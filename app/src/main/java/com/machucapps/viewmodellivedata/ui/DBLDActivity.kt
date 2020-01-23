package com.machucapps.viewmodellivedata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.machucapps.viewmodellivedata.R
import com.machucapps.viewmodellivedata.databinding.ActivityDbldBinding
import com.machucapps.viewmodellivedata.utils.User
import com.machucapps.viewmodellivedata.viewmodel.DBLDViewModel

class DBLDActivity : AppCompatActivity() {

    lateinit var viewModel: DBLDViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDbldBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_dbld)

        binding.lifecycleOwner = this

        viewModel = ViewModelProviders.of(this).get(DBLDViewModel::class.java)

        binding.viewModel = viewModel

        val user = User("Juan", "30")
        viewModel.setUser(user)
    }
}
