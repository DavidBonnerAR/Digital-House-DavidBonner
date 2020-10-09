package com.dbonner.testesiniciais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val MEU_NOME = "Meu nome é "
const val ERRO = "ERRO"
class MainActivity : AppCompatActivity() {
    private val edInputName by lazy {findViewById<EditText>(R.id.etTexto)}
    private val btnResult by lazy {findViewById<Button>(R.id.btnExibir}
    private val edInputName by lazy {findViewById<EditText>(R.id.tvResult)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        exibeView()
        restartView()
    }

    private fun restartView() {
        btnRestart.setOnClickListener {
            tvResult.visibility = View.GONE
        }
    }

    private fun exibeView() {
        btnExibir.setOnClickListener {
            val resulName = edInputName.text.toString()

            //tvResult.text = "Meu nome é $resulName"
            //tvResult.visibility = View.VISIBLE

            if (resulName.isNotEmpty()) {
                tvResult.text = "$MEU_NOME é $resulName"
                tvResult.visibility = View.VISIBLE
            } else {
                etTexto.error = ERRO
            }
        }
    }
}