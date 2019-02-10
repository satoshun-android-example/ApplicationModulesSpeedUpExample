package com.github.satoshun.example.feature1

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment

fun createUserFragment(userName: String, age: Int): Fragment {
  return UserFragment.createFragment(userName, age)
}

fun createUserIntent(context: Context): Intent {
  return Intent(context, UserActivity::class.java)
}
