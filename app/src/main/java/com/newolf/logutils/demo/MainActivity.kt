package com.newolf.logutils.demo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.newolf.logutils.LogUtils
import com.newolf.logutils.demo.ui.theme.WolfLogTheme

class MainActivity : ComponentActivity() {
    companion object{
        const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WolfLogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

    }

    override fun onResume() {
        super.onResume()
        logInfo()
    }


    fun logInfo(){
        Log.e("wolf", "logInfo: ",Exception() )
        LogUtils.v(" LogUtils.v")
        LogUtils.d(" LogUtils.d")
        LogUtils.i(" LogUtils.i")
        LogUtils.w(" LogUtils.w")
        LogUtils.e(" LogUtils.e",Exception())


        LogUtils.vTag(TAG,"LogUtils.v and TAG  ")
        LogUtils.dTag(TAG,"LogUtils.v and TAG  ")
        LogUtils.iTag(TAG,"LogUtils.v and TAG  ")
        LogUtils.wTag(TAG,"LogUtils.v and TAG  ")
        LogUtils.eTag(TAG,"LogUtils.v and TAG  ")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WolfLogTheme {
        Greeting("Android")
    }
}