# Week 13 Workshop - Threat Modeling

<!-- CONFIG-START -->
- FULL_NAME: Yeferson Esmid Heredia Perdomo
- GITHUB_USER: Yefersom10
- TEAM: CineSync Platform
- DOCS_REPO: https://github.com/code-corhuila/csp-docs
- BOUNDARY: API Gateway to Booking service
- CLAIM_ISSUE: https://github.com/code-corhuila/csp-docs/issues/274
- REFLECTION_DOC: https://docs.google.com/document/d/1VyxeIYaNo1889Bcml4jbAaX-bXpNdDxidI0gvQN6M_c/edit?usp=sharing
- LIBRARY_BOOK: Maiorano, Ariel. Criptografia: tecnicas de desarrollo para profesionales. 2009 edition. Call number: 0009608
- LIBRARY_RECORD_TIME: 2026-10-28 19:05
- STORIES: https://github.com/code-corhuila/csp-docs/issues/283 https://github.com/code-corhuila/csp-docs/issues/284 https://github.com/code-corhuila/csp-docs/issues/285
<!-- CONFIG-END -->

## Related stories of teammates

- #285 (mine, threat E) is related to #287 and #288 of the boundary booking-service to catalog-service: they check service tokens and audit rejected calls on the other side of the same service credential.
- #283 (mine, threat D) and #281 (STRIDE D of the boundary Gateway to csp-auth-api) both ask for a stricter limit; mine caps seats and active holds per user, theirs limits login and registration.
- #284 (mine, threat S) was rescored to risk 4 and priority P2 after the review of Oscar and Karen (ADR-054).
