package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tabLayout)

        //Faz com que o tab use o Viewpager
        tab.setupWithViewPager(pager)

        val fragments = listOf(
            MeuFragment(), MeuFragment(), MeuFragment()
        )

        val titulos = listOf(
            getString(R.string.Home), getString(R.string.Biblioteca), getString(R.string.Favoritos)
        )

        pager.adapter = ViewPagerAdapter(fragments, titulos, supportFragmentManager)

        tab.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tab.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_library_books_24)
        tab.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_star_24)

        //Contador de notificações
        tab.getTabAt(0)!!.orCreateBadge.apply{
            //Número de notificações, para ficar só ponto basta apagar
            number = 100
            //Máximo de casas
            maxCharacterCount = 3
            isVisible = true
        }

        tab.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(selected: TabLayout.Tab?){
                if(selected!!.position == 0){
                    tab.getTabAt(0)!!.badge?.isVisible = false
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?){

            }

            override fun onTabReselected(tab: TabLayout.Tab?){

            }

        })

        tab.getTabAt(1)!!.orCreateBadge.apply{
            //Número de notificações, para ficar só ponto basta apagar
            number = 75
            //Máximo de casas
            maxCharacterCount = 3
            isVisible = true
        }

        tab.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(selected: TabLayout.Tab?){
                if(selected!!.position == 1){
                    tab.getTabAt(1)!!.badge?.isVisible = false
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?){

            }

            override fun onTabReselected(tab: TabLayout.Tab?){

            }

        })

        tab.getTabAt(2)!!.orCreateBadge.apply{
            //Número de notificações, para ficar só ponto basta apagar
            number = 5
            //Máximo de casas
            maxCharacterCount = 3
            isVisible = true
        }

        tab.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(selected: TabLayout.Tab?){
                if(selected!!.position == 2){
                    tab.getTabAt(2)!!.badge?.isVisible = false
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?){

            }

            override fun onTabReselected(tab: TabLayout.Tab?){

            }

        })
    }
}