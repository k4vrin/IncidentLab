# IncidentLab engineering and learning guidance

Read README.md, docs/README.md and docs/education/implementation-tasks.md before implementation. IncidentLab is a Kotlin/Spring Boot 4 language lab, not an incident-management product. Use a tiny fictional incident domain and deterministic diagnostic fakes. The learner implements one concept and changed case at a time. Assisted setup does not close learner acceptance.

Use constructor injection and immutable values. Explain non-obvious intent; avoid redundant comments. Keep main code coherent; put alternative framework approaches, compiler-negative fixtures, JPA and preview features in isolated exercises. No external credentials, broker, real integrations, AI feature or business expansion is required. Keep imperative JDBC transactions synchronous. Add persistence and coroutine dependencies at their named checkpoints.

Prefer codebase-memory-mcp for code discovery; index first if needed, then search_graph, trace_path and get_code_snippet. Fall back to file searches for docs/config or unavailable graph information. Run shell commands directly, without RTK.

Initially ./gradlew check is portable and needs no Docker/database. At IL02, add a real PostgreSQL integrationTest lane and wire it into check; missing Docker must fail visibly, never silently skip. Save actual commands/results and distinguish planned, implemented, guided, independent and retained evidence.

Research version-sensitive APIs against the actual build. Rich errors are a proposal research checkpoint unless a compatible released compiler is independently verified. Do not add unsupported syntax to normal compilation. Preview flags belong only to isolated exercises.

Branches use feature/, fix/, refactor/, docs/, test/, build/, ci/ or chore/ with lowercase hyphenated descriptions. Never include an assistant or tool identity. Commits use a Type: imperative header, a concise reason and Key changes include: bullets. Do not create remotes or publish implicitly.
