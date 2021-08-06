package com.app.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.app.app.fragments.callfragment
import com.app.app.fragments.chatfragment
import com.app.app.fragments.statusfragment
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(){
    private lateinit var viewpager: ViewPager
    private lateinit var chat: TextView
    private lateinit var status: TextView
    private lateinit var call: TextView


    lateinit var tab1: TextView
    lateinit var tab2: TextView
    lateinit var tab3: TextView
    lateinit var select: TextView
    lateinit var appbar: AppBarLayout
    lateinit var tabmain: TabLayout




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUpSet()

    }

         private fun getUpSet() {
         // tab1=findViewById(R.id.tab1)
         // tab2=findViewById(R.id.tab2)
         // tab3=findViewById(R.id.tab3)
           // select=findViewById(R.id.textselected)
          //appbar=findViewById(R.id.appBarLayout)
             //setSupportActionBar(appbar)



            viewpager = findViewById<ViewPager>(R.id.vpfragment)
           val tab =findViewById<TabLayout>(R.id.tablayout)

           //  val tabmain =findViewById<TabLayout>(R.id.tablayoutmain)


            val adapter = ViewPagerAdapter(supportFragmentManager)
            adapter.addFragment(chatfragment(), "CHAT")
            adapter.addFragment(statusfragment(), "STATUS")
            adapter.addFragment(callfragment(), "CALLS")

             //tab.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
            viewpager.adapter = adapter
          tab.setupWithViewPager(viewpager)




        }

//    private fun setSupportActionBar(appbar: AppBarLayout?) {
//
//    }

}

