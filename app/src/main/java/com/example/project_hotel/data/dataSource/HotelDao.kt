package com.example.project_hotel.data.dataSource

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.project_hotel.data.model.Hotel

interface HotelDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addHotels(hotels: List<Hotel>)

}