package com.osakturk.weatherapp.di.module

import com.osakturk.weatherapp.ui.weather.WeatherFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author osakturk
 */

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeWeatherFragment(): WeatherFragment
}