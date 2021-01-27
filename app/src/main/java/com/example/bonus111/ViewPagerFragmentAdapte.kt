package com.example.bonus111

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.bonus111.fragments.FragmentOne
import com.example.bonus111.fragments.FragmentThree
import com.example.bonus111.fragments.FragmentTwo

class ViewPagerFragmentAdapte(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int =3



    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()
            else -> FragmentOne()



    }
}}