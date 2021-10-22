package com.roberthmdz.cryptocurrency_app.domain.entities

import com.roberthmdz.cryptocurrency_app.data.models.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>?,
    val team: List<TeamMember>?
)
