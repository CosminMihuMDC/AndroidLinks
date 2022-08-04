package ro.mdc_software.androidlinks.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text

private const val TAG = "SimpleDeepLinkActivity"

class SimpleDeepLinkActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val deepLink = intent.data
        val deviceId = deepLink?.getQueryParameter("deviceId")
        val appId = deepLink?.getQueryParameter("appId")

        setContent {
            Column {
                Text(TAG)
                Text("deepLink = $deepLink")
                Text("deviceId = $deviceId")
                Text("appId = $appId")
            }
        }
    }
}