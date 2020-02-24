package com.osakturk.weatherapp.model

import com.google.gson.annotations.SerializedName

class Coordination (
    @SerializedName("lon")
    val longtitude: Double,

    @SerializedName("lat")
    val latitude: Double
)
