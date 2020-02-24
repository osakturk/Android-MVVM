package com.osakturk.weatherapp.model.converters

import androidx.room.TypeConverter
import com.osakturk.weatherapp.model.Main
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainConverter {
//    @TypeConverter
//    fun fromStringMain(main: Main):String?{
//        main?.let {
//            val gson = Gson()
//            val type = object : TypeToken<Main>(){
//
//            }.type
//
//            return gson.toJson(main,type)
//        }
//    }
//
//    @TypeConverter
//    fun toMain(main:String): Sys?{
//        if (main.isNullOrBlank()){
//            return null
//        }
//
//        val gson = Gson()
//        val type = object : TypeToken<Main>(){
//
//        }.type
//
//        return gson.fromJson(main,type)
//    }

    @TypeConverter
    fun fromString(value: String): Main {
        val type = object: TypeToken<Main>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromMain(main: Main): String {
        val type = object: TypeToken<Main>() {}.type
        return Gson().toJson(main, type)
    }
}