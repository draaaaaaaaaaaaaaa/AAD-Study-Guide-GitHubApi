package com.daffa.namanabi

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daffa.namanabi.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    private val listUser = MutableLiveData<List<UsersResponse>>()

    fun getListUser(){
        ApiConfig.getApiService().getListUser().enqueue(object : Callback<List<UsersResponse>>{
            override fun onResponse(call: Call<List<UsersResponse>>,
            response: Response<List<UsersResponse>>
            ) {
              listUser.value = response.body()

            }

            override fun onFailure(call: Call<List<UsersResponse>>, t: Throwable) {
                Log.i("TAG", "onFailure:  @t")
            }
        })
    }
    fun getResultListUser(): LiveData<List<UsersResponse>> = listUser
}