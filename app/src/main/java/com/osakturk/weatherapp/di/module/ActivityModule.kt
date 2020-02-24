package com.osakturk.weatherapp.di.module

import com.osakturk.weatherapp.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author osakturk
 */

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity
}