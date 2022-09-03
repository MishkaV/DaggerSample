package io.mishkav.daggersample.logger

import android.util.Log
import io.mishkav.daggersample.logger.Logger

class LoggerImpl(tag: String) : Logger {
    private val APK_HUB_TAG = "APK-HUB: $tag"

    override fun d(message: String): Int = Log.d(APK_HUB_TAG, message)

    override fun e(message: String): Int = Log.e(APK_HUB_TAG, message)

    override fun i(message: String): Int = Log.i(APK_HUB_TAG, message)

    override fun v(message: String): Int = Log.v(APK_HUB_TAG, message)

    override fun w(message: String): Int = Log.w(APK_HUB_TAG, message)
}
