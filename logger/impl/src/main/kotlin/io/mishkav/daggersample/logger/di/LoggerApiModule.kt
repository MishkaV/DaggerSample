package io.mishkav.daggersample.logger.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import io.mishkav.daggersample.di.core.ApiKey
import io.mishkav.daggersample.di.core.ApiProvider

@Module
object LoggerApiProviderModule {

    @Provides
    @IntoMap
    @ApiKey(LoggerFactoryApi::class)
    fun providesLoggerFactoryApiProvider() =  ApiProvider { LoggerFactoryComponent.create() }
}