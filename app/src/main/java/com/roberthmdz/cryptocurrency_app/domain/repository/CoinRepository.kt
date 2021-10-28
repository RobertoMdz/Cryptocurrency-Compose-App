package com.roberthmdz.cryptocurrency_app.domain.repository

import com.roberthmdz.cryptocurrency_app.common.Resource
import com.roberthmdz.cryptocurrency_app.domain.entities.Coin
import com.roberthmdz.cryptocurrency_app.domain.entities.CoinDetail
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    suspend fun getCoins(): Resource<List<Coin>>
    suspend fun getCoin(coinId: String): CoinDetail

}