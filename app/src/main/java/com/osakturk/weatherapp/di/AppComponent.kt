package com.osakturk.weatherapp.di

import android.app.Application
import com.osakturk.weatherapp.WeatherApplication
import com.osakturk.weatherapp.di.module.ActivityModule
import com.osakturk.weatherapp.di.module.AppModule
import com.osakturk.weatherapp.di.module.RepositoryModule
import com.osakturk.weatherapp.di.scope.AppScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

/**
 * @author osakturk
 */

@AppScope
@Component(
        modules = [
            AndroidInjectionModule::class,
            AndroidSupportInjectionModule::class, //added for X
            AppModule::class,
            RepositoryModule::class,
            ActivityModule::class]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(weatherApplication: WeatherApplication)
}