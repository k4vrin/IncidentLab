# IncidentLab sources and feature research

Verified on 29 October 2026. Source mode: mixed. Official pages are research evidence; links for future exercises remain preparation, not executed API evidence.

| ID | Owner and source | Purpose and freshness |
| --- | --- | --- |
| S1 | Spring: [Initializr](https://start.spring.io/), [Boot Kotlin support](https://docs.spring.io/spring-boot/reference/features/kotlin.html), [requirements](https://docs.spring.io/spring-boot/system-requirements.html) | Live Initializr metadata and archive downloaded; requirements read this run. Boot Kotlin page read this run. |
| K1 | JetBrains: [idioms](https://kotlinlang.org/docs/idioms.html), [scope functions](https://kotlinlang.org/docs/scope-functions.html), [language reference](https://kotlinlang.org/docs/home.html) | Idioms/scope pages read this run; detailed language slices verified when each exercise opens. |
| K2 | JetBrains: [generics](https://kotlinlang.org/docs/generics.html), [inline functions](https://kotlinlang.org/docs/inline-functions.html), [delegation](https://kotlinlang.org/docs/delegation.html), [builders](https://kotlinlang.org/docs/type-safe-builders.html) | Primary preparation links; not all sections newly opened. |
| K3 | JetBrains: [coroutines guide](https://kotlinlang.org/docs/coroutines-guide.html), [Flow](https://kotlinlang.org/docs/flow.html) | Read this run; use deterministic coordination and actual cancellation evidence. |
| K4 | JetBrains: [feature status register](https://kotlinlang.org/docs/kotlin-language-features-and-proposals.html), [2.4 changes](https://kotlinlang.org/docs/whatsnew24.html), [2.4.20 changes](https://kotlinlang.org/docs/whatsnew2420.html), [release register](https://kotlinlang.org/docs/releases.html), [Gradle compatibility](https://kotlinlang.org/docs/gradle-configure-project.html) | Read this run. Kotlin 2.4.21 selected; Gradle 9.7 is within its documented support range. Release pages disagree on the 2.4.0 date; no exact date is used as a prerequisite. |
| K5 | Kotlin KEEP: [rich-error discussion](https://github.com/Kotlin/KEEP/discussions/487), [use-case analysis](https://github.com/Kotlin/KEEP/blob/main/notes/0009-rich-errors-use-cases.md) | Read this run. The status register lists motivation/rationale under KEEP discussion; no released compiler support verified. Proposal syntax is not baseline Kotlin. |
| S2 | JetBrains: [annotation targets](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) | Verify emitted targets at IL10 against the build. |
| S3 | JSpecify: [user guide](https://jspecify.dev/docs/user-guide/) | Primary preparation link; verify generic nullability at IL20. |
| S4 | Spring: [Kotlin coroutines](https://docs.spring.io/spring-framework/reference/languages/kotlin/coroutines.html) | Read this run; MVC suspend/Flow and coroutine adapter dependencies. |
| S5 | Spring: [JDBC reference](https://docs.spring.io/spring-data/relational/reference/jdbc.html) | Verify mapping/state detection/versioning against actual dependencies at IL02/12/15. |
| S6 | Spring: [declarative transaction implementation](https://docs.spring.io/spring-framework/reference/data-access/transaction/declarative/tx-decl-explained.html) | Preparation for synchronous proxy/transaction and rollback evidence. |
| S7 | Spring: [observability](https://docs.spring.io/spring-boot/reference/actuator/observability.html) | Verify selected tracing/context modules at IL23. |
| S8 | JetBrains/Spring/Hibernate: [JPA plugin](https://kotlinlang.org/docs/no-arg-plugin.html#jpa-support), [Hibernate](https://hibernate.org/orm/documentation/) | Isolated comparison at IL30; no JPA dependency at bootstrap. |
| S9 | Spring: [programmatic bean registration](https://docs.spring.io/spring-framework/reference/core/beans/java/programmatic-bean-registration.html) | Verify registrar APIs at IL31; no speculative framework DSL implementation. |
| S10 | SLF4J: [manual](https://www.slf4j.org/manual.html) | Minimal parameterized logging, no utility framework. |
| S11 | Spring/JetBrains: [Boot JSON](https://docs.spring.io/spring-boot/reference/features/json.html), [serialization](https://kotlinlang.org/docs/serialization.html) | Verify activation/converters at IL40. |
| S12 | Spring: [MVC API versioning](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-config/api-version.html) | Verify resolver and mapping behavior at IL41. |
| S13 | Spring: [Spring AI](https://docs.spring.io/spring-ai/reference/) | Optional future adapter only, verify Boot compatibility then. |
| S14 | Paketo: [Java reference](https://paketo.io/docs/reference/java-reference/) | Optional controlled AOT-cache experiment, check actual builder support. |
| S15 | Spring: [MVC functional endpoints](https://docs.spring.io/spring-framework/reference/web/webmvc-functional.html), [Kotlin web DSLs](https://docs.spring.io/spring-framework/reference/languages/kotlin/web.html) | Compare explicit validation, MVC handlers and MockMvc DSL at IL10/14. |

## Stable, preview and proposal boundaries

Research suggests IL25–IL29 as useful additions. Context parameters, explicit backing fields, annotation target improvements and the common UUID API are recorded as stable in the 2.4 line; individual generation/context APIs can still require opt-in. Preview features get isolated compiler exercises, not global flags. Rich errors get research plus executable stable alternatives; Kotlin Result, sealed results and library-based typed errors are distinct mechanisms.

The complete feature register maps every topic to evidence. This is comprehensive Kotlin/JVM practice, not proof of every Kotlin platform. New release features are added only with a source, stability status, selected-compiler check and changed case. Do not invent compiler flags from a proposal.

## Preserved material

The original user brief and conference transcript are copied unchanged into Sources/. They are historical topic inputs, not evidence of current APIs. Their exact video URL/title/timestamps were not supplied. The archived ClaimsLab curriculum retains the earlier insurance adaptation.
