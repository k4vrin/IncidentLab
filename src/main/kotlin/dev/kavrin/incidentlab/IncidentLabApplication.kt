package dev.kavrin.incidentlab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IncidentLabApplication

fun main(args: Array<String>) {
	runApplication<IncidentLabApplication>(*args)
}
