# How to run the instrumentation of booking-service

Minimal Spring Boot module for the hold journey: it reads or creates the `traceparent`, writes
the JSON logs of [02-log-contract.md](../02-log-contract.md), forwards the trace to Catalog and
exposes two metrics. It is not the real `csp-booking-api`: `POST /holds` only calls Catalog and
has no PostgreSQL transaction.

Requirements: Java 21 and Maven 3.9. Run the commands from this folder.

## Install and test

```bash
mvn -B test
```

Real output on my machine (Windows 11, Java 21.0.12, Maven 3.9.9):

```text
Tests run: 2 ... MetricsRegistryTest
Tests run: 1 ... StructuredLoggerTest
Tests run: 2 ... TraceContextFilterTest
Tests run: 3 ... TraceContextTest
Tests run: 1 ... TracePropagationTest
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

`TracePropagationTest` starts a stub of Catalog, sends `POST /holds` with a `traceparent` and checks
that the stub received the same `trace_id`.

## Run

```bash
mvn -B package -DskipTests
java -jar target/booking-observability-0.1.0.jar --server.port=18083
```

The real service uses port 8083; I used 18083 to avoid a clash. The base URL of Catalog is the
property `catalog.base-url` (default `http://localhost:8082/api/v1/catalog`). Catalog was stopped in this run.

## Try it

```text
$ curl -i -H 'traceparent: 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01' http://localhost:18083/api/v1/booking/health
HTTP/1.1 200
traceparent: 00-4bf92f3577b34da6a3ce929d0e0e4736-58582e564b43a3dd-01
X-Correlation-Id: 6466b075-32b8-4c8c-b27d-8edf36543179

{"status":"UP"}

$ curl -i -X POST -H 'Content-Type: application/json' -H 'traceparent: 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01' -d @hold.json http://localhost:18083/api/v1/booking/holds
HTTP/1.1 503
traceparent: 00-4bf92f3577b34da6a3ce929d0e0e4736-4c3e076d61f7a153-01
X-Correlation-Id: 438d167a-945a-424a-9e07-3bdd81fb49c1

{"error":"SERVICE_UNAVAILABLE"}
```

`hold.json` contains `{"showtimeId":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55"}`. The response keeps the
`trace_id` I sent and has a new span id.

## Metrics

```text
$ curl http://localhost:18083/metrics
# TYPE booking_requests_total counter
booking_requests_total{route="/api/v1/booking/health",outcome="success"} 1
booking_requests_total{route="/api/v1/booking/holds",outcome="server_error"} 1
# TYPE booking_request_duration_seconds histogram
booking_request_duration_seconds_bucket{route="/api/v1/booking/holds",le="0.25"} 0
booking_request_duration_seconds_bucket{route="/api/v1/booking/holds",le="0.5"} 1
booking_request_duration_seconds_bucket{route="/api/v1/booking/holds",le="+Inf"} 1
booking_request_duration_seconds_sum{route="/api/v1/booking/holds"} 0.3303208
booking_request_duration_seconds_count{route="/api/v1/booking/holds"} 1
```

I omitted the other buckets and the `health` histogram. The full list is in [04-metrics.md](../04-metrics.md).

## Console of the service

All lines of the failed hold carry the same `trace_id`:

```json
{"timestamp":"2026-10-21T01:32:01.503Z","level":"INFO","service":"booking-service","version":"0.1.0","environment":"dev","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"4c3e076d61f7a153","correlation_id":"438d167a-945a-424a-9e07-3bdd81fb49c1","event":"catalog.availability.requested","message":"asking Catalog for showtime availability","duration_ms":0,"showtime_id":"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55"}
{"timestamp":"2026-10-21T01:32:01.695Z","level":"ERROR","service":"booking-service","version":"0.1.0","environment":"dev","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"4c3e076d61f7a153","correlation_id":"438d167a-945a-424a-9e07-3bdd81fb49c1","event":"hold.failed","message":"hold not created, Catalog unavailable","duration_ms":0,"http_status":503,"error_code":"SERVICE_UNAVAILABLE"}
{"timestamp":"2026-10-21T01:32:01.711Z","level":"INFO","service":"booking-service","version":"0.1.0","environment":"dev","trace_id":"4bf92f3577b34da6a3ce929d0e0e4736","span_id":"4c3e076d61f7a153","correlation_id":"438d167a-945a-424a-9e07-3bdd81fb49c1","event":"http.request.completed","message":"POST /api/v1/booking/holds","duration_ms":330,"http_status":503}
```

## Known limits

- The metrics are written by hand (`MetricsRegistry`) because Micrometer was not available offline. The real service should use Micrometer.
- `duration_ms` of `hold.failed` is `0`; the real duration is in `http.request.completed`.
