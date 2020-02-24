package com.osakturk.weatherapp.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "weather")
class Weather (
    @SerializedName("id")
    val weather_id: Long,

    @SerializedName("main")
    val main: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("icon")
    val icon: String
)
