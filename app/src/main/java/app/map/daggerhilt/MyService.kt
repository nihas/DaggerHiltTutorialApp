package app.map.daggerhilt

import android.app.Service
import android.content.Intent
import android.os.IBinder
import app.map.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject

class MyService: Service() {

    //In Service no constructor allowed. so this inject annotation will take care of injection
    @Inject
    lateinit var myRepository: MyRepository

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}