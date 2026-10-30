<!-- HU-STATUS TEMPLATE - do NOT remove the <!-- ... --> markers or the table headers.
     Your weekly grade is read AUTOMATICALLY from this file:
       13-week/hu-status/README.md  (inside YOUR fork). English. -->

# Weekly Status - Week 13

<!-- CONFIG-START - must match your profile repo (username/username) CONFIG -->
- FULL_NAME: Yeferson Esmid Heredia Perdomo
- GITHUB_USER: Yefersom10
- TEAM: CineSync Platform
- SPRINT_GOAL: Threat model the boundary API Gateway to Booking service and turn the top threats into security stories and pipeline gates.
<!-- CONFIG-END -->

## 1. User stories worked this week
| HU ID | Title | Status (todo/doing/done) | Evidence (PR or commit URL) |
|---|---|---|---|
| Threat model | STRIDE of the boundary API Gateway to Booking service | done |  PR [csp-docs#277](https://github.com/code-corhuila/csp-docs/pull/277) (open, reviewed by three teammates), claim issue [#274](https://github.com/code-corhuila/csp-docs/issues/274) |
| [security] D | One user cannot hold unlimited seats of a showtime (risk 9, P0) | todo | [csp-docs#283](https://github.com/code-corhuila/csp-docs/issues/283) |
| [security] S | A stolen or revoked access token stops working quickly (risk 4, P2) | todo | [csp-docs#284](https://github.com/code-corhuila/csp-docs/issues/284) |
| [security] E | Internal workflow routes accept only genuine service tokens (risk 6, P1) | todo | [csp-docs#285](https://github.com/code-corhuila/csp-docs/issues/285) |

## 2. My individual contribution
- CP0: claimed the boundary and created the workshop folder ([ecf9372](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/ecf9372)).
- CP1: attack surface map with trust boundaries TB1 to TB8, assets and entry points ([7f8dad7](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/7f8dad7)).
- CP2: STRIDE analysis in two pushes, six threats ranked by risk, with the library book Maiorano, *Criptografia: tecnicas de desarrollo para profesionales*, pp. 31-32 ([8cfc556](https://github.com/code-corhuila/csp-docs/commit/8cfc556), [541f407](https://github.com/code-corhuila/csp-docs/commit/541f407)).
- CP3: three security stories with labels and priority, linked in the fork README ([df2b69c](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/df2b69c)).
- CP4: negative test `ForgedWorkflowTokenAuthzTest` (3 tests) and the workflow `security.yml` ([5d94ce0](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/5d94ce0), [9c811a5](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/9c811a5)).
- CP6: answered the three reviews of my PR (Nicolas on row D; Oscar and Karen on row S): the per-`sub` limit moved into Booking, and S was rescored to risk 4 with the 15-minute token of ADR-054 ([f1f95f4](https://github.com/code-corhuila/csp-docs/commit/f1f95f4), [d5c5200](https://github.com/code-corhuila/csp-docs/commit/d5c5200), [reply](https://github.com/code-corhuila/csp-docs/pull/277#issuecomment-6510178764)).
- CP7: refined the backlog: the three issues are in the team board (Backlog), #284 moved to P2 and #285 is related to #287 and #288 ([4103e95](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/4103e95)).
- CP8: ran `ForgedWorkflowTokenAuthzTest` (3 tests, 0 failures) and recorded the output in `HOW-TO-RUN.md` ([d884873](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/d884873)). `security.yml` is valid YAML; `actionlint` was not run.
- CP5: review comment on the STRIDE PR of a teammate: [csp-docs#278 review](https://github.com/code-corhuila/csp-docs/pull/278#pullrequestreview-5691725946). I pointed out that `POST /forgot-password` can be used for mail bombing and has no threat row.

## 3. Blockers and risks
- GitHub Actions is locked by billing, so `security.yml` is a proposal and the test is run locally (CP8).
- `actionlint` is not installed on my machine and Docker was off, so `security.yml` was only parsed as YAML.

## 4. Plan for next week
- Wait for the merge of PR #277 after the review, and start with story #283 (seat cap per user) in the next sprint.

## 5. Compliance self-check
- [x] Conventional Commits - `type(scope): summary`
- [ ] Per-environment HU branch + PR to that environment (not applicable: documentation workshop)
- [x] Testable acceptance criteria
- [x] Tests added/updated (unit / integration)
- [ ] DDD / hexagonal boundaries respected (not applicable: no service code changed)
- [x] No secrets; config via environment variables

## 6. Evidence links
- Workshop folder: https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/tree/main/13-week/workshop
- STRIDE file: https://github.com/code-corhuila/csp-docs/blob/security/stride-yefersom10/05-architecture/security/stride-yefersom10.md
