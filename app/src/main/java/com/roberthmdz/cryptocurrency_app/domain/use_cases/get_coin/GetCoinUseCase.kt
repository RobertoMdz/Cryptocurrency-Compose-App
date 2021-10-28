package com.roberthmdz.cryptocurrency_app.domain.use_cases.get_coin

import com.roberthmdz.cryptocurrency_app.common.Resource
import com.roberthmdz.cryptocurrency_app.domain.entities.CoinDetail
import com.roberthmdz.cryptocurrency_app.domain.repository.CoinRepository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
            emit(Resource.Loading())
            emit(repository.getCoin(coinId))
    }
}