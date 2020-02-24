package com.osakturk.weatherapp.di.module

import com.osakturk.weatherapp.di.scope.AppScope
import com.osakturk.weatherapp.network.AbstractApiUtils
import com.osakturk.weatherapp.network.ApiService
import com.osakturk.weatherapp.network.CustomCallbackSender
import com.osakturk.weatherapp.network.MockApiUtils
import dagger.Module
import dagger.Provides

/**
 * @author osakturk
 */

@Module(includes = [NetworkModule::class])
class ApiUtilsModule {
    @AppScope
    @Provides
    fun apiUtils(
            apiService: ApiService,
            customCallbackSender: CustomCallbackSender
    ): AbstractApiUtils {
        //Mock
        return MockApiUtils(apiService, customCallbackSender)
        //Live
//        return ApiUtils(apiService, customCallbackSender)
    }
}