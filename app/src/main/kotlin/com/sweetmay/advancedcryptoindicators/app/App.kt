package com.sweetmay.advancedcryptoindicators.app

import android.app.Application
import com.sweetmay.advancedcryptoindicators.data.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {

    private var instance: App? = null

    override fun onCreate() {
        super.onCreate()
        instance = this

        startKoin {
            androidContext(this@App)
            androidLogger(Level.ERROR)
            modules(appModule + dataModule)
        }
    }

    fun getInstance() = instance
}