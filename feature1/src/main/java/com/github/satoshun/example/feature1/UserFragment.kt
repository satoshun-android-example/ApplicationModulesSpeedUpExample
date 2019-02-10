package com.github.satoshun.example.feature1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class UserFragment : Fragment() {
  companion object {
    fun createFragment(userName: String, age: Int) =
      UserFragment().apply {
        arguments = Bundle().apply { putParcelable("key", UserParams(userName, age)) }
      }
  }

  override fun onAttach(context: Context) {
//    AndroidSupportInjection.inject(this)
    super.onAttach(context)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.feature_frag, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val params: UserParams = arguments!!.getParcelable("key")!!
    view.findViewById<TextView>(R.id.title).text = params.userName
  }
}
