package com.osakturk.weatherapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.osakturk.weatherapp.model.WeatherEntity
import com.osakturk.weatherapp.model.converters.Converters

@Database(
    entities = [
        WeatherEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class WeatherDb : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}