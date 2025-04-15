package sk.bwtplus.pzs

import java.time.LocalDate
import java.util.Date

data class SendMessageDto(
    val to: String?,
    val notification: NotificationBody
)

data class NotificationBody(
    val title: String,
    val body: String
    //val time: LocalDate
)
