package com.osakturk.weatherapp.repository

import com.osakturk.weatherapp.db.WeatherDao
import com.osakturk.weatherapp.model.WeatherEntity
import javax.inject.Inject

class WeatherLocalRepository @Inject constructor(private val weatherDao: WeatherDao){

    fun getWeatherModel(): WeatherEntity {
        return weatherDao.getAllWeathers()
    }

    suspend fun insertWeather(weatherEntity: WeatherEntity) {
        weatherDao.insertWeather(weatherEntity)
    }
}