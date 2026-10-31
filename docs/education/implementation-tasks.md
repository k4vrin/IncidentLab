# IncidentLab implementation and acceptance tasks

All learner acceptance remains open. Assisted bootstrap does not finish IL00/01. Each checkpoint needs an unaided prediction, a bounded implementation, a changed case and recorded evidence. No product feature is added only to enlarge the application.

| Task | Goal | Evidence lane | Prerequisite |
| --- | --- | --- | --- |
| IL00 | Bound the learning lab | Design | None |
| IL01 | Inspect and reproduce the Boot 4 foundation | Portable + Runtime | IL00 |
| IL02 | Separate PostgreSQL verification | PostgreSQL | IL01 |
| IL03 | Expressions, types and nullability | Portable | IL01 |
| IL04 | Functions, lambdas and scope functions | Portable | IL03 |
| IL05 | Objects, equality and delegation | Portable | IL03 |
| IL06 | Collections, sequences and algorithms | Portable | IL04 |
| IL07 | Generics and inline boundaries | Portable + Compiler | IL04 |
| IL08 | Resources and error representations | Portable | IL05 |
| IL09 | Contracts, reflection and compiler fixtures | Portable + Compiler | IL07 |
| IL10 | Validation targets and MVC test DSL | Portable | IL02, IL03 |
| IL11 | Typed incident rules and sealed events | Portable | IL10, IL05 |
| IL12 | Immutable JDBC mapping | PostgreSQL | IL11 |
| IL13 | Synchronous transaction boundaries | PostgreSQL | IL12 |
| IL14 | Functional and annotated HTTP adapters | PostgreSQL | IL13 |
| IL15 | Optimistic concurrency | PostgreSQL | IL14 |
| IL16 | Bounded reads and deterministic ordering | PostgreSQL | IL14 |
| IL17 | Configuration, logging and backend walkthrough | Runtime + PostgreSQL | IL10–IL16 |
| IL18 | Typed errors across application boundaries | Portable | IL08, IL14 |
| IL20 | JSpecify and Java interoperability | Portable + Compiler | IL11 |
| IL21 | Virtual threads, suspension and structured concurrency | Runtime | IL17 |
| IL22 | Flow and SSE | Runtime + PostgreSQL | IL21 |
| IL23 | Trace and coroutine context | Runtime | IL21 |
| IL24 | Channels, hot streams and shared state | Portable | IL21 |
| IL25 | Context parameters and explicit backing fields | Portable + Compiler | IL07 |
| IL26 | Modern expression and annotation features | Portable + Compiler | IL10 |
| IL27 | Time, UUIDs and standard library boundaries | Portable | IL11 |
| IL28 | Preview feature experiments | Compiler | IL25, IL26 |
| IL29 | Rich errors research and comparison | Research + Portable | IL18 |
| IL30 | Isolated JPA comparison | PostgreSQL | IL17 |
| IL31 | Receiver DSL and Bean Registrar | Portable + Compiler | IL11, IL13 |
| IL32 | API and binary compatibility | Compiler | IL07, IL20 |
| IL40 | Explicit serialization boundaries | PostgreSQL | IL17 |
| IL41 | Framework API versioning | Portable | IL14 |
| IL42 | Independent Kotlin/Spring defense | Runtime + PostgreSQL | Required stable checkpoints |
| IL50 | Optional Spring AI adapter comparison | Runtime | IL17; IL21 for suspend orchestration |
| IL51 | Optional JVM AOT-cache measurement | Runtime | IL17 |
| IL60 | Optional other Kotlin targets | Research | IL42 |

## IL00: Bound the learning lab

Lane: Design. Prerequisite: None. Preparation: S1 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Sketch report, assign, investigate, resolve and close using a tiny incident model. Explain that product expansion is excluded.
- [ ] Changed case: Change one status precondition and identify the smallest affected test.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL01: Inspect and reproduce the Boot 4 foundation

Lane: Portable + Runtime. Prerequisite: IL00. Preparation: S1 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Inspect Initializr archive, wrapper checksum, Kotlin/BOM alignment, Spring plugin, compiler flags, Jackson and starter activation. Run version, test and local health checks.
- [ ] Changed case: Remove one starter in a reversible diff, predict the effect, verify and restore it.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL02: Separate PostgreSQL verification

Lane: PostgreSQL. Prerequisite: IL01. Preparation: S5 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] At this checkpoint add JDBC, Flyway, pinned PostgreSQL Testcontainers and integrationTest. Keep test Docker-free and make check run both lanes. Verify fresh migration, constructor-injected tests and visible missing-Docker failure.
- [ ] Changed case: Break a test-only migration, observe startup failure, restore it and rerun.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL03: Expressions, types and nullability

