package com.example.project_hotel.data.dataSource.converter

import androidx.room.TypeConverter
import com.example.project_hotel.data.dataSource.modul.Hotels
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

class HotelsTypeConverter {

    @TypeConverter
    fun fromStringToMoviesList(data: String): List<Hotels> {
        val listType = object : TypeToken<ArrayList<Hotels>>() {}.type
        return GsonBuilder().create().fromJson(data, listType)
    }

    @TypeConverter
    fun fromNewsListTypeToString(breed: ArrayList<Hotels>): String {
        return GsonBuilder().create().toJson(breed)
    }

}