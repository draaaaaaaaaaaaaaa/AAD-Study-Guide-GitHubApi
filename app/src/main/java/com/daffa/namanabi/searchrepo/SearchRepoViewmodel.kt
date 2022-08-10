package com.daffa.namanabi

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daffa.namanabi.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SearchRepoViewModel : ViewModel() {

    private val listRepo = MutableLiveData<RepoResponse>()

    fun SearchRepo(userName: String) {
        ApiConfig.getApiService().getSearchRepo(userName).enqueue(object : Callback<RepoResponse> {
            override fun onResponse(call: Call<RepoResponse>, response: Response<RepoResponse>) {
                listRepo.value = response.body()
            }

            override fun onFailure(call: Call<RepoResponse>, t: Throwable) {
                Log.e("RepoData", "onFailure: $t", )
            }

        })
    }

    fun getListRepo(): LiveData<RepoResponse> = listRepo
}