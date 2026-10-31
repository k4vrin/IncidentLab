# IncidentLab

A guided Kotlin/JVM and Spring Boot 4 learning lab. A tiny fictional incident domain supports language exercises; this is not an incident-management product. ClaimsLab is the separate product project.

## Foundation

Spring Boot 4.1.2, Kotlin JVM/Spring plugins and libraries 2.4.21, Java 25, Gradle 9.7.0, dependency-management plugin 1.1.7. Initializr originally generated Kotlin 2.3.21 and Gradle 9.8.2; the selected pair uses Kotlin's documented Gradle support range. The original archive/metadata and wrapper checksum are preserved under docs/bootstrap and gradle/wrapper. Kotlin 2.4 made the generated annotation-default-target flag redundant; it was removed after compiler verification.

Initial dependencies are MVC, validation, Actuator, reflection and Jackson Kotlin. There is no database, coroutine or AI dependency yet. PostgreSQL/Flyway and a mandatory integration lane are introduced at IL02. This makes the initial application portable without test-only persistence exclusions.

## Run and verify

```sh
./gradlew test
./gradlew check bootJar
./gradlew bootRun
curl --fail http://127.0.0.1:8081/actuator/health
```

Java 25 must be installed. Initial dependency downloads need network access. The application binds to 127.0.0.1:8081, overridable with INCIDENTLAB_PORT. Stop it with Ctrl-C. At bootstrap check runs only portable tests; once IL02 exists, check must also run real PostgreSQL integration tests and fail visibly without Docker.

## Learning route

Read [the docs index](docs/README.md), [acceptance tasks](docs/education/implementation-tasks.md), [feature coverage](docs/education/kotlin-feature-coverage.md) and [dated research](docs/research/kotlin-feature-research.md). Start IL00/01; do not regenerate the skeleton. One concept, learner-written change and changed case at a time. All domain behavior remains unimplemented and learner acceptance remains open.

The vault has separate Learning/Notes/IncidentLab and Learning/Notes/ClaimsLab folders and separate tracks. [The split record](docs/project-split.md) preserves the former curriculum mapping. New stable features and isolated previews are planned exercises; rich errors are a proposal comparison, not supported syntax in this application.

No remote, publication, external account or credentials are created. Assisted bootstrap checks are recorded in [bootstrap evidence](docs/bootstrap/README.md), separately from learner performance.
