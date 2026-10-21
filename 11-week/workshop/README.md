# Week 11 workshop - Observability, SLOs and incident response

Individual delivery for the Booking and Seat Reservation Service of the Cinesync Platform (CSP).

<!-- CONFIG-START -->
- FULL_NAME: Yeferson Esmid Heredia Perdomo
- GITHUB_USER: Yefersom10
- TEAM: Group 1 - Cinesync Platform (CSP)
- DOCS_REPO: https://github.com/code-corhuila/csp-docs
- REFLECTION_DOC: https://docs.google.com/document/d/1j4nz5IdQeH5vIdKMc8WbaBI0puD9mEx5fvhnBpej2ME/edit?usp=sharing
- JOURNEY: Reserve seats - create hold (POST /holds), confirm (POST /reservations/{reservationId}/confirm) and publish BookingConfirmed
<!-- CONFIG-END -->

## My part of the project

I own the Booking and Seat Reservation Service (`csp-booking-api`, `csp-booking-db`,
`csp-booking-portal`). It creates temporary seat holds, confirms or expires them, and writes
the events `ReservationHeld`, `BookingConfirmed` and `ReservationExpired` to the outbox.

## Files

| Checkpoint | File |
|---|---|
| CP1 | [01-journey.md](./01-journey.md) |
| CP2 | [02-log-contract.md](./02-log-contract.md) |
