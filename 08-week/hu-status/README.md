<!-- HU-STATUS TEMPLATE - do NOT remove the <!-- ... --> markers or the table headers.
     Your weekly grade is read AUTOMATICALLY from this file:
       08-week/hu-status/README.md  (inside YOUR fork). English. -->


# Weekly Status - Week 08
<!-- CONFIG-START - must match your profile repo (username/username) CONFIG -->
- FULL_NAME: Yeferson Esmid Heredia Perdomo
- GITHUB_USER: Yefersom10
- TEAM: CineSync Platform
- SPRINT_GOAL: Restructure repository diagram assets, establish repository-wide governance for static assets in CONTRIBUTING.md, merge ADR-009 for diagram source standards, and align team workflows with Agile/DevOps practices and contract-first collaboration.
<!-- CONFIG-END -->

## 1. User stories worked this week
| HU ID | Title | Status (todo/doing/done) | Evidence (PR or commit URL) |
|---|---|---|---|
| HU-ARCH-001 | CineSync Architecture and Domain Diagrams | done | https://github.com/code-corhuila/csp-docs/pull/30 |
| HU-ARCH-002 | Microservices Specifications and Readiness | doing | https://github.com/code-corhuila/csp-docs/pull/27 |

## 2. My individual contribution
- Migrated and restructured the architectural diagrams directory from `08-uml` to `08-diagrams`, updating references and converting diagram exports to `.svg` format (excluding `csp-docs/08-diagrams/source/structural/`).
- Authored and declared the **Static Assets Policy (`assets/`)** in `csp-docs/CONTRIBUTING.md` to establish clear repository governance for media storage, subdirectories, and orphan image prevention.
- Merged **ADR-009**, defining the standard source formats for C4 models and behavioral views.
- Fixed duplicate path references, updated index links, and resolved merge conflicts across `main` and feature branches.
- **Class & Material Integration (Agile & DevOps for Distributed Teams & Story Mapping):**
  - Applied DevOps "you build it, you run it" culture and async communication standards by formalizing governance rules in `CONTRIBUTING.md` to prevent knowledge bottlenecks.
  - Aligned team branch strategies with small-batch execution and WIP limits through short-lived PRs (`#27`, `#30`).
  - Supported contract-first alignment and dependency mapping across microservices boundaries to enable realistic MVP 2 commitments without cross-service deadlocks.

### Commits with Direct Evidence
- [`0044f0d`](https://github.com/code-corhuila/csp-docs/commit/0044f0d2bf852a807d8ffb1e99bbb9d5bc37f652) — `Merge pull request #30 from code-corhuila/docs/migrate-uml-to-diagrams`
- [`659b907`](https://github.com/code-corhuila/csp-docs/commit/659b9071e974d87379a6d3354bf40e827aff3932) — `docs(governance): add static assets policy to CONTRIBUTING.md`
- [`6ec9f26`](https://github.com/code-corhuila/csp-docs/commit/6ec9f26045fead101937cd4eb283cba6cb2e6014) — `docs(diagrams): rename 08-uml to 08-diagrams and update SVG sources`
- [`ad64bfc`](https://github.com/code-corhuila/csp-docs/commit/ad64bfc0515ce7f8ff15550c7f55b97c6dbaa0a9) — `docs(architecture): merge ADR-009 for C4 and behavioral diagram source format standard`
- [`d0c96d6`](https://github.com/code-corhuila/csp-docs/commit/d0c96d6dffc279b8529f3900230ede743b0a2e1f) — `docs(architecture): diagram source Format standard for c4 and behavioral views`
- [`693e367`](https://github.com/code-corhuila/csp-docs/commit/693e36797184991cc04accf15e8afc7c8ee51367) — `Merge pull request #27 from code-corhuila/docs/update-uml-diagrams`
- [`009c250`](https://github.com/code-corhuila/csp-docs/commit/009c2502cc65ea4e70f535dee718a19008cc57be) — `Merge branch 'main' into docs/update-uml-diagrams`
- [`ddf4ibe`](https://github.com/code-corhuila/csp-docs/commit/ddf4ibe0515ce7f8ff15550c7f55b97c6dbaa0a9) — `chore(deps): merge main into docs/update-diagrams and renumber diagram ADR to ADR-009`
- [`411353d`](https://github.com/code-corhuila/csp-docs/commit/411353dbb5f7a3133550442af1b63eef74535873) — `docs(diagrams): fix duplicate path references and update diagram index links`
- [`b1c74a0`](https://github.com/code-corhuila/csp-docs/commit/b1c74a0d9dead2dee53b806185f37f4a1f8443d8) — `docs(diagrams): rename folder 08-uml to 08-diagrams and migrate diagrams to SVG format`

## 3. Blockers and risks
- Path refactoring across multiple documentation files requires strict verification to ensure no broken relative image links remain.
- Synchronizing ADR proposals (ADR-007 through ADR-010) across team branches requires careful conflict management during PR merges.
- Ensuring team adherence to the new `assets/` static policy and SVG diagram formatting standards across future documentation sprints.

## 4. Plan for next week
- Finalize remaining microservice specifications and verify integration with the updated `08-diagrams/` folder.
- Continue mapping MVP 2 user story journeys and contract-first API definitions (`openapi.yaml` and `.proto` files).
- Validate cross-service dependencies using mock servers to prevent blocking development during the upcoming sprint.
- Maintain WIP limits and continuous integration practices on documentation and code repositories.

## 5. Compliance self-check
- [x] Conventional Commits - `type(scope): summary`
- [x] Per-environment HU branch + PR to that environment (hu-xxx-dev -> develop, ...)
- [x] Testable acceptance criteria
- [ ] Tests added/updated (unit / integration)
- [x] DDD / hexagonal boundaries respected (domain has no I/O)
- [x] No secrets; config via environment variables

## 6. Evidence links
- Primary Documentation Repository: https://github.com/code-corhuila/csp-docs
- Pull Request #30 (Migrate UML to Diagrams): https://github.com/code-corhuila/csp-docs/pull/30
- Pull Request #27 (Update UML Diagrams): https://github.com/code-corhuila/csp-docs/pull/27
- Governance & Asset Policy: https://github.com/code-corhuila/csp-docs/blob/main/CONTRIBUTING.md
- Class Material - Agile & DevOps for Distributed Teams:

![Agile & DevOps for Distributed Teams](./Agile%20%26%20DevOps%20for%20Distributed%20Teams.png)