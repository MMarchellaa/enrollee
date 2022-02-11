package com.mihalkovich.enrollee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EnrolleeApplication

fun main(args: Array<String>) {
    runApplication<EnrolleeApplication>(*args)
}
