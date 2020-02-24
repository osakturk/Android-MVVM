package com.osakturk.weatherapp.model.converters

import androidx.room.TypeConverter
import com.osakturk.weatherapp.model.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {
    @TypeConverter
    fun fromStringCoordination(value: String): Coordination {
        val type = object : TypeToken<Coordination>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromCoordination(coordination: Coordination): String {
        val type = object : TypeToken<Coordination>() {}.type
        return Gson().toJson(coordination, type)
    }

    @TypeConverter
    fun fromStringCloud(value: String): Cloud {
        val type = object: TypeToken<Cloud>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromCloud(cloud: Cloud): String {
        val type = object: TypeToken<Cloud>() {}.type
        return Gson().toJson(cloud, type)
    }

    @TypeConverter
    fun fromStringWeatherList(value: String): List<Weather> {
        val type = object: TypeToken<List<Weather>>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromArrayList(list: List<Weather>): String {
        val type = object: TypeToken<List<Weather>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun fromStringMain(value: String): Main {
        val type = object: TypeToken<Main>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromMain(main: Main): String {
        val type = object: TypeToken<Main>() {}.type
        return Gson().toJson(main, type)
    }

    @TypeConverter
    fun fromStringSys(value: String): Sys {
        val type = object: TypeToken<Sys>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromSys(sys: Sys): String {
        val type = object: TypeToken<Sys>() {}.type
        return Gson().toJson(sys, type)
    }

    @TypeConverter
    fun fromStringWind(value: String): Wind {
        val type = object: TypeToken<Wind>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromWind(wind: Wind): String {
        val type = object: TypeToken<Wind>() {}.type
        return Gson().toJson(wind, type)
    }
}