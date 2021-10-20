package com.roberthmdz.cryptocurrency_app.domain.repository

import com.roberthmdz.cryptocurrency_app.domain.entities.Coin
import com.roberthmdz.cryptocurrency_app.domain.entities.CoinDetail

interface CoinRepository {

    suspend fun getCoins(): List<Coin>
    suspend fun getCoin(coinId: String): CoinDetail

}