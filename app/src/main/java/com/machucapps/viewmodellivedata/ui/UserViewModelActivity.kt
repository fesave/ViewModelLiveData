package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.utils.User
import com.machucapps.viewmodellivedata.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_user_view_model.*

class UserViewModelActivity : AppCompatActivity() {

    var userList: ArrayList<User> = ArrayList()
    lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view_model)
        setUpView()
    }

    private fun setUpView() {
        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        btSalvar.setOnClickListener {
            var user = User()
            user.age = etEdad.text.toString()
            user.name = etNombre.text.toString()
            userList.add(user)

            userViewModel.addUser(user)
        }

        btVer.setOnClickListener {
            var text = ""
            for (user in userList) {
                text += "${user.name} - ${user.age} \n"
            }
            tvUser.text = text

            text = ""
            for (user in userViewModel.userList) {
                text += "${user.name} - ${user.age} \n"
            }
            tvUserViewModel.text = text
        }
    }
}
