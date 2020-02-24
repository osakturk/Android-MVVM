package com.osakturk.weatherapp.repository

import com.osakturk.weatherapp.model.WeatherEntity
import com.osakturk.weatherapp.network.AbstractApiUtils
import com.osakturk.weatherapp.util.DataHolder
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class WeatherMockRepository @Inject constructor(private val apiUtils: AbstractApiUtils)  {
    fun getWeatherFromMock(location: String, appId: String): Flowable<DataHolder<WeatherEntity>> {
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