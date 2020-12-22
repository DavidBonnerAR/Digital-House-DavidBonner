package com.dbonner.ex01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        avancaPagina()
        checarCheckbox()
    }

    private fun checarCheckbox() {
        checkCerteza.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, "Checkbox funciona", Toast.LENGTH_SHORT).show()
            button.isEnabled = true
        }
    }

    private fun avancaPagina() {
        button.setOnClickListener {
            /*val intent = Intent(this, NovaTela::class.java)
            startActivity(intent)*/
            Toast.makeText(this, "Botão funciona", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, NovaTela::class.java)
            startActivity(intent)
        }
    }
}