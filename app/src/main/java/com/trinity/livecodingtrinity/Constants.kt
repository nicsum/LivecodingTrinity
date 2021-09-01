package com.trinity.livecodingtrinity

object Constants {
    const val BASE_API_ENDPOINT = "http://api.love-letters.dev.trinitydigital.ru"

    private const val API_PREFIX = "api"
    const val ANY_API_ENDPOINT = "$BASE_API_ENDPOINT/$API_PREFIX/"

    const val AUTH_API_ENDPOINT = BASE_API_ENDPOINT

    // headers
    const val AUTH_HEADER_NAME = "Authorization"

    const val AUTH_HEADER_KEY_TYPE = "bearer"

}