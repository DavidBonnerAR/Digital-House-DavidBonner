package com.dbonner.exerccio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val manager = supportFragmentManager

        var transaction = manager.beginTransaction()
        transaction.replace(R.id.containerInserir, IserirDados())
        transaction.commit()

        transaction = manager.beginTransaction()
        transaction.replace(R.id.containerResultado, Resultado())
        transaction.commit()




    }
}