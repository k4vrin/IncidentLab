# IncidentLab bootstrap evidence

Date: 29 October 2026, Asia/Tehran
Repository: `/Users/kavrin/Projects/Kavrin/IncidentLab`
Scope: assisted foundation only; incident behavior and all learner acceptance remain open.

## Origin and deliberate changes

Generated from official Spring Initializr with Kotlin, Gradle Kotlin DSL, Boot 4.1.2, Java 25, package dev.kavrin.incidentlab and web/validation/actuator selections. Downloaded metadata advertised Boot 4.1.2 as the stable default. Original archive and metadata are saved here.

Initializr archive SHA256: `3d55166c2440113bb1536754efff21b00f69a52d2fc248d17e34b1f78c45aa93`.

The generated baseline selected Kotlin 2.3.21 and Gradle 9.8.2. IncidentLab deliberately uses aligned Kotlin JVM/Spring plugins, stdlib and reflection at 2.4.21 and Gradle 9.7.0, within Kotlin's documented support range. The checksum came from the official Gradle distribution endpoint and is stored in wrapper properties. No ClaimsLab build versions were changed.

Wrapper distribution SHA256: `84fbba45c7f4c64abc77460e1c00f541e9f960e3c7ed2538f1ede19eacd873ae`.

The generated annotation-default-target flag produced a Kotlin 2.4 redundancy warning. It was removed and the check rerun successfully. Strict JSR-305 handling remains. Boot dependency management is explicitly given kotlin.version=2.4.21; dependencyInsight confirmed stdlib and reflection 2.4.21. Gradle's embedded Kotlin 2.4.0 is separate from the application's compiler/plugin.

## Observed verification

- `./gradlew check bootJar --console=plain`: passed, including compilation, the portable Spring MVC health test and executable packaging.
- Rerun after removing the redundant flag: passed without that compiler warning; unchanged test outputs were up-to-date.
- `./gradlew --version`: Gradle 9.7.0; launcher/daemon Java 25.0.2 from the local SDKMAN JDK.
- `./gradlew dependencyInsight --dependency kotlin-stdlib --configuration runtimeClasspath --console=plain`: passed; stdlib and reflection resolved to 2.4.21, Jackson Kotlin module 3.1.7.
- Test XML: IncidentLabApplicationTests, 1 test, 0 failures, 0 errors, 0 skipped. Constructor-injected MockMvc checked HTTP 200 and status UP without database configuration.
- Packaged jar started locally with `java -jar build/libs/incidentlab-0.0.1-SNAPSHOT.jar`; GET http://127.0.0.1:8081/actuator/health returned HTTP 200 with status UP. The process was terminated after the check.
- Learning Loop vault validation passed. Active project/track wikilinks were checked for missing local targets.

The initial check task is portable by design. PostgreSQL, Flyway, Testcontainers and integrationTest are not added until IL02. No database checks are claimed or silently skipped. No incident endpoint, diagnostic behavior, advanced language exercise, AI provider or preview/proposal feature was executed.

## Git and next action

Local Git initialized on main; no commit or remote created. Files remain available for review. Begin learner IL00, then inspect/reproduce IL01. The provided starter is not an independent learner implementation. Rich errors remain research and stable-alternative comparison, not enabled language syntax.