Lane: Portable. Prerequisite: IL01. Preparation: K1 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Practice val/var, inference, literals and numeric conversions, equality/identity, if/when/try expressions, Nothing/Unit/Any, smart casts, safe calls, Elvis, nullable collections, strings, templates, ranges and destructuring.
- [ ] Changed case: Introduce a missing responder and distinguish absence from an invalid value without !!.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL04: Functions, lambdas and scope functions

Lane: Portable. Prerequisite: IL03. Preparation: K1 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare default/named/vararg arguments, spread, overloads, local and extension functions, infix functions, function references, closures, receiver lambdas, labels, tailrec and apply/also/let/run/with return semantics.
- [ ] Changed case: Replace an overnested scope-function chain with explicit names and prove identical behavior.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL05: Objects, equality and delegation

Lane: Portable. Prerequisite: IL03. Preparation: K1 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare classes, data classes/objects, enums, interfaces, abstract/sealed types, visibility, constructors/init, companion/object expressions, nested/inner classes, interface delegation and property delegates. Prove copy is shallow and read-only collections are not necessarily immutable.
- [ ] Changed case: Mutate a shared nested collection and repair the aliasing assumption; compare a delegated diagnostic decorator.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL06: Collections, sequences and algorithms

Lane: Portable. Prerequisite: IL04. Preparation: K1 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Use list/set/map/array, primitive arrays, builders, map/filter/flatMap/fold/grouping, comparators, associate duplicate behavior, indexed access, lazy sequences and collection/sequence boundaries. Explain complexity and measure only with controlled inputs.
- [ ] Changed case: Change duplicate service keys and input order; preserve specified report ordering.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL07: Generics and inline boundaries

Lane: Portable + Compiler. Prerequisite: IL04. Preparation: K2 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Implement one typed diagnostic abstraction. Exercise in/out variance, use-site projections, star projections, constraints, erasure, definitely non-null types, type aliases, inline/reified/noinline/crossinline, SAM/fun interfaces and operator conventions.
- [ ] Changed case: Capture a rejected variance or ID-type call in an isolated compiler fixture and explain why it fails.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL08: Resources and error representations

Lane: Portable. Prerequisite: IL05. Preparation: K2 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare nullable absence, typed sealed outcomes, kotlin.Result and exceptions for the same operation. Use require/check/error, use and finally; retain causes, sanitize HTTP errors and do not swallow cancellation.
- [ ] Changed case: Inject a read failure and prove resource cleanup and correct error classification.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL09: Contracts, reflection and compiler fixtures

Lane: Portable + Compiler. Prerequisite: IL07. Preparation: K2 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare a built-in contract with a bounded custom-contract exercise after checking opt-in requirements. Inspect annotations/reflection and bytecode. Separate KClass/Class and erased/reified types. Keep negative fixtures outside normal source sets.
- [ ] Changed case: Change a predicate so its claimed contract would be unsound and explain why contracts are promises, not runtime proof.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL10: Validation targets and MVC test DSL

Lane: Portable. Prerequisite: IL02, IL03. Preparation: S2,S15 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Implement one immutable report DTO and valid/invalid cases through functional explicit validation and annotated @Valid fixtures. Inspect normal compiler targets, @field and @all applicability. Preserve Kotlin MockMvc DSL and one owner per route.
- [ ] Changed case: Compare blank/missing fields and nested constraints with emitted annotations; restore the normal compiler setup.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL11: Typed incident rules and sealed events

Lane: Portable. Prerequisite: IL10, IL05. Preparation: K2 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Model IncidentId, ResponderId and EventId value classes; nullable assignee, severity enum, explicit transitions, distinct outcomes and exhaustive typed events. Use injected Clock. Keep incident rules minimal.
- [ ] Changed case: Add an event and prove a mapper without else requires an update; reject an ID mixup in a compiler fixture.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL12: Immutable JDBC mapping

Lane: PostgreSQL. Prerequisite: IL11. Preparation: S5 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Map separate incident/event records with explicit ID conversion, assigned UUID new-state detection and nullable Version. Observe actual first version, timestamp precision and SQL.
- [ ] Changed case: Change one nullable field and prove insert/update round-trip without replacing append-only history.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL13: Synchronous transaction boundaries

Lane: PostgreSQL. Prerequisite: IL12. Preparation: S6 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Commit one incident mutation and event atomically. Force event insertion failure and inspect committed state from a separate transaction. Explain proxies and constructor injection.
- [ ] Changed case: Force failure after the earlier write and prove no partial state commits.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL14: Functional and annotated HTTP adapters

Lane: PostgreSQL. Prerequisite: IL13. Preparation: S15 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Give distinct routes to MVC functional and annotated adapters calling shared use cases. Use mapping extensions, typed body helpers, valid Location resources and one Problem Details contract.
- [ ] Changed case: Pass malformed IDs and wrong-resource IDs through both adapters and compare errors.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL15: Optimistic concurrency

