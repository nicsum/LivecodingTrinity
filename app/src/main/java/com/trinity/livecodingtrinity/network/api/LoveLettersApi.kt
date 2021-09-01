package com.trinity.livecodingtrinity.network.api

import com.trinity.livecodingtrinity.network.models.DataResponse
import com.trinity.livecodingtrinity.network.models.Payload
import com.trinity.livecodingtrinity.network.models.letters.LetterData
import retrofit2.http.GET


interface LoveLettersApi {

    @GET("letters/all")
    suspend fun getLetters(): DataResponse<Payload<List<LetterData>>>


}