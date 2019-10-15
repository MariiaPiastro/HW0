package com.demo.mycat

import android.content.Context
import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView


class MyAdapter(context: Context, private val hobbies: List<Hobby>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private var inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.list_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(hobbies[position])
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val hobbyTitle = view.findViewById<TextView>(R.id.hobbyTitle)
        private val hobbyImage = view.findViewById<ImageView>(R.id.hobbyImage)

        fun bind(hobby: Hobby) {
            hobbyTitle.text = hobby.hobby
            hobbyImage.setImageResource(hobby.image)
        }
    }
}
