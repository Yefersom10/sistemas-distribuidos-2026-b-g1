<!-- HU-STATUS TEMPLATE - do NOT remove the <!-- ... --> markers or the table headers.
     Your weekly grade is read AUTOMATICALLY from this file:
       02-week/hu-status/README.md  (inside YOUR fork). English. -->

# Weekly Status - Week 02

<!-- CONFIG-START - must match your profile repo (username/username) CONFIG -->

* FULL_NAME: Yeferson Esmid Heredia Perdomo
* GITHUB_USER: Yefersom10
* TEAM: CineSync Platform
* SPRINT_GOAL: Understand and apply distributed architecture, architectural planning, Scrum, and Kanban concepts to define the technical structure and team workflow for the Cine API project.

<!-- CONFIG-END -->

## 1. User stories worked this week

| HU ID      | Title                                                                   | Status (todo/doing/done) | Evidence (PR or commit URL) |
| ---------- | ----------------------------------------------------------------------- | ------------------------ | --------------------------- |
| HU-002-001 | Summarize distributed architectures and architectural planning concepts | done                     | N/A                         |
| HU-002-002 | Analyze distributed architecture styles applicable to Cine API          | done                     | N/A                         |
| HU-002-003 | Summarize and apply Scrum and Kanban concepts to the team workflow      | done                     | N/A                         |
| HU-002-004 | Define the initial team workflow using GitHub Projects                  | doing                    | N/A                         |

## 2. My individual contribution

* Reviewed the Week 2 material related to **distributed architectures and architectural planning**.
* Analyzed the main distributed architecture styles, including **Client-Server, Peer-to-Peer, SOA, and Microservices**.
* Related distributed architecture concepts to the proposed structure of **Cine API**.
* Analyzed how the system can be divided into different services based on responsibilities and boundaries.
* Reviewed **Scrum** concepts, including Sprint, Product Backlog, Sprint Backlog, Product Owner, Scrum Master, Developers, Daily Scrum, Sprint Review, and Sprint Retrospective.
* Reviewed **Kanban** concepts, especially workflow visualization through columns and Work in Progress (WIP) limits.
* Defined an initial proposal for organizing the team's workflow using a **Kanban board in GitHub Projects**.
* Related Scrum and Kanban practices to the development workflow of the Cine API project.
* Created the diagrams used as learning evidence for this week:

  * **Distributed Architectures and Architecture Planning**
  * **Scrum & Kanban**
* Continued defining the organization of the **Booking & Seat Reservation Service**, taking into account the architecture and agile methodology concepts studied during the week.

## 3. Blockers and risks

* The final **GitHub Projects** board is still being configured.
* Some decisions regarding the team's workflow still need to be agreed upon by all team members.
* The final Cine API architecture must remain aligned with each microservice's responsibilities to avoid unnecessary dependencies.
* The rules for board automation and their relationship with branches and Pull Requests still need to be fully defined.
* There is a risk of adding unnecessary complexity if distributed architectures or microservices are used without clearly defined responsibilities and boundaries.

## 4. Plan for next week

* Finalize the **GitHub Projects** board configuration.
* Define the columns and statuses that will be used by the team.
* Define the labels required to classify user stories, tasks, bugs, and priorities.
* Establish the workflow between the `develop`, `qa`, and `main` branches.
* Define the Pull Request workflow for user stories.
* Configure the available GitHub Projects automations.
* Link user stories with their corresponding tasks on the board.
* Continue implementing the **Booking & Seat Reservation Service**.
* Apply **DDD, TDD, SDD, SOLID, Clean Code, and Hexagonal Architecture** principles during development.

## 5. Compliance self-check

* [ ] Conventional Commits - `type(scope): summary`
* [ ] Per-environment HU branch + PR to that environment (`hu-xxx-dev -> develop`, ...)
* [x] Testable acceptance criteria
* [ ] Tests added/updated (unit / integration)
* [x] DDD / hexagonal boundaries respected (domain has no I/O)
* [x] No secrets; config via environment variables

### Notes

* The main focus of this week was the analysis and documentation of distributed architecture and agile methodology concepts.
* The diagrams created serve as visual evidence of the topics studied.
* The complete configuration of the branch, Pull Request, and automation workflow is still in progress.
* Testing will be implemented together with the corresponding functionality.
* Architectural decisions must remain aligned with the responsibilities defined for each microservice.

## 6. Evidence links

### Distributed Architectures and Architecture Planning

This diagram summarizes the concepts studied about distributed architectures and architectural planning during the week.

![Distributed Architectures and Architecture Planning](./Distributed%20Architectures%20and%20Architecture%20Planning.png)

### Scrum and Kanban

This diagram summarizes the main **Scrum and Kanban** concepts, including their elements, roles, and workflow.

![Scrum and Kanban](./Scurm%26Kanban.png)


