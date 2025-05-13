package com.app.viewpager.adapter


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.viewpager.U.TasksFragment
import com.app.viewpager.U.InsightsFragment
import com.app.viewpager.U.HomeFragment

class DashboardPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment{
        return when (position) {
            0 -> HomeFragment()
            1 -> TasksFragment()
            2 -> InsightsFragment()
            else -> HomeFragment()
        }
    }
}