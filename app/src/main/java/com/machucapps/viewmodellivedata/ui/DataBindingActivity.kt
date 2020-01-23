package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.databinding.ActivityDataBindingBinding
import com.machucapps.viewmodellivedata.utils.User

class DataBindingActivity : AppCompatActivity() {

    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)

        val binding: ActivityDataBindingBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        user = User("Pedro", "45")

        binding.user = this.user
    }
}
