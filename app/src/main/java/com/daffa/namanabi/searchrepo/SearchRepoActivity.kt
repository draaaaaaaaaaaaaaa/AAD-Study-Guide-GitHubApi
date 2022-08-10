package com.daffa.namanabi.searchrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.daffa.namanabi.R
import com.daffa.namanabi.SearchRepoViewModel

class SearchRepoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_repo)

        val searchViewRepo = "udin"

        val viewModel = ViewModelProvider(this)[SearchRepoViewModel::class.java]
        viewModel.SearchRepo(searchViewRepo)
        viewModel.getListRepo().observe(this) {
            Log.i("DataRepo", "onCreate: $it  \n \n \n repo nya kn $searchViewRepo")

        }
    }
}
