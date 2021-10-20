package com.roberthmdz.cryptocurrency_app.data.data_sources.remote

import retrofit2.http.GET

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins()

}