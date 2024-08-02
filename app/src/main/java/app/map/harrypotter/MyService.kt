package app.map.harrypotter

import android.app.Service
import android.content.Intent
import android.os.IBinder
import app.map.harrypotter.domain.repository.HarryPotterRepository
import javax.inject.Inject

class MyService: Service() {

    //In Service no constructor allowed. so this inject annotation will take care of injection
    @Inject
    lateinit var harryPotterRepository: HarryPotterRepository

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}