package com.slaviboy.features.weather.home.entities

import java.io.Serializable

data class Forecast24HoursItem(
    val time: Long = System.currentTimeMillis(),
    val temperature: Float = 20.2f,
    val weatherIconType: Int = 0,
    val windSpeed: Float = 13.4f
) : Serializable