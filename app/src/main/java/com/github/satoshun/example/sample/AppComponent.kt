package com.github.satoshun.example.sample

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    AndroidSupportInjectionModule::class,
    DatabaseModule::class
//    AdapterModule::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @Component.Builder
  interface Builder {
    @BindsInstance
    fun applicationContext(context: Context): AppComponent.Builder

    fun build(): AppComponent
  }
}
