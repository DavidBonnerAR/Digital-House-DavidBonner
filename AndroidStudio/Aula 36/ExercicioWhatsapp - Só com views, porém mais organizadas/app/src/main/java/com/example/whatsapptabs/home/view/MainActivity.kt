package com.example.whatsapptabs.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.whatsapptabs.home.contact.view.ContactsFragment
import com.example.whatsapptabs.R
import com.example.whatsapptabs.home.call.view.CallFragment
import com.example.whatsapptabs.home.status.view.StatusFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val fragments = listOf(
            CallFragment(),
            StatusFragment(),
            ContactsFragment()
        )
        val titles = listOf(getString(R.string.calls),
            getString(R.string.status),
            getString(R.string.contacts))

        tabLayout.setupWithViewPager(viewPager)
        viewPager.adapter = ViewPagerAdapter(
            fragments,
            titles,
            supportFragmentManager
        )

    }
}