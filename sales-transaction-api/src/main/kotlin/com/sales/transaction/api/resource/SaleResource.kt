package com.sales.transaction.api.resource

import com.sales.transaction.api.producer.CreateSaleProducer
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sale")
class SaleResource(private val createSaleProducer: CreateSaleProducer) {

    @PostMapping
    fun create(@RequestBody saleRequest: SaleRequest): ResponseEntity<String> {
        createSaleProducer.send(saleRequest)
        return ResponseEntity.ok("")
    }

}