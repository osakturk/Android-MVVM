package com.osakturk.weatherapp.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.osakturk.weatherapp.db.WeatherDao
import com.osakturk.weatherapp.db.WeatherDb
import com.osakturk.weatherapp.di.qualifiers.BaseUrlQualifier
import com.osakturk.weatherapp.di.scope.AppScope
import dagger.Module
import dagger.Provides

/**
 * @author osakturk
 */
@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @AppScope
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @AppScope
    @BaseUrlQualifier
    fun provideBaseUrl(): String {
        return "http://www.google.com/"
    }

    @AppScope
    @Provides
    fun provideWeatherDb(app: Application): WeatherDb {
        return Room
            .databaseBuilder(app, WeatherDb::class.java, "contacts.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @AppScope
    @Provides
    fun provideWeatherDao(db: WeatherDb): WeatherDao {
        return db.weatherDao()
    }
}