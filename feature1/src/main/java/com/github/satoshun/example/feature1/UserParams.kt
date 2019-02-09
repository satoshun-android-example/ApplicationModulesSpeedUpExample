package com.github.satoshun.example.feature1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
internal data class UserParams(
  val userName: String,
  val age: Int
) : Parcelable
