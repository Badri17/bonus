package com.example.bonus111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.util.ArrayList

class MainActivity(val MainAdapte: Unit) : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    private lateinit var ViewPagerFragmentAdapte:ViewPagerFragmentAdapte


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager =findViewById(R.id.view_pager)
        tabLayout =findViewById(R.id.Tabs_Layout)
        ViewPagerFragmentAdapte = ViewPagerFragmentAdapte(this)
        viewPager.adapter=ViewPagerFragmentAdapte

        TabLayoutMediator(tabLayout,viewPager){tab, position ->
            tab.text="Tab ${position + 1}"

        }.attach()

    }
}





























   



