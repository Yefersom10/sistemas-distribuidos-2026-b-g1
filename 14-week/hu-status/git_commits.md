# Week 14 Commits

Week Mon 2 - Sun 8 Nov 2026 · Source: GitHub API (`code-corhuila` and my fork), queried 2026-11-08 · Dates in UTC · Commits authored by me.

Commits dated 2026-11-09 UTC (up to 05:00Z) were made on the evening of Sunday 8 Nov in Colombia (UTC-5) and belong to this week. Branch = where the commit exists; qa commits are mostly cherry-picks with a different hash. Release 3.0.0 branches are open PRs and still unmerged; only my commits on them are listed (nine of those messages are shortened with an ellipsis; the hash link opens the full one). The fork commits belong to a personal certification study log, not to the CI/CD class activity.

## Summary

| Repository / branch | Commits |
|---|---:|
| [csp-booking-api](#csp-booking-api) | 26 |
| [csp-booking-db](#csp-booking-db) | 7 |
| [csp-booking-portal](#csp-booking-portal) | 18 |
| [csp-concessions-api](#csp-concessions-api) | 9 |
| [csp-concessions-db](#csp-concessions-db) | 4 |
| [csp-docs](#csp-docs) | 35 |
| [csp-infra-postgres](#csp-infra-postgres) | 8 |
| [csp-worker](#csp-worker) | 8 |
| [csp-booking-db release 3.0.0 branch (open PR #43)](#csp-booking-db-release-3-0-0-branch-open-pr-43) | 3 |
| [csp-booking-api release 3.0.0 branch (open PR #61)](#csp-booking-api-release-3-0-0-branch-open-pr-61) | 8 |
| [csp-booking-portal release 3.0.0 branch (open PR #78)](#csp-booking-portal-release-3-0-0-branch-open-pr-78) | 4 |
| [csp-concessions-api release 3.0.0 branch (open PR #27)](#csp-concessions-api-release-3-0-0-branch-open-pr-27) | 5 |
| [csp-concessions-db release 3.0.0 branch (open PR #7)](#csp-concessions-db-release-3-0-0-branch-open-pr-7) | 1 |
| [fork-certification](#fork-certification) | 18 |
| **Total** | **154** |

---

<a id="csp-booking-api"></a>
## `csp-booking-api` (26 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 24-10 23:17 | qa | [`6af4dd2`](https://github.com/code-corhuila/csp-booking-api/commit/6af4dd24da94b4fdcc2bae4c8488df4eeacb0515) | fix(booking): enforce the permissions of the access token and tolerate the clock skew |
| 29-10 23:07 | qa | [`4d378d1`](https://github.com/code-corhuila/csp-booking-api/commit/4d378d1733b5f523583d22dbe45de7386432e864) | fix(booking): pass the catalog settings in the platform compose |
| 29-10 23:30 | qa | [`25d0131`](https://github.com/code-corhuila/csp-booking-api/commit/25d0131f6d6af54e314c47553209f66faa63ddf0) | feat(booking): refuse the seats that are not in the catalog layout |
| 04 Nov 03:40 | develop | [`aca92d5`](https://github.com/code-corhuila/csp-booking-api/commit/aca92d53b749aa1d79e66e6090b66360e2ad55dd) | chore(booking): require iss and aud on the service credentials |
| 04 Nov 03:40 | qa | [`f886fde`](https://github.com/code-corhuila/csp-booking-api/commit/f886fde5f7b0075a227d774b6da6882abd970e20) | chore(booking): require iss and aud on the service credentials |
| 04 Nov 03:43 | develop | [`068b07e`](https://github.com/code-corhuila/csp-booking-api/commit/068b07eb9a49cd667c8e0e2af4234a78b0bad2ba) | chore(booking): merge PR #72 - require iss and aud on the service credentials |
| 04 Nov 04:54 | qa | [`815d72c`](https://github.com/code-corhuila/csp-booking-api/commit/815d72ced1ffb9868f2924ce2a0f99b5efe2b01d) | fix(booking): merge PR #73 - promote PRs #68, #70 and #72 to qa, token permissions, catalog settings and service claims |
| 04 Nov 05:49 | develop | [`b4baf60`](https://github.com/code-corhuila/csp-booking-api/commit/b4baf606259550236d4041ad12732c13e41d1df7) | chore(booking): merge develop into the seat layout check branch |
| 04 Nov 05:55 | develop | [`0f26774`](https://github.com/code-corhuila/csp-booking-api/commit/0f267749b3ccce201985f644877720cc232c8e5a) | feat(booking): merge PR #71 - refuse the seats that are not in the catalog layout |
| 04 Nov 06:05 | qa | [`a3a7246`](https://github.com/code-corhuila/csp-booking-api/commit/a3a7246caef2397270637e2967858a687f44bce4) | feat(booking): merge PR #74 - promote PR #71 to qa, refuse the seats that are not in the catalog layout |
| 04 Nov 13:00 | develop | [`34e3d4c`](https://github.com/code-corhuila/csp-booking-api/commit/34e3d4c93a5177b6a50fece92b474f29c202af69) | fix(booking): pass the service subjects through the platform compose |
| 04 Nov 13:00 | qa | [`392553e`](https://github.com/code-corhuila/csp-booking-api/commit/392553e1280aa0014ee618ca3c0c5f0310ecc6e2) | fix(booking): pass the service subjects through the platform compose |
| 04 Nov 13:03 | develop | [`f3c0e97`](https://github.com/code-corhuila/csp-booking-api/commit/f3c0e976255464eb418ba82dbcfd9868aac76c0a) | fix(booking): merge PR #75 - pass the service subjects through the platform compose |
| 04 Nov 13:06 | qa | [`9ef66c7`](https://github.com/code-corhuila/csp-booking-api/commit/9ef66c7db6cccb5f874958a945b6e9279768675f) | fix(booking): merge PR #76 - promote PR #75 to qa, service subjects in the platform compose |
| 05 Nov 06:04 | develop | [`c4a882b`](https://github.com/code-corhuila/csp-booking-api/commit/c4a882b6b510e1e814425a012db3130316061089) | feat(booking): bound the seats a user can hold |
| 05 Nov 06:04 | qa | [`73e1bc0`](https://github.com/code-corhuila/csp-booking-api/commit/73e1bc015b53214383533155a781a2c17788626c) | feat(booking): bound the seats a user can hold |
| 05 Nov 06:07 | develop | [`84d344b`](https://github.com/code-corhuila/csp-booking-api/commit/84d344bb557b4bb3fadb05c30d4370008b73467c) | feat(booking): merge PR #77 - bound the seats a user can hold |
| 05 Nov 06:10 | qa | [`ddae591`](https://github.com/code-corhuila/csp-booking-api/commit/ddae591e14fc689a8af03c16ed3aa53da16e9080) | feat(booking): merge PR #78 - promote the bound on the seats a user can hold to qa |
| 05 Nov 06:24 | develop | [`bab8dec`](https://github.com/code-corhuila/csp-booking-api/commit/bab8decfd4cc8742687059fb991e4cfd5126e6f3) | fix(booking): reject access tokens that live longer than fifteen minutes |
| 05 Nov 06:24 | qa | [`1aabc72`](https://github.com/code-corhuila/csp-booking-api/commit/1aabc721c4c5474a5ceec5fb7390f6b7303c89ea) | fix(booking): reject access tokens that live longer than fifteen minutes |
| 05 Nov 06:26 | develop | [`64163b0`](https://github.com/code-corhuila/csp-booking-api/commit/64163b0e6b4cea09ddb8e9feb5cbc9b608ccdfca) | fix(booking): merge PR #79 - reject access tokens that live longer than fifteen minutes |
| 05 Nov 06:30 | qa | [`b0b0535`](https://github.com/code-corhuila/csp-booking-api/commit/b0b05353889e763ad2cdfbdf7b79d45decd784b7) | fix(booking): merge PR #80 - promote the access token lifetime cap to qa |
| 05 Nov 06:50 | develop | [`d321868`](https://github.com/code-corhuila/csp-booking-api/commit/d321868452c93ebae04a756f3e28990a4ddd57cb) | feat(booking): audit every call to an internal route with a digest of the token |
| 05 Nov 06:50 | qa | [`60160be`](https://github.com/code-corhuila/csp-booking-api/commit/60160beba0365ab4190fd97ecccefd5bd9088113) | feat(booking): audit every call to an internal route with a digest of the token |
| 05 Nov 06:53 | develop | [`603afe6`](https://github.com/code-corhuila/csp-booking-api/commit/603afe6072e6f14588645965765d70587504d95d) | feat(booking): merge PR #81 - audit every call to an internal route with a digest of the token |
| 05 Nov 06:56 | qa | [`f7a0529`](https://github.com/code-corhuila/csp-booking-api/commit/f7a0529089d79adae31889d6ae251aacf29214f7) | feat(booking): merge PR #82 - promote the audit of internal calls to qa |

[Back to summary](#summary)

---

<a id="csp-booking-db"></a>
## `csp-booking-db` (7 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 03:23 | develop | [`a004eae`](https://github.com/code-corhuila/csp-booking-db/commit/a004eae6f4c4d2a40402de6846760e76612f164f) | chore(deploy): retry the connection of the migration executor while the instance starts |
| 04 Nov 03:23 | qa | [`dbdef2b`](https://github.com/code-corhuila/csp-booking-db/commit/dbdef2b93d6d6ae4040d6ceeefa755a7ca417260) | chore(deploy): retry the connection of the migration executor while the instance starts |
| 04 Nov 03:26 | develop | [`36c2caf`](https://github.com/code-corhuila/csp-booking-db/commit/36c2caf189856eedf85150927f77284beb8373e6) | chore(deploy): merge PR #45 - retry the connection of the migration executor while the instance starts |
| 04 Nov 03:28 | develop | [`c3c1581`](https://github.com/code-corhuila/csp-booking-db/commit/c3c15819f08a60fe26e7bde928ef7f8121a6f3e0) | docs(readme): state that the migration executor runs as booking_migrator |
| 04 Nov 03:28 | qa | [`49dac42`](https://github.com/code-corhuila/csp-booking-db/commit/49dac42eadc90ad7e9665471e6c24d61c5a897be) | docs(readme): state that the migration executor runs as booking_migrator |
| 04 Nov 03:31 | develop | [`582b701`](https://github.com/code-corhuila/csp-booking-db/commit/582b70108bd9c66d2dc70099d3b326b4842855aa) | docs(readme): merge PR #46 - state that the migration executor runs as booking_migrator |
| 04 Nov 04:54 | qa | [`c2699f5`](https://github.com/code-corhuila/csp-booking-db/commit/c2699f524764eb2779dd35a94eb901e20a322e24) | chore(deploy): merge PR #47 - promote PRs #45 and #46 to qa, executor retries and booking_migrator docs |

[Back to summary](#summary)

---

<a id="csp-booking-portal"></a>
## `csp-booking-portal` (18 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 05:10 | develop | [`d1bf326`](https://github.com/code-corhuila/csp-booking-portal/commit/d1bf3261836e499bf3b6722b8741a7033a33ccb6) | chore(booking): remove the sample reservations fallback of the list |
| 04 Nov 05:10 | qa | [`9450151`](https://github.com/code-corhuila/csp-booking-portal/commit/9450151621207a359a4d4ac7b4829b6490ce21e1) | chore(booking): remove the sample reservations fallback of the list |
| 04 Nov 05:13 | develop | [`f811a39`](https://github.com/code-corhuila/csp-booking-portal/commit/f811a39960f42acc0b067c5a1af90d86a70ef3ff) | chore(booking): merge PR #82 - remove the sample reservations fallback of the list |
| 04 Nov 05:16 | qa | [`5525a1a`](https://github.com/code-corhuila/csp-booking-portal/commit/5525a1a048883139483d2bce3a3808bb10b47745) | chore(booking): merge PR #83 - promote PR #82 to qa, sample reservations fallback removed |
| 04 Nov 05:41 | develop | [`73f851d`](https://github.com/code-corhuila/csp-booking-portal/commit/73f851da19796b8112f4b0d2c03394b518f4ad59) | test(booking): cover the list error of a server failure |
| 04 Nov 05:41 | qa | [`c1dee6e`](https://github.com/code-corhuila/csp-booking-portal/commit/c1dee6e89c490aea9924ba32e3cea8692c25c015) | test(booking): cover the list error of a server failure |
| 04 Nov 05:42 | develop | [`a9746a4`](https://github.com/code-corhuila/csp-booking-portal/commit/a9746a49bef1fc406210978ee8d428e3bd35b75f) | test(booking): merge PR #84 - cover the list error of a server failure |
| 04 Nov 05:46 | qa | [`5014719`](https://github.com/code-corhuila/csp-booking-portal/commit/50147194ce543aafb8b23960954f49f1c7501c80) | test(booking): merge PR #85 - promote PR #84 to qa, list error of a server failure |
| 04 Nov 06:35 | develop | [`9efd3a4`](https://github.com/code-corhuila/csp-booking-portal/commit/9efd3a4d86f651c0986af5292dae92e1a00be469) | feat(booking): replace the sample of the admin view with a not available state |
| 04 Nov 06:35 | qa | [`c9712c7`](https://github.com/code-corhuila/csp-booking-portal/commit/c9712c7ffa7a8e1c52f3b535709a890c0ef99d5f) | feat(booking): replace the sample of the admin view with a not available state |
| 04 Nov 06:39 | develop | [`e8330dd`](https://github.com/code-corhuila/csp-booking-portal/commit/e8330dd7bb75e120e2e38557ce3808c9088a821a) | feat(booking): merge PR #86 - replace the sample of the admin view with a not available state |
| 04 Nov 12:55 | qa | [`2468735`](https://github.com/code-corhuila/csp-booking-portal/commit/246873544138e6e1bbdea8af5ff73835a7a784a3) | feat(booking): merge PR #87 - promote PR #86 to qa, admin view without sample data |
| 05 Nov 04:04 | develop | [`2850edb`](https://github.com/code-corhuila/csp-booking-portal/commit/2850edb9fcbee1ddedf836651f6cdb21c613b1f4) | feat(booking): go to the snack selection after the hold |
| 05 Nov 04:06 | develop | [`38a9dac`](https://github.com/code-corhuila/csp-booking-portal/commit/38a9dac0b8f9b7007aa24a2497d42243d5102f1c) | feat(booking): merge PR #88 - go to the snack selection after the hold |
| 05 Nov 05:37 | develop | [`fa17b14`](https://github.com/code-corhuila/csp-booking-portal/commit/fa17b145e2110b28f2d4e146ee95e5e945e6b98b) | fix(deploy): require an anchored CORS origin regex and narrow the json location |
| 05 Nov 05:37 | qa | [`05e2623`](https://github.com/code-corhuila/csp-booking-portal/commit/05e2623ee47bd9563661ddceb9d00951d26a47f9) | fix(deploy): require an anchored CORS origin regex and narrow the json location |
| 05 Nov 05:43 | develop | [`e34ae2d`](https://github.com/code-corhuila/csp-booking-portal/commit/e34ae2d0d4f1fa30ce6fee4ae531b9917e9e4f74) | fix(deploy): merge PR #89 - require an anchored CORS origin regex and narrow the json location |
| 05 Nov 05:49 | qa | [`08d2e65`](https://github.com/code-corhuila/csp-booking-portal/commit/08d2e659f68a145954419c76227a14c7e9fda6c9) | fix(deploy): merge PR #90 - promote the anchored CORS origin regex to qa |

[Back to summary](#summary)

---

<a id="csp-concessions-api"></a>
## `csp-concessions-api` (9 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 24-10 23:35 | qa | [`a196e65`](https://github.com/code-corhuila/csp-concessions-api/commit/a196e652994d8277f96ce15908619eea4efa96c9) | fix(concessions): tolerate 30 seconds of clock skew on the token expiration |
| 25-10 00:11 | qa | [`a1b800b`](https://github.com/code-corhuila/csp-concessions-api/commit/a1b800bd6332e54e50bd554b2bdd81720c762747) | feat(concessions): list the stock movement history for HU-CONCESSIONS-007 |
| 04 Nov 03:20 | develop | [`2b136d9`](https://github.com/code-corhuila/csp-concessions-api/commit/2b136d92a0580b3c522a059cf8b7cd21806ed6bd) | feat(core): apply each reservation event once through an inbox for hu-concessions-005 |
| 04 Nov 03:20 | qa | [`67e16c0`](https://github.com/code-corhuila/csp-concessions-api/commit/67e16c03a812b24c045dc2706585550a69f880e6) | feat(core): apply each reservation event once through an inbox for hu-concessions-005 |
| 04 Nov 03:40 | develop | [`8b65a7f`](https://github.com/code-corhuila/csp-concessions-api/commit/8b65a7f3ba5a3fa7b5bc956ada351903242a110f) | chore(ci): pin the concessions schema to the commit with the inbox event table |
| 04 Nov 03:43 | develop | [`28ddd10`](https://github.com/code-corhuila/csp-concessions-api/commit/28ddd103e69e89ed8c2e82447ab111817227daef) | feat(core): merge PR #44 - apply each reservation event once through an inbox for hu-concessions-005 |
| 04 Nov 03:58 | qa | [`05cd3bc`](https://github.com/code-corhuila/csp-concessions-api/commit/05cd3bc1a21a1b10636d8de8c2a76f34691946e3) | chore(ci): pin the concessions schema to the qa commit with the inbox event table |
| 04 Nov 04:05 | qa | [`6ea12e0`](https://github.com/code-corhuila/csp-concessions-api/commit/6ea12e03772d0d8acf007acb97063646d83f9cc1) | feat(core): merge PR #45 - promote the inbox of hu-concessions-005 to qa |
| 04 Nov 05:43 | qa | [`75c3b25`](https://github.com/code-corhuila/csp-concessions-api/commit/75c3b25bb9e0a14d62dbb1f28de9f2ce9ff1d01e) | feat(concessions): merge PR #49 - promote the stock movement history of HU-CONCESSIONS-007 to qa |

[Back to summary](#summary)

---

<a id="csp-concessions-db"></a>
## `csp-concessions-db` (4 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 03:09 | develop | [`4feb342`](https://github.com/code-corhuila/csp-concessions-db/commit/4feb3426998bebf067296dc4e8c0700b47eb7e3b) | feat(db): add the inbox event table for hu-concessions-005 |
| 04 Nov 03:09 | qa | [`a4561b7`](https://github.com/code-corhuila/csp-concessions-db/commit/a4561b7f6eca4fce1f1697b0acd7e8d75113b05c) | feat(db): add the inbox event table for hu-concessions-005 |
| 04 Nov 03:40 | develop | [`b7b7ed9`](https://github.com/code-corhuila/csp-concessions-db/commit/b7b7ed9e3b8ebc70b09c32a600325c56de6146f5) | feat(db): merge PR #12 - add the inbox event table for hu-concessions-005 |
| 04 Nov 03:57 | qa | [`7cef8cf`](https://github.com/code-corhuila/csp-concessions-db/commit/7cef8cf13fdabd2c1d7e1efbfea28221e29bd12d) | feat(db): merge PR #13 - promote the inbox event table of hu-concessions-005 to qa |

[Back to summary](#summary)

---

<a id="csp-docs"></a>
## `csp-docs` (35 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 03:02 | main | [`7e0cc3e`](https://github.com/code-corhuila/csp-docs/commit/7e0cc3ed8de93d73f5c80ffafcece8f31c204e08) | docs(concessions): specify the inbox by event id for hu-concessions-005 |
| 04 Nov 03:39 | main | [`3f82790`](https://github.com/code-corhuila/csp-docs/commit/3f82790e77ef46871a109a7e408d978fc929e2bd) | docs(concessions): merge PR #321 - specify the inbox by event id for hu-concessions-005 |
| 04 Nov 04:11 | main | [`652323a`](https://github.com/code-corhuila/csp-docs/commit/652323aab6312a4c14ed31951599992c4064ff34) | docs(concessions): mark hu-concessions-005 as done in qa |
| 04 Nov 04:28 | main | [`2f6b271`](https://github.com/code-corhuila/csp-docs/commit/2f6b27103845d85938b6b1d48dcc26f14ccdbc94) | docs(concessions): merge PR #322 - mark hu-concessions-005 as done in qa |
| 04 Nov 04:41 | main | [`7cc3a02`](https://github.com/code-corhuila/csp-docs/commit/7cc3a02a5e6798752e4afd77603f959bc263c51b) | docs(quality): update the concessions test figures for hu-concessions-005 |
| 04 Nov 04:41 | main | [`37a3bf4`](https://github.com/code-corhuila/csp-docs/commit/37a3bf4fc0ccf6c5570b073e73c0cc5135813e9c) | docs(operations): record the concessions inbox in the recovery notes for hu-concessions-005 |
| 04 Nov 04:41 | main | [`fa1985e`](https://github.com/code-corhuila/csp-docs/commit/fa1985eae44351ea726e6dafd344685f24829d9c) | docs(training): describe the event id header and V019 for hu-concessions-005 |
| 04 Nov 04:41 | main | [`b0c53e3`](https://github.com/code-corhuila/csp-docs/commit/b0c53e3ed0dd38e3fa808a2704b2d262c43469a3) | docs(project-control): extend td-037 and td-039 for hu-concessions-005 |
| 04 Nov 04:44 | main | [`0dda85c`](https://github.com/code-corhuila/csp-docs/commit/0dda85ca86ebe20b580f419462a945aaab80ceb0) | docs(quality): merge PR #323 - update the concessions test figures for hu-concessions-005 |
| 04 Nov 04:45 | main | [`6759a11`](https://github.com/code-corhuila/csp-docs/commit/6759a114366e4cc174d123b4115dda751fc83897) | Merge remote-tracking branch 'origin/main' into docs/operations-hu-concessions-005 |
| 04 Nov 04:45 | main | [`9418038`](https://github.com/code-corhuila/csp-docs/commit/9418038b6c7aa5c5b7c3583b4ff7dfdc989ea1fe) | docs(operations): merge PR #324 - record the concessions inbox in the recovery notes for hu-concessions-005 |
| 04 Nov 04:45 | main | [`5f0809e`](https://github.com/code-corhuila/csp-docs/commit/5f0809eae9fbd306d49b40f12c805df62d3b68d8) | Merge remote-tracking branch 'origin/main' into docs/training-hu-concessions-005 |
| 04 Nov 04:46 | main | [`c158999`](https://github.com/code-corhuila/csp-docs/commit/c15899912186d4810275a687463024fc7c20772b) | docs(training): merge PR #325 - describe the event id header and V019 for hu-concessions-005 |
| 04 Nov 04:46 | main | [`70c8280`](https://github.com/code-corhuila/csp-docs/commit/70c828044ef12f0ca27fc484fe9790d52bdd404e) | Merge remote-tracking branch 'origin/main' into docs/project-control-hu-concessions-005 |
| 04 Nov 04:46 | main | [`0ee6271`](https://github.com/code-corhuila/csp-docs/commit/0ee6271d716f895d2ac0e3c564db78de43ce7ea4) | docs(project-control): merge PR #326 - extend td-037 and td-039 for hu-concessions-005 |
| 04 Nov 05:52 | main | [`dfab332`](https://github.com/code-corhuila/csp-docs/commit/dfab332c200677e79d8e8cde5ae962b8c22e6427) | docs(stories): mark HU-CONCESSIONS-007 as done in qa |
| 04 Nov 06:03 | main | [`9c74147`](https://github.com/code-corhuila/csp-docs/commit/9c74147771340d127cea55cf072573dce920037b) | docs(stories): merge PR #327 - mark HU-CONCESSIONS-007 as done in qa |
| 05 Nov 04:52 | main | [`7108ebf`](https://github.com/code-corhuila/csp-docs/commit/7108ebf18cb07dcb616636197ae97d87f2bfea40) | docs(operations): record how the outbox relay health, metrics and alerts are delivered |
| 05 Nov 04:55 | main | [`6b5a94f`](https://github.com/code-corhuila/csp-docs/commit/6b5a94ff015340f0b29e949e663e485708091227) | docs(operations): merge PR #330 - how the outbox relay health, metrics and alerts are delivered |
| 05 Nov 05:55 | main | [`355accd`](https://github.com/code-corhuila/csp-docs/commit/355accdb8dd3b386f9cc5adf164bc442bf749535) | docs(booking): bound the seats a user can hold in the contract and DEC-008 |
| 05 Nov 05:58 | main | [`017d75d`](https://github.com/code-corhuila/csp-docs/commit/017d75df96cc850b765f63475d8a4d717ab9e84a) | docs(booking): merge PR #331 - bound the seats a user can hold in the contract and DEC-008 |
| 05 Nov 07:02 | main | [`37611de`](https://github.com/code-corhuila/csp-docs/commit/37611de85f4908551ff1046fddccd90b619c9eef) | docs(project-control): record R-018 and the debt left by the Booking security stories |
| 05 Nov 07:05 | main | [`853f47e`](https://github.com/code-corhuila/csp-docs/commit/853f47ef3fac9697f73f1eb9320a59061dd2274c) | docs(project-control): merge PR #332 - record R-018 and the debt left by the Booking security stories |
| 09 Nov 00:25 | main | [`2022338`](https://github.com/code-corhuila/csp-docs/commit/20223388f7ac146563c7f89a7b956f67fdbf8cc1) | docs(project-control): close TD-053 and update R-018 after the TLS to Catalog |
| 09 Nov 00:30 | main | [`e486ac7`](https://github.com/code-corhuila/csp-docs/commit/e486ac730083b7a717422d35ae022d77ca21fdc6) | docs(project-control): merge PR #363 - close TD-053 and update R-018 after the TLS to Catalog |
| 09 Nov 00:30 | main | [`15d4f66`](https://github.com/code-corhuila/csp-docs/commit/15d4f6611e3a7ac2d74eb7aaabedf0aa4a260342) | docs(training): describe the booking seat limits, token lifetime and local validation |
| 09 Nov 00:31 | main | [`b8cd4eb`](https://github.com/code-corhuila/csp-docs/commit/b8cd4eb8a11d70779e1ef045a101a50800bbb3d1) | docs(changelog): record the training manuals refresh |
| 09 Nov 00:36 | main | [`2dcda74`](https://github.com/code-corhuila/csp-docs/commit/2dcda749147acbe95cd0b7756058fad4e74c21f5) | docs(security): merge PR #277 - threat model of the boundary API Gateway to Booking |
| 09 Nov 00:40 | main | [`393d50a`](https://github.com/code-corhuila/csp-docs/commit/393d50ad03a78519454a8ea8d66d860ec2cafc53) | docs(training): merge PR #364 - describe the booking seat limits, token lifetime and local validation |
| 09 Nov 00:58 | main | [`d45fa65`](https://github.com/code-corhuila/csp-docs/commit/d45fa6534051370549a582f9dc904f6d806f6f6d) | docs(training): state that the admin reservations list is real in develop and qa |
| 09 Nov 01:00 | main | [`f45b956`](https://github.com/code-corhuila/csp-docs/commit/f45b95676efa4d63f81f11a590c461cafcdfb00d) | docs(training): merge PR #365 - state that the admin reservations list is real in develop and qa |
| 09 Nov 01:40 | main | [`11f0ddb`](https://github.com/code-corhuila/csp-docs/commit/11f0ddbb577aef6346e1d49e8bb7eece209a43e6) | docs(training): add screenshots of the booking flow from develop |
| 09 Nov 01:50 | main | [`fd632dd`](https://github.com/code-corhuila/csp-docs/commit/fd632dd3e65b30c258da088fb62a7fea672529dc) | docs(training): merge PR #366 - add screenshots of the booking flow from develop |
| 09 Nov 01:56 | main | [`e750380`](https://github.com/code-corhuila/csp-docs/commit/e750380c916b89fb3969c191468c6bb36a854775) | docs(devops): point local setup to the booking path and recheck the admin manual |
| 09 Nov 01:58 | main | [`e8f12fe`](https://github.com/code-corhuila/csp-docs/commit/e8f12feb803b1597e88beb5e44792ac4cc32c71c) | docs(devops): merge PR #367 - point local setup to the booking path and recheck the admin manual |

[Back to summary](#summary)

---

<a id="csp-infra-postgres"></a>
## `csp-infra-postgres` (8 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Nov 02:25 | develop | [`3792c8d`](https://github.com/code-corhuila/csp-infra-postgres/commit/3792c8da0d800a8b13571654b423238e1e78e027) | feat(infra): give booking its service-only settings in the platform |
| 05 Nov 02:25 | qa | [`52e8399`](https://github.com/code-corhuila/csp-infra-postgres/commit/52e8399c307aff10505e8f6bff81c1d43d789f4f) | feat(infra): give booking its service-only settings in the platform |
| 05 Nov 02:28 | develop | [`9299c8d`](https://github.com/code-corhuila/csp-infra-postgres/commit/9299c8d999d1845b26c4e87bb8d9179aee6af893) | feat(infra): merge PR #49 - give booking its service-only settings in the platform |
| 05 Nov 02:37 | qa | [`697c34b`](https://github.com/code-corhuila/csp-infra-postgres/commit/697c34be3f5906a41651411656329e8ab5ca98f1) | feat(infra): merge PR #50 - promote PR #49 to qa, booking service-only settings in the platform |
| 05 Nov 04:39 | develop | [`86ca0f1`](https://github.com/code-corhuila/csp-infra-postgres/commit/86ca0f163caf843f39d36ae40bcf1cfe24b03c17) | feat(infra): add the metrics and alerts of the outbox relay of csp-worker |
| 05 Nov 04:39 | qa | [`d51c959`](https://github.com/code-corhuila/csp-infra-postgres/commit/d51c959b68bf947740fc8e568084520896339360) | feat(infra): add the metrics and alerts of the outbox relay of csp-worker |
| 05 Nov 04:43 | develop | [`3a38500`](https://github.com/code-corhuila/csp-infra-postgres/commit/3a385008e958b61aa06a2dfb281d548126b23548) | feat(infra): merge PR #51 - metrics and alerts of the outbox relay of csp-worker |
| 05 Nov 05:02 | qa | [`388c92a`](https://github.com/code-corhuila/csp-infra-postgres/commit/388c92a85e417bdef9ab9b80df9adde064dec990) | feat(infra): merge PR #52 - promote the metrics and alerts of the outbox relay to qa |

[Back to summary](#summary)

---

<a id="csp-worker"></a>
## `csp-worker` (8 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 03:24 | develop | [`30ba407`](https://github.com/code-corhuila/csp-worker/commit/30ba407edcc7f8a70844145273138c32358c17c1) | feat(worker): send the event id to the concessions service for hu-concessions-005 |
| 04 Nov 03:24 | qa | [`e98744d`](https://github.com/code-corhuila/csp-worker/commit/e98744ded05a90276e192ece4371e4403d6d528d) | feat(worker): send the event id to the concessions service for hu-concessions-005 |
| 04 Nov 03:44 | develop | [`f5b24fc`](https://github.com/code-corhuila/csp-worker/commit/f5b24fc6bcbcf4a632c5b65ea0a617c37cee6724) | feat(worker): merge PR #64 - send the event id to the concessions service for hu-concessions-005 |
| 04 Nov 03:57 | qa | [`e1d47e9`](https://github.com/code-corhuila/csp-worker/commit/e1d47e9fc554b65b302e2b0dbc63664bf28ca95f) | feat(worker): merge PR #65 - promote the event id for hu-concessions-005 to qa |
| 05 Nov 03:44 | develop | [`9c1f124`](https://github.com/code-corhuila/csp-worker/commit/9c1f124b3fa8353dc137128a455756d19df56db7) | feat(worker): add the health and readiness point of the worker |
| 05 Nov 03:44 | qa | [`37d430b`](https://github.com/code-corhuila/csp-worker/commit/37d430b182e7b8a8c31e87ccfcb63e4dc54eedc6) | feat(worker): add the health and readiness point of the worker |
| 05 Nov 03:58 | develop | [`04bd99c`](https://github.com/code-corhuila/csp-worker/commit/04bd99c1f1d6ae74cf4eb2bc1a9b001d6f9b51fd) | feat(worker): merge PR #66 - add the health and readiness point of the worker |
| 05 Nov 04:37 | qa | [`5bb7afc`](https://github.com/code-corhuila/csp-worker/commit/5bb7afc13f33fac365f732781fd74b2f30d4fe5a) | feat(worker): merge PR #67 - promote the health and readiness point to qa |

[Back to summary](#summary)

---

<a id="csp-booking-db-release-3-0-0-branch-open-pr-43"></a>
## `csp-booking-db release 3.0.0 branch (open PR #43)` (3 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Nov 00:44 | open release PR branch | [`ebf635e`](https://github.com/code-corhuila/csp-booking-db/commit/ebf635eca44bf66015baebeca19353ba2fabac82) | chore(deploy): retry the connection of the migration executor while t… |
| 05 Nov 00:44 | open release PR branch | [`565dbd8`](https://github.com/code-corhuila/csp-booking-db/commit/565dbd828db197c7567d969be76b0cea365e8149) | docs(readme): state that the migration executor runs as booking_migrator |
| 05 Nov 00:45 | open release PR branch | [`7f2cfa0`](https://github.com/code-corhuila/csp-booking-db/commit/7f2cfa0fdf05ad79660bcf721adba9a698a301bd) | docs(changelog): describe the added content in the 3.0.0 release |

[Back to summary](#summary)

---

<a id="csp-booking-api-release-3-0-0-branch-open-pr-61"></a>
## `csp-booking-api release 3.0.0 branch (open PR #61)` (8 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Nov 00:38 | open release PR branch | [`7f13ee3`](https://github.com/code-corhuila/csp-booking-api/commit/7f13ee32087174a7dddd4f25359122fdd7ae82bf) | fix(booking): enforce the permissions of the access token and tolerat… |
| 05 Nov 00:38 | open release PR branch | [`c82bd15`](https://github.com/code-corhuila/csp-booking-api/commit/c82bd1572b31dee8c7337ee7af23ef9bbcbe1fc1) | chore(booking): require iss and aud on the service credentials |
| 05 Nov 00:38 | open release PR branch | [`2070b42`](https://github.com/code-corhuila/csp-booking-api/commit/2070b421e0ab6de30a465ff94b7c3add4294a163) | feat(booking): refuse the seats that are not in the catalog layout |
| 05 Nov 00:38 | open release PR branch | [`4cb243b`](https://github.com/code-corhuila/csp-booking-api/commit/4cb243b6f533248796624860cce8b9898feec38a) | fix(booking): pass the service subjects through the platform compose |
| 05 Nov 00:38 | open release PR branch | [`7da0038`](https://github.com/code-corhuila/csp-booking-api/commit/7da0038f22458fccad95ed1435457b6efc0aa904) | docs(changelog): describe the added content in the 3.0.0 release |
| 06 Nov 14:27 | open release PR branch | [`cc4391e`](https://github.com/code-corhuila/csp-booking-api/commit/cc4391e5aaddec4a51ffffa72d49caa33cd91bde) | feat(booking): bound the seats a user can hold |
| 06 Nov 14:27 | open release PR branch | [`c0707a5`](https://github.com/code-corhuila/csp-booking-api/commit/c0707a5c04ffc96b5584816b65c89d0b12388643) | fix(booking): reject access tokens that live longer than fifteen minutes |
| 06 Nov 14:27 | open release PR branch | [`0cda43a`](https://github.com/code-corhuila/csp-booking-api/commit/0cda43a6a9b47974fd2b789a04dab3fbffc39102) | feat(booking): audit every call to an internal route with a digest of… |

[Back to summary](#summary)

---

<a id="csp-booking-portal-release-3-0-0-branch-open-pr-78"></a>
## `csp-booking-portal release 3.0.0 branch (open PR #78)` (4 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 05 Nov 00:47 | open release PR branch | [`84ad666`](https://github.com/code-corhuila/csp-booking-portal/commit/84ad666e865fe42db67b17477dea0faab905f506) | chore(booking): remove the sample reservations fallback of the list |
| 05 Nov 00:47 | open release PR branch | [`4a32445`](https://github.com/code-corhuila/csp-booking-portal/commit/4a324451d00b5ade914c236bec63d03192818bcf) | test(booking): cover the list error of a server failure |
| 05 Nov 00:47 | open release PR branch | [`5cfa743`](https://github.com/code-corhuila/csp-booking-portal/commit/5cfa74375155eb67ea29dd0bc5363871b66d39f7) | feat(booking): replace the sample of the admin view with a not availa… |
| 06 Nov 14:34 | open release PR branch | [`346c452`](https://github.com/code-corhuila/csp-booking-portal/commit/346c4520d2838d7bca75421f6de56c6d06b69236) | fix(deploy): require an anchored CORS origin regex and narrow the jso… |

[Back to summary](#summary)

---

<a id="csp-concessions-api-release-3-0-0-branch-open-pr-27"></a>
## `csp-concessions-api release 3.0.0 branch (open PR #27)` (5 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 04:13 | open release PR branch | [`543b2d3`](https://github.com/code-corhuila/csp-concessions-api/commit/543b2d32ce0f928230c7ad0afe75b81fcfc7c921) | feat(core): apply each reservation event once through an inbox for hu… |
| 04 Nov 04:13 | open release PR branch | [`619abe2`](https://github.com/code-corhuila/csp-concessions-api/commit/619abe2a1c5e3ba254d0feaab3dc551dcf4b198d) | chore(ci): pin the concessions schema to the qa commit with the inbox… |
| 04 Nov 04:13 | open release PR branch | [`55dad82`](https://github.com/code-corhuila/csp-concessions-api/commit/55dad82014c9c815250afe52c65a525594d5d717) | docs(changelog): require the schema up to v019 in the 3.0.0 release |
| 04 Nov 05:27 | open release PR branch | [`404021d`](https://github.com/code-corhuila/csp-concessions-api/commit/404021d9bc22d3f533c106afec6906957855f9fc) | fix(concessions): tolerate 30 seconds of clock skew on the token expi… |
| 04 Nov 05:43 | open release PR branch | [`2e8ce6b`](https://github.com/code-corhuila/csp-concessions-api/commit/2e8ce6ba115fdb0ae6b218bbddf7e823e905c272) | feat(concessions): list the stock movement history for HU-CONCESSIONS… |

[Back to summary](#summary)

---

<a id="csp-concessions-db-release-3-0-0-branch-open-pr-7"></a>
## `csp-concessions-db release 3.0.0 branch (open PR #7)` (1 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 04:12 | open release PR branch | [`0b4c922`](https://github.com/code-corhuila/csp-concessions-db/commit/0b4c92213384e9cfe0b394e57f7a0112f0569267) | feat(db): add the inbox event table for hu-concessions-005 |

[Back to summary](#summary)

---

<a id="fork-certification"></a>
## Fork `Yefersom10/sistemas-distribuidos-2026-b-g1` (`certification/` folder) (18 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 04 Nov 04:27 | main (fork) | [`3ddfec6`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/3ddfec67eaa5f9b5aefc39d491aa924ccae5420b) | docs(certification): add templates and enrollment evidence |
| 04 Nov 04:30 | main (fork) | [`8c8922a`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/8c8922a46b3cac5a51512b05e4b3cd7a828f37b2) | docs(certification): fill readme cover |
| 04 Nov 05:13 | main (fork) | [`fd565e5`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/fd565e57de64fac5a2b71770058a09e904714de8) | docs(certification): add chapter 1 evidence |
| 04 Nov 05:18 | main (fork) | [`4a17d2a`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/4a17d2a9f9c73e576158d0fac17e4921eb4ce9f4) | docs(certification): log study sessions for chapter 1 |
| 04 Nov 06:15 | main (fork) | [`f71deb3`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/f71deb3d174cd7b0077c03e0e6c0b6495d5ed511) | docs(certification): add chapter 2 evidence |
| 04 Nov 06:17 | main (fork) | [`909b021`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/909b0213be34aa14aabfda13d80ec1e89e8294b7) | docs(certification): log chapter 2 study session |
| 04 Nov 13:18 | main (fork) | [`2d496ff`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/2d496ff19b964488489fa349d444eef74046daa8) | docs(certification): add chapter 3 evidence |
| 04 Nov 13:18 | main (fork) | [`83ca7b0`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/83ca7b02b8753390ff496fda9cfae31df1c8eb00) | docs(certification): log chapter 3 study session |
| 05 Nov 03:59 | main (fork) | [`3aa1698`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/3aa1698bf873d9b1dbf8e7458ef8fd0883763f98) | docs(certification): add chapter 4 evidence |
| 05 Nov 03:59 | main (fork) | [`953ce83`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/953ce83c1afff91fd68c0e0bc10d3b4d2c107b82) | docs(certification): log chapter 4 study session |
| 05 Nov 07:01 | main (fork) | [`98bb2fd`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/98bb2fdc2ca290a13597ab29b87c2463d8bef29f) | docs(certification): add chapter 5 evidence |
| 05 Nov 07:01 | main (fork) | [`ec1fe35`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/ec1fe353cf708c742139b615faf5b384c5171b90) | docs(certification): log chapter 5 study session |
| 08 Nov 00:43 | main (fork) | [`4093956`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/40939561032617d8d9d21652c1957dd6ab4834f7) | docs(certification): add chapter 6 evidence |
| 08 Nov 00:47 | main (fork) | [`985d87f`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/985d87fb6f791cc52965b87a5a2f291b12f10418) | docs(certification): log chapter 6 study session |
| 09 Nov 00:26 | main (fork) | [`93d57d9`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/93d57d9e7e14a844ca57df99deacd3daa7cae186) | docs(certification): add chapter 7 evidence |
| 09 Nov 00:26 | main (fork) | [`5f91f17`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/5f91f1741a87651f23ed91725caf8429a7dacb20) | docs(certification): log chapter 7 study session |
| 09 Nov 02:05 | main (fork) | [`83d4d22`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/83d4d22e270b0ba32244c33789d8929f9af625f6) | docs(certification): add chapter 8 evidence |
| 09 Nov 02:07 | main (fork) | [`2c96448`](https://github.com/Yefersom10/sistemas-distribuidos-2026-b-g1/commit/2c9644894c179405aa6f4bb5542503beb0a591a0) | docs(certification): log chapter 8 study session |

[Back to summary](#summary)

---
