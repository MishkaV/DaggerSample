package io.mishkav.daggersample.logger.di

import dagger.Component

@Component(
    modules = [LoggerFactoryModule::class]
)
interface LoggerFactoryComponent : LoggerFactoryApi {
    companion object {
        fun create(): LoggerFactoryApi = DaggerLoggerFactoryComponent.builder().build()
    }
}