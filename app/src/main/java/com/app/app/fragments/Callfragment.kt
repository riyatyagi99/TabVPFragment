package com.app.app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.app.R
import com.app.app.adapters.callAdapter
import com.app.app.adapters.chatAdapter
import com.app.app.rvclass.call_design



class callfragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.callfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        var rvCall=  view.findViewById<RecyclerView>(R.id.rv3)
        lateinit var adapter: callAdapter


        var myList = ArrayList<call_design>()

        for(i in 0..50) {

            myList.add(
                call_design(
                    R.drawable.img1,
                    tv111 = "Riya ",
                    tv222 = "10:40 am",
                    R.drawable.ic_call
                )
            )
            myList.add(
                call_design(
                    R.drawable.i2,
                    tv111 = "Papa",
                    tv222 = "10:20 am",
                    R.drawable.ic_video_call_24
                )
            )
            myList.add(
                call_design(
                    R.drawable.i3,
                    tv111 = "mummy",
                    tv222 = "10:10 am",
                    R.drawable.ic_call
                )
            )
            myList.add(
                call_design(
                    R.drawable.i4,
                    tv111 = "Sister",
                    tv222 = "11:20 am",
                    R.drawable.ic_video_call_24
                )
            )
            myList.add(
                call_design(
                    R.drawable.img1,
                    tv111 = "Brother",
                    tv222 = "12:20 am",
                    R.drawable.ic_call
                )
            )
            myList.add(
                call_design(
                    R.drawable.i2,
                    tv111 = "RT",
                    tv222 = "1:40 am",
                    R.drawable.ic_video_call_24
                )
            )
//        myList.add(item_design(R.drawable.i4, tv111 = "E", tv222 = "5:30 am", R.drawable.ic_call))
            myList.add(
                call_design(
                    R.drawable.i4,
                    tv111 = "Nitya",
                    tv222 = "5:30 am",
                    R.drawable.ic_call
                )
            )


        }
        adapter = callAdapter(myList)
        rvCall.setHasFixedSize(true)
        rvCall.adapter = adapter
        rvCall.layoutManager= LinearLayoutManager(context)
        
        
    }

    }
