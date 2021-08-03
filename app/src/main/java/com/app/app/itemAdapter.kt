package com.app.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemAdapter(private var myList: List<item_design>):
    RecyclerView.Adapter<itemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     var view=LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageview.setImageResource(myList[position].image1)
        holder.tvName.text=myList[position].tv1
        holder.tvtime.text=myList[position].tv2
        holder.tvMsg.text=myList[position].tv3

    }

    override fun getItemCount(): Int {
        return myList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageview:ImageView=itemView.findViewById(R.id.image1)
        var tvName:TextView=itemView.findViewById(R.id.tv1)
       var tvtime:TextView=itemView.findViewById(R.id.tv2)
        var tvMsg:TextView=itemView.findViewById(R.id.tv3)

    }
}