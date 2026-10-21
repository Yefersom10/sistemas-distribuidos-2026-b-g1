# CP6 - SLIs, SLOs and error budget

Journey: hold and confirm seats ([01-journey.md](./01-journey.md)). Metric names come from
[04-metrics.md](./04-metrics.md). Targets start from `csp-docs/04-requirements/non-functional.md`:
NFR-001 (P95 of `POST /holds` under 300 ms) and NFR-002 (99.5 % availability, 216 minutes of
downtime per month). Metrics of the relay are proposals (CP4).

## The three SLOs

All use a rolling window of **30 days** and the route `POST /api/v1/booking/holds`.

### SLO 1 - Availability: 99.5 %

- SLI: valid requests that did not fail on the server side / all valid requests. A `422
  BUSINESS_RULE_VIOLATION` (seat already held) is a good answer; a `503` because Catalog did not answer is bad.
- Formula: `good = outcome != "server_error"`, `valid = all requests of the route`.

```promql
sum(rate(booking_requests_total{route="/api/v1/booking/holds",outcome!="server_error"}[30d]))
/
sum(rate(booking_requests_total{route="/api/v1/booking/holds"}[30d]))
```

### SLO 2 - Latency: 95 % of holds in 250 ms or less

- SLI: requests that finished in 0.25 s or less / all requests.
- NFR-001 says P95 under 300 ms. My histogram has no 0.3 bucket (CP4), so I use 0.25, which is
  stricter. Adding a 0.3 bucket is a possible follow-up.

```promql
sum(rate(booking_request_duration_seconds_bucket{route="/api/v1/booking/holds",le="0.25"}[30d]))
/
sum(rate(booking_request_duration_seconds_count{route="/api/v1/booking/holds"}[30d]))
```

### SLO 3 - Event freshness: 99 % of outbox events published in 30 s or less

- Why this one: the customer gets the ticket only after `BookingConfirmed` leaves the outbox
  (NFR: confirmation to ticket in under 60 s, median). The relay of `csp-worker` must not fall behind.
- SLI: events published within 30 s / all published events.
- Needs the proposed histogram `worker_outbox_publish_delay_seconds` with a `30` bucket
  (suggested buckets: 1, 5, 15, 30, 60).

```promql
sum(rate(worker_outbox_publish_delay_seconds_bucket{le="30"}[30d]))
/
sum(rate(worker_outbox_publish_delay_seconds_count[30d]))
```

## Traffic estimate

There are no production numbers; the platform is a course project. I assume a small chain:
**5,000 hold requests per day**, so **150,000 per month**. Each hold ends as `CONFIRMED` (60 %)
or `EXPIRED` (40 %).

| Quantity | Calculation | Result |
|---|---|---|
| Hold requests per month | 5,000 x 30 | 150,000 |
| Average rate | 150,000 / 2,592,000 s | about 0.06 requests per second |
| Peak in NFR-001 | 200 concurrent requests against one showtime | short burst, not the daily average |
| Outbox events per month | 150,000 `ReservationHeld` + 90,000 `BookingConfirmed` + 60,000 `ReservationExpired` | 300,000 |

## Error budget

| SLO | Allowed bad share | In requests or events per month | In minutes of the window |
|---|---|---|---|
| 1 Availability 99.5 % | 0.5 % | 750 failed holds of 150,000 | 216 minutes of total outage (43,200 x 0.005) |
| 2 Latency 95 % under 250 ms | 5 % | 7,500 slow holds | 2,160 minutes (43,200 x 0.05), counted as time with every request slow |
| 3 Freshness 99 % in 30 s | 1 % | 3,000 events published late | 432 minutes with the relay fully stopped |

At 0.06 requests per second, 750 failed holds are few: a 3-second Catalog outage during a
busy hour burns the budget faster than the average suggests. This is why the alerts of CP7 use
burn rate and not the monthly total.

## Error budget policy

| Budget consumed | What the team does |
|---|---|
| 50 % | The service owner reviews the failures of the last week in the logs (by `trace_id`) and writes the causes in the weekly status. Normal releases continue. |
| 75 % | New features of Booking stop being merged except fixes for the cause. The team reviews the Catalog dependency (timeout, snapshot, retries) and the runbook. |
| 100 % | Release freeze for Booking: only reliability work (fixes, tests, alerts) until the SLI is back above the target for 7 days. Every incident gets a blameless postmortem. |

## Check that the targets are realistic

- 99.5 % allows 216 minutes of outage per month. The hold depends on Catalog (DEC-006: no
  fallback), so the availability of Booking cannot be better than the combined availability of both services.
- The latency target of 250 ms leaves little room if Catalog answers slowly; Catalog is called once per hold.
- The freshness SLO depends on a metric that does not exist yet, so it cannot be alerted until the relay exposes it.
