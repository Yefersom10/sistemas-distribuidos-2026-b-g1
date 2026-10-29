# How to run the negative authorization test

Story covered: **[security] Internal workflow routes accept only genuine service tokens**
(threat E of the boundary API Gateway to Booking, `05-architecture/security/stride-yefersom10.md`).
Acceptance criterion covered: a token whose `sub` is `csp-workflow` but that was not signed by the
identity service (another RSA key, or HS256) receives `401 INVALID_TOKEN` on `/internal/workflow/holds`,
and a request without token receives `401 UNAUTHORIZED`.

Test: `ForgedWorkflowTokenAuthzTest` (3 tests), written for `csp-booking-api`, module `booking-adapters`.

## Run it locally

1. Clone `code-corhuila/csp-booking-api` on `develop` (short path, `core.longpaths` on Windows).
2. Copy `ForgedWorkflowTokenAuthzTest.java` to
   `booking-adapters/src/test/java/co/edu/corhuila/csp/booking/adapter/in/http/`.
3. From the repository root, with Java 21 and Maven:

```bash
mvn -B -pl booking-adapters -am test -Dtest=ForgedWorkflowTokenAuthzTest -Dsurefire.failIfNoSpecifiedTests=false
```

The test needs no database and no network: it builds the real `JwtAuthenticationFilter` behind MockMvc.

## Console output

Pending (checkpoint CP8).

## Workflow validation

Pending (checkpoint CP8).
