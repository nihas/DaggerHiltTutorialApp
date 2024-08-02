package app.map.daggerhilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}