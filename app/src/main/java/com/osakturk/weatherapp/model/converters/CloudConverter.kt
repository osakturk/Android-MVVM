package com.osakturk.weatherapp.model.converters

import androidx.room.TypeConverter
import com.osakturk.weatherapp.model.Cloud
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CloudConverter {
//    @TypeConverter
//    fun fromStringCloud(cloud: Cloud):String?{
//        cloud.let {
//            val gson = Gson()
//            val type = object : TypeToken<Cloud>(){
//
//            }.type
//
//            return gson.toJson(cloud,type)
//        }
//    }
//
//    @TypeConverter
//    fun toCloud(cloud:String): Sys?{
//        if (cloud.isNullOrBlank()){
//            return null
//        }
//
//        val gson = Gson()
//        val type = object : TypeToken<Cloud>(){
//
//        }.type
//
//        return gson.fromJson(cloud,type)
//    }

    @TypeConverter
    fun fromString(value: String): Cloud {
        val type = object: TypeToken<Cloud>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromCloud(cloud: Cloud): String {
        val type = object: TypeToken<Cloud>() {}.type
        return Gson().toJson(cloud, type)
    }
}