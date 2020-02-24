package com.osakturk.weatherapp.model

import com.google.gson.annotations.SerializedName

class Wind (
    @SerializedName("speed")
    val speed: Double,
    @SerializedName("deg")
    val deg: Int
)
