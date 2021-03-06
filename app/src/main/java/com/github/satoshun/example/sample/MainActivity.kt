package com.github.satoshun.example.sample

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.github.satoshun.example.feature1.createUserFragment
import com.github.satoshun.example.feature1.createUserIntent
import com.github.satoshun.example.sample.databinding.MainActBinding

class MainActivity : BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = DataBindingUtil.setContentView<MainActBinding>(this, R.layout.main_act)

    val fragment: Fragment = createUserFragment("test", 100)
    supportFragmentManager.commit {
      add(R.id.container, fragment)
    }

    val intent = createUserIntent(this)
  }
}
