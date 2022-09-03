package io.mishkav.daggersample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.mishkav.daggersample.ui.theme.DaggerSampleTheme
import io.mishkav.daggersample.di.core.api
import io.mishkav.daggersample.logger.di.LoggerFactoryApi

class MainActivity : ComponentActivity() {

    private val loggerFactory by api(LoggerFactoryApi::loggerFactory)
    private val logger by lazy { loggerFactory.create(this::class.java.simpleName) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        logger.d("IT'S WORKING!!!")

        setContent {
            DaggerSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DaggerSampleTheme {
        Greeting("Android")
    }
}