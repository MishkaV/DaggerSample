package io.mishkav.daggersample.di.core

fun interface ApiProvider {
    fun get(): Api
}