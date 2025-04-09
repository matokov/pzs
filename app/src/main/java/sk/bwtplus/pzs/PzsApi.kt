package sk.bwtplus.pzs

import retrofit2.http.Body
import retrofit2.http.POST

interface PzsApi {

    @POST("/send")
    suspend fun sendMessage(
        @Body body: SendMessageDto
    )

    @POST("/broadcast")
    suspend fun broadcast(
        @Body body: SendMessageDto
    )
}