# IL00 guided exercise evidence

Date: 2 November 2026, Asia/Tehran.

Status: partial, guided and assisted. IL00 acceptance remains open.

## Attempt and correction

The learner wrote the OPEN status check and copy operation in chat. The responder check initially used `ncident.responder.isNotNull`; guidance corrected the typo and used `incident.responder != null`. The learner initially predicted the responder error when both checks failed. Guidance explained that the first failed `require` throws immediately. The learner correctly predicted a new incident when both checks passed.

For the changed case, the learner correctly extended the status condition with `||` to allow RESOLVED. Guidance clarified that an existing test expecting rejection would fail until its expectation changed to a successful transition. This is an exercise variation of the original OPEN-only rule.

At the learner's request, the assistant added the model and function to `src/main/kotlin/dev/kavrin/incidentlab/Incident.kt`. The assistant then added `IncidentTests.kt` with checks for successful OPEN and RESOLVED transitions, preservation of the original, rejection of INVESTIGATING/CLOSED, and rejection of a missing responder for both allowed statuses.

## Observed verification

- `./gradlew compileKotlin --console=plain`: BUILD SUCCESSFUL after adding the implementation.
- `./gradlew test --tests dev.kavrin.incidentlab.IncidentTests --console=plain`: BUILD SUCCESSFUL; 4 tests, 0 failures, 0 errors, 0 skipped.
- `git diff --check`: passed.
- Pre-publication `./gradlew check --console=plain`: BUILD SUCCESSFUL; all 5 portable tests passed, including 4 incident tests and 1 application health test.

The narrow test command ran the incident tests only; the later check also ran the existing MockMvc health test. No database or live-server health verification was performed for this exercise.

## Remaining acceptance

The learner reviewed the RESOLVED test and exception assertions with guidance, then correctly predicted that a whitespace-only responder would fail a proposed `!isNullOrBlank()` check. The difference between empty and blank strings was explained. This stronger check is discussed only; the implementation still rejects null alone.

The complete report/assign/investigate/resolve/close sketch remains open. No independent implementation or independent variation has been demonstrated. Retained performance has not been assessed. The next step is to replace the null-only responder check with `!isNullOrBlank()` and add empty/whitespace rejection tests. Product questions should remain minimal; use fixed fictional rules and focus on Kotlin and tests.
