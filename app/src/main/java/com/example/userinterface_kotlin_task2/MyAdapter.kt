package com.example.userinterface_kotlin_task2

import android.content.Context
import android.content.IntentFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(
    private val context: Context,
    private val titles: List<String>,
    private val descriptions: List<String>
) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            title.text = titles[position]
            des.text = descriptions[position]
        }
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.text_title)
        val des: TextView = view.findViewById(R.id.text_description)
    }
}