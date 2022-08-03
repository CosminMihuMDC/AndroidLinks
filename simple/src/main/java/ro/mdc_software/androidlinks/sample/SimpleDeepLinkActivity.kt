package ro.mdc_software.androidlinks.sample

import android.os.Bundle
import androidx.activity.ComponentActivity

private const val TAG = "SimpleDeepLinkActivity"

class SimpleDeepLinkActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val deepLink = intent.data
        val deviceId = deepLink?.getQueryParameter("deviceId")
        val appId = deepLink?.getQueryParameter("appId")

        println("$TAG: deviceId = $deviceId")
        println("$TAG: appId = $appId")
    }
}