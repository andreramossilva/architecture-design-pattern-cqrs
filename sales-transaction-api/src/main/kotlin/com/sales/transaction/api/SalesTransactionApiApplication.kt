package com.sales.transaction.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafkaStreams

@SpringBootApplication
class SalesTransactionApiApplication

fun main(args: Array<String>) {
	runApplication<SalesTransactionApiApplication>(*args)
}
