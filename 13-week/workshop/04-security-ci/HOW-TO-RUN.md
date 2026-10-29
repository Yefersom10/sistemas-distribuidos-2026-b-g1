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

Run on 2026-10-29 in a throwaway worktree of `csp-booking-api` at `origin/develop`, with Java 21 and Maven 3.9.9 (only the relevant lines of the Maven log):

```text
[INFO] Running co.edu.corhuila.csp.booking.adapter.in.http.ForgedWorkflowTokenAuthzTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.05 s -- in co.edu.corhuila.csp.booking.adapter.in.http.ForgedWorkflowTokenAuthzTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] Reactor Summary for booking 0.1.0:
[INFO] booking ............................................ SUCCESS [  0.008 s]
[INFO] booking-core ....................................... SUCCESS [  6.674 s]
[INFO] booking-adapters ................................... SUCCESS [ 15.373 s]
[INFO] BUILD SUCCESS
[INFO] Total time:  23.643 s
```

## Workflow validation

`security.yml` was parsed with PyYAML: it is valid YAML with the trigger `pull_request` on `develop` and three jobs (`secret-scan`, `dependency-audit`, `authorization-tests`). `actionlint` was not run because it is not installed on this machine and Docker was off, so the semantic check of the actions is pending. GitHub Actions is locked by billing, so the workflow itself has not run in CI.
