package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.utils.Sumar
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : AppCompatActivity() {

    private var resultado: Int = 0
    private var TAG = ViewModelActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()")
        setContentView(R.layout.activity_view_model)
        setUpView()
    }

    private fun setUpView() {
        tvSumar.text = "$resultado"
        btSumar.setOnClickListener {
            resultado = Sumar.sumar(resultado)
            tvSumar.text = "$resultado"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")

    }
}
