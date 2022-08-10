package com.daffa.namanabi.ListUser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.daffa.namanabi.MainViewModel
import com.daffa.namanabi.R

class ListauserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listauser)

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.getListUser()
        viewModel.getResultListUser().observe(this){
            Log.i("ListUser", "onCreate: $it ")
        }
    }
}