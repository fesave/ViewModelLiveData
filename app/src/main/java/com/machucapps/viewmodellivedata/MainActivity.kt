package com.machucapps.viewmodellivedata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.machucapps.viewmodellivedata.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpView()
    }

    private fun setUpView() {
        btViewModel.setOnClickListener {
            startActivity(Intent(this, ViewModelActivity::class.java))
        }
        btUserViewModel.setOnClickListener {
            startActivity(Intent(this, UserViewModelActivity::class.java))

        }
        btLiveData.setOnClickListener {
            startActivity(Intent(this, LiveDataActivity::class.java))
        }

        btDataBinding.setOnClickListener {
            startActivity(Intent(this, DataBindingActivity::class.java))
        }

        btDBLABinding.setOnClickListener {
            startActivity(Intent(this, DBLDActivity::class.java))
        }

    }
}
