package com.daffa.namanabi

import com.google.gson.annotations.SerializedName

data class RepoResponse(
    @field:SerializedName("items")
    val items : List<RepoItem>? = null
)

data class RepoItem(
    @field:SerializedName("name")
    val name  : String? = null,
    @field:SerializedName("full_name")
    val fullName : String? = null,
    @field:SerializedName("describtion")
    val decs : String? = null,
    @field:SerializedName("topics")
    val topics : List<String>
)
