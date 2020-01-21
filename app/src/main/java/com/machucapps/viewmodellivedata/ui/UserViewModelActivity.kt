package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.utils.User
import kotlinx.android.synthetic.main.activity_user_view_model.*

class UserViewModelActivity : AppCompatActivity() {

    var userList: ArrayList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view_model)
        setUpView()
    }

    private fun setUpView() {
        btSalvar.setOnClickListener {
            var user = User()
            user.age = etEdad.text.toString()
            user.name = etNombre.text.toString()
            userList.add(user)
        }

        btVer.setOnClickListener {
            var text = ""
            for (user in userList) {
                text += "${user.name} - ${user.age} \n"
            }
        }
    }
}
