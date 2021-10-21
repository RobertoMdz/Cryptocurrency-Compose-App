package com.roberthmdz.cryptocurrency_app.presentation.coin_list

import com.roberthmdz.cryptocurrency_app.domain.entities.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
