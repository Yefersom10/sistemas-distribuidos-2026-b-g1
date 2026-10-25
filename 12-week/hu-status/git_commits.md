# Week 12 Commits

Week Mon 19 - Sun 25 Oct 2026 · Source: GitHub API of `code-corhuila` (queried 2026-10-25, last commit 2026-10-25 00:46 UTC) · Dates in UTC · Commits authored by me (merges done with `gh pr merge` appear as "Yeferson Heredia").

Branch = where the commit exists (develop, qa, main). qa commits are mostly cherry-picks with a different hash.

## Summary

| Repository | Commits |
|---|---:|
| [`csp-booking-api`](#csp-booking-api) | 26 |
| [`csp-booking-db`](#csp-booking-db) | 4 |
| [`csp-booking-portal`](#csp-booking-portal) | 47 |
| [`csp-worker`](#csp-worker) | 11 |
| [`csp-docs`](#csp-docs) | 101 |
| [`csp-concessions-api`](#csp-concessions-api) | 77 |
| [`csp-concessions-db`](#csp-concessions-db) | 18 |
| [`csp-api-gateway`](#csp-api-gateway) | 4 |
| **Total** | **288** |

---

<a id="csp-booking-api"></a>
## `csp-booking-api` (26 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 19 Oct 16:25 | develop | [`2f9e14e`](https://github.com/code-corhuila/csp-booking-api/commit/2f9e14ee5e3ef765da75952768f62e50145025dd) | chore(ci): pin the booking schema to the release tag v2.0.0 |
| 19 Oct 17:32 | develop | [`349ee3e`](https://github.com/code-corhuila/csp-booking-api/commit/349ee3e4a6176743a7733a5270907b1cbef6c596) | feat(auth): split the service subjects of the workflow from the maintenance ones |
| 19 Oct 17:32 | qa | [`86bdcd0`](https://github.com/code-corhuila/csp-booking-api/commit/86bdcd0fce4bc2eef93ffbd21f46495631a33042) | feat(auth): split the service subjects of the workflow from the maintenance ones |
| 19 Oct 17:41 | develop | [`8ff86a9`](https://github.com/code-corhuila/csp-booking-api/commit/8ff86a9cc274eb65fb2da1618299ce8ec64a7e9d) | feat(workflow): add the internal hold and confirm for the workflow service |
| 19 Oct 17:41 | qa | [`4ff668e`](https://github.com/code-corhuila/csp-booking-api/commit/4ff668ee7248c1c1dfab32e88c39b2d28fe88efb) | feat(workflow): add the internal hold and confirm for the workflow service |
| 19 Oct 17:54 | develop | [`3331048`](https://github.com/code-corhuila/csp-booking-api/commit/3331048c2b5f82621a12410e1047f36ef48e8258) | feat(workflow): add the internal release of a hold for the workflow service |
| 19 Oct 17:54 | qa | [`3a5559d`](https://github.com/code-corhuila/csp-booking-api/commit/3a5559dbe0d0e72ee4e839db98f857d3f8bf2aa0) | feat(workflow): add the internal release of a hold for the workflow service |
| 19 Oct 21:30 | develop | [`b12ac4c`](https://github.com/code-corhuila/csp-booking-api/commit/b12ac4c0739a199174463618f6e654135bc59e2b) | feat(auth): merge PR #56 - split the service subjects of the workflow from the maintenance ones |
| 19 Oct 21:31 | develop | [`44d6145`](https://github.com/code-corhuila/csp-booking-api/commit/44d6145890b98e18ebc19bace7ad6254a5942b4c) | feat(workflow): merge PR #57 - add the internal hold and confirm for the workflow service |
| 19 Oct 21:33 | develop | [`4ad930a`](https://github.com/code-corhuila/csp-booking-api/commit/4ad930acdc89aa041d14ffc6d03eecd10cfb89e4) | feat(workflow): merge PR #58 - add the internal release of a hold for the workflow service |
| 19 Oct 21:54 | develop | [`6a9fc03`](https://github.com/code-corhuila/csp-booking-api/commit/6a9fc03884954bf4cae6956d2d1194c009306054) | Merge remote-tracking branch 'origin/develop' into chore/booking-api-ci-schema-tag |
| 19 Oct 21:59 | develop | [`3812742`](https://github.com/code-corhuila/csp-booking-api/commit/3812742f0b983f1f8f30ffd1a7c89727c3c74c81) | chore(ci): merge PR #55 - CI checks out the schema at the release tag v2.0.0 |
| 19 Oct 21:59 | qa | [`606e5b0`](https://github.com/code-corhuila/csp-booking-api/commit/606e5b0cc804177c3d928b9aea8f1441f3955255) | chore(ci): merge PR #55 - CI checks out the schema at the release tag v2.0.0 |
| 20 Oct 01:39 | qa | [`3398914`](https://github.com/code-corhuila/csp-booking-api/commit/3398914ee1027e3eaccd6a467154139ee0be05a0) | chore(ci): merge PR #59 - promote PR #55 to qa, CI checks out the schema at v2.0.0 |
| 20 Oct 22:38 | qa | [`20a0b26`](https://github.com/code-corhuila/csp-booking-api/commit/20a0b268a291c9696d1aeeaaa7f294b0faa797b2) | feat(workflow): merge PR #60 - promote the internal workflow routes to qa |
| 23 Oct 04:40 | develop | [`d016a5d`](https://github.com/code-corhuila/csp-booking-api/commit/d016a5db8cf2e9a449dd43526ab5c1a43ea98ebe) | feat(booking): add the catalog client for the availability layout |
| 23 Oct 04:40 | qa | [`2201651`](https://github.com/code-corhuila/csp-booking-api/commit/22016517b2428daded301caba2fd0cf8dcc07548) | feat(booking): add the catalog client for the availability layout |
| 23 Oct 04:42 | develop | [`e0b14b1`](https://github.com/code-corhuila/csp-booking-api/commit/e0b14b131c4b845d50e6c8db4e44c3cf8f1b0208) | feat(booking): add the seat map route of a showtime |
| 23 Oct 04:42 | qa | [`47194cc`](https://github.com/code-corhuila/csp-booking-api/commit/47194cc99a172b6a3cf31d74be43cc430e6586e3) | feat(booking): add the seat map route of a showtime |
| 23 Oct 04:47 | develop | [`b1c3460`](https://github.com/code-corhuila/csp-booking-api/commit/b1c34608dafc2d1bb6428420e9d8c12c2b3b100c) | feat(booking): merge PR #63 - add the catalog client for the availability layout |
| 23 Oct 04:47 | develop | [`b367412`](https://github.com/code-corhuila/csp-booking-api/commit/b3674124007bd173beba9af51fc601a9788547be) | chore(booking): merge develop into the seat map branch |
| 23 Oct 05:11 | develop | [`70ccef0`](https://github.com/code-corhuila/csp-booking-api/commit/70ccef076195a3d80a028efa50c6441de25923c8) | feat(booking): merge PR #64 - add the seat map route of a showtime |
| 23 Oct 13:28 | qa | [`a6c7fea`](https://github.com/code-corhuila/csp-booking-api/commit/a6c7feabe47d67227e58deabed7c8b9686a96b16) | feat(booking): merge PR #65 - promote the catalog client of the seat map to qa |
| 23 Oct 13:38 | qa | [`664af10`](https://github.com/code-corhuila/csp-booking-api/commit/664af10301ae21f57b3657c26626cef0df3136c3) | feat(booking): merge PR #66 - promote the seat map route to qa |
| 24 Oct 23:17 | develop | [`4fecdef`](https://github.com/code-corhuila/csp-booking-api/commit/4fecdef9821b280e99c61efb2cfd8c1aa4a16ee5) | fix(booking): enforce the permissions of the access token and tolerate the clock skew |
| 24 Oct 23:29 | develop | [`c44c31f`](https://github.com/code-corhuila/csp-booking-api/commit/c44c31f193d8c8a76287d6f5d1f0e53011134072) | fix(booking): merge PR #68 - enforce token permissions and tolerate clock skew |

[Back to summary](#summary)

---

<a id="csp-booking-db"></a>
## `csp-booking-db` (4 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 19 Oct 16:25 | develop | [`f202047`](https://github.com/code-corhuila/csp-booking-db/commit/f202047edaf9675e1c0f5d1745c2527370029dd3) | docs(readme): document how a schema version is cut and consumed |
| 19 Oct 21:59 | develop | [`c29b3ad`](https://github.com/code-corhuila/csp-booking-db/commit/c29b3ad34e54a86014d5613d3ee3860e77de4ae6) | docs(readme): merge PR #41 - document how a schema version is cut and consumed |
| 19 Oct 21:59 | qa | [`d14ff07`](https://github.com/code-corhuila/csp-booking-db/commit/d14ff07f3d543d7688ac90575bbfc944b3764795) | docs(readme): merge PR #41 - document how a schema version is cut and consumed |
| 20 Oct 01:40 | qa | [`0d315ab`](https://github.com/code-corhuila/csp-booking-db/commit/0d315ab112237e15b26d4d2d6f3d3c5402b552da) | docs(readme): merge PR #42 - promote PR #41 to qa, how a schema version is cut and consumed |

[Back to summary](#summary)

---

<a id="csp-booking-portal"></a>
## `csp-booking-portal` (47 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 19 Oct 15:52 | develop | [`98733dc`](https://github.com/code-corhuila/csp-booking-portal/commit/98733dc0ae0d01faa7ae0dc30a6b9e0b378e52e4) | fix(deploy): merge PR #55 - check the container health on 127.0.0.1 |
| 19 Oct 15:52 | qa | [`3d08045`](https://github.com/code-corhuila/csp-booking-portal/commit/3d08045a1509499ac7130e0bb06de5ac08a4f348) | fix(deploy): merge PR #55 - check the container health on 127.0.0.1 |
| 19 Oct 16:25 | develop | [`03c4ee6`](https://github.com/code-corhuila/csp-booking-portal/commit/03c4ee6e22e7c6f673c45a5e8bbf902f4ed9171d) | chore(lint): enforce the shared-client boundary of the shell |
| 19 Oct 16:36 | develop | [`c573a85`](https://github.com/code-corhuila/csp-booking-portal/commit/c573a851f9269635e8624db48feb23adf79bf3e2) | fix(booking-portal): show the checkout, seat map and admin texts in Spanish |
| 19 Oct 16:36 | develop | [`d1f19ad`](https://github.com/code-corhuila/csp-booking-portal/commit/d1f19ad87d27868a4cb59152f14e94245c9bd5c4) | chore(booking-portal): normalize booking-page.component.ts to LF |
| 19 Oct 16:37 | develop | [`eb308ba`](https://github.com/code-corhuila/csp-booking-portal/commit/eb308ba3772173ab52658762cefb4a1d2ea4da87) | chore(booking-portal): normalize booking-form.component.ts to LF |
| 19 Oct 16:48 | develop | [`e586262`](https://github.com/code-corhuila/csp-booking-portal/commit/e586262079f080a89275036ad31f036cc907e1bc) | fix(booking-portal): show the main screen and the hold form in Spanish |
| 19 Oct 17:08 | qa | [`e5f330d`](https://github.com/code-corhuila/csp-booking-portal/commit/e5f330d4b251d0beaf207a87b4f2daa22235ea89) | fix(deploy): merge PR #57 - promote the container healthcheck on 127.0.0.1 to qa |
| 19 Oct 21:55 | develop | [`a6bb140`](https://github.com/code-corhuila/csp-booking-portal/commit/a6bb14087e195340c8eade578338058f91180557) | chore(portal): merge PR #60 - normalize booking-page.component.ts to LF |
| 19 Oct 21:55 | qa | [`22157fd`](https://github.com/code-corhuila/csp-booking-portal/commit/22157fd2396baa0ec8eb50d91827a116e9aa2156) | chore(portal): merge PR #60 - normalize booking-page.component.ts to LF |
| 19 Oct 21:55 | develop | [`3994b03`](https://github.com/code-corhuila/csp-booking-portal/commit/3994b036e5e7e70d7f4345022dd42e535ce6283b) | chore(portal): merge PR #61 - normalize booking-form.component.ts to LF |
| 19 Oct 21:55 | qa | [`def97e5`](https://github.com/code-corhuila/csp-booking-portal/commit/def97e599b819c87fdcf247604a68e32c286ae66) | chore(portal): merge PR #61 - normalize booking-form.component.ts to LF |
| 19 Oct 21:55 | develop | [`979a1bf`](https://github.com/code-corhuila/csp-booking-portal/commit/979a1bf4d098e7cb5069bdd59e30d4128d663258) | fix(portal): merge PR #59 - Spanish user-facing text, part 1 of #56 |
| 19 Oct 21:55 | qa | [`fbfa9d1`](https://github.com/code-corhuila/csp-booking-portal/commit/fbfa9d1a77528b5c8c24d2fee18a9a2952b7a322) | fix(portal): merge PR #59 - Spanish user-facing text, part 1 of #56 |
| 19 Oct 21:56 | develop | [`6851898`](https://github.com/code-corhuila/csp-booking-portal/commit/68518986a930815db7d625491cfa43213dcafa37) | chore(portal): merge PR #58 - lint rules keep the HTTP client and gateway URL in the shell |
| 19 Oct 21:56 | qa | [`d69743e`](https://github.com/code-corhuila/csp-booking-portal/commit/d69743eca2291736617318713d3cc5f702d872b2) | chore(portal): merge PR #58 - lint rules keep the HTTP client and gateway URL in the shell |
| 20 Oct 01:38 | develop | [`b1a38aa`](https://github.com/code-corhuila/csp-booking-portal/commit/b1a38aa20ef6d9a1288254c6e0119f640c5e276c) | fix(portal): merge PR #62 - Spanish text on the main screen and the hold form, part 2 of #56 |
| 20 Oct 01:38 | qa | [`d6418bb`](https://github.com/code-corhuila/csp-booking-portal/commit/d6418bb12fc8f73a978c5278fa8bfb0ebfcdc68a) | fix(portal): merge PR #62 - Spanish text on the main screen and the hold form, part 2 of #56 |
| 20 Oct 01:41 | qa | [`bc98015`](https://github.com/code-corhuila/csp-booking-portal/commit/bc98015878aed8ed96cb9bbf96e4c25b262447f5) | chore(portal): merge PR #63 - promote PR #60 to qa, normalize booking-page.component.ts to LF |
| 20 Oct 01:56 | qa | [`fc140d9`](https://github.com/code-corhuila/csp-booking-portal/commit/fc140d9ef616c9ceece53a94dbe2ca0cd98ccbe9) | chore(portal): merge PR #64 - promote PR #61 to qa, normalize booking-form.component.ts to LF |
| 20 Oct 02:05 | qa | [`52dfa77`](https://github.com/code-corhuila/csp-booking-portal/commit/52dfa779648a49c62118425b1312a6231f62835f) | fix(portal): merge PR #65 - promote PR #59 to qa, Spanish user-facing text part 1 of #56 |
| 20 Oct 02:12 | qa | [`85c0bd6`](https://github.com/code-corhuila/csp-booking-portal/commit/85c0bd6c46ac81a84198a7f7e7b88f36017b8af4) | chore(portal): merge PR #66 - promote PR #58 to qa, lint rules keep the HTTP client and gateway URL in the shell |
| 20 Oct 02:18 | qa | [`709950a`](https://github.com/code-corhuila/csp-booking-portal/commit/709950a8f9090072fff3b1de9a9a1aa18d049c30) | fix(portal): merge PR #67 - promote PR #62 to qa, Spanish text on the main screen and hold form, part 2 of #56 |
| 20 Oct 02:38 | develop | [`c49202d`](https://github.com/code-corhuila/csp-booking-portal/commit/c49202df2c9f41db0d8184e78cd113207fd7ffa1) | chore(booking-portal): normalize the pull request template to LF |
| 20 Oct 02:38 | develop | [`73c117a`](https://github.com/code-corhuila/csp-booking-portal/commit/73c117af14787886e2c2344471c0579870fe607e) | chore(booking-portal): normalize booking-api.service.ts to LF |
| 20 Oct 02:38 | develop | [`970de6d`](https://github.com/code-corhuila/csp-booking-portal/commit/970de6def36d57a637617f30d192a26fb9906025) | chore(booking-portal): normalize booking.ts to LF |
| 20 Oct 02:38 | develop | [`63f53fa`](https://github.com/code-corhuila/csp-booking-portal/commit/63f53fa1c61eaa9e0b7823933a6be840bde742a4) | chore(booking-portal): normalize money.ts to LF |
| 20 Oct 15:05 | develop | [`6b21060`](https://github.com/code-corhuila/csp-booking-portal/commit/6b21060573cd8ba4f59612ca2fb0b0cdc5be72f9) | chore(portal): merge PR #68 - normalize the pull request template to LF |
| 20 Oct 15:05 | qa | [`daf2da4`](https://github.com/code-corhuila/csp-booking-portal/commit/daf2da47fb800b79d9c89b6f1f8a8cc6e369af99) | chore(portal): merge PR #68 - normalize the pull request template to LF |
| 20 Oct 15:05 | develop | [`5b20f42`](https://github.com/code-corhuila/csp-booking-portal/commit/5b20f42eff03490f338f13b82df69ccf48bdf32f) | chore(portal): merge PR #69 - normalize booking-api.service.ts to LF |
| 20 Oct 15:05 | qa | [`31f81f9`](https://github.com/code-corhuila/csp-booking-portal/commit/31f81f9a6f4b6b55291394b720f2fda8dd20a08a) | chore(portal): merge PR #69 - normalize booking-api.service.ts to LF |
| 20 Oct 15:05 | develop | [`c4c0729`](https://github.com/code-corhuila/csp-booking-portal/commit/c4c07299422b9097e6e33b2f587f3d35bdaa40c1) | chore(portal): merge PR #70 - normalize booking.ts to LF |
| 20 Oct 15:05 | qa | [`23c8cf5`](https://github.com/code-corhuila/csp-booking-portal/commit/23c8cf52816251d2c55e1328988e916090aa6463) | chore(portal): merge PR #70 - normalize booking.ts to LF |
| 20 Oct 15:05 | develop | [`f233fa6`](https://github.com/code-corhuila/csp-booking-portal/commit/f233fa60bdcbdc1606a0f2fdc355ae90520c0010) | chore(portal): merge PR #71 - normalize money.ts to LF |
| 20 Oct 15:05 | qa | [`4e4673e`](https://github.com/code-corhuila/csp-booking-portal/commit/4e4673ec7ed158ab724840fa2bb6993c4d7acca7) | chore(portal): merge PR #71 - normalize money.ts to LF |
| 20 Oct 15:16 | qa | [`e6106d7`](https://github.com/code-corhuila/csp-booking-portal/commit/e6106d7940e512e8c6acb38aa6733838815584a9) | chore(portal): merge PR #72 - promote PR #68 to qa, normalize the pull request template to LF |
| 20 Oct 15:20 | qa | [`0255c9a`](https://github.com/code-corhuila/csp-booking-portal/commit/0255c9a2ee61d01dd1c3a47292af8090a60b50c7) | chore(portal): merge PR #73 - promote PR #69 to qa, normalize booking-api.service.ts to LF |
| 20 Oct 15:26 | qa | [`7cc6af4`](https://github.com/code-corhuila/csp-booking-portal/commit/7cc6af4a561b8b80e0ab3365feab3774d83d0d06) | chore(portal): merge PR #74 - promote PR #70 to qa, normalize booking.ts to LF |
| 20 Oct 15:30 | qa | [`0a212db`](https://github.com/code-corhuila/csp-booking-portal/commit/0a212db4e7b3b988c74e801da4198bb4fc0975f0) | chore(portal): merge PR #75 - promote PR #71 to qa, normalize money.ts to LF |
| 20 Oct 21:23 | develop | [`bde09b2`](https://github.com/code-corhuila/csp-booking-portal/commit/bde09b22d51d384e50378b2a0365457030f168cb) | chore(booking-portal): keep text files in LF on every machine |
| 20 Oct 22:20 | develop | [`6367b17`](https://github.com/code-corhuila/csp-booking-portal/commit/6367b175e4db1194b78cd085a65b7f81928bca19) | chore(portal): merge PR #76 - keep text files in LF on every machine |
| 20 Oct 22:20 | qa | [`5a1482e`](https://github.com/code-corhuila/csp-booking-portal/commit/5a1482eec846a8c05b9a87bb198dda4f22dac57a) | chore(portal): merge PR #76 - keep text files in LF on every machine |
| 20 Oct 22:23 | qa | [`f5da164`](https://github.com/code-corhuila/csp-booking-portal/commit/f5da1643eac07feb065e8dd8f96bd2e593d98bdf) | chore(portal): merge PR #77 - promote PR #76 to qa, keep text files in LF on every machine |
| 23 Oct 05:00 | develop | [`675d0fa`](https://github.com/code-corhuila/csp-booking-portal/commit/675d0fabd3c74b7fe39fdc2aad335965d19b37a9) | feat(booking): draw the real seat map in the portal |
| 23 Oct 05:00 | qa | [`d274bdc`](https://github.com/code-corhuila/csp-booking-portal/commit/d274bdc537db0a73a80d0ad2f90e356335def001) | feat(booking): draw the real seat map in the portal |
| 23 Oct 05:12 | develop | [`e11a9bb`](https://github.com/code-corhuila/csp-booking-portal/commit/e11a9bbc396f326fbfd3fc9d6d2acb7d5e0816f2) | feat(booking): merge PR #80 - draw the real seat map in the portal |
| 23 Oct 13:38 | qa | [`bb4ad27`](https://github.com/code-corhuila/csp-booking-portal/commit/bb4ad276d3fa57d7ead078f76ab689ac22122d28) | feat(booking): merge PR #81 - promote the real seat map of the portal to qa |

[Back to summary](#summary)

---

<a id="csp-worker"></a>
## `csp-worker` (11 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 23 Oct 02:33 | develop | [`3134dfd`](https://github.com/code-corhuila/csp-worker/commit/3134dfd1ad73cf44c6505f096cf705cb2e16a4bc) | feat(worker): add the job that settles the order of a reservation and its concessions client for hu-concessions-004 |
| 23 Oct 02:34 | develop | [`0b78c1d`](https://github.com/code-corhuila/csp-worker/commit/0b78c1dce1a0ef19080272b2964a124ba196b951) | feat(worker): compose the reservation events job on the queues of concessions for hu-concessions-004 |
| 23 Oct 02:44 | develop | [`72d2c67`](https://github.com/code-corhuila/csp-worker/commit/72d2c670be2ea9893db0aef813359b43c85b0ee0) | feat(worker): add the job that sweeps the concession orders whose time ran out for hu-concessions-004 |
| 23 Oct 02:49 | develop | [`b8d879b`](https://github.com/code-corhuila/csp-worker/commit/b8d879bfe1a641f0e1e4942469dbb8b92726a824) | feat(worker): relay the concessions outbox behind its own flag for hu-concessions-004 |
| 23 Oct 02:57 | develop | [`91329a8`](https://github.com/code-corhuila/csp-worker/commit/91329a88f2103699e92a5b0a35c98c411237aecc) | feat(worker): merge PR #37 - add the job that settles the order of a reservation and its concessions client for hu-concessions-004 |
| 23 Oct 02:58 | develop | [`fcbd7b5`](https://github.com/code-corhuila/csp-worker/commit/fcbd7b5814dfa9d5b0a0297c8af85fcbf5571510) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-004-reservation-queue |
| 23 Oct 03:05 | develop | [`77a7e75`](https://github.com/code-corhuila/csp-worker/commit/77a7e75edca3e1bff9aae2d37e584c9b7d9b40fc) | feat(worker): merge PR #38 - compose the reservation events job on the queues of concessions for hu-concessions-004 |
| 23 Oct 03:05 | develop | [`3fd42d4`](https://github.com/code-corhuila/csp-worker/commit/3fd42d4b4e1128b7b185cb93802f4dbda5f42007) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-004-expire-orders |
| 23 Oct 03:11 | develop | [`d6092ce`](https://github.com/code-corhuila/csp-worker/commit/d6092ceed97f521b9ee289c39add5a3067f077a2) | feat(worker): merge PR #39 - add the job that sweeps the concession orders whose time ran out for hu-concessions-004 |
| 23 Oct 03:12 | develop | [`6f0657c`](https://github.com/code-corhuila/csp-worker/commit/6f0657c702db321e0e1124b7a4d1a3cfe752905c) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-004-outbox-relay |
| 23 Oct 03:16 | develop | [`1f56afa`](https://github.com/code-corhuila/csp-worker/commit/1f56afaebb800ee98333ab8764f2ff95aec22e22) | feat(worker): merge PR #40 - relay the concessions outbox behind its own flag for hu-concessions-004 |

[Back to summary](#summary)

---

<a id="csp-docs"></a>
## `csp-docs` (101 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 19 Oct 16:27 | main | [`663accc`](https://github.com/code-corhuila/csp-docs/commit/663accc346f996569ce572b136e97048b275558f) | docs(booking): propose the internal operations for the workflow service (ADR-035) |
| 19 Oct 17:25 | main | [`1a8b3d6`](https://github.com/code-corhuila/csp-docs/commit/1a8b3d67885508474067aa0efc123c521482ec32) | docs(booking): merge PR #154 - propose the internal operations for the workflow service (ADR-035) |
| 19 Oct 17:35 | main | [`a0cfbda`](https://github.com/code-corhuila/csp-docs/commit/a0cfbda458c64c3d09d97546bd253bf530af0a55) | docs(concessions): add Yeferson as a participant of the Concessions service |
| 19 Oct 17:56 | main | [`cd0f15f`](https://github.com/code-corhuila/csp-docs/commit/cd0f15f21df5382746b4bd4c0b0b5c023e8213ef) | docs(adr): correct ADR-035 on the release and record the review of Auth |
| 19 Oct 21:28 | main | [`a6ac3a3`](https://github.com/code-corhuila/csp-docs/commit/a6ac3a3923f97c7371818043b9579d0a6bfbca07) | docs(concessions): merge main into docs/concessions-add-yeferson |
| 19 Oct 21:29 | main | [`4d9b34d`](https://github.com/code-corhuila/csp-docs/commit/4d9b34da030ad26b1b800a4a142d83d7156d511a) | docs(adr): merge PR #158 - correct ADR-035 on the release and record the review of Auth |
| 19 Oct 21:29 | main | [`67e6752`](https://github.com/code-corhuila/csp-docs/commit/67e6752785c0622d81ffb24290373b5d00451dc5) | docs(concessions): merge PR #157 - add Yeferson as a participant of the Concessions service |
| 19 Oct 21:42 | main | [`7922bf6`](https://github.com/code-corhuila/csp-docs/commit/7922bf627fd6da93c3b31c671ee9a20955240e68) | docs(concessions): add Yeferson to the remaining Concessions owner lists |
| 19 Oct 21:55 | main | [`44acf7f`](https://github.com/code-corhuila/csp-docs/commit/44acf7f8624096f0b503cbfa0c184ed60348fcd5) | docs(adr): add Yeferson to the Concessions owners named in ADR-003, ADR-004 and ADR-006 |
| 19 Oct 22:42 | main | [`f50e68f`](https://github.com/code-corhuila/csp-docs/commit/f50e68ff586a2ba4204b6cafb0dbeab34585a502) | docs(concessions): merge PR #159 - add Yeferson to the remaining Concessions owner lists |
| 20 Oct 21:27 | main | [`d6aeced`](https://github.com/code-corhuila/csp-docs/commit/d6aecedc918591aadd17e037d15dadb15fb2c3c6) | docs(concessions): document the product table, its idempotency key and the service runbook |
| 20 Oct 21:36 | main | [`0f74b15`](https://github.com/code-corhuila/csp-docs/commit/0f74b154418770a8dc2c8b37e9fa5adcaec6b7a3) | docs(concessions): record that the service owners agreed on the product decisions |
| 20 Oct 22:38 | main | [`6bc5dd9`](https://github.com/code-corhuila/csp-docs/commit/6bc5dd9f9607a2c86a2cb99db301ae92c897b730) | Merge remote-tracking branch 'origin/main' into docs/concessions-product-data-and-runbook |
| 20 Oct 22:38 | main | [`963da7c`](https://github.com/code-corhuila/csp-docs/commit/963da7cf40680cf8625348fd9f3f6a9c37aa3d82) | docs(concessions): merge PR #167 - product table, idempotency key and service runbook |
| 21 Oct 04:35 | main | [`cca4677`](https://github.com/code-corhuila/csp-docs/commit/cca46772d178c8b5092fe2dc915105d9d6524f95) | docs(concessions): mark hu-concessions-001 done in qa and record its delivery trail |
| 21 Oct 04:36 | main | [`db4f0c5`](https://github.com/code-corhuila/csp-docs/commit/db4f0c540aa69e8efec4010572f991b3345bf9a5) | docs(concessions): merge PR #174 - mark hu-concessions-001 done in qa and record its delivery trail |
| 21 Oct 04:46 | main | [`8f7c844`](https://github.com/code-corhuila/csp-docs/commit/8f7c8448ca64cf572799b0096666a6745636a74e) | docs(concessions): define the combo contract, status route and tables for hu-concessions-002 |
| 21 Oct 13:06 | main | [`2a9b6d5`](https://github.com/code-corhuila/csp-docs/commit/2a9b6d570bbdb7d99ef6fadcd54c26c048998240) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-002-combo-contract |
| 21 Oct 13:06 | main | [`acd72b6`](https://github.com/code-corhuila/csp-docs/commit/acd72b6279005816ec01ba74bf4306a8a992d395) | docs(concessions): version the combo contract and record it in the changelog |
| 21 Oct 13:06 | main | [`97cbc60`](https://github.com/code-corhuila/csp-docs/commit/97cbc6022b4fcf5ee66bfee265deeda895da831e) | docs(concessions): record the combo contract in the changelog |
| 21 Oct 20:45 | main | [`93cb878`](https://github.com/code-corhuila/csp-docs/commit/93cb878d327d8d32dff4b5ae20aec07611b4582b) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-002-combo-contract |
| 21 Oct 20:46 | main | [`b21e079`](https://github.com/code-corhuila/csp-docs/commit/b21e0799435b6e2f3d8c7de89469f0d3a809b772) | docs(concessions): merge PR #175 - define the combo contract, status route and tables for hu-concessions-002 |
| 21 Oct 21:53 | main | [`97177c9`](https://github.com/code-corhuila/csp-docs/commit/97177c9b3d0d81869d15c2d6ea574ffeacc4ad3a) | docs(concessions): mark hu-concessions-002 in progress and record its delivery trail |
| 21 Oct 21:54 | main | [`bf64fcc`](https://github.com/code-corhuila/csp-docs/commit/bf64fcced1c734352c0a3bd58e79db5f1f70e18b) | docs(project-control): record the concessions service code and the published combo debt |
| 21 Oct 21:54 | main | [`02f22d6`](https://github.com/code-corhuila/csp-docs/commit/02f22d6aa595680a241ac5ef9923c250890691df) | docs(quality): record the concessions test stack and its measured suite |
| 21 Oct 21:54 | main | [`50d78a1`](https://github.com/code-corhuila/csp-docs/commit/50d78a1e8920055ff4fd23f1c9922a7189002948) | docs(training): note the delivered concessions api in the admin manual |
| 21 Oct 21:58 | main | [`95f4770`](https://github.com/code-corhuila/csp-docs/commit/95f4770f218fd79462f57a660683923b055f507d) | docs(concessions): merge PR #205 - mark hu-concessions-002 in progress and record its delivery trail |
| 21 Oct 21:59 | main | [`2757fab`](https://github.com/code-corhuila/csp-docs/commit/2757fab9bf580a058c718806dcc07001054e54a1) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-002-project-control |
| 21 Oct 22:03 | main | [`4013854`](https://github.com/code-corhuila/csp-docs/commit/401385442268667a451093005f313099af99d82d) | docs(project-control): merge PR #209 - record the concessions service code and the published combo debt |
| 21 Oct 22:05 | main | [`befad95`](https://github.com/code-corhuila/csp-docs/commit/befad95d632d17b45453e5475bc87272e48d7c20) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-002-testing-strategy |
| 21 Oct 22:05 | main | [`499917d`](https://github.com/code-corhuila/csp-docs/commit/499917dd7433fdbb24b3fd42af5bb845d3392dcd) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-002-admin-manual |
| 21 Oct 22:07 | main | [`0e1c97d`](https://github.com/code-corhuila/csp-docs/commit/0e1c97dfb17542ae3e5dbd1a1a6de6d4aff06396) | docs(quality): merge PR #210 - record the concessions test stack and its measured suite |
| 21 Oct 22:07 | main | [`d6dd845`](https://github.com/code-corhuila/csp-docs/commit/d6dd8456992d92f1b12bb3aba4603840733b8229) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-002-admin-manual |
| 21 Oct 22:08 | main | [`ba7e96c`](https://github.com/code-corhuila/csp-docs/commit/ba7e96c4875758125b814598d30b643df14d6c05) | docs(training): merge PR #211 - note the delivered concessions api in the admin manual |
| 21 Oct 22:46 | main | [`c655f6f`](https://github.com/code-corhuila/csp-docs/commit/c655f6f4b14f55c7ac5eeb19a2c0b06f6b26eed2) | docs(concessions): mark hu-concessions-002 done in qa and record its promotion trail |
| 21 Oct 22:46 | main | [`e7450b3`](https://github.com/code-corhuila/csp-docs/commit/e7450b39931800989178b7c2346ef362f2704416) | docs(training): state that the concessions api is in qa in the admin manual |
| 21 Oct 22:53 | main | [`841baec`](https://github.com/code-corhuila/csp-docs/commit/841baec2069d16587832dcb9d46d2ddea411a97a) | docs(concessions): merge PR #212 - mark hu-concessions-002 done in qa and record its promotion trail |
| 22 Oct 01:30 | main | [`9612a72`](https://github.com/code-corhuila/csp-docs/commit/9612a72765cb69ec8bc2e98ceef91e7cb8ceeb84) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-002-manual-qa |
| 22 Oct 01:31 | main | [`807a299`](https://github.com/code-corhuila/csp-docs/commit/807a299b3ef96f5b36c59bc105195ae91e1aa4c7) | docs(training): merge PR #220 - state that the concessions api is in qa in the admin manual |
| 22 Oct 02:05 | main | [`7a7c9ad`](https://github.com/code-corhuila/csp-docs/commit/7a7c9ad5b1e24c1fcf1798074494c09411df5224) | docs(concessions): contract 2.3.0 and adr-043 for stock movements (hu-concessions-003) |
| 22 Oct 02:20 | main | [`dd70f77`](https://github.com/code-corhuila/csp-docs/commit/dd70f7793a16d7b84ccfa314913a056aab74dd41) | docs(concessions): merge PR #221 - contract 2.3.0 and adr-043 for stock movements |
| 22 Oct 04:22 | main | [`ec1d54b`](https://github.com/code-corhuila/csp-docs/commit/ec1d54bbfe98909f6033fd507ec1d6051dad42c0) | docs(concessions): hu-concessions-003 is in progress in develop |
| 22 Oct 04:26 | main | [`2b7ebc6`](https://github.com/code-corhuila/csp-docs/commit/2b7ebc609633bb3555e3027601820eb921edfc77) | docs(concessions): merge PR #222 - hu-concessions-003 is in progress in develop |
| 22 Oct 04:49 | main | [`a434968`](https://github.com/code-corhuila/csp-docs/commit/a434968f1b7ea7edce831bc96dd897635d20489b) | docs(concessions): hu-concessions-003 is done in qa |
| 22 Oct 04:55 | main | [`a1dd6ad`](https://github.com/code-corhuila/csp-docs/commit/a1dd6ad1f53e0dacb25babb4c6e841170e7e601d) | docs(concessions): merge PR #223 - hu-concessions-003 is done in qa |
| 22 Oct 04:58 | main | [`5b3b955`](https://github.com/code-corhuila/csp-docs/commit/5b3b9555c73c289c15243318549f4b99f8c40117) | docs(project-control): record td-036 for the opening stock without movement |
| 22 Oct 05:05 | main | [`fb615c1`](https://github.com/code-corhuila/csp-docs/commit/fb615c15cd5afa06b93e01c2612c88d1b0bec1a8) | docs(project-control): merge PR #224 - record td-036 for the opening stock without movement |
| 22 Oct 05:33 | main | [`3c82ec3`](https://github.com/code-corhuila/csp-docs/commit/3c82ec37d39a37c095a819b0a0b9ddd6389c09c7) | docs(concessions): contract 2.4.0 and adr-044 for orders and stock holds (hu-concessions-004) |
| 22 Oct 13:58 | main | [`8628a04`](https://github.com/code-corhuila/csp-docs/commit/8628a04bff6b11d176ed75fe3a20d1308277ff86) | docs(concessions): merge origin/main and renumber the order record as adr-045 |
| 22 Oct 14:15 | main | [`ecd108a`](https://github.com/code-corhuila/csp-docs/commit/ecd108aa9df86ef26ff44f56ca966f500177b61e) | docs(concessions): merge PR #226 - contract 2.4.0 and adr-045 for orders and stock holds |
| 22 Oct 15:30 | main | [`988d51e`](https://github.com/code-corhuila/csp-docs/commit/988d51e5325ff54a30d19e8f28af75f1aba2af4c) | docs(concessions): hu-concessions-004 is in progress in develop |
| 22 Oct 15:31 | main | [`16ccf34`](https://github.com/code-corhuila/csp-docs/commit/16ccf3476572820eaa3b7450e9e5e1dfeabbbc97) | docs(project-control): record the consumer and relay still missing after hu-concessions-004 |
| 22 Oct 15:32 | main | [`0dd722d`](https://github.com/code-corhuila/csp-docs/commit/0dd722d435bc866432e712166ea072ce29b75f7e) | docs(quality): record the concessions tests and the race checks after hu-concessions-004 |
| 22 Oct 15:32 | main | [`860b232`](https://github.com/code-corhuila/csp-docs/commit/860b23281b069a3eff112a7bce64bafb8f2b9b7b) | docs(operations): record the concessions signals and the schema to recover after hu-concessions-004 |
| 22 Oct 15:32 | main | [`9511bd9`](https://github.com/code-corhuila/csp-docs/commit/9511bd9b1d021ce3da149236c211a53db762dfab) | docs(training): note the order routes and the order configuration after hu-concessions-004 |
| 22 Oct 15:32 | main | [`f641fd6`](https://github.com/code-corhuila/csp-docs/commit/f641fd6fc2c8f4378438dda86996e5c6fb165867) | docs(project-control): date the update of q-001 |
| 22 Oct 16:05 | main | [`69001e9`](https://github.com/code-corhuila/csp-docs/commit/69001e99d4a4087f1c4663f57d6b4286a5f4b65b) | docs(concessions): merge PR #227 - hu-concessions-004 is in progress in develop |
| 22 Oct 16:06 | main | [`f2f43ae`](https://github.com/code-corhuila/csp-docs/commit/f2f43ae1c117d8a73ef09454f7bb32416cdbdebc) | Merge remote-tracking branch 'origin/main' into docs/project-control-hu-concessions-004 |
| 22 Oct 16:09 | main | [`cb4b1ff`](https://github.com/code-corhuila/csp-docs/commit/cb4b1ff2dc2b75b880199260a3b8d00d1686cab4) | docs(project-control): merge PR #228 - record the consumer and relay still missing after hu-concessions-004 |
| 22 Oct 16:09 | main | [`caa9153`](https://github.com/code-corhuila/csp-docs/commit/caa9153bc9ac67382863a69fc209b6949b63e030) | Merge remote-tracking branch 'origin/main' into docs/quality-hu-concessions-004 |
| 22 Oct 16:09 | main | [`eac145c`](https://github.com/code-corhuila/csp-docs/commit/eac145c2420e39cac7b755258c5174cc2f27835a) | docs(quality): date the update of the concessions rows |
| 22 Oct 16:12 | main | [`8fbd47c`](https://github.com/code-corhuila/csp-docs/commit/8fbd47c48efe2d0d3dc49543d1d3d8d6bd247ada) | docs(quality): merge PR #229 - record the concessions tests and the race checks after hu-concessions-004 |
| 22 Oct 16:12 | main | [`cc190e6`](https://github.com/code-corhuila/csp-docs/commit/cc190e6f6bc1601d12e4beef2043eb76ebacd2bb) | Merge remote-tracking branch 'origin/main' into docs/operations-hu-concessions-004 |
| 22 Oct 16:13 | main | [`4056f5c`](https://github.com/code-corhuila/csp-docs/commit/4056f5c5ff0d0b42532cfcaa63f1048ea3969e94) | docs(operations): state the restore effect on the relay precisely |
| 22 Oct 16:14 | main | [`b91f5fb`](https://github.com/code-corhuila/csp-docs/commit/b91f5fb2b9dd2f50b610d4354322fe661000cb0a) | docs(operations): merge PR #230 - record the concessions signals and the schema to recover after hu-concessions-004 |
| 22 Oct 16:14 | main | [`bd65088`](https://github.com/code-corhuila/csp-docs/commit/bd65088577a6917b70241f870128e3d76190baed) | Merge remote-tracking branch 'origin/main' into docs/training-hu-concessions-004 |
| 22 Oct 16:15 | main | [`aaa5d24`](https://github.com/code-corhuila/csp-docs/commit/aaa5d246f73e5cbe05739c792a4a3f6a5e5ee7be) | docs(training): word the order routes without claiming which screen uses them |
| 22 Oct 16:17 | main | [`66a5fbf`](https://github.com/code-corhuila/csp-docs/commit/66a5fbf53702746cc80758689764029f4317a017) | docs(training): merge PR #231 - note the order routes and the order configuration after hu-concessions-004 |
| 23 Oct 03:17 | main | [`0d5428f`](https://github.com/code-corhuila/csp-docs/commit/0d5428f5db3e3b141daaef74ce62ff44962e3048) | docs(project-control): record the worker side of the concessions order events as built and not running |
| 23 Oct 03:18 | main | [`877cd52`](https://github.com/code-corhuila/csp-docs/commit/877cd52dc27884765c89466c48b98e38acde5892) | docs(concessions): add the worker side to the delivery trail of hu-concessions-004 |
| 23 Oct 03:21 | main | [`a4e0709`](https://github.com/code-corhuila/csp-docs/commit/a4e07094a8a50d74dd8dcbb40db5c04102eafee1) | docs(project-control): merge PR #235 - record the worker side of the concessions order events as built and not running |
| 23 Oct 03:22 | main | [`6b51ae1`](https://github.com/code-corhuila/csp-docs/commit/6b51ae150c50e70e9e6f69fefc80fe938712fe21) | Merge remote-tracking branch 'origin/main' into docs/hu-concessions-004-worker-status |
| 23 Oct 03:23 | main | [`1d9f938`](https://github.com/code-corhuila/csp-docs/commit/1d9f9380baa2a6bbfd21d59674b38b4bf512fd7c) | docs(operations): replace the missing concessions consumer by the signals of its worker jobs |
| 23 Oct 03:23 | main | [`33f0170`](https://github.com/code-corhuila/csp-docs/commit/33f01702592535b59272066d97ed722bc0311ef5) | docs(training): say that the concessions worker jobs exist behind flags |
| 23 Oct 03:25 | main | [`d268afe`](https://github.com/code-corhuila/csp-docs/commit/d268afeeea8809d57c44ccf59f20ba4cb96aba28) | docs(project-control): record the missing purge of the concessions outbox as td-039 |
| 23 Oct 03:27 | main | [`9287f1e`](https://github.com/code-corhuila/csp-docs/commit/9287f1efba537b3abe0f97ce5f4e1adac7fc052a) | docs(concessions): merge PR #236 - add the worker side to the delivery trail of hu-concessions-004 |
| 23 Oct 03:27 | main | [`82a7494`](https://github.com/code-corhuila/csp-docs/commit/82a7494e429326e337e774f88e4b144e3020cd7d) | Merge remote-tracking branch 'origin/main' into docs/operations-hu-concessions-004-worker |
| 23 Oct 03:27 | main | [`a8a6c09`](https://github.com/code-corhuila/csp-docs/commit/a8a6c09397b17f40423ef1ef6eec8747c6a57e14) | docs(operations): merge PR #237 - replace the missing concessions consumer by the signals of its worker jobs |
| 23 Oct 03:28 | main | [`a6c3086`](https://github.com/code-corhuila/csp-docs/commit/a6c30860ec74df6b7bb98678df14231514a9d883) | Merge remote-tracking branch 'origin/main' into docs/training-hu-concessions-004-worker |
| 23 Oct 03:33 | main | [`a194f39`](https://github.com/code-corhuila/csp-docs/commit/a194f39ed2e3e8935d4a0b74de384a6cad885879) | docs(training): merge PR #238 - say that the concessions worker jobs exist behind flags |
| 23 Oct 03:33 | main | [`ff3c350`](https://github.com/code-corhuila/csp-docs/commit/ff3c35016e12de8ff641b11f6aef9c9220cd588b) | Merge remote-tracking branch 'origin/main' into docs/project-control-hu-concessions-004-purge |
| 23 Oct 03:49 | main | [`359a297`](https://github.com/code-corhuila/csp-docs/commit/359a29702233611555ee0d075061d476ba9c3d71) | Merge remote-tracking branch 'origin/main' into docs/project-control-hu-concessions-004-purge |
| 23 Oct 03:50 | main | [`c5315a7`](https://github.com/code-corhuila/csp-docs/commit/c5315a7d91426acf2ec1974067b3c1e7bb30624f) | docs(project-control): merge PR #239 - record the missing purge of the concessions outbox as td-039 |
| 23 Oct 04:10 | main | [`15f771c`](https://github.com/code-corhuila/csp-docs/commit/15f771c35b04dfd2464381a1d9b0ae3459d6b7f8) | docs(booking): add the seat map route for clients |
| 23 Oct 04:14 | main | [`e1a291c`](https://github.com/code-corhuila/csp-docs/commit/e1a291c8acc568847af5b67d4262dc7ff03da13e) | docs(booking): merge main into the seat map branch |
| 23 Oct 04:20 | main | [`780f742`](https://github.com/code-corhuila/csp-docs/commit/780f742ca8d19d08892cc250509ccc3a80eabd38) | docs(booking): attribute the seat map route to hu-catalog-005 |
| 23 Oct 04:50 | main | [`ca966b3`](https://github.com/code-corhuila/csp-docs/commit/ca966b38ae7ab29354f38b299a9d1c85cb929edc) | docs(booking): correct the impact of the seat map decision on the api and the gateway |
| 23 Oct 05:10 | main | [`f7702aa`](https://github.com/code-corhuila/csp-docs/commit/f7702aaaa8d541f3db5f3d9683aaf80150f02efa) | docs(booking): merge PR #242 - add the seat map route for clients |
| 23 Oct 05:17 | main | [`c9119b4`](https://github.com/code-corhuila/csp-docs/commit/c9119b402138ca7bf3183f7a0e7b9f8bec7bfbb8) | docs(project-control): record the seat map dependency on catalog and two new debts |
| 23 Oct 05:18 | main | [`657a44e`](https://github.com/code-corhuila/csp-docs/commit/657a44e1a68517f0d8e2eeae3a3259d0aea69382) | docs(training): describe the real seat map and the catalog variables of booking |
| 23 Oct 05:20 | main | [`f99e3c4`](https://github.com/code-corhuila/csp-docs/commit/f99e3c4f9e3804742df9aa15c64a052ed6b88762) | docs(project-control): merge PR #243 - record the seat map dependency on catalog and two new debts |
| 23 Oct 05:20 | main | [`6d1e4bb`](https://github.com/code-corhuila/csp-docs/commit/6d1e4bbc7404c849b84956c0c22e593b58426388) | docs(training): merge main into the seat map branch |
| 23 Oct 05:20 | main | [`eccf985`](https://github.com/code-corhuila/csp-docs/commit/eccf98513c45bb7fa4ebd16890c986c8bcbdc20b) | docs(training): merge PR #244 - describe the real seat map and the catalog variables of booking |
| 23 Oct 05:23 | main | [`49abdb2`](https://github.com/code-corhuila/csp-docs/commit/49abdb2300d2b83d06cee5bea94f99baeedc4055) | docs(quality): record the tests of the booking seat map and the gaps left |
| 23 Oct 05:31 | main | [`0816eff`](https://github.com/code-corhuila/csp-docs/commit/0816effe65bc406e90913402258807a41082f9d9) | docs(quality): merge PR #245 - record the tests of the booking seat map and the gaps left |
| 23 Oct 13:04 | main | [`17185bf`](https://github.com/code-corhuila/csp-docs/commit/17185bf033cda7c4a30663ce0d25163ae6e3cc4c) | docs(project-control): mark the booking route of the gateway as done |
| 23 Oct 13:10 | main | [`67d20a6`](https://github.com/code-corhuila/csp-docs/commit/67d20a65648b67b13e23408b07c6ffde84c79596) | docs(project-control): merge PR #246 - mark the booking route of the gateway as done |
| 23 Oct 14:04 | main | [`5f7f63e`](https://github.com/code-corhuila/csp-docs/commit/5f7f63e6b23483f9dd27234776ca77f911557b30) | docs(catalog): add the booking side of the seat map to the trail of hu-catalog-005 |
| 23 Oct 14:10 | main | [`53ce68a`](https://github.com/code-corhuila/csp-docs/commit/53ce68a1ddb44a69fea461b1c0b8b681e4927b38) | docs(catalog): merge PR #247 - add the booking side of the seat map to the trail of hu-catalog-005 |
| 25 Oct 00:29 | main | [`132f8fd`](https://github.com/code-corhuila/csp-docs/commit/132f8fd909e1e60fab7560e906af9752f6d50bda) | docs(stories): record the delivery of HU-CONCESSIONS-007 in develop |
| 25 Oct 00:46 | main | [`fdaffae`](https://github.com/code-corhuila/csp-docs/commit/fdaffae72d439b294e37335d08557f07a38da966) | docs(stories): merge PR #272 - record the delivery of HU-CONCESSIONS-007 |

[Back to summary](#summary)

---

<a id="csp-concessions-api"></a>
## `csp-concessions-api` (77 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 19 Oct 22:39 | develop | [`971266d`](https://github.com/code-corhuila/csp-concessions-api/commit/971266d4f373fa0e25e49aa38008bd8ad0ccabe9) | chore(scaffold): add the base structure of the concessions service |
| 19 Oct 22:39 | qa | [`40637b0`](https://github.com/code-corhuila/csp-concessions-api/commit/40637b044e38ebd8cea2857f0f06116e01e33c86) | chore(scaffold): add the base structure of the concessions service |
| 20 Oct 01:50 | develop | [`f330f4f`](https://github.com/code-corhuila/csp-concessions-api/commit/f330f4f3135e52110d021ec4c6fa74f8c6c1a1c6) | feat(auth): validate the RS256 token, add the error envelope and the correlation id |
| 20 Oct 01:50 | qa | [`25382e1`](https://github.com/code-corhuila/csp-concessions-api/commit/25382e108b37e25865d3ec711206655b4bb5d3da) | feat(auth): validate the RS256 token, add the error envelope and the correlation id |
| 20 Oct 02:00 | develop | [`19a16f9`](https://github.com/code-corhuila/csp-concessions-api/commit/19a16f9aa6fa17a1ac2dbe508e797a41a076f66d) | feat(product): add the product domain and its use cases (HU-CONCESSIONS-001) |
| 20 Oct 02:00 | qa | [`5959f62`](https://github.com/code-corhuila/csp-concessions-api/commit/5959f62de5998dc8a87c92fc223e65857e4c5ab8) | feat(product): add the product domain and its use cases (HU-CONCESSIONS-001) |
| 20 Oct 02:11 | develop | [`302d4a9`](https://github.com/code-corhuila/csp-concessions-api/commit/302d4a9db9b4bfe4eafa814a9600c47553cd4ff2) | feat(product): persist products with an idempotent create and a readiness check (HU-CONCESSIONS-001) |
| 20 Oct 02:11 | qa | [`1c365bb`](https://github.com/code-corhuila/csp-concessions-api/commit/1c365bbe1a934545f937bf8b319a16969dcf6174) | feat(product): persist products with an idempotent create and a readiness check (HU-CONCESSIONS-001) |
| 20 Oct 02:21 | develop | [`ff85510`](https://github.com/code-corhuila/csp-concessions-api/commit/ff85510e0a3af61e928b3920bf5295a875417103) | feat(product): expose the product routes with the permission of the administrator (HU-CONCESSIONS-001) |
| 20 Oct 02:21 | qa | [`a1583bc`](https://github.com/code-corhuila/csp-concessions-api/commit/a1583bcec407216194acdbc4c1f5a53a02d1e5c8) | feat(product): expose the product routes with the permission of the administrator (HU-CONCESSIONS-001) |
| 20 Oct 02:28 | develop | [`fbfcc7b`](https://github.com/code-corhuila/csp-concessions-api/commit/fbfcc7b8393ff91618f5c103150865f98ad1bd30) | chore(deploy): add the image, the compose service and the CI that applies the schema (HU-CONCESSIONS-001) |
| 20 Oct 02:28 | qa | [`39b3c06`](https://github.com/code-corhuila/csp-concessions-api/commit/39b3c0636af3cc61d1098ffa831c2d077d0d4337) | chore(deploy): add the image, the compose service and the CI that applies the schema (HU-CONCESSIONS-001) |
| 20 Oct 14:19 | develop | [`ae0c8a6`](https://github.com/code-corhuila/csp-concessions-api/commit/ae0c8a61ff16aad262fe14e16922c8dd30d00669) | chore(scaffold): merge PR #8 - base structure of the concessions service |
| 20 Oct 14:21 | develop | [`63358f3`](https://github.com/code-corhuila/csp-concessions-api/commit/63358f319379878fec22c6e2f05f20cd31caf187) | Merge remote-tracking branch 'origin/develop' into feat/concessions-api-jwt-auth |
| 20 Oct 15:09 | develop | [`7574a1e`](https://github.com/code-corhuila/csp-concessions-api/commit/7574a1e7d3d5fef809153e5816fb1ced4ea80e7b) | feat(auth): merge PR #9 - RS256 token validation, error envelope and correlation id |
| 20 Oct 15:09 | develop | [`21bcff1`](https://github.com/code-corhuila/csp-concessions-api/commit/21bcff19c45f760de2d9c93d3df5924485048e12) | Merge remote-tracking branch 'origin/develop' into feat/concessions-product-domain |
| 20 Oct 15:11 | develop | [`6fd5c24`](https://github.com/code-corhuila/csp-concessions-api/commit/6fd5c2466aa3a6a11e838915fa1f15964c27a18c) | Merge remote-tracking branch 'origin/develop' into feat/concessions-product-domain |
| 20 Oct 15:14 | develop | [`a5ffa47`](https://github.com/code-corhuila/csp-concessions-api/commit/a5ffa475f78429a9a05351cd25af7828b7a953ed) | feat(product): merge PR #10 - product domain and its use cases |
| 20 Oct 15:15 | develop | [`d38ed85`](https://github.com/code-corhuila/csp-concessions-api/commit/d38ed85487b0fbcadc4ed581c99d345f1aeaf59d) | Merge remote-tracking branch 'origin/develop' into feat/concessions-product-persistence |
| 20 Oct 15:20 | develop | [`386e56d`](https://github.com/code-corhuila/csp-concessions-api/commit/386e56d391732d268208aabdf5420227fbafe770) | feat(product): merge PR #11 - product persistence with idempotent create and readiness |
| 20 Oct 15:20 | develop | [`5d207bd`](https://github.com/code-corhuila/csp-concessions-api/commit/5d207bd81a5326f8f91a00c18194d9a4fe5fb28e) | Merge remote-tracking branch 'origin/develop' into feat/concessions-product-api |
| 20 Oct 15:26 | develop | [`56d59ed`](https://github.com/code-corhuila/csp-concessions-api/commit/56d59edf1139c613ea7cb4f9baaeb991c23c8347) | feat(product): merge PR #12 - product routes with the administrator permission |
| 20 Oct 15:26 | develop | [`a52cc0e`](https://github.com/code-corhuila/csp-concessions-api/commit/a52cc0eee175ded735460e07ffa912fe857d3d83) | Merge remote-tracking branch 'origin/develop' into feat/concessions-api-deploy |
| 20 Oct 15:29 | develop | [`4a58c62`](https://github.com/code-corhuila/csp-concessions-api/commit/4a58c6290a70984d3db4be62bbfbee2a90b96bc8) | chore(ci): pin the schema to the merged commit of csp-concessions-db (HU-CONCESSIONS-001) |
| 20 Oct 15:29 | qa | [`5b29e65`](https://github.com/code-corhuila/csp-concessions-api/commit/5b29e658c49a4cc0a34592f1ebf12cf7551aa39b) | chore(ci): pin the schema to the merged commit of csp-concessions-db (HU-CONCESSIONS-001) |
| 20 Oct 15:32 | develop | [`d83f7a6`](https://github.com/code-corhuila/csp-concessions-api/commit/d83f7a6b1e252eb93e278d0ec4af38fb95666413) | chore(deploy): merge PR #13 - image, compose service and CI that applies the schema |
| 20 Oct 22:56 | develop | [`5a35cf2`](https://github.com/code-corhuila/csp-concessions-api/commit/5a35cf210a69b63dbeda50247a29cb36fba3c9e6) | fix(app): answer the validation messages in english whatever the client or the machine |
| 20 Oct 22:56 | qa | [`784e51b`](https://github.com/code-corhuila/csp-concessions-api/commit/784e51be7a85fb10d36e01431d57301b468f877a) | fix(app): answer the validation messages in english whatever the client or the machine |
| 20 Oct 22:57 | develop | [`733a6cc`](https://github.com/code-corhuila/csp-concessions-api/commit/733a6cca99158219e087c5be027df26b8bfaeaec) | fix(app): merge PR #14 - validation messages in english |
| 21 Oct 03:42 | qa | [`3788ebd`](https://github.com/code-corhuila/csp-concessions-api/commit/3788ebd414baf270cf1958a786cd7693e8de6e0a) | chore(scaffold): merge PR #15 - promote the base structure of the concessions service to qa |
| 21 Oct 03:46 | qa | [`534b875`](https://github.com/code-corhuila/csp-concessions-api/commit/534b875c9f10c3d3cc69563d0f5c9c964db94c72) | feat(auth): merge PR #16 - promote the RS256 token validation, the error envelope and the correlation id to qa |
| 21 Oct 03:49 | qa | [`4e1c5c2`](https://github.com/code-corhuila/csp-concessions-api/commit/4e1c5c2a5f90cc62665c9c915b32ac86d79016a1) | feat(product): merge PR #17 - promote the product domain and its use cases to qa |
| 21 Oct 03:53 | qa | [`8d83d26`](https://github.com/code-corhuila/csp-concessions-api/commit/8d83d266b0d9f84039c7c337d44c3822acf92cce) | feat(product): merge PR #18 - promote the idempotent product persistence and the readiness check to qa |
| 21 Oct 03:57 | qa | [`2014059`](https://github.com/code-corhuila/csp-concessions-api/commit/2014059b2627602f08696fc15e678b39cb918ebc) | feat(product): merge PR #19 - promote the product routes with the permission of the administrator to qa |
| 21 Oct 04:02 | qa | [`92daeff`](https://github.com/code-corhuila/csp-concessions-api/commit/92daeff666a9478b3765bb3d6952d24223c94b7f) | chore(deploy): merge PR #20 - promote the image, the compose service, the CI with the schema and the english messages to qa |
| 21 Oct 06:00 | develop | [`d82b536`](https://github.com/code-corhuila/csp-concessions-api/commit/d82b536405eabb1fdf999291842d243ebad4a149) | feat(core): add the combo aggregate, ports and use cases for hu-concessions-002 |
| 21 Oct 06:00 | qa | [`87a2e6d`](https://github.com/code-corhuila/csp-concessions-api/commit/87a2e6dc46c9bbed77a84410371ad41f7baf2bd7) | feat(core): add the combo aggregate, ports and use cases for hu-concessions-002 |
| 21 Oct 20:46 | develop | [`72111f2`](https://github.com/code-corhuila/csp-concessions-api/commit/72111f22cda16db427394a592ff167181532e48d) | feat(core): merge PR #21 - add the combo aggregate, ports and use cases for hu-concessions-002 |
| 21 Oct 20:52 | develop | [`a69dace`](https://github.com/code-corhuila/csp-concessions-api/commit/a69dace4963d7303ce7ca196bb6b838c0228a59a) | feat(persistence): store combos, their components and idempotency keys for hu-concessions-002 |
| 21 Oct 20:52 | qa | [`94fc5c7`](https://github.com/code-corhuila/csp-concessions-api/commit/94fc5c78e4e380453ac88c55d1526153427d2dde) | feat(persistence): store combos, their components and idempotency keys for hu-concessions-002 |
| 21 Oct 20:56 | develop | [`38b2896`](https://github.com/code-corhuila/csp-concessions-api/commit/38b2896299fb8eae80d67ea1593812dd91b10a08) | feat(http): add the combo routes and their error answers for hu-concessions-002 |
| 21 Oct 20:56 | qa | [`9c80f57`](https://github.com/code-corhuila/csp-concessions-api/commit/9c80f57feda89adba65d11d90cb928007cb8362a) | feat(http): add the combo routes and their error answers for hu-concessions-002 |
| 21 Oct 21:43 | develop | [`2d7f073`](https://github.com/code-corhuila/csp-concessions-api/commit/2d7f07389e0578952e643029ae5927860e5dbd9d) | feat(persistence): merge PR #22 - store combos, their components and idempotency keys for hu-concessions-002 |
| 21 Oct 21:43 | develop | [`8812e3e`](https://github.com/code-corhuila/csp-concessions-api/commit/8812e3e3081997dc4ef07aff3866a21bb7b3b65f) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-002-combo-http |
| 21 Oct 21:48 | develop | [`da30448`](https://github.com/code-corhuila/csp-concessions-api/commit/da30448e742d80aacd110a11073c014dc67e4558) | feat(http): merge PR #23 - add the combo routes and their error answers for hu-concessions-002 |
| 21 Oct 22:25 | qa | [`dac6200`](https://github.com/code-corhuila/csp-concessions-api/commit/dac62007ee4726b65c6a281a6001b475d2322e8d) | feat(core): merge PR #24 - promote the combo aggregate, ports and use cases of hu-concessions-002 to qa |
| 21 Oct 22:33 | qa | [`09dae48`](https://github.com/code-corhuila/csp-concessions-api/commit/09dae488aae0f96467b62ee67c58376e38627383) | feat(persistence): merge PR #25 - promote the combo persistence of hu-concessions-002 to qa |
| 21 Oct 22:41 | qa | [`9b3b2db`](https://github.com/code-corhuila/csp-concessions-api/commit/9b3b2dbe4c3a1eeef3d6eeb2be2349b9d7aabb03) | feat(http): merge PR #26 - promote the combo routes of hu-concessions-002 to qa |
| 22 Oct 02:29 | develop | [`e9a76be`](https://github.com/code-corhuila/csp-concessions-api/commit/e9a76befedab6d9e9c3ba8990a4def5d89f87404) | feat(core): add the stock movement, the stock adjustment rules and their use case for hu-concessions-003 |
| 22 Oct 02:29 | qa | [`83c7087`](https://github.com/code-corhuila/csp-concessions-api/commit/83c70875afcf32416eeefcf1b2c3064f214360c8) | feat(core): add the stock movement, the stock adjustment rules and their use case for hu-concessions-003 |
| 22 Oct 02:44 | develop | [`0aa05a7`](https://github.com/code-corhuila/csp-concessions-api/commit/0aa05a7c0df94ada94bb1e9be2dcce4e1a8ea014) | feat(http): add post /stock/adjust and its guarded stock update for hu-concessions-003 |
| 22 Oct 02:44 | qa | [`d01ca02`](https://github.com/code-corhuila/csp-concessions-api/commit/d01ca021f2483d5b8db5cc30b9b11b562048bb8f) | feat(http): add post /stock/adjust and its guarded stock update for hu-concessions-003 |
| 22 Oct 02:45 | develop | [`2615932`](https://github.com/code-corhuila/csp-concessions-api/commit/26159322ffa52d7bf288f0765aa4c19b9c9fec71) | feat(core): merge PR #28 - add the stock movement, the stock adjustment rules and their use case for hu-concessions-003 |
| 22 Oct 02:46 | develop | [`3ace99a`](https://github.com/code-corhuila/csp-concessions-api/commit/3ace99ad42d1741111b6db0dc0d0f0db496bf9f6) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-003-stock-http |
| 22 Oct 04:21 | develop | [`873385e`](https://github.com/code-corhuila/csp-concessions-api/commit/873385e771a5d313db1c3384c2794e3b04fef002) | feat(http): merge PR #29 - add post /stock/adjust and its guarded stock update for hu-concessions-003 |
| 22 Oct 04:43 | qa | [`70a8d97`](https://github.com/code-corhuila/csp-concessions-api/commit/70a8d97ba4d911154650d952e4bd44d948fce862) | feat(core): merge PR #30 - promote the stock movement the stock rules and their use case of hu concessions 003 to qa |
| 22 Oct 04:48 | qa | [`fd836ad`](https://github.com/code-corhuila/csp-concessions-api/commit/fd836adf4e94d45b42496176d4676dd187607c4a) | feat(http): merge PR #31 - promote post /stock/adjust and its guarded stock update of hu-concessions-003 to qa |
| 22 Oct 14:22 | develop | [`3179d41`](https://github.com/code-corhuila/csp-concessions-api/commit/3179d41b930574d0f05e2f5c9d53364f98622598) | feat(core): add the concession order, its snapshot lines and the stock hold for hu-concessions-004 |
| 22 Oct 14:29 | develop | [`202e358`](https://github.com/code-corhuila/csp-concessions-api/commit/202e3581f7909aed68f16e112f4b6f6156971680) | feat(core): add the order use cases, their ports and the order events for hu-concessions-004 |
| 22 Oct 14:29 | develop | [`0d29394`](https://github.com/code-corhuila/csp-concessions-api/commit/0d29394cae087b0f8e239eadcc313e710ed264bf) | chore(changelog): record the order domain of hu-concessions-004 |
| 22 Oct 14:29 | develop | [`30e9e2c`](https://github.com/code-corhuila/csp-concessions-api/commit/30e9e2c9c07ffad3d1de0d61fc1b5de2fe5521ce) | Merge branch 'feat/hu-concessions-004-order-core' into feat/hu-concessions-004-order-service |
| 22 Oct 14:29 | develop | [`1485d2c`](https://github.com/code-corhuila/csp-concessions-api/commit/1485d2ca8a86d4189608bc0683f85a193eddc50a) | chore(changelog): record the order use cases of hu-concessions-004 |
| 22 Oct 14:41 | develop | [`13e114f`](https://github.com/code-corhuila/csp-concessions-api/commit/13e114ff61f25494d8c276be61c3e0cd88da5066) | feat(persistence): add the jdbc order repository with the guarded stock reservation for hu-concessions-004 |
| 22 Oct 14:49 | develop | [`a379411`](https://github.com/code-corhuila/csp-concessions-api/commit/a37941147a8f5501a82ae060fba8e2e0e42f8510) | feat(core): merge PR #32 - add the concession order, its snapshot lines and the stock hold for hu-concessions-004 |
| 22 Oct 14:50 | develop | [`c0da955`](https://github.com/code-corhuila/csp-concessions-api/commit/c0da955203ac69f5d2b91b50bfe8b3edecfb0bab) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-004-order-service |
| 22 Oct 14:50 | develop | [`8e4d6b2`](https://github.com/code-corhuila/csp-concessions-api/commit/8e4d6b2c5f034bc3337b7454c124f3420dd33cf0) | chore(ci): pin the schema to the merge that adds the order tables |
| 22 Oct 14:56 | develop | [`6b4b6de`](https://github.com/code-corhuila/csp-concessions-api/commit/6b4b6ded6bb53b36fb1e557e1d4a7753288e937e) | feat(core): merge PR #33 - add the order use cases, their ports and the order events for hu-concessions-004 |
| 22 Oct 14:57 | develop | [`8514654`](https://github.com/code-corhuila/csp-concessions-api/commit/85146541a2ae15e9986f5f7c3dc869c56176bdb0) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-004-order-jdbc |
| 22 Oct 14:57 | develop | [`8d8a564`](https://github.com/code-corhuila/csp-concessions-api/commit/8d8a5640e05a358540b6b43476de413cf116476d) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-004-order-jdbc |
| 22 Oct 15:18 | develop | [`7b86292`](https://github.com/code-corhuila/csp-concessions-api/commit/7b862929548c2eee2596496cc5f41808b9cd1616) | feat(http): add the order routes, the internal order operations and their error answers for hu-concessions-004 |
| 22 Oct 15:20 | develop | [`5b0ddc7`](https://github.com/code-corhuila/csp-concessions-api/commit/5b0ddc798a00370663fcbb156d03e80a58d03db0) | feat(persistence): merge PR #34 - add the jdbc order repository with the guarded stock reservation for hu-concessions-004 |
| 22 Oct 15:20 | develop | [`6359603`](https://github.com/code-corhuila/csp-concessions-api/commit/6359603aa00e3fec586efa3be8c8ef3a14405e2d) | Merge remote-tracking branch 'origin/develop' into feat/hu-concessions-004-order-http |
| 22 Oct 15:29 | develop | [`825320c`](https://github.com/code-corhuila/csp-concessions-api/commit/825320c5fce7d2991e86ba95c923a82e94fc5543) | feat(http): merge PR #35 - add the order routes, the internal order operations and their error answers for hu-concessions-004 |
| 24 Oct 23:35 | develop | [`436485f`](https://github.com/code-corhuila/csp-concessions-api/commit/436485f35db7e2438f733a7e974e3196a4aed313) | fix(concessions): tolerate 30 seconds of clock skew on the token expiration |
| 24 Oct 23:39 | develop | [`ace4e3d`](https://github.com/code-corhuila/csp-concessions-api/commit/ace4e3dfd3cdf7b10709b0a349113038b7d5dc09) | fix(concessions): merge PR #37 - tolerate clock skew on the token expiration |
| 25 Oct 00:11 | develop | [`59cfa70`](https://github.com/code-corhuila/csp-concessions-api/commit/59cfa708d79ab2aae92cf68bcb48b3858ea370c3) | feat(concessions): list the stock movement history for HU-CONCESSIONS-007 |
| 25 Oct 00:26 | develop | [`27fd4db`](https://github.com/code-corhuila/csp-concessions-api/commit/27fd4dbfe23afe0640e800acb16930633be01769) | feat(concessions): merge PR #38 - list the stock movement history (HU-CONCESSIONS-007) |

[Back to summary](#summary)

---

<a id="csp-concessions-db"></a>
## `csp-concessions-db` (18 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 19 Oct 22:29 | develop | [`84d19ae`](https://github.com/code-corhuila/csp-concessions-db/commit/84d19aeb59a0e0784b23e87fa751b9606978a9e8) | feat(concessions-db): schema, roles and product table (HU-CONCESSIONS-001) |
| 19 Oct 22:29 | qa | [`b15049e`](https://github.com/code-corhuila/csp-concessions-db/commit/b15049e305eaf0e0edc32997a77c947cf19f3e23) | feat(concessions-db): schema, roles and product table (HU-CONCESSIONS-001) |
| 20 Oct 01:43 | develop | [`d5a84f2`](https://github.com/code-corhuila/csp-concessions-db/commit/d5a84f2cc737912b289ed776776630dd2170999a) | feat(concessions-db): merge PR #1 - schema, roles and product table |
| 20 Oct 02:04 | develop | [`e35e16e`](https://github.com/code-corhuila/csp-concessions-db/commit/e35e16e99dbfe56aa42ce881440c0da70e13c477) | feat(concessions-db): add the idempotency key of POST /products (HU-CONCESSIONS-001) |
| 20 Oct 02:04 | qa | [`ee4939b`](https://github.com/code-corhuila/csp-concessions-db/commit/ee4939b34428b22ef0c183f524191e4ea3eba0cb) | feat(concessions-db): add the idempotency key of POST /products (HU-CONCESSIONS-001) |
| 20 Oct 15:09 | develop | [`244df92`](https://github.com/code-corhuila/csp-concessions-db/commit/244df92c7a83cfec05c92b38a6954e917f7d4115) | feat(concessions-db): merge PR #2 - idempotency key of POST /products |
| 20 Oct 23:55 | qa | [`c4c4345`](https://github.com/code-corhuila/csp-concessions-db/commit/c4c43454d6d7129f7df4c4616fe624441afcc1a5) | feat(concessions-db): merge PR #3 - promote the schema, roles and product table to qa |
| 21 Oct 00:10 | qa | [`c5bd455`](https://github.com/code-corhuila/csp-concessions-db/commit/c5bd45571c10a960d890c092080becac449699b4) | feat(concessions-db): merge PR #4 - promote the idempotency key of POST /products to qa |
| 21 Oct 04:53 | develop | [`60f7053`](https://github.com/code-corhuila/csp-concessions-db/commit/60f70537325915b13c29b1727883905f548706e6) | feat(db): add the combo tables, their keys and foreign keys for hu-concessions-002 |
| 21 Oct 04:53 | qa | [`65f9c85`](https://github.com/code-corhuila/csp-concessions-db/commit/65f9c855a3b4dc523d2cf32e558e7d1240e24459) | feat(db): add the combo tables, their keys and foreign keys for hu-concessions-002 |
| 21 Oct 20:46 | develop | [`5bd7a7b`](https://github.com/code-corhuila/csp-concessions-db/commit/5bd7a7bc77f645affded4e7b4c1d60e7ab8e8e64) | feat(db): merge PR #5 - add the combo tables, their keys and foreign keys for hu-concessions-002 |
| 21 Oct 22:18 | qa | [`b97ca6c`](https://github.com/code-corhuila/csp-concessions-db/commit/b97ca6cbd2d669d4ae4a0311d9becaeebff8d2de) | feat(concessions-db): merge PR #6 - promote the combo tables of hu-concessions-002 to qa |
| 22 Oct 02:19 | develop | [`27428e3`](https://github.com/code-corhuila/csp-concessions-db/commit/27428e32288b7f6bada85eb387eda9af213cd161) | feat(db): add the stock movement table and its foreign key for hu-concessions-003 |
| 22 Oct 02:19 | qa | [`fba4271`](https://github.com/code-corhuila/csp-concessions-db/commit/fba42718d5592aac62bdcef3b19dc7dded971658) | feat(db): add the stock movement table and its foreign key for hu-concessions-003 |
| 22 Oct 02:30 | develop | [`78f0cd2`](https://github.com/code-corhuila/csp-concessions-db/commit/78f0cd2bbc78edaab10cd453f546f0a7ce1b5281) | feat(db): merge PR #8 - add the stock movement table and its foreign key for hu-concessions-003 |
| 22 Oct 04:43 | qa | [`239187c`](https://github.com/code-corhuila/csp-concessions-db/commit/239187c9c31381496694c1a34a20dbebda1427a9) | feat(concessions-db): merge PR #9 - promote the stock movement table of hu concessions 003 to qa |
| 22 Oct 14:13 | develop | [`c25d6ea`](https://github.com/code-corhuila/csp-concessions-db/commit/c25d6eae7b0420800b1208fe62488a7e3b357fa4) | feat(db): add the order, stock hold and outbox tables and their foreign keys for hu-concessions-004 |
| 22 Oct 14:48 | develop | [`a7ff65e`](https://github.com/code-corhuila/csp-concessions-db/commit/a7ff65e32c5bccc8b42fea220ad17bcee2feb21d) | feat(db): merge PR #10 - add the order, stock hold and outbox tables and their foreign keys for hu-concessions-004 |

[Back to summary](#summary)

---

<a id="csp-api-gateway"></a>
## `csp-api-gateway` (4 commits)

| Date (UTC) | Branch | Hash | Commit message |
|---|---|---|---|
| 23 Oct 05:37 | develop | [`07efbc9`](https://github.com/code-corhuila/csp-api-gateway/commit/07efbc95d024720e65936567a37aa61fba8dad7c) | feat(gateway): route the booking client operations to csp-booking-api |
| 23 Oct 05:37 | qa | [`e24b440`](https://github.com/code-corhuila/csp-api-gateway/commit/e24b4409f363f357588cd8345807718b91c785d8) | feat(gateway): route the booking client operations to csp-booking-api |
| 23 Oct 12:59 | develop | [`4f5f554`](https://github.com/code-corhuila/csp-api-gateway/commit/4f5f5546acb6e7caa6e260221803b77b417cc2a9) | feat(gateway): merge PR #12 - route the booking client operations to csp-booking-api |
| 23 Oct 13:38 | qa | [`7090bae`](https://github.com/code-corhuila/csp-api-gateway/commit/7090bae5242898f921b06fba51d5f6f3e19e6ccb) | feat(gateway): merge PR #13 - promote the booking routes to qa |

[Back to summary](#summary)

---
