package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.utils.User
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        setUpView()
    }

    private fun setUpView() {
        btSave.setOnClickListener {
            if (number == 0) {
                val user = User()
                user.name = "Juan"
                user.age = "30"
            }
            if (number == 1) {
                val user = User()
                user.name = "Sofía"
                user.age = "45"
            }
            if (number == 2) {
                val user = User()
                user.name = "Felipe"
                user.age = "65"
            }
        }
    }
}
