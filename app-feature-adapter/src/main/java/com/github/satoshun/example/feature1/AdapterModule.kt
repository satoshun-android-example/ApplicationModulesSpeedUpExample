package com.github.satoshun.example.feature1

import dagger.Module

@Module(
  includes = [UserModule::class]
)
interface AdapterModule
