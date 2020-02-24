package com.osakturk.weatherapp.model.converters

import androidx.room.TypeConverter
import com.osakturk.weatherapp.model.Wind
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class WindConverter {
//    @TypeConverter
//    fun fromStringWind(wind: Wind):String?{
//        wind?.let {
//            val gson = Gson()
//            val type = object : TypeToken<Cloud>(){
//
//            }.type
//
//            return gson.toJson(wind,type)
//        }
//    }
//
//    @TypeConverter
//    fun toWind(wind:String): Sys?{
//        if (wind.isNullOrBlank()){
//            return null
//        }
//
//        val gson = Gson()
//        val type = object : TypeToken<Wind>(){
//
//        }.type
//
//        return gson.fromJson(wind,type)
//    }

    @TypeConverter
    fun fromString(value: String): Wind {
        val type = object: TypeToken<Wind>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromWind(wind: Wind): String {
        val type = object: TypeToken<Wind>() {}.type
        return Gson().toJson(wind, type)
    }
}