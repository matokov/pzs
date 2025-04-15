package sk.bwtplus.pzs.message

import retrofit2.http.Body
import retrofit2.http.POST
import sk.bwtplus.pzs.SendMessageDto

interface FcmApi {

    @POST("/send")
    suspend fun sendMessage(
        @Body body: SendMessageDto
    )

    @POST("/broadcast")
    suspend fun broadcast(
        @Body body: SendMessageDto
    )
}