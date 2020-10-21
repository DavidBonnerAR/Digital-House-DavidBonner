package com.dbonner.exerccio2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_iserir_dados.*
import kotlinx.android.synthetic.main.fragment_resultado.*
import java.util.*

class MainActivity : AppCompatActivity(), IResultados {
    var fragInserirDados = IserirDados()
    var fragResultado = Resultado()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val manager = supportFragmentManager

        var transaction = manager.beginTransaction()
        transaction.replace(R.id.containerInserir, fragInserirDados)
        transaction.commit()

        val transaction2 = manager.beginTransaction()
        transaction2.replace(R.id.containerResultado, fragResultado)
        transaction2.commit()




    }

    override fun mudarResultado(nome: String, idade: Int){
        super.mudarResultado(nome, idade)
        var anoAtual = Calendar.getInstance().get(Calendar.YEAR).toInt()
        var idadeAtual = anoAtual - idade

        when {
            idadeAtual == 0 ->{
                fragResultado.txtResultado.text = "$nome, você tem menos de um ano"
            }
            idadeAtual == 1 ->{
                fragResultado.txtResultado.text = "$nome, você tem $idadeAtual ano"
            }
            idadeAtual < 0 ->{
                fragResultado.txtResultado.text = "$nome, você ainda não nasceu"
            }
            else -> {
                fragResultado.txtResultado.text = "$nome, você tem $idadeAtual anos"
            }
        }
    }

    //função para ocultar teclado
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