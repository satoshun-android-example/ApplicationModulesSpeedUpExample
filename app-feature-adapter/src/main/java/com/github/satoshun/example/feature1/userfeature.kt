package com.github.satoshun.example.feature1

import androidx.fragment.app.Fragment

fun createUserFragment(userName: String, age: Int): Fragment {
  return UserFragment.createFragment(userName, age)
}
