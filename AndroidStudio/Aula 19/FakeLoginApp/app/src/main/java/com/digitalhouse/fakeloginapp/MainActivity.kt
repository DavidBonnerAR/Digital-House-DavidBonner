package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        btnLogin.setOnClickListener {
            try {
                var emailInserido = editTextEmail.text.toString()
                var senhaInserida = editTextSenha.text.toString()

                val loguin = UserService.logIn(emailInserido, senhaInserida)
                val intent = Intent(this, LoginConcluido::class.java)
                intent.putExtra("userName", loguin?.name)
                startActivity(intent)
            } catch (error: Exception) {
                Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
            }
        }
        }

    private fun CriarConta() {
        btnCreateAccount.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }
    }
}



/*btnCreateAccount.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
                    startActivity(intent)
        }

        btnLogin.setOnClickListener {
            var emailInserido = editTextEmail.text.toString()
            var senhaInserida = editTextSenha.text.toString()
            if (emailRegistrado.equals(emailInserido)) {
                if(senhaRegistrada == senhaInserida) {
                    val intent = Intent(this, LoginConcluido::class.java)
                    startActivity(intent)
                    LimparEntradas()
                }
                else{
                    Toast.makeText(this, "Senha incorreta!", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Email incorreto!", Toast.LENGTH_SHORT).show()
            }
        }*/