package com.secretdialer.app.activities

import android.os.Bundle
import org.fossify.commons.extensions.viewBinding
import org.fossify.commons.helpers.NavigationIcon
import com.secretdialer.app.adapters.ConferenceCallsAdapter
import com.secretdialer.app.databinding.ActivityConferenceBinding
import com.secretdialer.app.helpers.CallManager

class ConferenceActivity : SimpleActivity() {
    private val binding by viewBinding(ActivityConferenceBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            setupEdgeToEdge(padBottomSystem = listOf(conferenceList))
            setupMaterialScrollListener(binding.conferenceList, binding.conferenceAppbar)
            conferenceList.adapter = ConferenceCallsAdapter(this@ConferenceActivity, conferenceList, ArrayList(CallManager.getConferenceCalls())) {}
        }
    }

    override fun onResume() {
        super.onResume()
        setupTopAppBar(binding.conferenceAppbar, NavigationIcon.Arrow)
    }
}
