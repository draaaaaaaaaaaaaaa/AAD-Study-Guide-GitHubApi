package com.daffa.namanabi.network

import com.daffa.namanabi.RepoResponse
import com.daffa.namanabi.UsersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("users")
    fun getListUser() : Call<List<UsersResponse>>

    @GET("search/users")
    fun SearchUser(
        @Query("q") username : String
    ) : Call<UsersResponse>

    @GET("search/repositories")
    fun getSearchRepo(@Query("q") repositories: String) : Call<RepoResponse>


}