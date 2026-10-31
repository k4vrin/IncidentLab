# IncidentLab brief and scope

The goal is idiomatic Kotlin/JVM and Spring Boot 4 proficiency. Incidents are a small teaching domain. Implement only enough behavior to make the current concept observable.

Minimal model: incident ID, title, description, severity, optional responder, status, timestamps/version and separate events. Suggested lifecycle: OPEN → INVESTIGATING → RESOLVED → CLOSED. Assignment is separate; investigation requires a responder. These are exercise defaults, not a product specification. Diagnostics use deterministic fakes and produce advisory results.

The first application slice reports and retrieves an incident. Later slices demonstrate typed outcomes, persistence, transactions, concurrent diagnostics and progress streams. Do not expand into escalation schedules, policy administration, real telemetry, multitenancy, UI or distributed workflow infrastructure.

MVC is the baseline. Functional routing, annotated synchronous MVC and annotated suspend MVC have distinct method/path owners during comparisons. No coRouter in MVC. Keep ordinary JDBC transactions synchronous; no external or suspended work inside them. Add optional frameworks only at named exercises. Preserve a working application while isolating JPA, serialization, ABI and preview experiments.

Initial dependencies: MVC, validation, Actuator, Kotlin reflection and Jackson Kotlin. PostgreSQL/Flyway/Testcontainers arrive at IL02; coroutines at IL21. AI and AOT are optional comparison exercises, never product requirements.
