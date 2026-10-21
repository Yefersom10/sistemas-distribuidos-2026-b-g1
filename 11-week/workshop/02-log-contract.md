# CP2 - Structured log contract

Service: `booking-service` (`csp-booking-api`). Journey: hold and confirm seats (see [01-journey.md](./01-journey.md)).

Current state: `13-operations/observability.md` asks for JSON logs with `correlationId`. This
contract uses snake_case names as the workshop asks and adds `trace_id`, `span_id` and `event`.
It is a proposal for the team; today `csp-booking-api` does not guarantee all of these fields.

## Common fields

| Field | Type | Required | Example | Why it exists |
|---|---|---|---|---|
| timestamp | string, ISO-8601 UTC with ms | required | `2026-10-20T23:41:07.112Z` | order events across services |
| level | string | required | `ERROR` | filter by severity |
| service | string | required | `booking-service` | filter by owner |
| version | string | required | `1.3.0` | link a failure to a release |
| environment | string | required | `qa` | separate dev, qa and main |
| trace_id | string, 32 hex | required | `4bf92f3577b34da6a3ce929d0e0e4736` | join the logs of all services in one request |
| span_id | string, 16 hex | required | `00f067aa0ba902b7` | locate the exact hop |
| correlation_id | string, UUID | required | `0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11` | same value as `X-Correlation-Id`, also in events (`metadata.correlationId`) |
| event | string, dotted | required | `catalog.availability.timeout` | stable name to count and alert on |
| message | string | required | `catalog did not answer in time` | human reading, no sensitive data |
| duration_ms | integer | required (0 if not applicable) | `3004` | latency without parsing text |

## Domain fields

| Field | Type | Required | Example | Why it exists |
|---|---|---|---|---|
| reservation_id | UUID | optional | `7d1e5c0a-...` | follow one `reservation` (aggregate) from `HELD` to `CONFIRMED` or `EXPIRED` |
| showtime_id | UUID | optional | `a31f0b6e-...` | see contention on one showtime |
| seat_count | integer | optional | `2` | size of the hold without logging seat labels of other people |
| reservation_status | string | optional | `HELD` | state after the change (`HELD`, `CONFIRMED`, `EXPIRED`) |
| error_code | string | optional | `BUSINESS_RULE_VIOLATION` | same code as the API error envelope |
| http_status | integer | optional | `422` | outcome of the request |
| outbox_event_type | string | optional | `BookingConfirmed` | link an API change to the event written in `outbox_event` |

## Never log

| Data | Rule | How it is masked |
|---|---|---|
| Authorization header, JWT, service token (`SERVICE_SUBJECTS`) | never | not written; log only the `sub` claim of a service |
| `user_id` with email or name | log only the user UUID | no email, no name; if needed `u***@example.com` |
| `Idempotency-Key` value | never raw | first 8 characters of its SHA-256 |
| Database credentials (`BOOKING_DB_USER`, password) | never | not written |
| Payment data (card number) | never, Booking does not handle it | not applicable; amounts are integer cents in `total_amount` |
| Full SQL with values | never | log the operation name, row counts and `duration_ms` |
| Full request body of `POST /holds` | never | log `seat_count` and `showtime_id` only |

## Levels

| Level | When the team uses it | Example in Booking |
|---|---|---|
| ERROR | the service failed to do its job and someone must look | `catalog.availability.timeout`: no answer from Catalog, the hold answers `503` |
| WARN | abnormal but handled | `hold.rejected`: a seat is already `HELD`, answered `422` |
| INFO | normal business step | `hold.created`, `reservation.confirmed` |
| DEBUG | developer detail, off in `qa` and `main` | row counts of the hold transaction |

## Example: one failed request, seven lines

The portal keeps the same trace for a user action, so the retry after the first failure keeps the
same `trace_id`. Common fields not repeated in the explanation: `version` is `1.3.0`,
`environment` is `qa`, `correlation_id` is `0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11`.

```json
{"timestamp":"2026-10-20T23:41:07.112Z","level":"INFO","service":"booking-service","version":"1.3.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"00f067aa0ba902b7","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"hold.request.received","message":"POST /holds received","duration_ms":0,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55","seat_count":2}
{"timestamp":"2026-10-20T23:41:07.130Z","level":"INFO","service":"booking-service","version":"1.3.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"b7ad6b7169203331","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"catalog.availability.requested","message":"asking Catalog for showtime availability","duration_ms":0,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55"}
{"timestamp":"2026-10-20T23:41:10.136Z","level":"ERROR","service":"booking-service","version":"1.3.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"b7ad6b7169203331","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"catalog.availability.timeout","message":"catalog-service did not answer in time","duration_ms":3004,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55"}
{"timestamp":"2026-10-20T23:41:10.141Z","level":"ERROR","service":"booking-service","version":"1.3.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"00f067aa0ba902b7","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"hold.failed","message":"hold not created, Catalog unavailable","duration_ms":3029,"http_status":503,"error_code":"SERVICE_UNAVAILABLE"}
{"timestamp":"2026-10-20T23:41:12.480Z","level":"INFO","service":"booking-service","version":"1.3.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"3c1d9e2f5a4b6c70","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"hold.request.received","message":"POST /holds retried by the portal","duration_ms":0,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55","seat_count":2}
{"timestamp":"2026-10-20T23:41:12.541Z","level":"INFO","service":"booking-service","version":"1.3.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"9e8f7a6b5c4d3e21","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"catalog.availability.received","message":"Catalog answered with the showtime snapshot","duration_ms":58,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55"}
{"timestamp":"2026-10-20T23:41:12.566Z","level":"WARN","service":"booking-service","version":"1.3.0","environment":"qa","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"3c1d9e2f5a4b6c70","correlation_id":"0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11","event":"hold.rejected","message":"a requested seat is already held by another reservation","duration_ms":86,"http_status":422,"error_code":"BUSINESS_RULE_VIOLATION","showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55","seat_count":2}
```

Reading by `trace_id`: the first attempt waits 3 s for Catalog and fails with `503`; the retry gets the
snapshot but another client already holds a seat, so the API answers `422 BUSINESS_RULE_VIOLATION`
and no seat is held. Both failures use the error codes of `booking-service.yaml` and the API
decisions DEC-006.
