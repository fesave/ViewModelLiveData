package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.utils.User
import com.machucapps.viewmodellivedata.viewmodel.LiveDataViewModel
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    var number: Int = 0
    lateinit var viewModel: LiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        setUpView()
    }

    private fun setUpView() {
        viewModel = ViewModelProviders.of(this).get(LiveDataViewModel::class.java)

        btSave.setOnClickListener {
            if (number == 0) {
                val user = User()
                user.name = "Juan"
                user.age = "30"
                viewModel.addUser(user)

            }
            if (number == 1) {
                val user = User()
                user.name = "Sofía"
                user.age = "45"
                viewModel.addUser(user)

            }
            if (number == 2) {
                val user = User()
                user.name = "Felipe"
                user.age = "65"
                viewModel.addUser(user)

            }
            number++
        }

        val listObserver = Observer<List<User>> { userList ->
            var text = ""
            for (user in userList) {
                text += "${user.name} - ${user.age} \n"
            }
            tvLiveData.text = text
        }

        viewModel.getUserList().observe(this@LiveDataActivity, listObserver)
    }
}
