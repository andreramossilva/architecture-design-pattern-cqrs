package com.sales.transaction.api.producer

import com.sales.transaction.api.resource.SaleRequest
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class CreateSaleProducer(private val kafkaTemplate: KafkaTemplate<String, SaleRequest>) {

    fun send(saleRequest: SaleRequest) {
        kafkaTemplate.send("topic", saleRequest)
    }

}
