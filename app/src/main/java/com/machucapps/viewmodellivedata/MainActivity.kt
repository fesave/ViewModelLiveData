package com.machucapps.viewmodellivedata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.machucapps.viewmodellivedata.ui.ViewModelActivity
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

    }
}
