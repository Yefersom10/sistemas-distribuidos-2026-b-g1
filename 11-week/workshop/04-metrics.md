# CP4 - Golden signals and metric catalog

Journey: hold and confirm seats (see [01-journey.md](./01-journey.md)). Logs follow
[02-log-contract.md](./02-log-contract.md); the two `booking_*` metrics are implemented in
[03-instrumentation](./03-instrumentation). Every other metric is a **proposal**: the docs of the
other services do not define it yet.

## booking-service (`csp-booking-api`)

| Signal | Metric | Type | Labels | PromQL for the dashboard |
|---|---|---|---|---|
| Latency | `booking_request_duration_seconds` | histogram | `route` | `histogram_quantile(0.95, sum by (le) (rate(booking_request_duration_seconds_bucket{route="/api/v1/booking/holds"}[5m])))` |
| Traffic | `booking_requests_total` | counter | `route`, `outcome` | `sum by (route) (rate(booking_requests_total[5m]))` |
| Errors | `booking_requests_total` | counter | `route`, `outcome` | `sum(rate(booking_requests_total{route="/api/v1/booking/holds",outcome="server_error"}[5m])) / sum(rate(booking_requests_total{route="/api/v1/booking/holds"}[5m]))` |
| Saturation | `hikaricp_connections_active` / `hikaricp_connections_max` (proposed: needs Micrometer) | gauge | `pool` | `hikaricp_connections_active{pool="HikariPool-1"} / hikaricp_connections_max{pool="HikariPool-1"}` |

`outcome` is `success` (below 400), `client_error` (4xx, for example `422 BUSINESS_RULE_VIOLATION`)
or `server_error` (5xx, for example `503 SERVICE_UNAVAILABLE` when Catalog does not answer).

## api-gateway (proposed)

| Signal | Metric | Type | Labels | PromQL |
|---|---|---|---|---|
| Latency | `gateway_request_duration_seconds` | histogram | `route` | `histogram_quantile(0.95, sum by (le) (rate(gateway_request_duration_seconds_bucket{route="/api/v1/booking/holds"}[5m])))` |
| Traffic | `gateway_requests_total` | counter | `route`, `outcome` | `sum by (route) (rate(gateway_requests_total[5m]))` |
| Errors | `gateway_requests_total` | counter | `route`, `outcome` | `sum(rate(gateway_requests_total{outcome="server_error"}[5m])) / sum(rate(gateway_requests_total[5m]))` |
| Saturation | `gateway_inflight_requests` | gauge | none | `max_over_time(gateway_inflight_requests[5m])` |

## catalog-service (proposed)

| Signal | Metric | Type | Labels | PromQL |
|---|---|---|---|---|
| Latency | `catalog_request_duration_seconds` | histogram | `route` | `histogram_quantile(0.95, sum by (le) (rate(catalog_request_duration_seconds_bucket{route="/api/v1/catalog/showtimes/{showtimeId}/availability"}[5m])))` |
| Traffic | `catalog_requests_total` | counter | `route`, `outcome` | `sum by (route) (rate(catalog_requests_total[5m]))` |
| Errors | `catalog_requests_total` | counter | `route`, `outcome` | `sum(rate(catalog_requests_total{outcome="server_error"}[5m])) / sum(rate(catalog_requests_total[5m]))` |
| Saturation | `catalog_inflight_requests` | gauge | none | `max_over_time(catalog_inflight_requests[5m])` |

## csp-worker outbox relay (proposed)

| Signal | Metric | Type | Labels | PromQL |
|---|---|---|---|---|
| Latency | `worker_outbox_publish_delay_seconds` (from `created_at` to publication) | histogram | `event_type` | `histogram_quantile(0.95, sum by (le) (rate(worker_outbox_publish_delay_seconds_bucket[5m])))` |
| Traffic | `worker_outbox_published_total` | counter | `event_type`, `result` | `sum by (event_type) (rate(worker_outbox_published_total[5m]))` |
| Errors | `worker_outbox_published_total` | counter | `event_type`, `result` | `sum(rate(worker_outbox_published_total{result="failed"}[5m])) / sum(rate(worker_outbox_published_total[5m]))` |
| Saturation | `worker_outbox_pending_events` (rows not yet published) | gauge | none | `max_over_time(worker_outbox_pending_events[5m])` |

## Cardinality

| Label | Values | Estimate | Rule |
|---|---|---|---|
| `route` | mapped pattern, not the raw URL (`/api/v1/booking/holds`, `/reservations/{reservationId}/confirm`, ...) | about 8 | bounded by the controllers; any other path is `unmatched` |
| `outcome` | `success`, `client_error`, `server_error` | 3 | closed list |
| `event_type` | `ReservationHeld`, `BookingConfirmed`, `ReservationExpired` | 3 | closed list of `events.md` |
| `result` | `published`, `failed` | 2 | closed list |
| `le` (histogram) | 6 buckets plus `+Inf` | 7 | fixed |

The worst series count of the booking histogram is 8 routes x 7 buckets = 56 series, and the counter
is 8 x 3 = 24. That is small enough for one Prometheus.

Labels that are **forbidden** because they are unbounded:

| Forbidden label | Why | What replaces it |
|---|---|---|
| `user_id` | one value per customer | the log field `user_id` and the trace |
| `reservation_id`, `showtime_id` | one value per reservation or showtime | `reservation_id` and `showtime_id` in the logs, searched by `trace_id` |
| raw URL or path | `/reservations/<uuid>/confirm` makes one series per reservation | `route` with the pattern `{reservationId}` |
| `Idempotency-Key`, email | unbounded and sensitive | nothing; never a label |

## Histogram buckets

`0.05, 0.1, 0.25, 0.5, 1, 2.5` seconds, plus `+Inf`.

- A customer who picks seats expects the hold to answer in under half a second, so the buckets
  are dense up to `0.5`: the 95th percentile target is `0.5 s`.
- The call to Catalog has a read timeout of 3 s (see the log example in CP2). The last bucket
  `2.5` sits below it, and the `+Inf` bucket counts the requests that waited for the timeout.
- Fewer than eight buckets keeps the series count low (see above).
