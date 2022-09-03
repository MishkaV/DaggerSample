package io.mishkav.daggersample.di

import android.content.Context
import dagger.Component
import io.mishkav.daggersample.di.core.ApiRegistry
import io.mishkav.daggersample.di.core.ApiResolver
import io.mishkav.daggersample.logger.di.LoggerApiProviderModule

@Component(
    modules = [
        LoggerApiProviderModule::class
    ]
)
interface AppComponent {

    val apiResolver: ApiResolver
}

fun Context.installApis(): AppComponent =
    DaggerAppComponent
        .builder()
        .build()
        .also {
            ApiRegistry.init(it.apiResolver)
        }