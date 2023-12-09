package com.example.project_hotel.domain

import com.example.project_hotel.data.dataSource.HotelDao
import com.example.project_hotel.data.repository.HotelRepository
import javax.inject.Inject

class GetHotelUseCase @Inject constructor (
    private val repository: HotelRepository,
    private val hotelsDao: HotelDao,
    private val dispatcher: DispatchersProvider
) {
}