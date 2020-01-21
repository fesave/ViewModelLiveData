package com.machucapps.viewmodellivedata.viewmodel

import androidx.lifecycle.ViewModel
import com.machucapps.viewmodellivedata.utils.User

class UserViewModel : ViewModel() {
    var userList: MutableList<User> = ArrayList<User>()

    fun addUser(user: User) {
        userList.add(user)
    }
}