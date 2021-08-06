package com.app.app.adapters

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.app.app.R
import com.app.app.rvclass.Status_design
import com.app.app.rvclass.chat_design

class statusAdapter(private var myList: ArrayList<Status_design>):
    RecyclerView.Adapter<statusAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.status_design,parent,false)
        return ViewHolder(view)
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageview.setImageResource(myList[position].image11)
        holder.tvName.text=myList[position].tv11
        holder.tvtime.text=myList[position].tv22

        if (myList[position].switchbutton){
            holder.buttonn.isChecked=true
        }else{
            holder.buttonn.isChecked=false
        }


        holder.buttonn.setOnClickListener {
            myList[position].switchbutton=! myList[position].switchbutton
        }

    }

    override fun getItemCount(): Int {
        return myList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageview:ImageView=itemView.findViewById(R.id.image11)
        var tvName:TextView=itemView.findViewById(R.id.tv11)
        var tvtime:TextView=itemView.findViewById(R.id.tv22)
        var buttonn:Switch=itemView.findViewById(R.id.switchbutton)


    }



}