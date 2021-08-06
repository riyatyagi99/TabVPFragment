package com.app.app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.app.R
import com.app.app.rvclass.call_design
import com.app.app.rvclass.chat_design

class callAdapter(private var myList: List<call_design>) : RecyclerView.Adapter<callAdapter.ViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        var view= LayoutInflater.from(parent.context).inflate(R.layout.call_design,parent,false)
        return callAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageview.setImageResource(myList[position].image111)
        holder.tvName.text=myList[position].tv111
        holder.tvtime.text=myList[position].tv222
        holder.calll.setImageResource(myList[position].image222)
    }

    override fun getItemCount(): Int {
   return myList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        var imageview: ImageView =itemView.findViewById(R.id.image111)
        var tvName: TextView =itemView.findViewById(R.id.tv111)
        var tvtime: TextView =itemView.findViewById(R.id.tv222)
        var calll: ImageView =itemView.findViewById(R.id.call)




    }

}