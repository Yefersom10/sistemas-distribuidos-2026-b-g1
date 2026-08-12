<!-- HU-STATUS TEMPLATE - do NOT remove the <!-- ... --> markers or the table headers.
     Your weekly grade is read AUTOMATICALLY from this file:
       01-week/hu-status/README.md  (inside YOUR fork). English. -->

# Weekly Status - Week 01

<!-- CONFIG-START - must match your profile repo (username/username) CONFIG -->
- FULL_NAME: Yeferson Esmid Heredia Perdomo
- GITHUB_USER: Yeferson10
- TEAM: CineSync Platform
- SPRINT_GOAL: Define and structure the Booking & Seat Reservation Service, establishing the business rules for seat availability, temporary holds, and reservation confirmation, together with its architecture, persistence, and event-based integration.
<!-- CONFIG-END -->


## 1. User stories worked this week

| HU ID       | Title                                                               | Status (todo/doing/done) | Evidence (PR or commit URL) |
| ----------- | ------------------------------------------------------------------- | ------------------------ | --------------------------- |
| HU-BOOK-001 | Consult the availability and status of seats for a showtime         | doing                    | Pending implementation      |
| HU-BOOK-002 | Temporarily hold one or more seats during the reservation process   | doing                    | Pending implementation      |
| HU-BOOK-003 | Confirm a reservation after payment validation                      | todo                     | Pending implementation      |
| HU-BOOK-004 | Automatically release seats when the temporary hold expires         | doing                    | Pending implementation      |
| HU-BOOK-005 | Publish the `BookingConfirmed` event after confirming a reservation | todo                     | Pending implementation      |

## 2. My individual contribution

* Defined the scope of the **Booking & Seat Reservation Service**, responsible for managing seat availability, temporary holds, and reservation confirmation.
* Defined the main seat states: `AVAILABLE`, `HELD`, and `OCCUPIED`.
* Designed the seat state transition flow, including the automatic release of seats when a temporary hold expires.
* Established **Redis** as the technology for managing temporary seat holds through TTL, with an approximate duration of 5 to 10 minutes.
* Defined **PostgreSQL** as the persistence mechanism for confirmed reservations and permanent reservation data.
* Defined the main REST API endpoints:

  * `GET /api/v1/showtimes/{id}/seats`
  * `POST /api/v1/bookings/hold`
  * `POST /api/v1/bookings/confirm`
* Analyzed the concurrency problem that occurs when multiple users try to reserve the same seat simultaneously.
* Defined as a core requirement that a seat can only be held by one user at a time.
* Defined the integration with a message broker such as **RabbitMQ or Kafka** to publish the `BookingConfirmed` event.
* Established the integration flow with the **Notification & Ticket Service**, which will use the reservation confirmation event to generate the digital ticket.
* Defined an architecture based on **DDD, TDD, SDD, SOLID, Clean Code, and Hexagonal Architecture**, keeping business logic independent from Redis, PostgreSQL, and the message broker.
* Documented the main error cases for the service, including unavailable seats, expired reservations, nonexistent reservations, and authentication/authorization failures.
* Used the distributed systems concepts provided during Week 1 as a reference for defining service boundaries, communication between services, persistence, and asynchronous event-based integration.

## 3. Blockers and risks

* The final integration with the payment service still needs to be defined by the team, especially the mechanism through which the Booking Service will receive payment confirmation.
* The team still needs to decide whether **RabbitMQ or Kafka** will be used as the message broker.
* The final structure of the `Booking` and `BookingSeat` entities must be aligned with the final design of the Catalog & Showtimes Service.
* There is a concurrency risk if seat locking does not use atomic operations or appropriate transactional mechanisms.
* The final duration of the temporary hold must be agreed upon by the team, although an initial range of 5 to 10 minutes has been established.
* Concurrency testing will be important to verify that two users cannot obtain the same seat simultaneously.
* The final availability of showtimes depends on the **Catalog & Showtimes Service**, so both services must maintain clear integration contracts.

## 4. Plan for next week

* Define the user stories and acceptance criteria related to reservations and seats.
* Create the initial structure of the **Booking & Seat Reservation Service** following Hexagonal Architecture.
* Implement the domain related to `Booking`, `BookingSeat`, and seat states.
* Implement the use case for querying seat availability.
* Implement the temporary seat hold mechanism using Redis and TTL.
* Create the first unit tests using TDD for the main domain rules.
* Define reservation persistence using PostgreSQL.
* Define the contract for the `BookingConfirmed` event.
* Coordinate with the **Notification & Ticket Service** owner to define the contract required to consume the event.
* Document the API endpoints using Swagger/OpenAPI.
* Prepare the Docker configuration for the microservice and its dependencies.
* Perform concurrency tests on the seat-holding process.

## 5. Compliance self-check

* [ ] Conventional Commits - `type(scope): summary`
* [ ] Per-environment HU branch + PR to that environment (`hu-xxx-dev -> develop`, ...)
* [x] Testable acceptance criteria defined at the design level
* [ ] Tests added/updated (unit / integration)
* [x] DDD / hexagonal boundaries respected (domain has no I/O)
* [x] No secrets; configuration via environment variables

### Notes

* The user stories are currently in the definition and design stage, so several stories are marked as `doing` or `todo`.
* The proposed architecture separates the domain from infrastructure technologies such as PostgreSQL, Redis, and RabbitMQ/Kafka.
* Tests will be implemented together with the use cases in order to apply TDD during development.
* Acceptance criteria must be formalized before each user story can be considered complete.
* PR and commit links will be added once real repository evidence is available.

## 6. Evidence links

* **Booking & Seat Reservation Service PDR:** [`PDR-Booking-Seat-Reservation.md`](prd.md)
* **Week 1 distributed systems diagram:** 
![`week1_distributed_systems_diagram.jpg`](week1_distributed_systems_diagram.jpg)
