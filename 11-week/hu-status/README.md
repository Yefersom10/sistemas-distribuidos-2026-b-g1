<!-- HU-STATUS TEMPLATE - do NOT remove the <!-- ... --> markers or the table headers.
     Your weekly grade is read AUTOMATICALLY from this file:
       11-week/hu-status/README.md  (inside YOUR fork). English. -->

# Weekly Status - Week 11

<!-- CONFIG-START - must match your profile repo (username/username) CONFIG -->
- FULL_NAME: Yeferson Esmid Heredia Perdomo
- GITHUB_USER: Yefersom10
- TEAM: CineSync Platform
- SPRINT_GOAL: Keep the released Booking vertical (v2.0.0) demonstrable: rehearse the platform demo runbook, fix the portal container healthcheck, record the promotional video, and complete the project-control, operations, quality and training documentation in csp-docs.
<!-- CONFIG-END -->

## 1. User stories worked this week
| HU ID | Title | Status (todo/doing/done) | Evidence (PR or commit URL) |
|---|---|---|---|
| HU-BOOKING-001, 002, 003 | Seat hold, hold expiration, reservation confirmation | done | No change this week; already Done (DoD) on main since release 2.0.0 (https://github.com/code-corhuila/csp-booking-api/issues/8) |
| HU-FE-BOOKING-001 | Frontend Booking Integrates the Real Booking API | done | No change this week; Done (DoD) on main (https://github.com/code-corhuila/csp-booking-portal/issues/10) |
| csp-booking-portal#54 | Portal container healthcheck resolves `localhost` to `::1` | doing | Issue https://github.com/code-corhuila/csp-booking-portal/issues/54 · PR (open, approved, CI green) https://github.com/code-corhuila/csp-booking-portal/pull/55 |
| csp-booking-portal#56 | Visible portal text in Spanish | todo | https://github.com/code-corhuila/csp-booking-portal/issues/56 |
| Demo runbook | Rehearsed demo runbook of the platform | done | https://github.com/code-corhuila/csp-docs/pull/121 |
| Video record | Record of the promotional video | done | https://github.com/code-corhuila/csp-docs/pull/127 |
| W11 workshop, deliveries 1 and 2 | Observability of the Booking hold and confirm journey: traces, logs, metrics, SLOs, alerts, runbook and incident drill (CP0 to CP10) | done | https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/tree/main/11-week/workshop |

## 2. My individual contribution
- **Deployment (portal):** the container healthcheck now checks `127.0.0.1` instead of `localhost`, which nginx resolved to `::1` ([csp-booking-portal#55](https://github.com/code-corhuila/csp-booking-portal/pull/55), 9 lines added and 2 removed), with a CHANGELOG note under `Unreleased`. The PR is approved and its CI passed on 2026-10-13; it is not merged yet.
- **Booking documentation:** rehearsed demo runbook with what it does not cover and what was not observed ([csp-docs#121](https://github.com/code-corhuila/csp-docs/pull/121), 64 lines), linked to its stories and ADR.
- **Training documentation:** record of the promotional video and the source of its music ([csp-docs#127](https://github.com/code-corhuila/csp-docs/pull/127), 72 lines).
- **W11 workshop, delivery 1 (2026-10-20):** mapped the hold and confirm journey with its trace propagation ([a9916fb](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/a9916fbe99657317bd18b3dbc9dfa481048b9d8d)), defined the structured log contract ([bd847b5](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/bd847b550b4e9a3e8f13f0fe0e97a78ff91d1e00)), wrote a Spring Boot instrumentation module with a trace-context filter, JSON logger, downstream propagation to Catalog and two metrics, tested with 9 passing tests ([595eee3](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/595eee354a37590b251dfa0d14e09562ed5f21c4)), and the golden-signals catalog ([a4c07bd](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/a4c07bdfb2f10a0078c73eee714cb5f00d5797b9)). The module is a sample; `csp-booking-api` is unchanged.
- **W11 workshop, delivery 2 (2026-10-20 to 2026-10-21):** defined three SLOs and the error budget ([1a01c94](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/1a01c94813b955a6dc79b7c290f260e45c15d584)), added burn-rate alert rules checked with `promtool` ([d17b1b3](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/d17b1b3a5e0f4156e1ecc27102a9b75b4a71134a)), wrote the runbook of the fast-burn alert ([ebe0baa](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/ebe0baaed4524a341444c496ab7cdea74f985dbf)) and ran a simulated incident with a blameless postmortem ([d5fb214](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/d5fb2142c081e16e9279a8fbe6f6a79e91401bf1)). The traffic and the incident are assumptions, not measurements.
- **Cross-cutting documentation in csp-docs** (merged 2026-10-12 UTC): risk register, open questions, dependencies and technical backlog ([#117](https://github.com/code-corhuila/csp-docs/pull/117)); backup and recovery, observability and incidents bound to the CSP services ([#118](https://github.com/code-corhuila/csp-docs/pull/118)); code review guide and testing strategy ([#119](https://github.com/code-corhuila/csp-docs/pull/119)); user and administrator manuals and onboarding ([#120](https://github.com/code-corhuila/csp-docs/pull/120)). They were opened on the evening of Sunday 2026-10-11 in Colombian time (UTC-5), so they fall on Monday in UTC and were not counted in Week 10.
- **PR breakdown (7 PRs opened this week):** all 7 are my own docs and fix PRs; there are no promotions, changelogs or release merges. 6 merged and 1 open (#55). If #117 to #120 are assigned to Week 10 by local time, 3 remain in this week.
- **No code changes** this week in `csp-booking-api`, `csp-booking-db` or `csp-worker`; the work was operations and documentation.
- **Volume:** 8 commits authored by me, listed with URLs in [git_commits.md](./git_commits.md).

## 3. Blockers and risks
- **GitHub Actions is blocked by a billing lock.** A failed `csp-worker` job (run 38791990822) reports "your account is locked due to a billing issue"; the first failure I found is from 2026-10-14 22:47 UTC. The CI of PR #55 passed on 2026-10-13, before the lock, but if its branch is updated the CI would fail for the same reason (inference, not observed). I could not confirm the cause of the 37 `startup_failure` runs in `csp-docs`.
- PR #55 is approved but not merged, and issue #56 (Spanish text) has no PR yet.
- No planning, daily, review or retro minutes exist for this week, so the ceremonies cannot be evidenced.
- Pending from earlier weeks: V013 (remove `UPDATE` on the outbox), the source of the 400-line exemption, `csp-infra-postgres` not yet promoted to main, and messages to other teams not sent.

## 4. Plan for next week
- Merge PR #55 once it can be updated and validated while Actions is locked, and close issue #54.
- Open the PR for issue #56 (visible portal text in Spanish).
- Resolve the pending operations items: V013, outbox purge decision and the `events.md` exchange.
- Record real ceremony minutes (planning, review, retro) in `csp-docs` so the next report can evidence them.
- Observability: write an ADR for `traceparent` and the log field names, then propose stories for `csp-booking-api`: trace and log filter, request metrics, a circuit breaker and a metric for the Catalog call (actions of the postmortem in `08-incident.md`).

## 5. Compliance self-check
- [x] Conventional Commits - `type(scope): summary`
- [x] Per-environment HU branch + PR to that environment (hu-xxx-dev -> develop, ...)
- [x] Testable acceptance criteria
- [x] Tests added/updated (unit / integration)
- [x] DDD / hexagonal boundaries respected (domain has no I/O)
- [x] No secrets; config via environment variables

## 6. Evidence links
- Full commit list of the week: [git_commits.md](./git_commits.md)
- Portal healthcheck fix (open): https://github.com/code-corhuila/csp-booking-portal/pull/55
- Demo runbook: https://github.com/code-corhuila/csp-docs/pull/121
- Promotional video record: https://github.com/code-corhuila/csp-docs/pull/127
- Operations, quality and training documentation: https://github.com/code-corhuila/csp-docs/pull/117 · https://github.com/code-corhuila/csp-docs/pull/118 · https://github.com/code-corhuila/csp-docs/pull/119 · https://github.com/code-corhuila/csp-docs/pull/120
- Repositories: https://github.com/code-corhuila/csp-docs · https://github.com/code-corhuila/csp-booking-portal
- W11 workshop folder: https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/tree/main/11-week/workshop
- Class Material - Observability (logs, metrics and distributed tracing):

![Observability — logs, metrics and distributed tracing](Observability-—-logs_-metrics-and-distributed-tracing.png)
