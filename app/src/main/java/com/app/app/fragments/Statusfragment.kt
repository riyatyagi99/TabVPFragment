package com.app.app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.app.R
import com.app.app.adapters.statusAdapter
import com.app.app.rvclass.Status_design


class statusfragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.statusfragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var rvStatus =  view.findViewById<RecyclerView>(R.id.rv2)
        lateinit var adapter: statusAdapter


        var myList = ArrayList<Status_design>()
for (i in 0..50) {


    myList.add(
        Status_design(
            R.drawable.img1,
            tv11 = "Riya Tyagi",
            tv22 = "Today, 10:40 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i2,
            tv11 = "Shilpa",
            tv22 = "Today, 1:40 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i3,
            tv11 = "Dev",
            tv22 = "Today, 3:50 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Nityasha",
            tv22 = "Today, 4:40 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.img1,
            tv11 = "Manoj",
            tv22 = "Today, 7:40 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i2,
            tv11 = "Sonia",
            tv22 = "Today, 10:56 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Anchal",
            tv22 = "Today, 2:22 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Kajal",
            tv22 = "Today, 6:44am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Akhil",
            tv22 = "Today, 2:00 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Arpit",
            tv22 = "Today,5:11am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Deepika",
            tv22 = "Today, 6:08 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Akshay",
            tv22 = "Today, 7:45 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Papa",
            tv22 = "Today, 10:40 am",
            switchbutton = false
        )
    )
    myList.add(
        Status_design(
            R.drawable.i4,
            tv11 = "Mummy",
            tv22 = "Today, 3:30 am",
            switchbutton = false
        )
    )
}

        adapter = statusAdapter(myList)
        rvStatus.setHasFixedSize(false)
        rvStatus.adapter = adapter
        rvStatus.layoutManager= LinearLayoutManager(context)
    }

    }
