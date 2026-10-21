# CP7 - Alert policy

Rules: [06-alerts.yml](./06-alerts.yml). SLO and budget: [05-slo.md](./05-slo.md).
I checked the file with `promtool check rules` (Prometheus v2.54.1): `SUCCESS: 2 rules found`.

Basis: SLO 99.5 % in 30 days (720 hours) for `POST /holds`. Budget = 0.5 % = 750 failed holds of
150,000, or 216 minutes of total outage. Traffic is an assumption of 5,000 holds per day.

## How much budget each alert represents

Budget consumed when the alert fires = burn rate x alert window / 720 hours.

| Alert | Burn rate | Windows | Error ratio needed | Budget consumed | In failed holds | In minutes of total outage |
|---|---|---|---|---|---|---|
| `BookingHoldFastBurn` (page) | 14.4 | 1 hour, confirmed by 5 minutes | 14.4 x 0.5 % = 7.2 % | 14.4 x 1 / 720 = 2 % | 15 of 750 | 4.3 of 216 |
| `BookingHoldSlowBurn` (ticket) | 6 | 6 hours, confirmed by 30 minutes | 6 x 0.5 % = 3 % | 6 x 6 / 720 = 5 % | 37.5 of 750 | 10.8 of 216 |

Reading the numbers:

- If Catalog is down and every hold answers `503`, the error ratio is 100 %. The 1 hour
  window crosses 7.2 % after about 4.3 minutes (7.2 % of 60 minutes), which matches the 2 % of the budget.
  The page arrives when 4.3 of the 216 minutes are already gone.
- The slow alert catches a quiet problem, for example 4 % of the holds failing for hours. The fast alert
  never fires for it (4 % is below 7.2 %), but it would burn the whole budget in 5 days.
- The confirmation windows (5 minutes and 30 minutes) stop the alert when the problem is already over: the long window
  still remembers the errors, but the short one is back to normal.

## Low traffic

At about 0.06 requests per second there are only about 208 holds per hour and about 17 in 5 minutes. Seven percent
of that is a handful of requests, so a short blip of 3 failures in 5 minutes is already above 7.2 %.
The long window protects against it, because it needs about 15 failures in the hour. If real
traffic is lower than my assumption, the thresholds should be reviewed.

## Alerts I will not create

| Alert based on a cause | Why not |
|---|---|
| CPU of `booking-service` above 80 % | High CPU does not mean a customer failed to hold seats. If it hurts users, the error ratio or the latency SLO shows it. It would page for nothing. |
| One `catalog.availability.timeout` log line | A single timeout is one failed hold, a tiny part of the budget. The burn rate alert fires when timeouts are frequent enough to matter. |

## Routing

| Severity | Meaning | Reaction |
|---|---|---|
| `page` | the budget is going away within hours | the person on call for Booking follows [07-runbook.md](./07-runbook.md) now |
| `ticket` | slow leak | an issue is opened and handled in working hours |

## Limits

- The metric `booking_requests_total` exists in the instrumentation sample (CP3), not yet in `csp-booking-api`.
- The alerts cover SLO 1 only. SLO 2 (latency) and SLO 3 (event freshness) have no alert yet.
