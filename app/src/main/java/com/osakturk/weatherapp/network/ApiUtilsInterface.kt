package com.osakturk.weatherapp.network

import com.osakturk.weatherapp.model.WeatherEntity
import com.osakturk.weatherapp.util.DataHolder
import io.reactivex.Flowable

interface ApiUtilsInterface {
    fun getWeatherData(location: String, appId: String) : Flowable<DataHolder<WeatherEntity>>
}