package com.osakturk.weatherapp.repository

import com.osakturk.weatherapp.model.WeatherEntity
import com.osakturk.weatherapp.network.AbstractApiUtils
import com.osakturk.weatherapp.util.DataHolder
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

class WeatherRepository(private val apiUtils: AbstractApiUtils) {

    fun getWeatherData(location: String, appId: String): Flowable<DataHolder<WeatherEntity>> {
        return apiUtils.getWeatherData(location, appId)
            .observeOn(Schedulers.io())
            .subscribeOn(Schedulers.io())
            .map {
                when (it) {
                    is DataHolder.Success -> DataHolder.Success(it.data, it.isRemote)
                    is DataHolder.Error -> DataHolder.Error(it.data)
                }
            }
    }
}