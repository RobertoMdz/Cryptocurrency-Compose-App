package com.roberthmdz.cryptocurrency_app.data.repository

import com.roberthmdz.cryptocurrency_app.common.Resource
import com.roberthmdz.cryptocurrency_app.data.data_sources.remote.CoinPaprikaApi
import com.roberthmdz.cryptocurrency_app.data.models.toCoin
import com.roberthmdz.cryptocurrency_app.data.models.toCoinDetail
import com.roberthmdz.cryptocurrency_app.domain.entities.Coin
import com.roberthmdz.cryptocurrency_app.domain.entities.CoinDetail
import com.roberthmdz.cryptocurrency_app.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): Resource<List<Coin>> {
        return try {
            val coins = api.getCoins()
            Resource.Success(coins.map { it.toCoin() })
        } catch(e: HttpException) {
            Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occured")
        } catch(e: IOException) {
            Resource.Error<List<Coin>>("Couldn't reach server. Check your internet connection.")
        }
    }

    override suspend fun getCoin(coinId: String): CoinDetail {
        return api.getCoinById(coinId).toCoinDetail()
    }
}