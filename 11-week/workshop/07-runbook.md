# CP8 - Runbook: alert `BookingHoldFastBurn`

Alert: [06-alerts.yml](./06-alerts.yml), severity `page`. Fires when more than 7.2 % of
`POST /api/v1/booking/holds` fail on the server side in 1 hour and in the last 5 minutes.
Budget at stake: [05-slo.md](./05-slo.md). Service runbook of the team:
`csp-docs/09-microservices/services/04-booking-service/runbook.md`; roles and steps:
`csp-docs/13-operations/incident-management.md`.

## 1. Symptoms

- The portal cannot hold seats: the customer sees an error instead of the reservation in `HELD`.
- `POST /holds` answers `503 SERVICE_UNAVAILABLE` (Catalog did not answer, DEC-006) or `500`.
- `GET /reservations` and `POST .../confirm` can still work: confirmation and reads do not call Catalog.
- Logs with `event="catalog.availability.timeout"` and `event="hold.failed"` (see [02-log-contract.md](./02-log-contract.md)).

## 2. Confirm

1. Error ratio of the route (should be above 0.072):

```promql
sum(rate(booking_requests_total{route="/api/v1/booking/holds",outcome="server_error"}[5m]))
/
sum(rate(booking_requests_total{route="/api/v1/booking/holds"}[5m]))
```

2. Latency of the same route; a wall at the last bucket means waiting for the 3 s timeout:

```promql
histogram_quantile(0.95, sum by (le) (rate(booking_request_duration_seconds_bucket{route="/api/v1/booking/holds"}[5m])))
```

3. Take the `trace_id` of one failed request (from the `traceparent` header the portal got, or from a
   `hold.failed` log) and read the whole story in the logs of all services:

```text
trace_id="4bf92f3577b34da6a3ce929d0e0e4736"
```

   Order the lines by `timestamp`. If `catalog.availability.timeout` comes before `hold.failed`, the
   cause is Catalog. If there is no Catalog line, look at `error_code` and at PostgreSQL (`/health/ready`).

4. Is the service itself alive? `curl http://localhost:8083/api/v1/booking/health/ready` must show PostgreSQL `connected`.
5. What changed in the last 2 hours? A deploy of Booking or Catalog, a configuration change, or a traffic peak.

## 3. First mitigations, ordered from lowest to highest risk

| # | Mitigation | When | Command or action | Risk |
|---|---|---|---|---|
| 1 | Roll back the last deploy of Booking | a deploy happened in the last 2 hours and the errors started after it | `kubectl rollout undo deployment/booking-service -n "${K8S_NAMESPACE}"` then `kubectl rollout status ...` | low: the previous image already ran |
| 2 | Scale Booking | PostgreSQL pool or CPU is saturated (`hikaricp_connections_active` near the maximum) | `kubectl scale deployment/booking-service -n "${K8S_NAMESPACE}" --replicas=3` | low, but it does not help if Catalog is the cause |
| 3 | Ask the owner of Catalog to restore it | logs show `catalog.availability.timeout` | send the `trace_id` and the time of the first timeout to the Catalog owner (Karen) | none for Booking; it is the real fix |

Not available today, so they are not in the list:

- **Feature flag:** Booking has no feature flag for holds.
- **Circuit breaker:** there is none around the Catalog call. A hold would still wait 3 s.
- **Hold without Catalog:** DEC-006 forbids it. Never create a hold from the values in the request.
- **SQL by hand:** never update `reservation`, `seat_hold` or `seat_hold_item` directly; the three updates and the event go together.

## 4. Escalation

| Time | Who | Action |
|---|---|---|
| 0 min | On-call engineer of Booking (Yeferson) | acknowledge the page, write in the team channel "Investigating hold failures" with the PromQL value |
| 15 min without improvement | Tech Lead | joint diagnosis |
| P0 or P1 | Incident Commander | opens the incident, coordinates, decides mitigations |
| cause is Catalog | owner of Catalog (Karen) | restore the availability endpoint; Booking does not act on another domain |
| customers affected | Comms Lead | one update to stakeholders |

Announce each change in the channel and wait for the Incident Commander before executing it.

## 5. Verify the recovery

- The error ratio of step 2 is below 0.005 for 15 minutes.
- `BookingHoldFastBurn` is resolved in the alert manager and `BookingHoldSlowBurn` is not firing.
- A real `POST /holds` answers `201` with status `HELD`, and its `trace_id` shows `catalog.availability.received` in the logs.
- `/health/ready` still shows PostgreSQL `connected`.
- Write the minutes of budget used (see the table in [05-slo.md](./05-slo.md)) and open a postmortem if more than 25 % of the budget was consumed.
