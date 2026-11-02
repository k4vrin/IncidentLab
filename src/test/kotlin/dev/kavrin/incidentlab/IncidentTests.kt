package dev.kavrin.incidentlab

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotSame

class IncidentTests {

    @Test
    fun `an open incident starts investigation without changing the original`() {
        val original = Incident("Example failure", IncidentStatus.OPEN, "Sara")

        val result = startInvestigation(original)

        assertEquals(Incident("Example failure", IncidentStatus.INVESTIGATING, "Sara"), result)
        assertEquals(IncidentStatus.OPEN, original.status)
        assertNotSame(original, result)
    }

    @Test
    fun `a resolved incident can restart investigation`() {
        val original = Incident("Example failure", IncidentStatus.RESOLVED, "Sara")

        val result = startInvestigation(original)

        assertEquals(IncidentStatus.INVESTIGATING, result.status)
        assertEquals(IncidentStatus.RESOLVED, original.status)
    }

    @Test
    fun `investigating and closed incidents reject investigation even with a responder`() {
        for (status in listOf(IncidentStatus.INVESTIGATING, IncidentStatus.CLOSED)) {
            val incident = Incident("Example failure", status, "Sara")

            val failure = assertFailsWith<IllegalArgumentException> {
                startInvestigation(incident)
            }

            assertEquals("Only an open or resolved incident can start investigation", failure.message)
        }
    }

    @Test
    fun `both allowed statuses still require a responder`() {
        for (status in listOf(IncidentStatus.OPEN, IncidentStatus.RESOLVED)) {
            val incident = Incident("Example failure", status, null)

            val failure = assertFailsWith<IllegalArgumentException> {
                startInvestigation(incident)
            }

            assertEquals("A responder must be assigned", failure.message)
        }
    }
}
