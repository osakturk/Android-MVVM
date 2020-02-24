package com.osakturk.weatherapp.di.module

import com.osakturk.weatherapp.di.scope.AppScope
import com.osakturk.weatherapp.network.AbstractApiUtils
import com.osakturk.weatherapp.repository.WeatherRepository
import dagger.Module
import dagger.Provides

@Module(includes = [ApiUtilsModule::class])
class RepositoryModule {

    @AppScope
    @Provides
    fun provideWeatherRepository(apiUtils: AbstractApiUtils): WeatherRepository {
        return WeatherRepository(apiUtils)
    }

}