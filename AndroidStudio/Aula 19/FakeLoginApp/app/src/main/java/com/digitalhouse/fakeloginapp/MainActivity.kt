package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailRegistrado = "diegoalmeida09897@gmail.com"
        val senhaRegistrada = "sobrenatural"


        btnLogin.setOnClickListener {
            var emailInserido = editTextEmail.text.toString()
            var senhaInserida = editTextSenha.text.toString()
            if (emailRegistrado.equals(emailInserido)) {
                if(senhaRegistrada == senhaInserida) {
                    val intent = Intent(this, LoginConcluido::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "Senha incorreta!", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Email incorreto!", Toast.LENGTH_SHORT).show()
            }
        }


    }
}