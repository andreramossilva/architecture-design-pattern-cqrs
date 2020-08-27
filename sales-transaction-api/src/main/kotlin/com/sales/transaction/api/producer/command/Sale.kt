package com.sales.transaction.api.producer.command

data class Sale(
        val productId: Int,
        val userId: Int,
        val addressId: Int
)