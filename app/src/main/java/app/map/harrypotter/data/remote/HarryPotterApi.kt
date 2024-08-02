package app.map.harrypotter.data.remote

import retrofit2.http.GET

interface HarryPotterApi {

    @GET("test")
    suspend fun doNetworkCall()
}