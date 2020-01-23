package com.machucapps.viewmodellivedata.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.machucapps.viewmodellivedata.utils.User

class DBLDViewModel : ViewModel() {

    var user: MutableLiveData<User> = MutableLiveData()

    fun setUser(user: User) {
        this.user.value = user
    }

    fun updateUser() {
        val user = User("Laura", "27")
        this.user.value = user
    }
}