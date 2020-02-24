package com.osakturk.weatherapp.network

import com.osakturk.weatherapp.mock.WEATHER_RESPONSE
import com.osakturk.weatherapp.model.WeatherEntity
import com.osakturk.weatherapp.util.DataHolder
import com.google.gson.Gson
import io.reactivex.Flowable


class MockApiUtils(apiService: ApiService, customCallbackSender: CustomCallbackSender) : AbstractApiUtils(apiService, customCallbackSender) {
    override fun getWeatherData(
        location: String,
        appId: String
    ): Flowable<DataHolder<WeatherEntity>> {
        return Flowable.just(DataHolder.Success(Gson().fromJson(WEATHER_RESPONSE, WeatherEntity::class.java), false))
    }


}