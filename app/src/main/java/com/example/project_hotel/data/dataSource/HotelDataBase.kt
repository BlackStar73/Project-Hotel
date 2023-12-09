package com.example.project_hotel.data.dataSource

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.project_hotel.data.dataSource.converter.HotelsTypeConverter

@TypeConverters(HotelsTypeConverter::class)
abstract class HotelDataBase : RoomDatabase() {

    abstract fun getHotelsDao(): HotelDao

    companion object {
        @Volatile
        private var INSTANCE: HotelDataBase? = null

        fun getDataBase(context: Context) : HotelDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    HotelDataBase::class.java,
                    "hotels_database"
                ).allowMainThreadQueries().fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

}