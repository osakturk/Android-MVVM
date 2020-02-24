package com.osakturk.weatherapp.model

import com.google.gson.annotations.SerializedName

class Main(
    @SerializedName("temp")
    val temp: Double,

    @SerializedName("pressure")
    val pressure: Long,

    @SerializedName("humidity")
    val humidity: Int,

    @SerializedName("temp_min")
    val tempMin: Double,

    @SerializedName("temp_max")
    val tempMax: Double
)
