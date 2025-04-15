package sk.bwtplus.pzs.message
import sk.bwtplus.pzs.NotificationBody
import kotlin.collections.listOf

data class ChatState(
    val isEnteringToken: Boolean = true,
    val remoteToken: String = "",
    val messageText: String = "",
    val incomingNotifications: List<NotificationBody> = listOf()
)
