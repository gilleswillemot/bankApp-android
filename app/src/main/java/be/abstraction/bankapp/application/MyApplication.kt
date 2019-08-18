package be.abstraction.bankapp.application

import android.app.Application
import assemblers.bankProviderModule
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // your modules
            modules(bankProviderModule)
        }
    }
 }