Lane: PostgreSQL. Prerequisite: IL14. Preparation: S5,S6 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Require expectedVersion; coordinate independent writers with barriers and bounded timeouts. Prove exactly one version/event commits without automatic conflict retry.
- [ ] Changed case: Race two resolutions and verify only the winner appears in committed history.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL16: Bounded reads and deterministic ordering

Lane: PostgreSQL. Prerequisite: IL14. Preparation: S5 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Implement bounded incident and event queries, explicit missing-parent behavior and deterministic tie-breakers. Inspect SQL rather than page an unbounded in-memory list.
- [ ] Changed case: Use equal timestamps and concurrent inserts to demonstrate offset pagination limits.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL17: Configuration, logging and backend walkthrough

Lane: Runtime + PostgreSQL. Prerequisite: IL10–IL16. Preparation: S1,S10 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Bind validated immutable pagination settings, use constructor-injected Spring tests and a small reified logger/helper. Reproduce report-to-close, health and both test lanes without logging full incident text.
- [ ] Changed case: Reject invalid startup configuration and prove a valid override changes the bound.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL18: Typed errors across application boundaries

Lane: Portable. Prerequisite: IL08, IL14. Preparation: K2 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Carry typed diagnostic failures to HTTP with exhaustive mapping; compare a generic covariant outcome with a domain-specific sealed result and kotlin.Result. Do not claim these implement proposed rich-error syntax.
- [ ] Changed case: Add one recoverable failure, update every required mapping and preserve cancellation.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL20: JSpecify and Java interoperability

Lane: Portable + Compiler. Prerequisite: IL11. Preparation: S3 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Add Java NullMarked/Nullable examples including generic nullability. Inspect Kotlin signatures, SAMs, JVM name/overload/static annotations, checked-exception interop and boxed value-class limits.
- [ ] Changed case: Capture an invalid nullability call; distinguish annotation contracts from Java runtime enforcement.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL21: Virtual threads, suspension and structured concurrency

Lane: Runtime. Prerequisite: IL17. Preparation: S4,S6 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Observe thread names/isVirtual, compare sync MVC and annotated suspend MVC. Add core/reactor coroutine adapters only here; compose independent deterministic fakes with coroutineScope and async/await. Keep blocking JDBC outside suspended transaction composition.
- [ ] Changed case: Prove overlap, sibling failure cancellation and parent cancellation with coordination, not timing guesses.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL22: Flow and SSE

Lane: Runtime + PostgreSQL. Prerequisite: IL21. Preparation: S4 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Return Flow from an annotated SSE route. Publish after commit, prove rollback silence, two subscribers, cleanup, bounded buffering and slow-subscriber overflow. REST history remains recovery.
- [ ] Changed case: Disconnect a client and overflow a slow subscriber without claiming replay or lossless delivery.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL23: Trace and coroutine context

Lane: Runtime. Prerequisite: IL21. Preparation: S7 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Inspect actual tracing/context dependencies, verify trace identity across real suspension and compare with a negative control. Explain context versus transaction continuity.
- [ ] Changed case: Remove one propagation mechanism reversibly and observe the broken correlation.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL24: Channels, hot streams and shared state

Lane: Portable. Prerequisite: IL21. Preparation: K3 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare cold Flow, StateFlow, SharedFlow and channels; implement bounded diagnostic workers. Exercise mutex, atomics, confinement, supervision, dispatcher selection, timeouts, cancellation and coroutine virtual-time tests.
- [ ] Changed case: Cancel the parent and prove workers/resources stop; expose then repair a shared-counter race.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL25: Context parameters and explicit backing fields

Lane: Portable + Compiler. Prerequisite: IL07. Preparation: K4 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Use stable context parameters for a small pure diagnostic context and compare explicit arguments/constructor injection. Expose read-only progress with an explicit backing field; verify actual compiler support.
- [ ] Changed case: Create an ambiguous context call and capture its diagnostic; do not turn Spring service dependencies into hidden global context.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL26: Modern expression and annotation features

Lane: Portable + Compiler. Prerequisite: IL10. Preparation: K4 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Exercise when guards, data-flow exhaustiveness, nested type aliases, multi-dollar interpolation, non-local break/continue, annotation default targets and @all with bytecode inspection.
- [ ] Changed case: Add a subtype or annotation target and predict the new compiler/runtime observation.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL27: Time, UUIDs and standard library boundaries

