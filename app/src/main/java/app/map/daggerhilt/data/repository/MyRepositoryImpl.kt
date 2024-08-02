package app.map.daggerhilt.data.repository

import android.app.Application
import app.map.daggerhilt.data.remote.MyApi
import app.map.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {
    override suspend fun doNetworkCall() {
        //We have to write Api call Which comes from MyApi class?
        //So we will add so called modules to pass the constructor injection
    }
}