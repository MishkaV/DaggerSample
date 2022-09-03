package io.mishkav.daggersample.logger

import io.mishkav.daggersample.logger.Logger

interface LoggerFactory {

    fun create(tag: String): Logger
}