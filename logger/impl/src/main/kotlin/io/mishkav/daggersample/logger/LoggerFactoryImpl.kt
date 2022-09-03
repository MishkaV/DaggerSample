package io.mishkav.daggersample.logger

class LoggerFactoryImpl : LoggerFactory {
    override fun create(tag: String): Logger = LoggerImpl(tag)
}