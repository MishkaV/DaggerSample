package io.mishkav.daggersample.logger

interface Logger {
    fun d(message: String): Int
    fun e(message: String): Int
    fun i(message: String): Int
    fun v(message: String): Int
    fun w(message: String): Int
}