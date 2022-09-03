package io.mishkav.daggersample.di.core

object ApiRegistry {

    private var apiResolver: ApiResolver? = null

    fun <T : Api> getApi(cls: Class<T>): T = apiResolver?.getApi(cls) ?: throw Exception("Resolver is not installed")

    fun init(newApiResolver: ApiResolver) {
        apiResolver = newApiResolver
    }
}
