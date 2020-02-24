package com.osakturk.weatherapp.model.converters

import androidx.room.TypeConverter
import com.osakturk.weatherapp.model.Coordination
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CoordinationConverter {
    //    @TypeConverter
//    fun fromStringCoordination(coordination: Coordination):String?{
//        coordination.let {
//            val gson = Gson()
//            val type = object : TypeToken<Coordination>(){
//
//            }.type
//
//            return gson.toJson(coordination,type)
//        }
//    }
//
//    @TypeConverter
//    fun toCoordination(coordination:String): Sys?{
//        if (coordination.isNullOrBlank()){
//            return null
//        }
//
//        val gson = Gson()
//        val type = object : TypeToken<Cloud>(){
//
//        }.type
//
//        return gson.fromJson(coordination,type)
//    }
    @TypeConverter
    fun fromString(value: String): Coordination {
        val type = object : TypeToken<Coordination>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromCoordination(coordination: Coordination): String {
        val type = object : TypeToken<Coordination>() {}.type
        return Gson().toJson(coordination, type)
    }
}