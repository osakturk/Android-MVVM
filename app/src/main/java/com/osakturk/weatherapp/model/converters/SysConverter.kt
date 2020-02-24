package com.osakturk.weatherapp.model.converters

import androidx.room.TypeConverter
import com.osakturk.weatherapp.model.Sys
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class SysConverter {
//    @TypeConverter
//    fun fromStringSys(sys:Sys):String?{
//        sys.let {
//            val gson = Gson()
//            val type = object : TypeToken<Sys>(){
//
//            }.type
//
//            return gson.toJson(sys,type)
//        }
//    }
//
//    @TypeConverter
//    fun toSys(sys:String): Sys? {
//        if (sys.isNullOrBlank()){
//            return null
//        }
//
//        val gson = Gson()
//        val type = object : TypeToken<Sys>(){
//
//        }.type
//
//        return gson.fromJson(sys,type)
//    }

    @TypeConverter
    fun fromString(value: String): Sys {
        val type = object: TypeToken<Sys>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromWind(sys: Sys): String {
        val type = object: TypeToken<Sys>() {}.type
        return Gson().toJson(sys, type)
    }
}