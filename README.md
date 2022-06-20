# TabVPFragment
# TabVPFragment
# TabVPFragment

Here I am pasting recyclerView Code.


//className-ClassItem
package com.app.recyclerview

data class ClassItem(var image1:Int, var tv1:String, var tv2:String, var tv3:String ) {}

=====================================================================================================

//MainActivity
package com.app.recyclerview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcv: RecyclerView
    private  lateinit var adapter: itemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcv = findViewById(R.id.rv1)

        var myList = ArrayList<ClassItem>()

        myList.add(ClassItem(R.drawable.img1, tv1 = "Riya Tyagi", tv2 = "10:40 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i2, tv1 = "A", tv2 = "10:20 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i3, tv1 = "B", tv2 = "10:10 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "C", tv2 = "11:20 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.img1, tv1 = "D", tv2 = "12:20 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i2, tv1 = "RT", tv2 = "1:40 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))

        adapter = itemAdapter(myList)
        rcv.setHasFixedSize(true)
        rcv.adapter = adapter

    }

}

========================================================================================

// ItemAdapter

package com.app.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemAdapter(private var myList: List<ClassItem>):
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
