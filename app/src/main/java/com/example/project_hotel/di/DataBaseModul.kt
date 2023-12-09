package com.example.project_hotel.di

import android.app.Application
import com.example.project_hotel.data.dataSource.HotelDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule{

    @Singleton
    @Provides
    fun provideDataBase(application: Application) = HotelDataBase.getDataBase(application)

    @Singleton
    @Provides
    fun provideHotelsDao(dataBase: HotelDataBase) =
        dataBase.getHotelsDao()

}