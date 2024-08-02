package app.map.harrypotter.domain.repository

interface HarryPotterRepository {
    suspend fun doNetworkCall()
}