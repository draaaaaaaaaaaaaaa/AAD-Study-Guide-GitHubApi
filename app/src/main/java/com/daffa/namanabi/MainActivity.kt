package com.daffa.namanabi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daffa.namanabi.ListUser.ListauserActivity
import com.daffa.namanabi.databinding.ActivityMainBinding
import com.daffa.namanabi.searchrepo.SearchRepoActivity
import com.daffa.namanabi.searchuser.SearchUserActivity


class MainActivity : AppCompatActivity() ,View.OnClickListener {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnJson.setOnClickListener(this@MainActivity)
            btnListUser.setOnClickListener(this@MainActivity)
            btnSeachRepo.setOnClickListener(this@MainActivity)
            btnSeachRepo.setOnClickListener(this@MainActivity)
            btnSearchUser.setOnClickListener(this@MainActivity)
        }

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_json -> startActivity(Intent(this, JsonActivity::class.java))
            R.id.btn_list_user -> startActivity(Intent(this, ListauserActivity::class.java))
            R.id.btn_seach_repo -> startActivity(Intent(this, SearchRepoActivity::class.java))
            R.id.btn_search_user -> startActivity(Intent(this, SearchUserActivity::class.java))

        }

    }
}