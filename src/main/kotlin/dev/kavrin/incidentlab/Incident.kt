package dev.kavrin.incidentlab

enum class IncidentStatus {
    OPEN,
    INVESTIGATING,
    RESOLVED,
    CLOSED
}

data class Incident(
    val title: String,
    val status: IncidentStatus,
    val responder: String?
)

fun startInvestigation(incident: Incident): Incident {
    require(
        incident.status == IncidentStatus.OPEN ||
            incident.status == IncidentStatus.RESOLVED
    ) {
        "Only an open or resolved incident can start investigation"
    }

    require(incident.responder != null) {
        "A responder must be assigned"
    }

    return incident.copy(status = IncidentStatus.INVESTIGATING)
}
