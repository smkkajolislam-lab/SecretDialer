package com.secretdialer.app.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.secretdialer.app.activities.CallActivity
import com.secretdialer.app.helpers.ACCEPT_CALL
import com.secretdialer.app.helpers.CallManager
import com.secretdialer.app.helpers.DECLINE_CALL

class CallActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            ACCEPT_CALL -> {
                context.startActivity(CallActivity.getStartIntent(context))
                CallManager.accept()
            }

            DECLINE_CALL -> CallManager.reject()
        }
    }
}
