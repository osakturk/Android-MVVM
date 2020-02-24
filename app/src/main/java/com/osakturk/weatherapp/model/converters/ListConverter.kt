package com.osakturk.weatherapp.model.converters

import androidx.room.TypeConverter
import com.osakturk.weatherapp.model.Weather
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ListConverter {
    @TypeConverter
    fun fromString(value: String): List<Weather> {
        val type = object: TypeToken<List<Weather>>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromArrayList(list: List<Weather>): String {
        val type = object: TypeToken<List<Weather>>() {}.type
        return Gson().toJson(list, type)
    }
}