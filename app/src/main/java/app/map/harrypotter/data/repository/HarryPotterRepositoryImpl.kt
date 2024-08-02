package app.map.harrypotter.data.repository

import android.app.Application
import app.map.harrypotter.data.remote.HarryPotterApi
import app.map.harrypotter.domain.repository.HarryPotterRepository

class HarryPotterRepositoryImpl(
    private val api: HarryPotterApi,
    private val appContext: Application
): HarryPotterRepository {
    override suspend fun doNetworkCall() {
        //We have to write Api call Which comes from HarryPotter Api class?
        //So we will add so called modules to pass the constructor injection
    }
}