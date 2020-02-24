package com.osakturk.weatherapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.osakturk.weatherapp.model.WeatherEntity

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeather(weather: WeatherEntity)

    @Query("SELECT * FROM weathers WHERE id=:id")
    fun getWeatherModel(id: Int): LiveData<WeatherEntity>

    @Query("SELECT * FROM weathers")
    fun getAllWeathers(): WeatherEntity
}