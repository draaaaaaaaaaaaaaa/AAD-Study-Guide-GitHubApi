package com.daffa.namanabi.searchuser

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.daffa.namanabi.UsersItem
import com.daffa.namanabi.databinding.RowItemUserBinding

class UserAdapter(private val listUser: List<UsersItem>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder (val binding: RowItemUserBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        RowItemUserBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val data = listUser [position]
        holder.binding.apply {
            tvNamaUser.text = data.login
            tvNamaUserLengkap.text = data.url
            Glide.with(imageUser).load(data.avatarUrl).into(imageUser)
        }
    }
    override fun getItemCount(): Int = listUser.size

}