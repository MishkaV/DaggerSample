package io.mishkav.daggersample.logger.di

import dagger.Module
import dagger.Provides
import io.mishkav.daggersample.logger.LoggerFactory
import io.mishkav.daggersample.logger.LoggerFactoryImpl

@Module
class LoggerFactoryModule {

    @Provides
    fun provideLoggerFactory(): LoggerFactory = LoggerFactoryImpl()
}