package com.dbonner.ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class NovaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_tela)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val senha = findViewById<EditText>(R.id.editTextSenha)



    }
}