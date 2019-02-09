package com.github.satoshun.example.sample

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {
  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerAppComponent
      .builder()
      .applicationContext(this)
      .build()
  }
}
