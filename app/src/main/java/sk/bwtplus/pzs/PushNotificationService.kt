package sk.bwtplus.pzs

import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import sk.bwtplus.pzs.message.ChatState
import java.time.LocalDate

class PushNotificationService: FirebaseMessagingService() {

    var state by mutableStateOf(ChatState())
        private set

    override fun onNewToken(token: String) {
        super.onNewToken(token)

        // Update server
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        if (message.notification != null) {
            val notification = NotificationBody(
                message.notification!!.title.orEmpty(),
                body = message.notification!!.body.orEmpty()
            )
            //time = LocalDate.now())
            state = state.copy(
                incomingNotifications = state.incomingNotifications + notification
            )
        }
        // Respond to received messages
    }
}