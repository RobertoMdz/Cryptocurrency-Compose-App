package com.roberthmdz.cryptocurrency_app.domain.entities

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
