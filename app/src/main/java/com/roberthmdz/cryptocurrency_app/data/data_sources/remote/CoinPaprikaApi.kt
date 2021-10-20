package com.roberthmdz.cryptocurrency_app.data.data_sources.remote

import com.roberthmdz.cryptocurrency_app.data.models.CoinDetailModel
import com.roberthmdz.cryptocurrency_app.data.models.CoinModel
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinModel>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailModel

}