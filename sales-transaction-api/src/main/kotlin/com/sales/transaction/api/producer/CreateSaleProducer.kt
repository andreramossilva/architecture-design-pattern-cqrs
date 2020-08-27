package com.sales.transaction.api.producer

import com.sales.transaction.api.producer.command.Command
import com.sales.transaction.api.producer.command.CommandEnum
import com.sales.transaction.api.producer.command.Sale
import com.sales.transaction.api.resource.SaleRequest
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class CreateSaleProducer(private val kafkaTemplate: KafkaTemplate<String, Command>) {

    fun send(saleRequest: SaleRequest) {
        kafkaTemplate.send("sale_topic", saleRequest.userId.toString(), getCommand(saleRequest))
    }

    private fun getCommand(saleRequest: SaleRequest) =
            Command(
                    sale = Sale(
                            productId = saleRequest.productId,
                            addressId = saleRequest.addressId,
                            userId = saleRequest.userId
                    ),
                    command = CommandEnum.CREATE
            )

}
