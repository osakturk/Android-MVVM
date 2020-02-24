package com.osakturk.weatherapp.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.osakturk.weatherapp.base.BaseViewModel
import com.osakturk.weatherapp.model.WeatherEntity
import com.osakturk.weatherapp.repository.WeatherLocalRepository
import com.osakturk.weatherapp.repository.WeatherMockRepository
import com.osakturk.weatherapp.util.DataHolder
import kotlinx.coroutines.launch
import javax.inject.Inject

class VMWeather @Inject constructor(
    private val weatherMockRepository: WeatherMockRepository,
    private val weatherLocalRepository: WeatherLocalRepository
) : BaseViewModel() {
    val weatherResponse = MutableLiveData<WeatherEntity>()

    fun getWeatherData(location: String, appId: String) {
        val disposable = weatherMockRepository.getWeatherFromMock(location, appId)
            .subscribe {
                when (it) {
                    is DataHolder.Success -> {
                        insertDataToDb(it.data)
                        weatherResponse.postValue(it.data)
                    }
                    is DataHolder.Error -> errorMessage.postValue("Error while getting weather")
                }
            }
        disposableList.add(disposable)
    }

    private fun insertDataToDb(it: WeatherEntity?) {
        viewModelScope.launch {
            it?.let { model ->
                weatherLocalRepository.insertWeather(model)
            }
        }
    }

    fun getWeatherFromDb(): WeatherEntity{
        return weatherLocalRepository.getWeatherModel()
    }
}