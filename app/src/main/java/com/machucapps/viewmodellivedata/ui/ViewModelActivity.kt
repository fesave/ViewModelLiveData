package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.utils.Sumar
import com.machucapps.viewmodellivedata.viewmodel.SumarViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : AppCompatActivity() {

    lateinit var sumarViewModel: SumarViewModel
    private var resultado: Int = 0
    private var TAG = ViewModelActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()")
        setContentView(R.layout.activity_view_model)
        setUpView()
    }

    private fun setUpView() {
        sumarViewModel = ViewModelProviders.of(this).get(SumarViewModel::class.java)
        tvSumar.text = "$resultado"
        tvSumarViewModel.text = sumarViewModel.resultado.toString()
        btSumar.setOnClickListener {
            resultado = Sumar.sumar(resultado)
            tvSumar.text = "$resultado"

            sumarViewModel.resultado = Sumar.sumar(sumarViewModel.resultado)
            tvSumarViewModel.text = sumarViewModel.resultado.toString()
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
