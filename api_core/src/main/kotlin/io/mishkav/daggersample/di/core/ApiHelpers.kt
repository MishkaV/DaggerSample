package io.mishkav.daggersample.di.core

inline fun <T, reified A : Api> api(crossinline getter: (A) -> T): Lazy<T> = lazy { getter(getApi()) }

fun <T : Api> getApi(cls: Class<T>): T = ApiRegistry.getApi(cls)

inline fun <reified T : Api> getApi(): T = getApi(T::class.java)