package com.trinity.livecodingtrinity.network.models.letters

import com.google.gson.annotations.SerializedName

data class LetterData(
    val id: String,
    val author: String,
    val from: String?,
    val to: String,
    val year: Int,
    val description: String?,
    @SerializedName("label_image")
    val labelImageUrl: String?,
    @SerializedName("audio")
    val audioUrl:String,
    @SerializedName("city_id")
    val cityId: String,
    @SerializedName("user_uuid")
    val userUuid: String,
    val poi: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    val images: List<PhotoContentData>?
)


data class PhotoContentData(
    val order: Int,
    val src: String
)