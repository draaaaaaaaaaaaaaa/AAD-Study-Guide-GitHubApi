package com.daffa.namanabi.searchuser

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daffa.namanabi.UsersResponse
import com.daffa.namanabi.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchUserViewModel : ViewModel() {

    val listUser = MutableLiveData<UsersResponse>()

    fun searchUser(username : String){
        ApiConfig.getApiService().SearchUser(username).enqueue(object : Callback<UsersResponse> {
            override fun onResponse(call: Call<UsersResponse>, response: Response<UsersResponse>) {
                listUser.value = response.body()

            }

            override fun onFailure(call: Call<UsersResponse>, t: Throwable) {
                Log.i("searchUser", "onFailure: $t ")
            }
        })
    }
    fun getSearchUser() : LiveData<UsersResponse> = listUser


}