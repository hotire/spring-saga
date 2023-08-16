package com.github.hotire.spring.saga

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringSagaApplication

fun main(args: Array<String>) {
    runApplication<SpringSagaApplication>(*args)
}
