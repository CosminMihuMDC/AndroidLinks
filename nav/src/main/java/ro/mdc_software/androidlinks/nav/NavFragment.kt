package ro.mdc_software.androidlinks.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

private const val TAG = "NavDeepLinkActivity"

class NavFragment : Fragment() {

    private val args: NavFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = ComposeView(requireContext())

        view.setContent {
            val deviceId = args.deviceId
            val appId = args.appId

            Column {
                Text(TAG)
                Text("deviceId = $deviceId")
                Text("appId = $appId")
            }
        }

        return view
    }
}