package com.github.satoshun.example.feature1

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface UserModule {
  @ContributesAndroidInjector
  fun contributeUserFragment(): UserFragment
}
