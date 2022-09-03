package io.mishkav.daggersample.di.core

import javax.inject.Inject

class ApiResolver @Inject constructor(
    private val apiFactories: Map<Class<out Api>, @JvmSuppressWildcards ApiProvider>
) {

    private fun <T : Api> getProvider(cls: Class<T>): ApiProvider =
        apiFactories[cls] ?: throw RuntimeException("Not found provider for class $cls")

    @Suppress("UNCHECKED_CAST")
    fun <T : Api> getApi(cls: Class<T>): T = getProvider(cls).get() as T
}
