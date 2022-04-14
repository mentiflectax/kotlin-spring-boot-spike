package com.dpisarenko.kotlinspringbootspike

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootSpikeApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootSpikeApplication>(*args)
}
