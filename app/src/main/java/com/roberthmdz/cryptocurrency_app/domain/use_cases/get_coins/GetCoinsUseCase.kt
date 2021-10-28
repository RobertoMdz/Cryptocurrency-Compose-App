package com.roberthmdz.cryptocurrency_app.domain.use_cases.get_coins

import com.roberthmdz.cryptocurrency_app.common.Resource
import com.roberthmdz.cryptocurrency_app.domain.entities.Coin
import com.roberthmdz.cryptocurrency_app.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
            emit(Resource.Loading<List<Coin>>())
            emit(repository.getCoins())
    }
}