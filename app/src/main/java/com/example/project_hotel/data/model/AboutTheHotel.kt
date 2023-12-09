package com.example.project_hotel.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AboutTheHotel(
    @SerializedName("description")
    val description: String?,
    @SerializedName("peculiarities")
    val peculiarities: List<String?>?
) : Serializable