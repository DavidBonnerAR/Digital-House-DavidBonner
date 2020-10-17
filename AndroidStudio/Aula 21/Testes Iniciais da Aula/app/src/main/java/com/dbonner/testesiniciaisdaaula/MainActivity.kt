package com.dbonner.testesiniciaisdaaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        btnPrimeiroFragment.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.conteiner, PrimeiroFragment())
            transaction.commit()
        }

        btnSegundoFragment.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.conteiner, SegundoFragment())
            transaction.commit()
        }
    }
}