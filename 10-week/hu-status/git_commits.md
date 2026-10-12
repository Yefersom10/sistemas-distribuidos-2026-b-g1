# Week 10 Commits

Week Mon 05 - Sun 11 Oct 2026 · Source: GitHub API of `code-corhuila` (queried 2026-10-11) · Dates in UTC.

Branch = where the commit exists. qa/main commits are mostly cherry-picks (`-x`) of the develop ones, so they have a different hash. Click a hash to open the commit.

## Summary

| Repository | Commits |
|---|---:|
| [`csp-booking-api`](#csp-booking-api) | 103 |
| [`csp-booking-db`](#csp-booking-db) | 44 |
| [`csp-booking-portal`](#csp-booking-portal) | 87 |
| [`csp-worker`](#csp-worker) | 62 |
| [`csp-docs`](#csp-docs) | 31 |
| [`csp-infra-postgres`](#csp-infra-postgres) | 15 |
| [`csp-catalog-portal`](#csp-catalog-portal) | 5 |
| [`csp-concessions-portal`](#csp-concessions-portal) | 6 |
| [`csp-ticketing-portal`](#csp-ticketing-portal) | 3 |
| **Total** | **356** |

---

<a id="csp-booking-api"></a>
## `csp-booking-api` (103 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Oct | main | [`b702667`](https://github.com/code-corhuila/csp-booking-api/commit/b70266782bd6dde7ca45b4e04601a000b8b1ac14) | Merge pull request #14 from code-corhuila/qa-promote/booking-api-base-1 |
| 05 Oct | develop | [`cc0e8f1`](https://github.com/code-corhuila/csp-booking-api/commit/cc0e8f12aebf766f3b8fa295987d2587c211fdff) | feat(http): carry the correlation id from the first filter to every log line |
| 05 Oct | develop | [`0470302`](https://github.com/code-corhuila/csp-booking-api/commit/0470302bb62beb770ffdf02bc7f3a1ed92bbf263) | feat(security): validate the bearer token of every request in this service |
| 05 Oct | develop | [`3f7d528`](https://github.com/code-corhuila/csp-booking-api/commit/3f7d5285b5fe37300c3a1d146db2a9dc868bfa88) | feat(health): expose the liveness and readiness routes of the contract |
| 05 Oct | main | [`97d1f35`](https://github.com/code-corhuila/csp-booking-api/commit/97d1f35985c5422d6e28af39839c4751c4376a49) | Merge pull request #15 from code-corhuila/qa-promote/booking-api-base-2 |
| 05 Oct | develop | [`0dbefa3`](https://github.com/code-corhuila/csp-booking-api/commit/0dbefa328df826466a8990c67adadce026c7a9bb) | feat(persistence): store the hold, its seats, the key and the event in one transaction |
| 05 Oct | develop | [`cf2e463`](https://github.com/code-corhuila/csp-booking-api/commit/cf2e46349dd58214087cb4c7939ecf96e838cbf0) | feat(persistence): read the reservations of a caller, one page at a time |
| 05 Oct | develop | [`39b91b1`](https://github.com/code-corhuila/csp-booking-api/commit/39b91b1aaf33a7e9b43a8048cc8202bc24d6d7f1) | feat(application): hold the seats of the request and answer the reservation |
| 05 Oct | develop | [`927e159`](https://github.com/code-corhuila/csp-booking-api/commit/927e159b3681aed2b00f2138829a4e91818f1089) | feat(http): answer the contract of the hold behind the base of the service |
| 05 Oct | develop | [`637e4cf`](https://github.com/code-corhuila/csp-booking-api/commit/637e4cf803ca05bfa8e0bb0425fe1b2c03de1259) | feat(http): read the reservations of the caller behind the contract |
| 05 Oct | develop | [`4fc4a0f`](https://github.com/code-corhuila/csp-booking-api/commit/4fc4a0fd1007c007cbacfd0645e330fbb335d7d2) | feat(security): merge PR #18 - carry the correlation id and validate the bearer RS256 |
| 05 Oct | qa | [`af4b826`](https://github.com/code-corhuila/csp-booking-api/commit/af4b826c1b82b849cfc7eb4fe997dcdaef3ccdd9) | feat(security): merge PR #18 - carry the correlation id and validate the bearer RS256 |
| 05 Oct | main | [`2996eb5`](https://github.com/code-corhuila/csp-booking-api/commit/2996eb5bffde356923068e6c2be3617a33fc6c4f) | Merge pull request #19 from code-corhuila/release/0.1.0 |
| 05 Oct | develop | [`2eea8e9`](https://github.com/code-corhuila/csp-booking-api/commit/2eea8e9a75691bf34d15982c0aac1670f3e2cceb) | test(health): assert the message of the 503 of readiness |
| 05 Oct | develop | [`f951b6a`](https://github.com/code-corhuila/csp-booking-api/commit/f951b6a91bc40ba6b142fcf738de7f5188a96176) | feat(health): merge PR #21 - expose the liveness and readiness routes of the contract |
| 05 Oct | qa | [`0d38387`](https://github.com/code-corhuila/csp-booking-api/commit/0d3838726c1c9d5ea1046986b2a1d1a78f9b7bb5) | feat(health): merge PR #21 - expose the liveness and readiness routes of the contract |
| 05 Oct | main | [`758afb7`](https://github.com/code-corhuila/csp-booking-api/commit/758afb75e67aa1cb6f1f6d0a838e80050b5049d8) | chore(booking-api): bring release/0.1.0 up to date with main |
| 05 Oct | develop | [`21f9150`](https://github.com/code-corhuila/csp-booking-api/commit/21f9150b7367cc3c6f8eae1743d7fd8b9c820fdd) | fix(core): require the correlation id of the hold command |
| 05 Oct | develop | [`ba51cc8`](https://github.com/code-corhuila/csp-booking-api/commit/ba51cc8bf2234940520a868ed60260900a8a6aae) | docs(test): show the database url as an environment variable, not a credential |
| 05 Oct | develop | [`4075d57`](https://github.com/code-corhuila/csp-booking-api/commit/4075d5752fdd668dcc436abb27f6a8d43243a9d6) | feat(persistence): merge PR #23 - store the hold, its seats, the key and the event in one transaction |
| 05 Oct | qa | [`be1ae8a`](https://github.com/code-corhuila/csp-booking-api/commit/be1ae8a1881f2d7ba9e256c7a6f3f516e9b9af96) | feat(persistence): merge PR #23 - store the hold, its seats, the key and the event in one transaction |
| 05 Oct | develop | [`fb2577b`](https://github.com/code-corhuila/csp-booking-api/commit/fb2577b8969b71eb8065547a2d546d09d7d632f3) | feat(application): merge PR #26 - hold the seats of the request and answer the reservation |
| 05 Oct | qa | [`c846253`](https://github.com/code-corhuila/csp-booking-api/commit/c84625333239a8b59ecc112e5a1bc8607ef74d24) | feat(application): merge PR #26 - hold the seats of the request and answer the reservation |
| 05 Oct | develop | [`a7bc86c`](https://github.com/code-corhuila/csp-booking-api/commit/a7bc86c9c4fc98c75d96389c483c0bea3f0e5ef0) | feat(persistence): merge PR #27 - implement POST /holds |
| 05 Oct | qa | [`ed0930d`](https://github.com/code-corhuila/csp-booking-api/commit/ed0930d9e48ff2ec57ed378e8923c7ff7293b5cf) | feat(persistence): merge PR #27 - implement POST /holds |
| 05 Oct | develop | [`8fb9c1e`](https://github.com/code-corhuila/csp-booking-api/commit/8fb9c1ea4412fe31d5f7cf64513171e3a6136e8e) | feat(http): merge PR #28 - read the reservations of the caller behind the contract |
| 05 Oct | qa | [`15e4477`](https://github.com/code-corhuila/csp-booking-api/commit/15e447734cef0076f40856c49e11d02a10781a37) | feat(http): merge PR #28 - read the reservations of the caller behind the contract |
| 05 Oct | main | [`0f35ffa`](https://github.com/code-corhuila/csp-booking-api/commit/0f35ffaea99feefc505a02a9d4f520c02bfb9be6) | chore(booking-api): merge PR #22 - promote segment 2 to main (release/0.1.0) |
| 05 Oct | develop | [`2cb648a`](https://github.com/code-corhuila/csp-booking-api/commit/2cb648a851746028fc951ca32564b8393f7096f3) | feat(booking): add internal expire-holds endpoint for the expiration sweep |
| 05 Oct | develop | [`62e0a4b`](https://github.com/code-corhuila/csp-booking-api/commit/62e0a4bf2d1d9975668c5169fdb28c9bdf7b1af3) | fix(booking): release the seats of an expired hold and guard the transition |
| 06 Oct | qa | [`c1efc09`](https://github.com/code-corhuila/csp-booking-api/commit/c1efc092a30fef51685f442562644bd93af779a4) | feat(security): merge PR #30 - promote the correlation id and the bearer RS256 validation to qa |
| 06 Oct | main | [`200a074`](https://github.com/code-corhuila/csp-booking-api/commit/200a07449cc5e147f964b61bd801e7f23dcff8e6) | feat(security): merge PR #30 - promote the correlation id and the bearer RS256 validation to qa |
| 06 Oct | develop | [`34dc06d`](https://github.com/code-corhuila/csp-booking-api/commit/34dc06d39e4705d45b7416076326ce1971e825ee) | fix(booking): enforce the service token, survive a lost race and clear the log context |
| 06 Oct | develop | [`3788230`](https://github.com/code-corhuila/csp-booking-api/commit/37882303f40230b25e58756be709ddb3ccd297fb) | feat(booking): merge PR #29 - release the seats of an expired hold through an internal sweep |
| 06 Oct | qa | [`660aa7c`](https://github.com/code-corhuila/csp-booking-api/commit/660aa7cf7f5fdb68c60d5099f3d92c21b686908c) | feat(booking): merge PR #29 - release the seats of an expired hold through an internal sweep |
| 06 Oct | develop | [`eed05cb`](https://github.com/code-corhuila/csp-booking-api/commit/eed05cb515150ad5d9a3c3d1858b5d9859ccaaa6) | chore(ci): run the integration tests against PostgreSQL and document the sweep |
| 06 Oct | develop | [`bd73ed7`](https://github.com/code-corhuila/csp-booking-api/commit/bd73ed711e7ef3cbbbb5a4c757654c4c9dd25c36) | fix(ci): skip the PostgreSQL integration tests with a warning when the schema token is missing |
| 06 Oct | develop | [`97ddab8`](https://github.com/code-corhuila/csp-booking-api/commit/97ddab86d6fe70a93281b3e740274fd136dff760) | fix(ci): fail without the schema token and pin the csp-booking-db schema |
| 06 Oct | qa | [`2f8dbf7`](https://github.com/code-corhuila/csp-booking-api/commit/2f8dbf71e966015a327b154d717c8d2419d33a79) | chore(qa): bring the branch up to date with qa |
| 06 Oct | qa | [`677fb89`](https://github.com/code-corhuila/csp-booking-api/commit/677fb891431a33efbe1b920d0d78a002ef43a41b) | feat(health): merge PR #31 - promote the liveness and readiness routes to qa |
| 06 Oct | main | [`49809be`](https://github.com/code-corhuila/csp-booking-api/commit/49809be2fc18610340ce28c004eace4b8e904b9b) | feat(health): merge PR #31 - promote the liveness and readiness routes to qa |
| 06 Oct | qa | [`77182d2`](https://github.com/code-corhuila/csp-booking-api/commit/77182d2aae6f4a725ccd342172de24eaac186f91) | chore(qa): bring the branch up to date with qa |
| 06 Oct | qa | [`cf2e411`](https://github.com/code-corhuila/csp-booking-api/commit/cf2e4114594395e7607a01003bd8c2c2694cb39b) | feat(persistence): merge PR #33 - promote the transactional hold storage to qa |
| 06 Oct | main | [`212a7c5`](https://github.com/code-corhuila/csp-booking-api/commit/212a7c549fdca7ab3c7af1328c49e767bc89b05d) | feat(persistence): merge PR #33 - promote the transactional hold storage to qa |
| 06 Oct | develop | [`3992f28`](https://github.com/code-corhuila/csp-booking-api/commit/3992f28954e591145f9dfcd5709cca9bcdf347c3) | fix(ci): read the schema with a read-only deploy key |
| 06 Oct | develop | [`d72e504`](https://github.com/code-corhuila/csp-booking-api/commit/d72e504f73e40530ebbf38224d017809b15d0950) | fix(ci): create the login users before applying the booking schema |
| 06 Oct | develop | [`f273574`](https://github.com/code-corhuila/csp-booking-api/commit/f27357428dc7a4ac88423735158495fda44c2775) | test(persistence): count only the expiration events in the sweep tests |
| 06 Oct | qa | [`36630e0`](https://github.com/code-corhuila/csp-booking-api/commit/36630e02a3cfbe6203bba433845f592666cf17ce) | chore(qa): bring the branch up to date with qa |
| 06 Oct | qa | [`58f9f89`](https://github.com/code-corhuila/csp-booking-api/commit/58f9f8999213b4df250fe070efc64bbb519677e1) | feat(application): merge PR #34 - promote the hold use cases and reservation reads to qa |
| 06 Oct | main | [`8f98cec`](https://github.com/code-corhuila/csp-booking-api/commit/8f98cec6d255677156bb90035fdbb0e023c081de) | feat(application): merge PR #34 - promote the hold use cases and reservation reads to qa |
| 06 Oct | develop | [`caa0684`](https://github.com/code-corhuila/csp-booking-api/commit/caa06849fd7b06852139b081717fdbf16511dda2) | chore(ci): merge PR #32 - run the integration tests against PostgreSQL and document the sweep |
| 06 Oct | qa | [`f4994db`](https://github.com/code-corhuila/csp-booking-api/commit/f4994db8338200e9f9d0808e674813fc592631b3) | chore(ci): merge PR #32 - run the integration tests against PostgreSQL and document the sweep |
| 06 Oct | qa | [`c45f996`](https://github.com/code-corhuila/csp-booking-api/commit/c45f996b08de706e2ade445ceb9c0ae7844f2a09) | chore(qa): bring the branch up to date with qa |
| 06 Oct | qa | [`52287ec`](https://github.com/code-corhuila/csp-booking-api/commit/52287ecc92ce2cd853200641ee881d7e297c24f6) | feat(persistence): merge PR #35 - promote POST /holds to qa |
| 06 Oct | main | [`fe206d9`](https://github.com/code-corhuila/csp-booking-api/commit/fe206d97cfdfe49878e1d6344f107b468529b4da) | feat(persistence): merge PR #35 - promote POST /holds to qa |
| 06 Oct | qa | [`cef4ac2`](https://github.com/code-corhuila/csp-booking-api/commit/cef4ac2d02d9f43a1d8fa4672225f2b07c3b7a78) | chore(qa): bring the branch up to date with qa |
| 06 Oct | qa | [`bb85c85`](https://github.com/code-corhuila/csp-booking-api/commit/bb85c8535dd9c2ceb7163db5e9700a73697cb811) | feat(http): merge PR #36 - promote the reservation reads to qa |
| 06 Oct | main | [`b395ff7`](https://github.com/code-corhuila/csp-booking-api/commit/b395ff77b5bb60b328ba432251cf4cb26ecbd443) | feat(http): merge PR #36 - promote the reservation reads to qa |
| 06 Oct | develop | [`e654f01`](https://github.com/code-corhuila/csp-booking-api/commit/e654f010c4ecd026c147c1f7d78f4797bb774301) | feat(application): confirm a held reservation and publish BookingConfirmed |
| 06 Oct | qa | [`62ac65a`](https://github.com/code-corhuila/csp-booking-api/commit/62ac65aca373c7899a2f3830dedebeac0931c23b) | feat(booking): merge PR #37 - promote the expired-hold sweep to qa |
| 06 Oct | main | [`c3bb4a5`](https://github.com/code-corhuila/csp-booking-api/commit/c3bb4a5d20d6c17fe85200336e7067359deec18c) | feat(booking): merge PR #37 - promote the expired-hold sweep to qa |
| 06 Oct | qa | [`533f68a`](https://github.com/code-corhuila/csp-booking-api/commit/533f68abd5062ab183792c5cea285f988095bbc1) | chore(ci): merge PR #39 - promote the PostgreSQL integration tests and the sweep documentation to qa |
| 06 Oct | main | [`75d39f9`](https://github.com/code-corhuila/csp-booking-api/commit/75d39f94006e3e2057a73597aa589b7bea58f502) | chore(ci): merge PR #39 - promote the PostgreSQL integration tests and the sweep documentation to qa |
| 06 Oct | develop | [`c9cb5e5`](https://github.com/code-corhuila/csp-booking-api/commit/c9cb5e51ba69ad1d0c6a8d9e2f19f6a1e7e3919d) | docs(http): state that the confirm route does not replay the idempotency key |
| 06 Oct | develop | [`b76c488`](https://github.com/code-corhuila/csp-booking-api/commit/b76c48810403b5a52983c870a4690a655a2a1748) | feat(application): merge PR #38 - confirm a held reservation and publish BookingConfirmed |
| 06 Oct | qa | [`21ad73f`](https://github.com/code-corhuila/csp-booking-api/commit/21ad73f3d976c49e2593f872c93e64b88e0e27f9) | feat(application): merge PR #38 - confirm a held reservation and publish BookingConfirmed |
| 06 Oct | qa | [`c164266`](https://github.com/code-corhuila/csp-booking-api/commit/c16426640915e9d1d84e1d588d737cb6af420da3) | feat(application): merge PR #40 - promote the confirmation of a reservation to qa |
| 06 Oct | main | [`d908aed`](https://github.com/code-corhuila/csp-booking-api/commit/d908aedddb4f004554f632fde15ddf8195790b75) | feat(application): merge PR #40 - promote the confirmation of a reservation to qa |
| 06 Oct | develop | [`48d08a7`](https://github.com/code-corhuila/csp-booking-api/commit/48d08a74434398cbf00486c5b9e5c39f9542edc3) | fix(domain): split malformed reservations from rule violations and name the caller on access denial |
| 06 Oct | develop | [`50c8c29`](https://github.com/code-corhuila/csp-booking-api/commit/50c8c2980b83168c3990a8fbd5917d7a7080c738) | chore(deploy): dockerignore, layered build, healthcheck and the source of the capacity limits |
| 06 Oct | develop | [`1522e7b`](https://github.com/code-corhuila/csp-booking-api/commit/1522e7b422efa78e0c2fcd6da1fca68b902850a0) | docs(readme): point the compose reference at csp-infra-postgres |
| 07 Oct | develop | [`b9b667d`](https://github.com/code-corhuila/csp-booking-api/commit/b9b667dbd7fcd6957e3cb3fdeaf6cff5fe4b9093) | chore(api): merge PR #41 - domain error split, access denial context, README and deploy follow-ups |
| 07 Oct | qa | [`0725e1d`](https://github.com/code-corhuila/csp-booking-api/commit/0725e1d3328a527c35f91b99a9872dbdadd79223) | chore(api): merge PR #41 - domain error split, access denial context, README and deploy follow-ups |
| 07 Oct | develop | [`fa89e75`](https://github.com/code-corhuila/csp-booking-api/commit/fa89e756db76898fac3c1a20f68aa4818d983a3b) | refactor(auth): expose the authenticated identity through a port declared by booking-core |
| 07 Oct | develop | [`949964e`](https://github.com/code-corhuila/csp-booking-api/commit/949964e164a95fbcf52747f1692d6a040357e652) | refactor(auth): merge PR #44 - expose the authenticated identity through a port declared by booking-core |
| 07 Oct | qa | [`d38ace1`](https://github.com/code-corhuila/csp-booking-api/commit/d38ace1612f11f91b5cf553e388d0cf74f806e05) | refactor(auth): merge PR #44 - expose the authenticated identity through a port declared by booking-core |
| 07 Oct | qa | [`e3166df`](https://github.com/code-corhuila/csp-booking-api/commit/e3166df05a065ca9aadd415483252ab50048bfaa) | chore(api): merge PR #42 - promote PR #41 to qa, domain error split and deploy follow-ups |
| 07 Oct | main | [`7fd02c9`](https://github.com/code-corhuila/csp-booking-api/commit/7fd02c91abba096ea01aba4032288e7339ee1d91) | chore(api): merge PR #42 - promote PR #41 to qa, domain error split and deploy follow-ups |
| 07 Oct | qa | [`e298257`](https://github.com/code-corhuila/csp-booking-api/commit/e298257773fd9896bdcfc1823e331d1d09bef4b9) | refactor(auth): merge PR #45 - promote PR #44 to qa, authenticated caller port |
| 07 Oct | main | [`e93099c`](https://github.com/code-corhuila/csp-booking-api/commit/e93099cb33a08573dc4f5dd26b2f6406e250b709) | refactor(auth): merge PR #45 - promote PR #44 to qa, authenticated caller port |
| 07 Oct | develop | [`780e97f`](https://github.com/code-corhuila/csp-booking-api/commit/780e97f366505d86bfb3e5e56809b81a83271662) | fix(persistence): write the hold of the reservation on each reservation seat |
| 07 Oct | develop | [`91c5f6b`](https://github.com/code-corhuila/csp-booking-api/commit/91c5f6b7af156fb47d6cf848eb5a5afcc536e6d9) | fix(persistence): merge PR #46 - write the hold of the reservation on each reservation seat |
| 07 Oct | qa | [`f12f2f7`](https://github.com/code-corhuila/csp-booking-api/commit/f12f2f7fd6da874710b3feb0d1f9ad2f552f97b5) | fix(persistence): merge PR #46 - write the hold of the reservation on each reservation seat |
| 07 Oct | qa | [`a1b0881`](https://github.com/code-corhuila/csp-booking-api/commit/a1b08812b19ed5894d684a8015321c7ad92376e9) | fix(persistence): merge PR #47 - promote PR #46 to qa, write the hold on each reservation seat |
| 07 Oct | main | [`c643346`](https://github.com/code-corhuila/csp-booking-api/commit/c643346ac3424983af98aa98d50cf1391c0e0ef9) | fix(persistence): merge PR #47 - promote PR #46 to qa, write the hold on each reservation seat |
| 07 Oct | develop | [`f24db89`](https://github.com/code-corhuila/csp-booking-api/commit/f24db89a30379764207187c85a1341a8386db262) | fix(http): answer 503 when a write cannot open its database transaction |
| 08 Oct | develop | [`fab4b41`](https://github.com/code-corhuila/csp-booking-api/commit/fab4b41a5c98da4488faabcb2bb9c4ba340b9b28) | fix(http): log the root cause of a 503 and prove the repository throws the mapped exception |
| 08 Oct | develop | [`6a1bafc`](https://github.com/code-corhuila/csp-booking-api/commit/6a1bafc0b9cb236ba7202951ac48f4da464a5791) | fix(http): merge PR #48 - answer 503 when a write cannot open its database transaction |
| 08 Oct | qa | [`23a9560`](https://github.com/code-corhuila/csp-booking-api/commit/23a9560929d80406c23dc2d02d5c5a0ed3ecab88) | fix(http): merge PR #48 - answer 503 when a write cannot open its database transaction |
| 08 Oct | develop | [`b93aa01`](https://github.com/code-corhuila/csp-booking-api/commit/b93aa01f95020bea311bd0deed7f295787939d95) | docs(readme): describe the confirmation, the configuration and what is missing |
| 08 Oct | develop | [`78154c8`](https://github.com/code-corhuila/csp-booking-api/commit/78154c866d854b2d0312ea45e834d3d97197dfb0) | docs(readme): merge PR #49 - describe the confirmation, the configuration and what is missing |
| 08 Oct | qa | [`130c408`](https://github.com/code-corhuila/csp-booking-api/commit/130c408d1f597639473328bc913590c1308358d9) | docs(readme): merge PR #49 - describe the confirmation, the configuration and what is missing |
| 08 Oct | qa | [`72c476a`](https://github.com/code-corhuila/csp-booking-api/commit/72c476a49d748dab78414e8f20d9b6d3d15b3dae) | fix(http): merge PR #50 - promote PR #48 to qa, answer 503 when a write cannot open its transaction |
| 08 Oct | main | [`01dafce`](https://github.com/code-corhuila/csp-booking-api/commit/01dafce7e3b9454035f8caf8ddc05008c58e3d47) | fix(http): merge PR #50 - promote PR #48 to qa, answer 503 when a write cannot open its transaction |
| 08 Oct | qa | [`129853f`](https://github.com/code-corhuila/csp-booking-api/commit/129853f6564d8c680229f5a4101001c684e63696) | Merge branch 'qa' into qa-promote/booking-api-readme |
| 08 Oct | qa | [`3d651de`](https://github.com/code-corhuila/csp-booking-api/commit/3d651de58f4e71b6cd87dc9da396bf8c9497290d) | docs(readme): merge PR #51 - promote PR #49 to qa, describe the confirmation and the configuration |
| 08 Oct | main | [`8476c3d`](https://github.com/code-corhuila/csp-booking-api/commit/8476c3dfe9fe5a2ef88534cf250a092346171486) | docs(readme): merge PR #51 - promote PR #49 to qa, describe the confirmation and the configuration |
| 08 Oct | develop | [`d1df2d5`](https://github.com/code-corhuila/csp-booking-api/commit/d1df2d5ceddb90ff0dc7ca630a54d7fe0d76193a) | docs(changelog): add the changelog of the 2.0.0 release |
| 08 Oct | develop | [`3b48b18`](https://github.com/code-corhuila/csp-booking-api/commit/3b48b18016ccf097ed9da696fde98deff3379430) | docs(changelog): merge PR #52 - add the changelog of the 2.0.0 release |
| 08 Oct | qa | [`bb640e6`](https://github.com/code-corhuila/csp-booking-api/commit/bb640e6ddd4948a22b8f3c8bec8d0fbb36026ed8) | docs(changelog): merge PR #52 - add the changelog of the 2.0.0 release |
| 09 Oct | qa | [`3f901fa`](https://github.com/code-corhuila/csp-booking-api/commit/3f901fa1fdf84ff0f7701432390e30d322c5a7d5) | docs(changelog): merge PR #53 - promote the changelog of the 2.0.0 release to qa |
| 09 Oct | main | [`42628d5`](https://github.com/code-corhuila/csp-booking-api/commit/42628d5fd4f1e458cf047c35976f8ce015384c14) | docs(changelog): merge PR #53 - promote the changelog of the 2.0.0 release to qa |
| 11 Oct | main | [`dd1c81f`](https://github.com/code-corhuila/csp-booking-api/commit/dd1c81fb825be225151c3d03e118b40367068787) | feat(booking-api): merge PR #54 - promote HU-BOOKING-001, HU-BOOKING-002 and HU-BOOKING-003 from qa to main (release/2.0.0) |

[Back to summary](#summary)

---

<a id="csp-booking-db"></a>
## `csp-booking-db` (44 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Oct | qa | [`44b08ae`](https://github.com/code-corhuila/csp-booking-db/commit/44b08aefa16267c52f0559ca3a83ebd31b66791a) | Merge remote-tracking branch 'origin/qa' into qa-promote/booking-db-base-1 |
| 05 Oct | qa | [`01b25cc`](https://github.com/code-corhuila/csp-booking-db/commit/01b25cc378bfb0ab09be2b10dc3c94488a82dc81) | Merge pull request #11 from code-corhuila/qa-promote/booking-db-base-1 |
| 05 Oct | main | [`4fec9c2`](https://github.com/code-corhuila/csp-booking-db/commit/4fec9c2c42e5d842027f4dfc87e1f6e7c8f69c31) | Merge pull request #11 from code-corhuila/qa-promote/booking-db-base-1 |
| 05 Oct | develop | [`290d8a7`](https://github.com/code-corhuila/csp-booking-db/commit/290d8a78ccb39095f10c137ecb753bdd3867aa49) | feat(tables): merge PR #15 - create the booking hold, reservation, idempotency and outbox tables |
| 05 Oct | qa | [`bd95064`](https://github.com/code-corhuila/csp-booking-db/commit/bd95064df53ecb49d888d4ca5fad8799abcb3749) | feat(tables): merge PR #15 - create the booking hold, reservation, idempotency and outbox tables |
| 05 Oct | main | [`4656de8`](https://github.com/code-corhuila/csp-booking-db/commit/4656de8611342edff59b7c4374a16f556819e2dd) | Merge pull request #16 from code-corhuila/release/0.1.0 |
| 05 Oct | qa | [`04b7d65`](https://github.com/code-corhuila/csp-booking-db/commit/04b7d658faef4123c0b3a1ebec5f5cc7a9db660b) | chore(booking-db): merge PR #19 - promote the booking tables to qa |
| 05 Oct | main | [`9bcd79a`](https://github.com/code-corhuila/csp-booking-db/commit/9bcd79a96b1199b4b77e9bb5584c53bd0745641c) | chore(booking-db): merge PR #19 - promote the booking tables to qa |
| 07 Oct | develop | [`5e19857`](https://github.com/code-corhuila/csp-booking-db/commit/5e19857a490bea1afe7859bafcd846428b46022b) | fix(rollback): make U001 refuse a partial or out-of-order schema drop |
| 07 Oct | develop | [`f0f237b`](https://github.com/code-corhuila/csp-booking-db/commit/f0f237b04436d585cba0bca8083ba872ae6a4a2b) | test(rollback): check that U001 also refuses while the roles of V002 exist |
| 07 Oct | develop | [`fd43004`](https://github.com/code-corhuila/csp-booking-db/commit/fd4300466026c8ff599a041be8c437259e0f8eff) | fix(outbox): remove the unused DELETE grant and document the absence of a purge |
| 07 Oct | develop | [`e3f3451`](https://github.com/code-corhuila/csp-booking-db/commit/e3f345187279befab38a4ab75dad2638396ffa53) | fix(rollback): merge PR #27 - make U001 refuse a partial or out-of-order schema drop |
| 07 Oct | qa | [`61a29dc`](https://github.com/code-corhuila/csp-booking-db/commit/61a29dc249c3cba84990280f274aca90fb950cbd) | fix(rollback): merge PR #27 - make U001 refuse a partial or out-of-order schema drop |
| 07 Oct | develop | [`dee1607`](https://github.com/code-corhuila/csp-booking-db/commit/dee16079317006176287e9237377328290965fce) | chore(booking-db): sync fix/booking-db-outbox-retention with develop |
| 07 Oct | develop | [`6b63fd1`](https://github.com/code-corhuila/csp-booking-db/commit/6b63fd1e5bff823fa8cd1a31138d691880896e80) | fix(seat-hold): tie seat_hold_item and reservation_seat to their hold |
| 07 Oct | develop | [`02fe58b`](https://github.com/code-corhuila/csp-booking-db/commit/02fe58b5af310b3a26ae6cd04b60a6ba10387c24) | fix(outbox): merge PR #28 - remove the unused DELETE grant and document the absence of a purge |
| 07 Oct | qa | [`132bc4d`](https://github.com/code-corhuila/csp-booking-db/commit/132bc4d9213ccd15bbd0adeb922bae2a280ca28c) | fix(outbox): merge PR #28 - remove the unused DELETE grant and document the absence of a purge |
| 07 Oct | develop | [`a3116fb`](https://github.com/code-corhuila/csp-booking-db/commit/a3116fb284cb028d9d4c346bfdc3414fc7e54deb) | Merge remote-tracking branch 'origin/develop' into fix/booking-db-seat-integrity |
| 07 Oct | qa | [`c2c34e3`](https://github.com/code-corhuila/csp-booking-db/commit/c2c34e3a5c89427bc32352b94c4e1a12e26947d1) | fix(rollback): merge PR #29 - promote PR #27 to qa, U001 ordering guard |
| 07 Oct | main | [`28dd412`](https://github.com/code-corhuila/csp-booking-db/commit/28dd412b8b4052c05755e86602f4f367454c2572) | fix(rollback): merge PR #29 - promote PR #27 to qa, U001 ordering guard |
| 07 Oct | develop | [`10740a0`](https://github.com/code-corhuila/csp-booking-db/commit/10740a0b41cf1cd277dd15e36fb2a4837a88cf3e) | test(seat-hold): make db-ci refuse the inconsistent rows the V011 keys exist for |
| 07 Oct | qa | [`ccccdeb`](https://github.com/code-corhuila/csp-booking-db/commit/ccccdebeeb16e15a239e7d46328a0c1bd3872e3a) | fix(outbox): merge PR #31 - promote PR #28 to qa, unused DELETE grant removed |
| 07 Oct | main | [`bad2d47`](https://github.com/code-corhuila/csp-booking-db/commit/bad2d47e88b2f0db97f532f1f23f7ee51d3b66da) | fix(outbox): merge PR #31 - promote PR #28 to qa, unused DELETE grant removed |
| 07 Oct | develop | [`67b219a`](https://github.com/code-corhuila/csp-booking-db/commit/67b219a70841d76c57a3e6c6178200839b1da0a0) | fix(seat-hold): merge PR #30 - tie seat_hold_item and reservation_seat to their hold |
| 07 Oct | qa | [`e7c4046`](https://github.com/code-corhuila/csp-booking-db/commit/e7c4046bf197160c8132ff43afa7645c1bfb087b) | fix(seat-hold): merge PR #30 - tie seat_hold_item and reservation_seat to their hold |
| 07 Oct | qa | [`aae6f01`](https://github.com/code-corhuila/csp-booking-db/commit/aae6f01ed1fa4c417e2fe97dedf79205375aea18) | fix(seat-hold): merge PR #32 - promote PR #30 to qa, seat integrity keys |
| 07 Oct | main | [`04f535e`](https://github.com/code-corhuila/csp-booking-db/commit/04f535efa5b0b151fc210efa634cd46fd8a216d7) | fix(seat-hold): merge PR #32 - promote PR #30 to qa, seat integrity keys |
| 08 Oct | develop | [`2171fdb`](https://github.com/code-corhuila/csp-booking-db/commit/2171fdb5f57a0faee9f238f48be254c6bbdb8299) | docs(readme): describe the tables of Cut 2 and what is missing |
| 08 Oct | develop | [`a389c38`](https://github.com/code-corhuila/csp-booking-db/commit/a389c38d94de57807a8daca2b1a020ded81c41c3) | docs(readme): merge PR #33 - describe the tables of Cut 2 and what is missing |
| 08 Oct | qa | [`488809b`](https://github.com/code-corhuila/csp-booking-db/commit/488809b9632530f6606aee61f7a3fea94bf6f053) | docs(readme): merge PR #33 - describe the tables of Cut 2 and what is missing |
| 08 Oct | qa | [`1639706`](https://github.com/code-corhuila/csp-booking-db/commit/1639706498ecea8bf59723c0c3f4973a76db7534) | docs(readme): merge PR #34 - promote PR #33 to qa, describe the tables of Cut 2 |
| 08 Oct | main | [`9fcda14`](https://github.com/code-corhuila/csp-booking-db/commit/9fcda14ca7ae7c8429f467116f2b177eeab55e89) | docs(readme): merge PR #34 - promote PR #33 to qa, describe the tables of Cut 2 |
| 08 Oct | develop | [`db95e65`](https://github.com/code-corhuila/csp-booking-db/commit/db95e65d7f65d389fb63ea0e9f76a501ef635f89) | docs(changelog): add the changelog of the 2.0.0 release |
| 08 Oct | develop | [`5d58385`](https://github.com/code-corhuila/csp-booking-db/commit/5d5838561266697ad6d8a504d6a17066b88e07a7) | docs(changelog): merge PR #35 - add the changelog of the 2.0.0 release |
| 08 Oct | qa | [`7310c3b`](https://github.com/code-corhuila/csp-booking-db/commit/7310c3b91007b8916d9ec1fc57d38a4309c4eabb) | docs(changelog): merge PR #35 - add the changelog of the 2.0.0 release |
| 09 Oct | qa | [`7e525a4`](https://github.com/code-corhuila/csp-booking-db/commit/7e525a4bd2af1a60fef1eafed7cf9c991d97a685) | docs(changelog): merge PR #36 - promote the changelog of the 2.0.0 release to qa |
| 09 Oct | main | [`01c7b4a`](https://github.com/code-corhuila/csp-booking-db/commit/01c7b4ae1c5ceb6f5bcccbceedbf644c59969d80) | docs(changelog): merge PR #36 - promote the changelog of the 2.0.0 release to qa |
| 09 Oct | develop | [`2470a33`](https://github.com/code-corhuila/csp-booking-db/commit/2470a3368b7996a24feba9f3b660fbdcc82e2ef8) | chore(seat-hold): drop the single-column foreign key that V011 made redundant |
| 09 Oct | develop | [`3a9ba66`](https://github.com/code-corhuila/csp-booking-db/commit/3a9ba66cb57828634166d54d10b712599ee6f9fb) | chore(seat-hold): remove a temporary file left by a local run of the rebuild |
| 10 Oct | develop | [`8c9c7e8`](https://github.com/code-corhuila/csp-booking-db/commit/8c9c7e810419996a814f6e13f056282a8f3bac41) | chore(seat-hold): merge PR #39 - drop the single-column foreign key that V011 made redundant |
| 10 Oct | qa | [`27ccd87`](https://github.com/code-corhuila/csp-booking-db/commit/27ccd8738dac606f97fd41448bfe01e93ef522fc) | chore(seat-hold): merge PR #39 - drop the single-column foreign key that V011 made redundant |
| 10 Oct | qa | [`932a09e`](https://github.com/code-corhuila/csp-booking-db/commit/932a09e254800c4fe5f6f382ef3a0a89df441277) | chore(seat-hold): merge PR #40 - promote PR #39 to qa, redundant seat_hold_item key dropped |
| 10 Oct | main | [`e2a17cd`](https://github.com/code-corhuila/csp-booking-db/commit/e2a17cd8227ccf520251ca483692e3fa628f67ad) | chore(seat-hold): merge PR #40 - promote PR #39 to qa, redundant seat_hold_item key dropped |
| 11 Oct | main | [`6627f8a`](https://github.com/code-corhuila/csp-booking-db/commit/6627f8a5acfbbc28f307d28b2d1c482e72d12b1b) | feat(booking-db): merge PR #37 - promote the booking schema of HU-BOOKING-001 to HU-BOOKING-003 from qa to main (release/2.0.0) |

[Back to summary](#summary)

---

<a id="csp-booking-portal"></a>
## `csp-booking-portal` (87 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Oct | qa | [`0f936df`](https://github.com/code-corhuila/csp-booking-portal/commit/0f936dfff528d057eda054990d487f5780068e64) | Merge pull request #16 from code-corhuila/qa-promote/booking-portal-base-1 |
| 05 Oct | main | [`a8a5a56`](https://github.com/code-corhuila/csp-booking-portal/commit/a8a5a5650177bf3e28fd0c036fb573afbb382538) | Merge pull request #16 from code-corhuila/qa-promote/booking-portal-base-1 |
| 05 Oct | main | [`6826413`](https://github.com/code-corhuila/csp-booking-portal/commit/6826413a80a60ed7b55daa98d8daa0d948a49028) | Merge pull request #17 from code-corhuila/release/0.1.0 |
| 06 Oct | develop | [`b0ad701`](https://github.com/code-corhuila/csp-booking-portal/commit/b0ad701432ab3d3e064cec188d291bdd99a0aa7a) | feat(booking): add the Dark Cinema Neon theme as a scoped layout |
| 06 Oct | develop | [`ced97f1`](https://github.com/code-corhuila/csp-booking-portal/commit/ced97f1c96adc37620e43bde0d8c8856e2c96095) | fix(booking): keep booking ids on one line and let the table scroll |
| 06 Oct | develop | [`351455e`](https://github.com/code-corhuila/csp-booking-portal/commit/351455e38a6eec8a7203be89ff522bc9e7b3b890) | style(booking): remove the default body margin when the portal runs standalone |
| 07 Oct | develop | [`d098198`](https://github.com/code-corhuila/csp-booking-portal/commit/d098198c38712859f3fa49f8801dbe966366163c) | feat(booking): merge PR #22 - add the Dark Cinema Neon theme as a scoped layout |
| 07 Oct | qa | [`36d81d9`](https://github.com/code-corhuila/csp-booking-portal/commit/36d81d9f4693ab0cbb20751f8432549c6a7b2bcb) | feat(booking): merge PR #22 - add the Dark Cinema Neon theme as a scoped layout |
| 07 Oct | develop | [`129d886`](https://github.com/code-corhuila/csp-booking-portal/commit/129d886920b21c3214518d4217f1b94ac0807254) | feat(booking): confirm a held reservation from the checkout page |
| 07 Oct | develop | [`51346dd`](https://github.com/code-corhuila/csp-booking-portal/commit/51346dd0a4670166d8b86dc5c97d5e0904608b08) | style(booking): lay out the reservation summary as label and value |
| 07 Oct | develop | [`0cf7f87`](https://github.com/code-corhuila/csp-booking-portal/commit/0cf7f8752cd3599def6ae593cfb4b436b6a2bea8) | fix(booking): re-read the reservation after a failed confirmation and follow the :id param |
| 07 Oct | develop | [`b26f4f8`](https://github.com/code-corhuila/csp-booking-portal/commit/b26f4f897be419a0e8734566b56d425e9a12fb52) | feat(booking): merge PR #23 - confirm a held reservation from the checkout page |
| 07 Oct | qa | [`a5b5169`](https://github.com/code-corhuila/csp-booking-portal/commit/a5b5169eec3fdd1f92d399e027fb0861be0fd903) | feat(booking): merge PR #23 - confirm a held reservation from the checkout page |
| 07 Oct | develop | [`76d310c`](https://github.com/code-corhuila/csp-booking-portal/commit/76d310c4af8cccdf9b5e2e064173495a32daa525) | feat(booking): count down the hold from expiresAt on the checkout page |
| 07 Oct | develop | [`8a695f0`](https://github.com/code-corhuila/csp-booking-portal/commit/8a695f07e28df5e2e54b224c12f62b64cb93e4a2) | feat(booking): pick seats on the showtime map and create the hold |
| 07 Oct | develop | [`c07ad25`](https://github.com/code-corhuila/csp-booking-portal/commit/c07ad255910fdc6b360ba8b8f356f27a07948ac6) | test(booking): cover a failed reconciliation read after a failed confirmation |
| 07 Oct | develop | [`d492554`](https://github.com/code-corhuila/csp-booking-portal/commit/d4925543668517d5daa1d52310d17713809404bb) | feat(booking): explain a seat conflict and let the client pick again |
| 07 Oct | develop | [`d0d377b`](https://github.com/code-corhuila/csp-booking-portal/commit/d0d377bf5e242404208b892a10d940ec71930ba1) | feat(booking): merge PR #24 - pick seats on the showtime map and create the hold |
| 07 Oct | qa | [`9139402`](https://github.com/code-corhuila/csp-booking-portal/commit/9139402c266bfe67182cdcb926c5bea077a544ef) | feat(booking): merge PR #24 - pick seats on the showtime map and create the hold |
| 07 Oct | develop | [`e831d2c`](https://github.com/code-corhuila/csp-booking-portal/commit/e831d2c9ca6bccd260148ccebc2e22dad0e3db88) | test(booking): check the synthetic showtimes against what the Booking API requires |
| 07 Oct | develop | [`76b15b4`](https://github.com/code-corhuila/csp-booking-portal/commit/76b15b4640e8a377fddd95bcf30ec6225c2ce6f6) | chore(booking): update the branch with develop after PR #24 |
| 07 Oct | develop | [`92f7d56`](https://github.com/code-corhuila/csp-booking-portal/commit/92f7d56385ac3aadf7f30f75a8ba1893e4e37285) | fix(booking): treat a seat conflict only as 422 with BUSINESS_RULE_VIOLATION |
| 07 Oct | develop | [`f29f26e`](https://github.com/code-corhuila/csp-booking-portal/commit/f29f26e3db2325784cf5286e1343250b93440dff) | fix(booking): join the conflict reason and the clarification as two sentences |
| 07 Oct | develop | [`c10b9d6`](https://github.com/code-corhuila/csp-booking-portal/commit/c10b9d6e9e968247a6a6c681f324643f976d0a43) | feat(booking): merge PR #25 - explain a seat conflict and let the client pick again |
| 07 Oct | qa | [`236f91e`](https://github.com/code-corhuila/csp-booking-portal/commit/236f91e4d4d300f153763316c5105a7a63af4e58) | feat(booking): merge PR #25 - explain a seat conflict and let the client pick again |
| 07 Oct | develop | [`a10bb6e`](https://github.com/code-corhuila/csp-booking-portal/commit/a10bb6e4618e3dda472b66cd362ca93502703786) | feat(booking): show burned-in sample reservations when the Booking service cannot answer |
| 07 Oct | qa | [`392d57d`](https://github.com/code-corhuila/csp-booking-portal/commit/392d57ddce234e5d9641d430d02922830c3ae00a) | chore(booking-portal): merge PR #26 - promote the Dark Cinema Neon theme layout to qa |
| 07 Oct | main | [`b99e232`](https://github.com/code-corhuila/csp-booking-portal/commit/b99e23217704f7e46192b33d5b9c5eb7aeb00d07) | chore(booking-portal): merge PR #26 - promote the Dark Cinema Neon theme layout to qa |
| 07 Oct | develop | [`f8ae07b`](https://github.com/code-corhuila/csp-booking-portal/commit/f8ae07bcf91eb28a3f3cb466cf74956d58283762) | test(booking): guard that every rule of the layout stylesheet is scoped under .csp-booking |
| 07 Oct | develop | [`3c38dba`](https://github.com/code-corhuila/csp-booking-portal/commit/3c38dba9422c0b04e6da5cd1299800b41a54cecc) | feat(booking): merge PR #28 - show burned-in sample reservations when the Booking service cannot answer |
| 07 Oct | qa | [`d6ebedf`](https://github.com/code-corhuila/csp-booking-portal/commit/d6ebedfe53bee0b92a91439ba4ba93bf60207605) | feat(booking): merge PR #28 - show burned-in sample reservations when the Booking service cannot answer |
| 07 Oct | develop | [`393712b`](https://github.com/code-corhuila/csp-booking-portal/commit/393712beaa734944ca15f3d1bcae802d2e03a063) | chore(booking): update the branch with develop after PR #28 |
| 07 Oct | qa | [`ec0e5af`](https://github.com/code-corhuila/csp-booking-portal/commit/ec0e5afc9e8c7843c4cc22f7a780455fa391cee5) | chore(booking-portal): update the branch with qa after PR #26 |
| 07 Oct | qa | [`9a29fa7`](https://github.com/code-corhuila/csp-booking-portal/commit/9a29fa7ce608d843d3f83b721db059ca480f4187) | feat(booking-portal): merge PR #29 - promote the checkout and confirmation of a hold to qa |
| 07 Oct | main | [`557cbbb`](https://github.com/code-corhuila/csp-booking-portal/commit/557cbbb9788afa998610c7937a9e58162c4ce086) | feat(booking-portal): merge PR #29 - promote the checkout and confirmation of a hold to qa |
| 07 Oct | qa | [`c18ed1e`](https://github.com/code-corhuila/csp-booking-portal/commit/c18ed1e9f4f20decc33011b3b6f1d9fecd1e5234) | chore(booking-portal): update the branch with qa after PR #29 |
| 07 Oct | develop | [`46b2486`](https://github.com/code-corhuila/csp-booking-portal/commit/46b2486eb0df6c0f25a04aaedce945e3ec5b7898) | test(booking): find the layout stylesheet by its rule, reject global at-rules and test the helpers |
| 07 Oct | qa | [`0bea589`](https://github.com/code-corhuila/csp-booking-portal/commit/0bea589870e5c03e5e46dcbcc6a4f35bd666ddec) | feat(booking-portal): merge PR #33 - promote the seat map and the hold creation to qa |
| 07 Oct | main | [`da1a53a`](https://github.com/code-corhuila/csp-booking-portal/commit/da1a53af5276cf6cf2065892e5a483a45f3129d1) | feat(booking-portal): merge PR #33 - promote the seat map and the hold creation to qa |
| 07 Oct | qa | [`9583a79`](https://github.com/code-corhuila/csp-booking-portal/commit/9583a79d4b11f566ca634be89ea5a1e3c603f172) | chore(booking-portal): update the branch with qa after PR #33 |
| 08 Oct | qa | [`24ca3df`](https://github.com/code-corhuila/csp-booking-portal/commit/24ca3df2f2beec611588b132a99928773e7e2ef2) | feat(booking-portal): merge PR #36 - promote the seat conflict handling to qa |
| 08 Oct | main | [`c5d88b2`](https://github.com/code-corhuila/csp-booking-portal/commit/c5d88b22cd50d0059aaf345456f0a213c9760496) | feat(booking-portal): merge PR #36 - promote the seat conflict handling to qa |
| 08 Oct | qa | [`a33de48`](https://github.com/code-corhuila/csp-booking-portal/commit/a33de4863a78a20f44ae0c60b09a2aff9638e5a7) | chore(booking-portal): update the branch with qa after PR #36 |
| 08 Oct | develop | [`245bb9f`](https://github.com/code-corhuila/csp-booking-portal/commit/245bb9febc7071e9e0b8fef5cdffb43673cf36ec) | test(booking): prove the stylesheet guards on bad stylesheets and respect quoted commas |
| 08 Oct | develop | [`28d1112`](https://github.com/code-corhuila/csp-booking-portal/commit/28d11125cd44ba56f295897410034394bd5477d6) | test(booking): merge PR #34 - guard the layout stylesheet scope |
| 08 Oct | qa | [`16684eb`](https://github.com/code-corhuila/csp-booking-portal/commit/16684eba275bd209faf650275aa5eb0149b1f589) | test(booking): merge PR #34 - guard the layout stylesheet scope |
| 08 Oct | develop | [`7c5d031`](https://github.com/code-corhuila/csp-booking-portal/commit/7c5d031d6c66d090ea5643b47c1910b4240693e9) | feat(booking): add the administration view of the reservations with sample data |
| 08 Oct | qa | [`78815db`](https://github.com/code-corhuila/csp-booking-portal/commit/78815db1a5acc70ea7fbdcb899a866091637a4be) | feat(booking): merge PR #37 - promote the sample reservations to qa |
| 08 Oct | main | [`38d473c`](https://github.com/code-corhuila/csp-booking-portal/commit/38d473c5f0427aa0da04277feefd62c177092194) | feat(booking): merge PR #37 - promote the sample reservations to qa |
| 08 Oct | develop | [`f648d78`](https://github.com/code-corhuila/csp-booking-portal/commit/f648d78ba2540599a26b95731090c714aeffa3d6) | feat(booking): merge PR #39 - add the admin reservations view with sample data |
| 08 Oct | qa | [`3986d67`](https://github.com/code-corhuila/csp-booking-portal/commit/3986d67fc35f861fbdff232c7885395bab884971) | feat(booking): merge PR #39 - add the admin reservations view with sample data |
| 08 Oct | develop | [`906e4b8`](https://github.com/code-corhuila/csp-booking-portal/commit/906e4b8dce2c22232fccd2c9f841e23a109b8b67) | docs(readme): document the routes, the shell contract and what is missing |
| 08 Oct | qa | [`114143c`](https://github.com/code-corhuila/csp-booking-portal/commit/114143c2a200a643091916a86526ed57b57b7938) | test(booking): merge PR #40 - promote the layout stylesheet scope guard to qa |
| 08 Oct | main | [`f0625a6`](https://github.com/code-corhuila/csp-booking-portal/commit/f0625a6d1e0782fd9a1a15bc7484a8e1edec812b) | test(booking): merge PR #40 - promote the layout stylesheet scope guard to qa |
| 08 Oct | qa | [`a17d9ea`](https://github.com/code-corhuila/csp-booking-portal/commit/a17d9ea287cde0001c95eafed290b248f4e13810) | chore(booking-portal): update the branch with qa after PR #40 |
| 08 Oct | develop | [`9726aac`](https://github.com/code-corhuila/csp-booking-portal/commit/9726aac69d7a2b7a0b2dc15a21d64c3565e9d969) | docs(readme): merge PR #41 - document the routes, the shell contract and what is missing |
| 08 Oct | qa | [`32974da`](https://github.com/code-corhuila/csp-booking-portal/commit/32974da1833e933e24a39ca256046549a4e47e6e) | docs(readme): merge PR #41 - document the routes, the shell contract and what is missing |
| 08 Oct | qa | [`b1377eb`](https://github.com/code-corhuila/csp-booking-portal/commit/b1377ebf55c6de864d74efe841654fefc337a66a) | feat(booking): merge PR #43 - promote the admin reservations view to qa |
| 08 Oct | main | [`5537d5c`](https://github.com/code-corhuila/csp-booking-portal/commit/5537d5c678b01be6a2ad4427b93f626c8fdbda0e) | feat(booking): merge PR #43 - promote the admin reservations view to qa |
| 08 Oct | qa | [`c4a75e0`](https://github.com/code-corhuila/csp-booking-portal/commit/c4a75e0916b2d2abd78b9a22c9703e8d156b1d5d) | docs(readme): merge PR #44 - promote PR #41 to qa, document the routes and the shell contract |
| 08 Oct | main | [`f531d3b`](https://github.com/code-corhuila/csp-booking-portal/commit/f531d3b049af893831ba36b92736721c7a6325de) | docs(readme): merge PR #44 - promote PR #41 to qa, document the routes and the shell contract |
| 08 Oct | develop | [`a8a611a`](https://github.com/code-corhuila/csp-booking-portal/commit/a8a611a72905b317fcdb1812a422f4886aa751e9) | refactor(booking): expose the administration view as its own federated entry |
| 08 Oct | develop | [`07c474e`](https://github.com/code-corhuila/csp-booking-portal/commit/07c474e3ff64221551adf0cc16934dd3bbf683e2) | chore(deploy): normalize the deploy and CI files to LF |
| 08 Oct | develop | [`60a68e8`](https://github.com/code-corhuila/csp-booking-portal/commit/60a68e80ee2ffe264e365999dd7dc1023d912d11) | fix(deploy): let the shell load the portal container by sending CORS headers |
| 08 Oct | develop | [`0320f2c`](https://github.com/code-corhuila/csp-booking-portal/commit/0320f2cd94b87b876ae2dfe37f36b1c044b33367) | chore(deploy): merge PR #46 - normalize the deploy and CI files to LF |
| 08 Oct | qa | [`b72d4b2`](https://github.com/code-corhuila/csp-booking-portal/commit/b72d4b2c77bf128e32f39dcc7ca1d328a66dadf0) | chore(deploy): merge PR #46 - normalize the deploy and CI files to LF |
| 08 Oct | develop | [`e5b5384`](https://github.com/code-corhuila/csp-booking-portal/commit/e5b5384abb18ca08922d63df4fea298ec2858010) | refactor(booking): rely on the shell role guard for the administration view |
| 08 Oct | develop | [`609dd9b`](https://github.com/code-corhuila/csp-booking-portal/commit/609dd9b91079d23fed596928cb5af38d8c42b0ef) | chore(booking-portal): update the branch with develop |
| 08 Oct | develop | [`03a0e5f`](https://github.com/code-corhuila/csp-booking-portal/commit/03a0e5f3d265eb405418a4c7b83ae1a3d38efbfa) | fix(deploy): merge PR #47 - let the shell load the portal container by sending CORS headers |
| 08 Oct | qa | [`a5495fe`](https://github.com/code-corhuila/csp-booking-portal/commit/a5495fe1e297bfeea41d7fad45dda2c3ce5e2c5e) | fix(deploy): merge PR #47 - let the shell load the portal container by sending CORS headers |
| 08 Oct | develop | [`4dcc9d8`](https://github.com/code-corhuila/csp-booking-portal/commit/4dcc9d87cb6628d6f749e2c000cab6593c83a07e) | chore(booking-portal): update the branch with develop after PR #47 |
| 08 Oct | qa | [`fa96dd8`](https://github.com/code-corhuila/csp-booking-portal/commit/fa96dd80c4f4589de8c0058bce7c5b7709986b46) | chore(deploy): merge PR #48 - promote the LF normalization of the deploy and CI files to qa (segment 1) |
| 08 Oct | main | [`1d889a3`](https://github.com/code-corhuila/csp-booking-portal/commit/1d889a30a4ae505ad365cae53e5a332f38f8aa75) | chore(deploy): merge PR #48 - promote the LF normalization of the deploy and CI files to qa (segment 1) |
| 08 Oct | develop | [`0493462`](https://github.com/code-corhuila/csp-booking-portal/commit/0493462a72b1bf8d0002ad2dfa7a9e69e222c77d) | refactor(booking): merge PR #45 - expose the administration view as its own federated entry |
| 08 Oct | qa | [`cee8565`](https://github.com/code-corhuila/csp-booking-portal/commit/cee85656ffedfb5b343f999ddb01c290e41a51c6) | refactor(booking): merge PR #45 - expose the administration view as its own federated entry |
| 08 Oct | qa | [`ebba246`](https://github.com/code-corhuila/csp-booking-portal/commit/ebba2460a3256ba7ac327eb5a2f95b2633d20143) | chore(booking-portal): update the branch with qa after PR #48 |
| 08 Oct | qa | [`2f29eb1`](https://github.com/code-corhuila/csp-booking-portal/commit/2f29eb1f4df160d41155645be2ccfdf1c3451ddf) | fix(deploy): merge PR #49 - promote the CORS headers of the portal container to qa (segment 2) |
| 08 Oct | main | [`8433453`](https://github.com/code-corhuila/csp-booking-portal/commit/84334532b0abefc1a7cdb2e82f635b88ad0b0e26) | fix(deploy): merge PR #49 - promote the CORS headers of the portal container to qa (segment 2) |
| 08 Oct | qa | [`3be6cd8`](https://github.com/code-corhuila/csp-booking-portal/commit/3be6cd8565da92c228914fff2d032103c1230e76) | chore(booking-portal): update the branch with qa after PR #49 |
| 08 Oct | qa | [`1261460`](https://github.com/code-corhuila/csp-booking-portal/commit/12614603ab05105f2979806c879027b9bee1fd6d) | refactor(booking): merge PR #50 - promote the admin entry of the reservations view to qa |
| 08 Oct | main | [`ad2a5eb`](https://github.com/code-corhuila/csp-booking-portal/commit/ad2a5ebdc3d5a364abce15ff6debe0faefd1ca5e) | refactor(booking): merge PR #50 - promote the admin entry of the reservations view to qa |
| 08 Oct | develop | [`5582969`](https://github.com/code-corhuila/csp-booking-portal/commit/558296912444749371bb10f1089b58b87c1a3504) | docs(changelog): add the changelog of the 2.0.0 release |
| 08 Oct | develop | [`0d7a1a9`](https://github.com/code-corhuila/csp-booking-portal/commit/0d7a1a9d6a0aa34fbda12c8bef8d776d9232f714) | docs(changelog): merge PR #51 - add the changelog of the 2.0.0 release |
| 08 Oct | qa | [`b04a339`](https://github.com/code-corhuila/csp-booking-portal/commit/b04a339efa087398c2152dda3b861d1e604a8dd1) | docs(changelog): merge PR #51 - add the changelog of the 2.0.0 release |
| 09 Oct | qa | [`148606a`](https://github.com/code-corhuila/csp-booking-portal/commit/148606ae356ab095bd417e752567bdbe6e0f5dae) | docs(changelog): merge PR #52 - promote the changelog of the 2.0.0 release to qa |
| 09 Oct | main | [`a69d72f`](https://github.com/code-corhuila/csp-booking-portal/commit/a69d72f28cbb162aa2261363b80b443a173e5c66) | docs(changelog): merge PR #52 - promote the changelog of the 2.0.0 release to qa |
| 11 Oct | main | [`ea1503d`](https://github.com/code-corhuila/csp-booking-portal/commit/ea1503d43124d7d1db806dcc983cab1e1733cc02) | feat(booking-portal): merge PR #53 - promote HU-FE-BOOKING-001 from qa to main (release/2.0.0) |

[Back to summary](#summary)

---

<a id="csp-worker"></a>
## `csp-worker` (62 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Oct | develop | [`cf72d1b`](https://github.com/code-corhuila/csp-worker/commit/cf72d1b9cc64d3477df52006b7806508bfb5bd03) | chore(worker): scaffold the three module Maven project |
| 05 Oct | develop | [`51b6e27`](https://github.com/code-corhuila/csp-worker/commit/51b6e27ae4d48cd08658a8e783880fb50f5ae49e) | feat(worker): add the expire-holds job that sweeps overdue reservations |
| 06 Oct | develop | [`c220e8f`](https://github.com/code-corhuila/csp-worker/commit/c220e8f719a57a52011b07b57ab476b73a209f48) | chore(worker): merge PR #1 - scaffold the three module Maven project |
| 06 Oct | qa | [`ff29973`](https://github.com/code-corhuila/csp-worker/commit/ff29973face523bdd4b38f310d8a6aabae1d7e27) | chore(worker): merge PR #1 - scaffold the three module Maven project |
| 06 Oct | develop | [`3b95c42`](https://github.com/code-corhuila/csp-worker/commit/3b95c42b00b7ef4ecad0b26b1bb5e8b460e0bc1b) | chore(worker): sync feat/expire-holds-sweep with develop |
| 06 Oct | develop | [`ae67376`](https://github.com/code-corhuila/csp-worker/commit/ae673761ad8845b9611d0cec8c62198fe7fdaafb) | fix(worker): register the expire-holds job and fail fast without a service token |
| 06 Oct | develop | [`af516ff`](https://github.com/code-corhuila/csp-worker/commit/af516ffb00843020382091f1ba17e8a38d7651c1) | fix(worker): call the booking route behind its context path and retry only what a retry fixes |
| 06 Oct | develop | [`af86d5c`](https://github.com/code-corhuila/csp-worker/commit/af86d5cebbfa8e744e07a4fe39bf2e29a9abebe5) | fix(worker): stop the scheduler on shutdown and document the idempotency it relies on |
| 06 Oct | develop | [`1829144`](https://github.com/code-corhuila/csp-worker/commit/18291449c0725002dad41b28befdfa8abf130868) | fix(worker): wait the interval after a sweep ends instead of firing at a fixed rate |
| 06 Oct | develop | [`adb6660`](https://github.com/code-corhuila/csp-worker/commit/adb66606575dcc21450fa2327e7a139c2baebe24) | fix(worker): read the service token at every sweep so it can be rotated |
| 06 Oct | develop | [`ef38792`](https://github.com/code-corhuila/csp-worker/commit/ef3879266bd8f3e11d675c751d979fe6106ed2a4) | feat(worker): merge PR #2 - add the expire-holds job that sweeps overdue reservations |
| 06 Oct | qa | [`9f49d00`](https://github.com/code-corhuila/csp-worker/commit/9f49d00a1c654ed89f2c7a990370686350fac18b) | feat(worker): merge PR #2 - add the expire-holds job that sweeps overdue reservations |
| 06 Oct | develop | [`06a5d68`](https://github.com/code-corhuila/csp-worker/commit/06a5d683a7cdd5c649d60cb26ef5975b9738f3e9) | fix(worker): build an executable jar and a container image that csp-infra can compose |
| 06 Oct | develop | [`d5836eb`](https://github.com/code-corhuila/csp-worker/commit/d5836eba6ce67cc664b53cffa209d33818e29071) | fix(worker): scope the image build, keep local files out of it and check the jar in CI |
| 06 Oct | develop | [`4141fe2`](https://github.com/code-corhuila/csp-worker/commit/4141fe23f7ae8f57e18f668a3255b9dadc93f8ef) | fix(ci): write the jar check as a block so the workflow parses |
| 06 Oct | develop | [`e5039a5`](https://github.com/code-corhuila/csp-worker/commit/e5039a53f338009f986b284c88b1075d6dfe4aa5) | fix(ci): build the container image and start it in CI |
| 06 Oct | develop | [`312aee7`](https://github.com/code-corhuila/csp-worker/commit/312aee7a19d277f9de397fb4b7f4562fe3b10e98) | fix(worker): merge PR #3 - build an executable jar and a container image that csp-infra can compose |
| 06 Oct | qa | [`fe79c4b`](https://github.com/code-corhuila/csp-worker/commit/fe79c4bb2201cc0b3a2ed58c64f59feda58f0c17) | fix(worker): merge PR #3 - build an executable jar and a container image that csp-infra can compose |
| 06 Oct | qa | [`7c35f8e`](https://github.com/code-corhuila/csp-worker/commit/7c35f8e47ae1024f0fadbfd17d46619f391f5ea9) | chore(worker): merge PR #4 - promote the scaffold of the three module Maven project to qa |
| 06 Oct | main | [`29ed595`](https://github.com/code-corhuila/csp-worker/commit/29ed595138bb796c78af0cb30ee8ff8fb4ed4107) | chore(worker): merge PR #4 - promote the scaffold of the three module Maven project to qa |
| 06 Oct | qa | [`999eff2`](https://github.com/code-corhuila/csp-worker/commit/999eff2c19095d6e429a0038fb63e3673366e37e) | feat(worker): merge PR #5 - promote the expire-holds job to qa |
| 06 Oct | main | [`718faed`](https://github.com/code-corhuila/csp-worker/commit/718faed90467a19657327033da331651a202c3db) | feat(worker): merge PR #5 - promote the expire-holds job to qa |
| 06 Oct | qa | [`3d21cbb`](https://github.com/code-corhuila/csp-worker/commit/3d21cbb3d175b286c2be5b2caa73356b7c01f6fb) | fix(worker): merge PR #6 - promote the executable jar and the container image to qa |
| 06 Oct | main | [`ce9797a`](https://github.com/code-corhuila/csp-worker/commit/ce9797af33aefa1bace764644c77a9ef07dbd4cc) | fix(worker): merge PR #6 - promote the executable jar and the container image to qa |
| 07 Oct | develop | [`5654b11`](https://github.com/code-corhuila/csp-worker/commit/5654b110f89498b606bdd1790b0147ca09bba32b) | feat(worker): add the core of the booking outbox relay |
| 07 Oct | develop | [`73a70e5`](https://github.com/code-corhuila/csp-worker/commit/73a70e5bb24145ed5c7d5caf036419d65bc439df) | feat(worker): read the booking outbox and keep the relay state in schema worker |
| 07 Oct | develop | [`6741e6b`](https://github.com/code-corhuila/csp-worker/commit/6741e6b82cb6a17426f5c1beef9128f83122e492) | feat(worker): publish the booking events to RabbitMQ with confirms |
| 07 Oct | develop | [`a122813`](https://github.com/code-corhuila/csp-worker/commit/a12281319b727d374fef829e28b4293b4cae3605) | feat(worker): schedule the outbox relay and compose it with the platform |
| 08 Oct | develop | [`1d400ac`](https://github.com/code-corhuila/csp-worker/commit/1d400acc99a1d2e10f9405d072f009e6b2758a56) | feat(worker): give every job its own flag so the light and heavy jobs can live apart |
| 08 Oct | develop | [`470248e`](https://github.com/code-corhuila/csp-worker/commit/470248e2350f1881a88535fc6970ce10ee6aad04) | feat(worker): merge PR #7 - add the core of the booking outbox relay |
| 08 Oct | qa | [`3208ea2`](https://github.com/code-corhuila/csp-worker/commit/3208ea231d51712c8ef5929191fe4a15a682df82) | feat(worker): merge PR #7 - add the core of the booking outbox relay |
| 08 Oct | develop | [`7240779`](https://github.com/code-corhuila/csp-worker/commit/7240779b333ef7b7899b943003e7900cb1c51836) | ci(worker): run the PostgreSQL tests of the outbox relay in CI |
| 08 Oct | develop | [`cf4b7d9`](https://github.com/code-corhuila/csp-worker/commit/cf4b7d9bd8982e4726da74b7adec9fba886f10d7) | fix(worker): do not let the JDBC starter build a DataSource nobody configures |
| 08 Oct | develop | [`ca7910e`](https://github.com/code-corhuila/csp-worker/commit/ca7910e0faab947c8ccbc229b85b1d97b46b4899) | test(worker): pin that the relay cursor never moves ahead of the tracked events |
| 08 Oct | develop | [`1d3797f`](https://github.com/code-corhuila/csp-worker/commit/1d3797faef5f799cdd75b62f4af1935188f5b0bb) | feat(worker): merge PR #8 - read the booking outbox and keep the relay state in schema worker |
| 08 Oct | qa | [`db86229`](https://github.com/code-corhuila/csp-worker/commit/db862297867b1bca6814f3a9ca570968bd0e8fa8) | feat(worker): merge PR #8 - read the booking outbox and keep the relay state in schema worker |
| 08 Oct | develop | [`9436891`](https://github.com/code-corhuila/csp-worker/commit/9436891d37754bea9fbd9a3fd92aac95e570119a) | ci(worker): run the RabbitMQ tests of the outbox relay in CI |
| 08 Oct | develop | [`514b437`](https://github.com/code-corhuila/csp-worker/commit/514b437c22f4c34f3b370f4848622f812783c8b0) | feat(worker): merge PR #9 - publish the booking events to RabbitMQ with confirms |
| 08 Oct | qa | [`18ea57c`](https://github.com/code-corhuila/csp-worker/commit/18ea57c802e2324ddc3e839c2a9fcb88e966cc7f) | feat(worker): merge PR #9 - publish the booking events to RabbitMQ with confirms |
| 08 Oct | develop | [`82a1e70`](https://github.com/code-corhuila/csp-worker/commit/82a1e7013d3127ac5b2e2ee3b499b43308b8424b) | docs(worker): say the relay runs as a single instance and pin its default exchange |
| 08 Oct | develop | [`29136f4`](https://github.com/code-corhuila/csp-worker/commit/29136f4ed3b920d51593e5a4890d50adba7532e2) | test(worker): pin what the scheduler promises to its jobs |
| 08 Oct | develop | [`42686ea`](https://github.com/code-corhuila/csp-worker/commit/42686eaf4025956f3508f1bc164aaabda6ca0883) | feat(worker): merge PR #10 - schedule the outbox relay and compose it with the platform |
| 08 Oct | qa | [`9c8145e`](https://github.com/code-corhuila/csp-worker/commit/9c8145eb9fea573caea74cc1a19c9eeb6a14556c) | feat(worker): merge PR #10 - schedule the outbox relay and compose it with the platform |
| 08 Oct | qa | [`7530bfd`](https://github.com/code-corhuila/csp-worker/commit/7530bfdf0e04f24d23e4ac13f9f2a1916431e48f) | feat(worker): merge PR #11 - promote the core of the booking outbox relay to qa |
| 08 Oct | main | [`02c68b0`](https://github.com/code-corhuila/csp-worker/commit/02c68b013cfa9105ce44e77c07d97942692fd2a0) | feat(worker): merge PR #11 - promote the core of the booking outbox relay to qa |
| 08 Oct | qa | [`32ac8e4`](https://github.com/code-corhuila/csp-worker/commit/32ac8e4d1041bb3b362b6a84ffc93c78f677f8f8) | feat(worker): merge PR #12 - promote the PostgreSQL adapters of the booking outbox relay to qa |
| 08 Oct | main | [`0e38791`](https://github.com/code-corhuila/csp-worker/commit/0e38791840a2cb926bfa26283e89aca41b9051b9) | feat(worker): merge PR #12 - promote the PostgreSQL adapters of the booking outbox relay to qa |
| 08 Oct | qa | [`d19f0e3`](https://github.com/code-corhuila/csp-worker/commit/d19f0e3a29c9806c696c467dd0814b0bf6886d46) | feat(worker): merge PR #13 - promote the RabbitMQ publisher of the booking outbox relay to qa |
| 08 Oct | main | [`0c7822c`](https://github.com/code-corhuila/csp-worker/commit/0c7822c0524526c0afdd8120784a94b1b6de3133) | feat(worker): merge PR #13 - promote the RabbitMQ publisher of the booking outbox relay to qa |
| 08 Oct | qa | [`132dc7d`](https://github.com/code-corhuila/csp-worker/commit/132dc7d6927815a3c750bd3e8ce023fb0d2ac500) | feat(worker): merge PR #14 - promote the scheduling and wiring of the booking outbox relay to qa |
| 08 Oct | main | [`5d63e3f`](https://github.com/code-corhuila/csp-worker/commit/5d63e3f28437383ec34f3ef68f446a279061f3e2) | feat(worker): merge PR #14 - promote the scheduling and wiring of the booking outbox relay to qa |
| 08 Oct | develop | [`8d3332a`](https://github.com/code-corhuila/csp-worker/commit/8d3332a3453337f7d1f4261c72d5bacf22085dcc) | docs(changelog): add the changelog of the 2.0.0 release |
| 09 Oct | develop | [`03b221e`](https://github.com/code-corhuila/csp-worker/commit/03b221e2d80db951d03852dddd4e42631b833f9f) | docs(changelog): merge PR #15 - add the changelog of the 2.0.0 release |
| 09 Oct | qa | [`f620d48`](https://github.com/code-corhuila/csp-worker/commit/f620d481435de6aeae4d19b066998731322de759) | docs(changelog): merge PR #15 - add the changelog of the 2.0.0 release |
| 09 Oct | qa | [`e2af1c5`](https://github.com/code-corhuila/csp-worker/commit/e2af1c5543d81870fe2ba45ba0269218c43c36c5) | docs(changelog): merge PR #16 - promote the changelog of the 2.0.0 release to qa |
| 09 Oct | main | [`7890673`](https://github.com/code-corhuila/csp-worker/commit/78906734df7a1815c27daf54998df868203b4077) | docs(changelog): merge PR #16 - promote the changelog of the 2.0.0 release to qa |
| 09 Oct | develop | [`b08ceb5`](https://github.com/code-corhuila/csp-worker/commit/b08ceb5a61c066efbfce28953629053211af4254) | fix(worker): keep the framework out of worker-core and correct the health endpoint claim |
| 10 Oct | develop | [`7964866`](https://github.com/code-corhuila/csp-worker/commit/79648660bddc7e8b525819aa4870a61ada101a3a) | fix(worker): merge PR #20 - keep the framework out of worker-core and correct the health endpoint claim |
| 10 Oct | qa | [`b16aaab`](https://github.com/code-corhuila/csp-worker/commit/b16aaab91d72c6b20043ea1034ad4c2af08c754b) | fix(worker): merge PR #20 - keep the framework out of worker-core and correct the health endpoint claim |
| 10 Oct | qa | [`4463d61`](https://github.com/code-corhuila/csp-worker/commit/4463d61d956e653b2314da6e891e26eb3f97af3c) | fix(worker): merge PR #21 - promote PR #20 to qa, core dependency and health claim |
| 10 Oct | main | [`cfe89dd`](https://github.com/code-corhuila/csp-worker/commit/cfe89dd5aa30fa03315e4087eb06aff3b88a631d) | fix(worker): merge PR #21 - promote PR #20 to qa, core dependency and health claim |
| 11 Oct | main | [`415cdf6`](https://github.com/code-corhuila/csp-worker/commit/415cdf683d63ebfd6d85446ded8b91cd2a1b9fb7) | feat(worker): merge PR #17 - promote the expiration and outbox relay jobs of the Booking stories from qa to main (release/2.0.0) |

[Back to summary](#summary)

---

<a id="csp-docs"></a>
## `csp-docs` (31 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 06 Oct | main | [`942bb88`](https://github.com/code-corhuila/csp-docs/commit/942bb88940e9d686f58a77f493ce4301909f9974) | docs(booking): document the hold expiration operation in the runbook |
| 06 Oct | main | [`e032030`](https://github.com/code-corhuila/csp-docs/commit/e032030a95007fdd0324785dd516e9d15ba64da5) | docs(booking): link the expiration procedure and the event contract from the runbook |
| 06 Oct | main | [`3e0f394`](https://github.com/code-corhuila/csp-docs/commit/3e0f394661693e3d293bc7c9f124e501b4b1146b) | docs(booking): trace the expiration runbook section to its story and decisions |
| 06 Oct | main | [`4616660`](https://github.com/code-corhuila/csp-docs/commit/46166600887452444d7328480eee60273558a00f) | docs(booking): merge PR #97 - document the hold expiration operation in the runbook |
| 06 Oct | main | [`796b9b6`](https://github.com/code-corhuila/csp-docs/commit/796b9b680eef3548a4465636f13df209008ef860) | docs(requirements): mark HU-BOOKING-001 and HU-BOOKING-002 as done in qa |
| 06 Oct | main | [`3d3d6cf`](https://github.com/code-corhuila/csp-docs/commit/3d3d6cf319ed06cdf18e0dad2e3cdb2c8ac26d96) | docs(requirements): add the legend of Done (in qa) and the delivery trail of HU-BOOKING-002 |
| 06 Oct | main | [`9ce4dd6`](https://github.com/code-corhuila/csp-docs/commit/9ce4dd6afc1efd00169a12b63404373f02f3751e) | Merge remote-tracking branch 'origin/main' into docs/user-stories-booking-status |
| 06 Oct | main | [`b3ab556`](https://github.com/code-corhuila/csp-docs/commit/b3ab5564d6608cb21100d56ebb5c8a7b5d1d6191) | docs(requirements): list csp-booking-db in HU-BOOKING-001 and write the status value without code formatting |
| 06 Oct | main | [`51482c3`](https://github.com/code-corhuila/csp-docs/commit/51482c3cfd73b97d6ea68431d7ecfd13f54237b8) | docs(requirements): merge PR #98 - mark HU-BOOKING-001 and HU-BOOKING-002 as Done (in qa) |
| 06 Oct | main | [`495cb9e`](https://github.com/code-corhuila/csp-docs/commit/495cb9e904ff11f5291a8835626b639ea40f69f2) | docs(requirements): mark HU-BOOKING-003 as done in qa |
| 06 Oct | main | [`414ca9c`](https://github.com/code-corhuila/csp-docs/commit/414ca9c1f83caf3f47eab3879546f967827a872a) | docs(requirements): merge PR #100 - mark HU-BOOKING-003 as done in qa |
| 07 Oct | main | [`b0c2788`](https://github.com/code-corhuila/csp-docs/commit/b0c27885786713733214940f9ba9b3aa9cae7e75) | docs(data): document the seat keys of V011 and the absence of an outbox purge in the booking dictionary |
| 07 Oct | main | [`4eb4151`](https://github.com/code-corhuila/csp-docs/commit/4eb415196ac0c76888703e27719855a2bfc5c31c) | docs(data): state the delete action of the composite key of seat_hold_item |
| 07 Oct | main | [`696c7b9`](https://github.com/code-corhuila/csp-docs/commit/696c7b9ec3fabb03c1f328ffef1805e3f5709a97) | docs(data): merge PR #102 - document the seat keys of V011 and the absence of an outbox purge |
| 08 Oct | main | [`7327955`](https://github.com/code-corhuila/csp-docs/commit/7327955d2df0b086ae9ca27e7e732ebdb31a678c) | docs(adr): amend ADR-014 so the relay discovery pages by (created_at, id) |
| 08 Oct | main | [`888b9c3`](https://github.com/code-corhuila/csp-docs/commit/888b9c31fcf900fdacbbe65dea7340f802e596f6) | docs(ux): add the Booking admin reservations route, wireframe and read permission |
| 08 Oct | main | [`355f28e`](https://github.com/code-corhuila/csp-docs/commit/355f28eb1bb710b8a7ef78f34a6a3cd4b9902cb9) | docs(adr): flag in ADR-014 that ADR-019 still carries the discovery query that stalls |
| 08 Oct | main | [`75744b3`](https://github.com/code-corhuila/csp-docs/commit/75744b31b19164bc97f5d6c8cc76e10c488b3c60) | docs(ux): trace the admin reservations route and record the provisional permission |
| 08 Oct | main | [`2103049`](https://github.com/code-corhuila/csp-docs/commit/2103049848e131a52406cd985889f5f1669ad8a0) | docs(requirements): mark HU-FE-BOOKING-001 as done in qa and count it in Cut 2 |
| 08 Oct | main | [`8139116`](https://github.com/code-corhuila/csp-docs/commit/81391167ea95cc9fc89a2af3856fbd55ab53dbdb) | docs(adr): merge PR #104 - amend ADR-014 so the relay discovery pages by (created_at, id) |
| 08 Oct | main | [`a2ba145`](https://github.com/code-corhuila/csp-docs/commit/a2ba1454e219336b47204d7eaf0ddd135ac6cd9c) | chore(docs): update the branch with main after PR #104 |
| 08 Oct | main | [`6d97688`](https://github.com/code-corhuila/csp-docs/commit/6d97688b3e0d07514adea0872e3c6b43e48d4297) | docs(ux): merge PR #105 - add the Booking admin reservations route, wireframe and read permission |
| 08 Oct | main | [`d751ba2`](https://github.com/code-corhuila/csp-docs/commit/d751ba271c5b432336bf38e2664bc47ebb1b4dd3) | docs(requirements): merge PR #108 - mark HU-FE-BOOKING-001 as done in qa and count it in Cut 2 |
| 08 Oct | main | [`27351b6`](https://github.com/code-corhuila/csp-docs/commit/27351b6d1c221b868cf508cd357b6abccc131cbb) | docs(requirements): record the outbox relay in the delivery trail of HU-BOOKING-001 to 003 |
| 08 Oct | main | [`b3c0ea9`](https://github.com/code-corhuila/csp-docs/commit/b3c0ea9860e8d9b59a648173d34767832ecfbfd9) | docs(requirements): use the structured delivery trail format in HU-BOOKING-001 |
| 08 Oct | main | [`ac18bbf`](https://github.com/code-corhuila/csp-docs/commit/ac18bbf97b27fd6b7c6b29dba76376a46debd55d) | docs(requirements): merge main into docs/user-stories-booking-outbox-relay-trail |
| 08 Oct | main | [`94451a7`](https://github.com/code-corhuila/csp-docs/commit/94451a77db788be2699a1fa2237050176921b01f) | docs(requirements): merge PR #109 - record the outbox relay in the delivery trail of HU-BOOKING-001 to 003 |
| 11 Oct | main | [`3b0f909`](https://github.com/code-corhuila/csp-docs/commit/3b0f90949d41077a913717af34184fd02bf6f4d5) | docs(requirements): mark the four Booking stories as done in main |
| 11 Oct | main | [`42fc9d5`](https://github.com/code-corhuila/csp-docs/commit/42fc9d52b7183a51012f04aae967a9c17651a6af) | docs(requirements): update the status of the Auth and Concessions stories |
| 11 Oct | main | [`d27c130`](https://github.com/code-corhuila/csp-docs/commit/d27c130a7774d7141f5486b93f8ef580b9b0d91a) | docs(requirements): define In Progress, align the product backlog and cite the contract gap |
| 11 Oct | main | [`6c3322a`](https://github.com/code-corhuila/csp-docs/commit/6c3322a948ce3340d09c57f47fb3bf3a3840d00e) | docs(requirements): merge PR #116 - update the status of the Booking, Auth and Concessions stories |

[Back to summary](#summary)

---

<a id="csp-infra-postgres"></a>
## `csp-infra-postgres` (15 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 06 Oct | develop | [`5f7dc30`](https://github.com/code-corhuila/csp-infra-postgres/commit/5f7dc30b50a0773cf7e8c9b9edc98cb1b7d29b9e) | chore(infra): scaffold the platform composition from the infra template |
| 06 Oct | develop | [`4d607cb`](https://github.com/code-corhuila/csp-infra-postgres/commit/4d607cbf881fee5b3838160a776bb7c433a9f790) | feat(infra): run the single PostgreSQL and compose the booking slice |
| 06 Oct | develop | [`3f05f51`](https://github.com/code-corhuila/csp-infra-postgres/commit/3f05f51f92e222b00857ca8b866e1143f39be59f) | fix(infra): close Grafana unless develop opens it and require the worker token at up |
| 06 Oct | develop | [`7533f88`](https://github.com/code-corhuila/csp-infra-postgres/commit/7533f88f79c35e4a64c9fd86107620339535a614) | fix(infra): pass the database passwords to psql as variables and check the token subject at up |
| 06 Oct | develop | [`864fea8`](https://github.com/code-corhuila/csp-infra-postgres/commit/864fea85e5a7557bf02d1716e94a17e28f022bc6) | feat(infra): merge PR #1 - run the single PostgreSQL, compose the booking slice and scaffold the platform |
| 06 Oct | qa | [`f104132`](https://github.com/code-corhuila/csp-infra-postgres/commit/f10413216b764846990f42ac6a7875cad81d0598) | feat(infra): merge PR #1 - run the single PostgreSQL, compose the booking slice and scaffold the platform |
| 06 Oct | qa | [`f802ef5`](https://github.com/code-corhuila/csp-infra-postgres/commit/f802ef5f941e3cb83d8fbc948cf2d43d3e368de6) | feat(infra): merge PR #2 - promote the single PostgreSQL and the booking slice to qa |
| 06 Oct | develop | [`fe7c975`](https://github.com/code-corhuila/csp-infra-postgres/commit/fe7c9757b8ffa47488f995e90fb5045bdf131cf9) | fix(infra): name the env files and the projects as Annex J asks |
| 06 Oct | develop | [`c69f6d1`](https://github.com/code-corhuila/csp-infra-postgres/commit/c69f6d1959f05497de9e0d640576b0491e23906e) | fix(infra): merge PR #3 - name the env files and the projects as Annex J asks |
| 06 Oct | qa | [`85fd084`](https://github.com/code-corhuila/csp-infra-postgres/commit/85fd0847b934d8d36034313ef03c6f5dccd76071) | fix(infra): merge PR #3 - name the env files and the projects as Annex J asks |
| 06 Oct | qa | [`a5e9cfd`](https://github.com/code-corhuila/csp-infra-postgres/commit/a5e9cfd1fd2a2947c4464b66c0989c7794e08b8f) | fix(infra): merge PR #4 - promote the env file names of Annex J to qa |
| 06 Oct | develop | [`a53f7a5`](https://github.com/code-corhuila/csp-infra-postgres/commit/a53f7a5d4c7b2cbf02f7be5c6116cfbe3ff06181) | fix(infra): require the environment in up.sh and down.sh instead of defaulting to dev |
| 06 Oct | develop | [`6231111`](https://github.com/code-corhuila/csp-infra-postgres/commit/62311116e85eb153898c78b4cc6ef98d259eb60d) | fix(infra): merge PR #6 - require the environment in up.sh and down.sh |
| 06 Oct | qa | [`e4b483d`](https://github.com/code-corhuila/csp-infra-postgres/commit/e4b483d18a3a8f2dc7d8533c3d4cae5fe24aa421) | fix(infra): merge PR #6 - require the environment in up.sh and down.sh |
| 06 Oct | qa | [`4709f91`](https://github.com/code-corhuila/csp-infra-postgres/commit/4709f910094bd200e93d7d18e3e396dcb38dd73d) | fix(infra): merge PR #7 - promote PR #5 and #6 to qa |

[Back to summary](#summary)

---

<a id="csp-catalog-portal"></a>
## `csp-catalog-portal` (5 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Oct | qa | [`555863c`](https://github.com/code-corhuila/csp-catalog-portal/commit/555863c5e6eeb3fa8c92ef123e947b218dae5aa2) | Merge pull request #9 from code-corhuila/qa-promote/catalog-base-2 |
| 05 Oct | main | [`30902e4`](https://github.com/code-corhuila/csp-catalog-portal/commit/30902e4bb24acb60ea62c974fd785744cae5dedb) | Merge pull request #9 from code-corhuila/qa-promote/catalog-base-2 |
| 05 Oct | main | [`3484ee6`](https://github.com/code-corhuila/csp-catalog-portal/commit/3484ee66b100026bd9514f424ae3ae9d65a62de6) | Merge pull request #11 from code-corhuila/release/0.1.0 |
| 05 Oct | qa | [`05fa1e3`](https://github.com/code-corhuila/csp-catalog-portal/commit/05fa1e393f66bb8c74359977a1fc5316542a9e75) | Merge pull request #12 from code-corhuila/qa-promote/catalog-domain-ci |
| 05 Oct | main | [`196d3dc`](https://github.com/code-corhuila/csp-catalog-portal/commit/196d3dc9682270b50d15c30a90cb7bec9626b9ab) | Merge pull request #12 from code-corhuila/qa-promote/catalog-domain-ci |

[Back to summary](#summary)

---

<a id="csp-concessions-portal"></a>
## `csp-concessions-portal` (6 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Oct | qa | [`001d688`](https://github.com/code-corhuila/csp-concessions-portal/commit/001d688f02546ea5bb0f13452ebfc26c82c8358a) | Merge pull request #7 from code-corhuila/qa-promote/concessions-base-1 |
| 05 Oct | main | [`5e9c724`](https://github.com/code-corhuila/csp-concessions-portal/commit/5e9c724da6586f0de3e9547e7a5299327254e156) | Merge pull request #7 from code-corhuila/qa-promote/concessions-base-1 |
| 05 Oct | qa | [`6bc520d`](https://github.com/code-corhuila/csp-concessions-portal/commit/6bc520dd494b62e9df502945ab026d811ed8638d) | Merge pull request #10 from code-corhuila/qa-promote/concessions-domain |
| 05 Oct | main | [`598bb80`](https://github.com/code-corhuila/csp-concessions-portal/commit/598bb80348958800ccfd4f61535f6e01e315840e) | Merge pull request #10 from code-corhuila/qa-promote/concessions-domain |
| 05 Oct | qa | [`89b73aa`](https://github.com/code-corhuila/csp-concessions-portal/commit/89b73aa6dc3c4655b19ec97577713e091ea95e4e) | chore(concessiones-portal): promote CI and deployment scaffold to qa (segmento 3) |
| 05 Oct | main | [`d570669`](https://github.com/code-corhuila/csp-concessions-portal/commit/d570669d123d7f17cacd1000881e3c753c50b3e3) | chore(concessiones-portal): promote CI and deployment scaffold to qa (segmento 3) |

[Back to summary](#summary)

---

<a id="csp-ticketing-portal"></a>
## `csp-ticketing-portal` (3 commits)

| Date | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Oct | qa | [`db524f5`](https://github.com/code-corhuila/csp-ticketing-portal/commit/db524f53b27ef7383f61814466f74759d1baaabe) | Merge pull request #4 from code-corhuila/qa-promote/ticketing-base-1 |
| 05 Oct | main | [`1bdf934`](https://github.com/code-corhuila/csp-ticketing-portal/commit/1bdf9345e253436a29ba3a273450529f39dbab59) | Merge pull request #4 from code-corhuila/qa-promote/ticketing-base-1 |
| 05 Oct | main | [`94a20ae`](https://github.com/code-corhuila/csp-ticketing-portal/commit/94a20ae687add2f29e0ae8c0b60f5e4167ad1f5e) | Merge pull request #6 from code-corhuila/release/0.1.0 |

[Back to summary](#summary)

---
