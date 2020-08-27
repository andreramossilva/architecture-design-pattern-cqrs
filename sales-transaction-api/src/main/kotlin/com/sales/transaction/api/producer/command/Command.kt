package com.sales.transaction.api.producer.command

data class Command(
        val sale: Sale,
        val command: CommandEnum
)