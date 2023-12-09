package com.example.project_hotel.data.dataSource.modul

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.project_hotel.data.model.AboutTheHotel
import com.example.project_hotel.data.model.Hotel
import java.io.Serializable

@Entity(tableName = Hotels.TABLE_NAME)
data class Hotels(
    val aboutTheHotel: AboutTheHotel?,
    val address: String?,
    @PrimaryKey val id: Int?,
    val imageUrls: List<String> = emptyList(),
    val minimalPrice: Int?,
    val name: String?,
    val priceForIt: String?,
    val rating: Int?,
    val ratingName: String?
) : Serializable {
    companion object {
        const val TABLE_NAME = "hotels"
    }
}

fun Hotel.mapToHotels() = Hotels(
    aboutTheHotel = this.aboutTheHotel,
    address = this.adress,
    id = this.id,
    imageUrls = (this.imageUrls ?: emptyList()) as List<String>,
    minimalPrice = this.minimalPrice,
    name = this.name,
    priceForIt = this.priceForIt,
    rating = this.rating,
    ratingName = this.ratingName
)