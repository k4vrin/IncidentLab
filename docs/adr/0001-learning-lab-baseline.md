# 0001: Use Spring Boot 4 for a small Kotlin learning lab

Date: 2026-10-29
Status: Accepted for bootstrap; exercises remain pending

## Context

The learner requested Spring Boot 4 from the beginning and comprehensive idiomatic Kotlin coverage in a project separate from ClaimsLab.

## Decision

Generate the official MVC/validation/Actuator Kotlin starter with Java 25. Use Boot 4.1.2 and align compiler, Spring plugin and Kotlin libraries at 2.4.21. Select Gradle 9.7.0 within the Kotlin plugin's documented support range. Preserve the untouched generator archive and metadata. Bind locally on port 8081.

Implement no incident product behavior at bootstrap. Introduce PostgreSQL at IL02, coroutines at IL21 and comparison dependencies only at their checkpoints. Stable main code and isolated compiler/preview fixtures have separate purposes. Rich errors remain research until a released compatible compiler is verified.

## Alternatives

Keeping the combined ClaimsLab curriculum mixed product priorities with language demonstrations. A Kotlin-only command-line project would not satisfy the request for Boot 4 from day one.

## Consequences

The initial test/check lane needs no infrastructure. IL02 must add real PostgreSQL integration verification without silent skips. Feature coverage is comprehensive for Kotlin/JVM and Spring, with explicit separate platform extensions. Bootstrap assistance never closes learner acceptance.

## Evidence

See bootstrap evidence and dated research. Runtime/compiler support is claimed only for checks actually executed.