Lane: Portable. Prerequisite: IL11. Preparation: K4 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare kotlin.time Instant/Clock/Duration and kotlin.uuid.Uuid with Java equivalents at JSON/JDBC boundaries. Check generation API opt-ins separately; exercise enum entries, rangeUntil, regex, unsigned values and explicit conversions.
- [ ] Changed case: Round-trip boundary instants and IDs without changing wire format or silently truncating precision.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL28: Preview feature experiments

Lane: Compiler. Prerequisite: IL25, IL26. Preparation: K4 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Independently gate name-based destructuring, context-sensitive resolution, unused-return checks, collection literals, explicit context arguments and boxed value-class exposure against the selected compiler. Each experiment records source, flag, success and negative diagnostics.
- [ ] Changed case: Remove one opt-in/flag and explain the diagnostic; restore a clean stable application build.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL29: Rich errors research and comparison

Lane: Research + Portable. Prerequisite: IL18. Preparation: K5 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Read the current KEEP status, motivation and design discussion. Compare the same operation using sealed typed errors, kotlin.Result and exceptions. Proposed rich-error examples are explicitly non-executable until a released compiler and exact flag are verified.
- [ ] Changed case: Recheck availability; either run an isolated compatible experiment or record unsupported status honestly. Stable comparisons still run.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL30: Isolated JPA comparison

Lane: PostgreSQL. Prerequisite: IL17. Preparation: S8 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Isolate JPA scanning/dependencies from the JDBC application. Observe data-class equality/hash, generated IDs, no-arg/open/proxy/lazy behavior and record a corrective ADR.
- [ ] Changed case: Trigger the identity/hash or lazy-proxy failure, repair it and rerun the JDBC regression lane.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL31: Receiver DSL and Bean Registrar

Lane: Portable + Compiler. Prerequisite: IL11, IL13. Preparation: S9,K2 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Build a tiny diagnostic-plan DSL with receiver lambdas and DslMarker. Validate duplicates and use condition/loop-based actual Spring bean registrations consumed by one use case. Compare ordinary constructor wiring.
- [ ] Changed case: Capture forbidden receiver access and prove a changed registration changes the chosen diagnostic.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL32: API and binary compatibility

Lane: Compiler. Prerequisite: IL07, IL20. Preparation: K4 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare source and JVM ABI effects of default parameters, inline bodies, value classes, visibility/PublishedApi and overloads. Investigate version-overloading only when the selected compiler supports it.
- [ ] Changed case: Compile a tiny consumer against an earlier fixture and observe the changed binary contract.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL40: Explicit serialization boundaries

Lane: PostgreSQL. Prerequisite: IL17. Preparation: S11 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Compare Jackson with isolated kotlinx.serialization activation. Assert actual converter selection, nullable/default/sealed/value-class wire shapes and round-trip persistence.
- [ ] Changed case: Change a default or serializer and prove which endpoint representation changes.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL41: Framework API versioning

Lane: Portable. Prerequisite: IL14. Preparation: S12 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Use supported framework version resolver/mapping APIs in an isolated adapter exercise. Both representations refer to the same incident outcome.
- [ ] Changed case: Request missing/unsupported versions and prove framework resolution rather than path-only duplication.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL42: Independent Kotlin/Spring defense

Lane: Runtime + PostgreSQL. Prerequisite: Required stable checkpoints. Preparation: All in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Build an evidence matrix, independently implement a new rule and a changed framework/concurrency behavior, diagnose a failure and explain simpler alternatives. Keep guided, independent and retained evidence separate.
- [ ] Changed case: Use an unrehearsed variation; reopen the earliest demonstrated gap rather than average away a critical failure.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL50: Optional Spring AI adapter comparison

Lane: Runtime. Prerequisite: IL17; IL21 for suspend orchestration. Preparation: S13 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Only if requested later, compare a deterministic incident summarizer fake and an explicitly enabled provider. Keep it outside transactions, bounded and non-authoritative.
- [ ] Changed case: Force timeout and provider failure without changing the incident lifecycle.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL51: Optional JVM AOT-cache measurement

Lane: Runtime. Prerequisite: IL17. Preparation: S14 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Verify selected builder/JDK support, compare equal-condition startup/RSS runs including preparation costs, raw samples, medians and limitations.
- [ ] Changed case: Record a slower or unsupported result without claiming an improvement.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.

## IL60: Optional other Kotlin targets

Lane: Research. Prerequisite: IL42. Preparation: K4 in the source map.

- [ ] Explain/predict the behavior before reference use, then inspect only the needed source slice.
- [ ] Inventory Native/JS/Wasm/Multiplatform and Compose as separate platform tracks. Do not claim a JVM Boot app demonstrates their toolchains.
- [ ] Changed case: Choose one target only under a separate explicit scope request.
- [ ] Save commands, expected/observed results, failure/correction and assistance level. Demonstrate one independent variation before marking independent performance; later recall remains separate.

Evidence: pending.
