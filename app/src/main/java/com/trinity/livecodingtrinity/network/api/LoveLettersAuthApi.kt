package com.trinity.livecodingtrinity.network.api

import com.trinity.livecodingtrinity.network.models.AccessToken
import com.trinity.livecodingtrinity.Constants.AUTH_HEADER_NAME
import retrofit2.Call
import retrofit2.http.*

data class UUID(val uuid: String)

interface LoveLettersAuthApi {

    @GET("auth/refresh")
    fun refreshAccessToken(@Header(AUTH_HEADER_NAME) authHeader: String): Call<AccessToken>

    @POST("auth/login")
    suspend fun loginByUUID(@Body uuid: UUID): AccessToken

    @POST("auth/login")
    fun callLoginByUUID(@Body uuid: UUID): Call<AccessToken>
}