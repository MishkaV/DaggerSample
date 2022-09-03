package io.mishkav.daggersample

import android.app.Application
import io.mishkav.daggersample.di.installApis

class DaggerSampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        installApis()
    }
}