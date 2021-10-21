package com.roberthmdz.cryptocurrency_app.data.repository

import com.roberthmdz.cryptocurrency_app.data.data_sources.remote.CoinPaprikaApi
import com.roberthmdz.cryptocurrency_app.data.models.toCoin
import com.roberthmdz.cryptocurrency_app.data.models.toCoinDetail
import com.roberthmdz.cryptocurrency_app.domain.entities.Coin
import com.roberthmdz.cryptocurrency_app.domain.entities.CoinDetail
import com.roberthmdz.cryptocurrency_app.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCoin(coinId: String): CoinDetail {
        return api.getCoinById(coinId).toCoinDetail()
    }
}