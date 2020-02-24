package com.osakturk.weatherapp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.osakturk.weatherapp.di.ViewModelKey
import com.osakturk.weatherapp.ui.weather.VMWeather
import com.osakturk.weatherapp.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory


    @Binds
    @IntoMap
    @ViewModelKey(VMWeather::class)
    abstract fun bindWeatherViewModel(VMContactDetail: VMWeather): ViewModel
}