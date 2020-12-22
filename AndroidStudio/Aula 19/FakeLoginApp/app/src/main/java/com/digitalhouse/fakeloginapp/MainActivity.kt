package com.digitalhouse.fakeloginapp

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
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

        fazerLogin()
        criarConta()

    }

    private fun criarConta() {
        btnCreateAccount.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }
    }

    private fun fazerLogin() {
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

    //função para ocultar teclado com toque na tela
    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN) {
            val v: View? = currentFocus
            if (v is EditText) {
                val outRect = Rect()
                v.getGlobalVisibleRect(outRect)
                if (!outRect.contains(event.rawX.toInt(), event.rawY.toInt())) {
                    v.clearFocus()
                    val imm: InputMethodManager =
                        getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0)
                }
            }
        }
        return super.dispatchTouchEvent(event)
    }

}
