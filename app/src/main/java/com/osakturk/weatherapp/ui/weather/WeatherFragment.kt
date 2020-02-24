package com.osakturk.weatherapp.ui.weather

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import com.osakturk.weatherapp.R
import com.osakturk.weatherapp.base.BaseFragment
import com.osakturk.weatherapp.databinding.FragmentWeatherBinding
import com.osakturk.weatherapp.di.Injectable

class WeatherFragment : BaseFragment<VMWeather, FragmentWeatherBinding>(), Injectable {
    override val getLayoutId: Int = R.layout.fragment_weather
    override val viewModelClass = VMWeather::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        subscribeData()
        viewModel.getWeatherData("London", "b6907d289e10d714a6e88b30761fae22")
    }

    private fun subscribeData() {
        viewModel.weatherResponse.observe(this, Observer {
            binding.cityValue.text = it.location
            binding.countryValue.text = it.sys?.country
            binding.weatherValue.text = it.weather[0]?.main
        })
        viewModel.errorMessage.observe(this, Observer {
            setTextInfo(it)
        })

        binding.btnLogin.setOnClickListener {
            val weatherEntity = viewModel.getWeatherFromDb()
            Toast.makeText(
                context,
                "Country: ${weatherEntity.sys?.country}\n City: ${weatherEntity.location}\n Weather: ${weatherEntity.weather[0]?.main}",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun setTextInfo(text: String) {
        binding.txtError.text = text
    }


}