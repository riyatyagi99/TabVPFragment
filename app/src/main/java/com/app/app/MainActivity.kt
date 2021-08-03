package com.app.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var viewpager: ViewPager
    private lateinit var chat: TextView
    private lateinit var status: TextView
    private lateinit var call: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUpSet()

    }

         private fun getUpSet() {
            viewpager = findViewById<ViewPager>(R.id.vpfragment)
            val tab =findViewById<TabLayout>(R.id.tablayout)
            val adapter = ViewPagerAdapter(supportFragmentManager)
            adapter.addFragment(chatfragment(), "CHAT")
            adapter.addFragment(statusfragment(), "STATUS")
            adapter.addFragment(callfragment(), "CALLS")
            viewpager.adapter = adapter
           tab.setupWithViewPager(viewpager)

        }

}