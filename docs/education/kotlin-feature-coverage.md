# Kotlin feature coverage register

Scope: Kotlin/JVM language, standard-library idioms, kotlinx concurrency/serialization and Spring integration. All practice evidence is pending. Stable topics still need execution; preview/proposal status must be rechecked at the checkpoint. Native/JS/Wasm/Android/Compose need separate tracks.

| Category | Feature inventory and exercise location | Evidence |
| --- | --- | --- |
| Fundamentals | Expressions, inference, val/var, conversions, equality/identity, strings/templates/regex, ranges/progressions, loops, labels, destructuring, Unit/Nothing/Any, smart casts and null safety: IL03/04/27 | Changed input and compiler/behavior checks |
| Functions | Named/default/vararg, spread, local/top-level/member/extension/infix/tailrec, function references/types, lambdas/closures, receivers and all scope functions: IL04 | Equivalent behavior and readability comparison |
| Object model | Constructors/init, visibility/modality, interfaces/defaults, data/enum/sealed/value classes, data objects, companions/object expressions, nested/inner, interface/property delegation, lazy/observable/vetoable/custom delegates: IL05/11 | Equality/aliasing and delegation changed cases |
| Collections | Mutable versus read-only, primitive arrays, collection builders, grouping/folds/flatMap, maps/sets/ordering, duplicate keys and eager/lazy sequences: IL06 | Boundary/ordering and measured comparison |
| Type system | Generic constraints, declaration/use-site variance, projections, erasure, definitely non-null types, aliases, SAM/fun interfaces, inline/reified/noinline/crossinline and operators: IL07/20/32 | Positive/negative compilation and JVM inspection |
| Errors/resources | Nullable absence, sealed typed errors, Result, exceptions/causes, preconditions, use/finally, contracts and cancellation preservation: IL08/09/18 | Cleanup and exhaustive mapping failure cases |
| JVM boundary | Java nullability/JSpecify, Java/Kotlin collection views, annotations/retention/targets, KClass/Class/reflection, JVM overload/name/static annotations, value-class boxing and ABI: IL09/10/20/32 | Java caller, emitted signatures and incompatible fixture |
| Coroutines library | suspend/continuations concept, coroutineScope/supervisorScope, launch/async, jobs/context/dispatchers, exception ownership, timeout/cancellation, cleanup, mutex/atomics/confinement and coroutine tests: IL21/24 | Coordinated overlap, parent/sibling cancellation and repaired race |
| Streams library | Flow/StateFlow/SharedFlow/channels, cold/hot lifetimes, buffering/conflation/backpressure, terminal/intermediate operators, cancellation and bounded workers: IL22/24 | Multiple subscribers, cleanup and overflow |
| DSL/config | Receiver lambdas, DslMarker, builder inference, configuration properties, actual bean registration and small extensions/reified helpers: IL17/31 | Forbidden receiver compile fixture and behavior-changing configuration |
| Modern stable language | Context parameters, explicit backing fields, when guards, data-flow exhaustiveness, nested aliases, multi-dollar strings, non-local loop control, annotation improvements: IL25/26 | Build-specific compiler and emitted-target evidence |
| Modern standard library | Kotlin time/clock/duration and UUID interoperability, enum entries and rangeUntil; individual generation opt-ins checked separately: IL27 | Java/JSON/JDBC round-trip and deterministic time |
| Preview | Name-based destructuring, context-sensitive resolution, unused-return checker, collection literals, explicit context arguments, boxed inline exposure, compile-time constants/version-overloading where supported: IL28/32 | Isolated flag/version ledger and negative check |
| Proposal | Rich errors: IL29 | Source-status review plus runnable stable error comparisons; proposed syntax excluded from normal compilation |
| Spring framework | Boot activation/plugins, constructor DI/proxies, validation, MVC styles, immutable JDBC, synchronous transactions, optimistic locking, MockMvc DSL, SSE, tracing, JPA/serialization/API-versioning comparisons: IL01/02/10–17/20–23/30/31/40/41 | Context/HTTP/real database/runtime evidence |
| Other platforms | JS/Native/Wasm/Multiplatform/Compose: IL60 optional | Separate scope; no mastery claim from JVM exercises |

All eight previously explicit requirements are preserved: sealed exhaustive types, value classes, immutable configuration, MockMvc DSL, receiver/DslMarker DSL, Bean Registrar DSL, extensions/reified helpers and structured concurrency. The original 22 framework checkpoints are mapped in the split record. Feature breadth is an inventory to work through, not a requirement to use every construct in production code.
