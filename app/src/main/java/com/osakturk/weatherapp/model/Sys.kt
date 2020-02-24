package com.osakturk.weatherapp.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "sys")
class Sys(
    @SerializedName("type")
    val sys: Int,

    @SerializedName("message")
    val message: Double,

    @SerializedName("id")
    val sys_id: Long,

    @SerializedName("country")
    val country: String,

    @SerializedName("sunrise")
    val sunrise: Long,

    @SerializedName("sunset")
    val sunset: Long
)
