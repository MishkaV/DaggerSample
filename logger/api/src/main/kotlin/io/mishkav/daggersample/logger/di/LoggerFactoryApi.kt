package io.mishkav.daggersample.logger.di

import io.mishkav.daggersample.di.core.Api
import io.mishkav.daggersample.logger.LoggerFactory

interface LoggerFactoryApi : Api {
    val loggerFactory: LoggerFactory
}