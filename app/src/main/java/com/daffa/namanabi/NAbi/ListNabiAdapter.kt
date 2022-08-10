package com.daffa.namanabi.NAbi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.daffa.namanabi.Data.Nabi
import com.daffa.namanabi.R

class ListNabiAdapter(val listNabi: ArrayList<Nabi>) : RecyclerView.Adapter<ListNabiAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_nabi, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val nabi = listNabi[position]
        holder.tvname.text = nabi.name

    }

    override fun getItemCount(): Int {
        return listNabi.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvname : TextView = itemView.findViewById(R.id.tvname)

    }
}