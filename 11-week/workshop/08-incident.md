# CP9 - Incident drill and blameless postmortem

Drill on the journey of [01-journey.md](./01-journey.md): hop 3, `booking-service` to
`catalog-service` (`GET /showtimes/{showtimeId}/availability`, DEC-006). Everything below is a
simulation built from CP1 to CP8; nothing here was measured on a real system.

**Scenario:** for 40 minutes, Catalog takes 3 seconds or more to answer for 25 % of the requests.
`booking-service` has a read timeout of 3 s (CP3), so those holds fail with `503 SERVICE_UNAVAILABLE`.

**Assumptions:** traffic of 5,000 holds per day (CP6) but the incident hits the evening peak, 3 times the
average: 625 holds per hour, 10.4 per minute, steady for the 6 hours before. During the 40 minutes
that is 417 holds, and 25 % fail: **104 failed holds**.

## Trace of a slow request

One request of the incident; durations in milliseconds.

```text
trace_id 4bf92f3577b34da6a3ce929d0e0e4736
- gateway: POST /holds                          3090 ms  (root span, status 503)
  - booking-service: POST /holds                3060 ms  (server span, status 503)
    - catalog-service: GET availability         3004 ms  (client span, timeout, no answer)
    (no postgres span: the transaction never started)
```

## Four log lines of that trace

```json
{"timestamp":"2026-10-21T19:47:12.100Z","level":"INFO","service":"booking-service","version":"0.1.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"00f067aa0ba902b7","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"hold.request.received","message":"POST /holds received","duration_ms":0,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55","seat_count":2}
{"timestamp":"2026-10-21T19:47:12.118Z","level":"INFO","service":"booking-service","version":"0.1.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"b7ad6b7169203331","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"catalog.availability.requested","message":"asking Catalog for showtime availability","duration_ms":0,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55"}
{"timestamp":"2026-10-21T19:47:15.122Z","level":"ERROR","service":"booking-service","version":"0.1.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"b7ad6b7169203331","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"catalog.availability.timeout","message":"catalog-service did not answer in time","duration_ms":3004,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55"}
{"timestamp":"2026-10-21T19:47:15.127Z","level":"ERROR","service":"booking-service","version":"0.1.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"00f067aa0ba902b7","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"hold.failed","message":"hold not created, Catalog unavailable","duration_ms":3027,"http_status":503,"error_code":"SERVICE_UNAVAILABLE"}
```

## SLIs during the incident

| SLI ([05-slo.md](./05-slo.md)) | Value in the 40 minutes | Target | Value over the 30 days |
|---|---|---|---|
| Availability: holds without server error | 75 % (313 of 417) | 99.5 % | (150,000 - 104) / 150,000 = 99.93 % |
| Latency: holds in 250 ms or less | 75 % (the 104 timeouts took 3 s) | 95 % | 99.93 % |
| Event freshness | not affected (the relay does not use Catalog) | 99 % | unchanged |

Error ratio 25 % / 0.5 % allowed = **burn rate 50**.

## Which alert fires first, and when

Minute 0 is the start of the incident. Failures in the 1 hour window after t minutes: 0.25 x 10.4 x t = 2.6 t,
out of 625 requests, so the ratio crosses 7.2 % when 2.6 t / 625 > 0.072, that is **t = 17.3 minutes**.
The 5 minute window already shows 25 %.

| Alert ([06-alerts.yml](./06-alerts.yml)) | Fires | Why |
|---|---|---|
| `BookingHoldFastBurn` | **minute 18** | 1 hour ratio above 7.2 % and 5 minute ratio at 25 % |
| `BookingHoldSlowBurn` | never | needs 3 % over 6 hours: 112.5 failures in 3,750 requests, i.e. minute 43, and the incident ends at minute 40 |

At minute 18 about 47 holds have failed (45 %); the other 57 happen after the page.

## Which runbook step stops the damage

[07-runbook.md](./07-runbook.md): section 2 (confirm) shows `catalog.availability.timeout` before `hold.failed`, so the cause is
Catalog. Mitigations 1 (rollback) and 2 (scale Booking) do not help: no deploy happened and PostgreSQL is not saturated.
**Mitigation 3**, asking the owner of Catalog to restore the endpoint, is the step that stops the damage.

## Postmortem (blameless)

### Timeline

| Minute | Time | Event |
|---|---|---|
| 0 | 19:30 | Catalog starts answering slowly for 25 % of the requests |
| 18 | 19:48 | `BookingHoldFastBurn` pages the on-call engineer of Booking |
| 21 | 19:51 | Alert acknowledged; error ratio confirmed at 25 % with the PromQL of the runbook |
| 26 | 19:56 | A failed `trace_id` shows `catalog.availability.timeout`; rollback and scaling discarded |
| 30 | 20:00 | Message to the Catalog owner with the `trace_id` and the first timeout |
| 40 | 20:10 | Catalog restored; the timeouts stop |
| 55 | 20:25 | Error ratio below 0.005 for 15 minutes; alert resolved |

### Impact

- 417 holds in 40 minutes, 104 failed (25 %). Customers saw an error instead of a seat hold. No data was lost.
- Budget: 104 of 750 failed holds allowed per month = **13.9 %** of the availability budget, equal to **30 minutes** of
  the 216 minutes (13.9 % x 216), because the incident happened at 3 times the average traffic.
- Confirmations and reads kept working; they do not call Catalog.

### Root cause

Booking waits up to 3 s for Catalog and has no other answer for a hold (DEC-006, no fallback), so
every slow Catalog answer became a failed hold. Why Catalog was slow is outside the data of this drill.

### Contributing factors

- No circuit breaker: each failed hold waited the full 3 s, which also kept request threads busy.
- Booking has no metric for the Catalog call, so the dashboard showed the effect (errors) and not the cause (Catalog latency).
- The alert needed 18 minutes: the 1 hour window and the low traffic delay the page.
- The runbook gives no contact for the Catalog on-call; the message at minute 30 took time to find.

### Actions

| # | User story | Acceptance criteria |
|---|---|---|
| 1 | As the on-call engineer of Booking, I want the Catalog call to fail fast after repeated timeouts, so that customers do not wait 3 s for an error. | A circuit breaker (new ADR) opens after 5 consecutive timeouts; while open, `POST /holds` answers `503` in under 100 ms; a test with a stub of Catalog that sleeps 3 s proves it; it closes after one good answer. |
| 2 | As the owner of Booking, I want a metric of the Catalog call, so that the dashboard shows Catalog latency before the alert fires. | `/metrics` exposes `booking_catalog_request_duration_seconds` with label `outcome` (`success`, `timeout`, `error`); a test checks the labels; the runbook has the PromQL of its p95. |
| 3 | As the on-call engineer, I want the contact and the dashboard of Catalog in the runbook, so that escalation takes less than 5 minutes. | `07-runbook.md` names the Catalog contact and its dashboard link; in the next drill the time from the page to the message to Catalog is below 5 minutes. |
