package com.osakturk.weatherapp.model

import androidx.room.*
import com.google.gson.annotations.SerializedName


@Entity(tableName = "weathers")
class WeatherEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    val id: Long,

    @ColumnInfo(name = "cod")
    @SerializedName("cod")
    val cod: Int,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val location: String,

    @ColumnInfo(name = "dt")
    @SerializedName("dt")
    val dateTime: Long,

    @ColumnInfo(name = "visibility")
    @SerializedName("visibility")
    val visibility: Long,

    @ColumnInfo(name = "base")
    @SerializedName("base")
    val base: String,

    @ColumnInfo(name = "sys")
    @SerializedName("sys")
    val sys: Sys?,

    @ColumnInfo(name = "clouds")
    @SerializedName("clouds")
    val cloud: Cloud?,

    @ColumnInfo(name = "wind")
    @SerializedName("wind")
    val wind: Wind?,

    @ColumnInfo(name = "main")
    @SerializedName("main")
    val main: Main?,

    @ColumnInfo(name = "weather")
    @SerializedName("weather")
    val weather: List<Weather?>,

    @ColumnInfo(name = "coord")
    @SerializedName("coord")
    val coordination: Coordination?
)