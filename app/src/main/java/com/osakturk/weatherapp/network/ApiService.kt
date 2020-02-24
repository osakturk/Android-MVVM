package com.osakturk.weatherapp.network

import com.osakturk.weatherapp.model.WeatherEntity
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url


//Eğer Mock yerine API kullanacaksak buraya servisleri yazmamız gerek
interface ApiService {

    @GET("data/2.5/weather")
    fun loadWeatherData(@Url url: String, @Query("q") location: String, @Query("appid") appId: String): WeatherEntity
}