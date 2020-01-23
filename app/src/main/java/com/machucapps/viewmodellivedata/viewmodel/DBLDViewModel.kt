package com.machucapps.viewmodellivedata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.machucapps.viewmodellivedata.utils.User

class DBLDViewModel : ViewModel() {

    var user: MutableLiveData<User> = MutableLiveData()

    fun getUser(): LiveData<User> {
        return user
    }

    fun setUser() {
        val user = User("Laura", "34")
        this.user.value = user
    }
}