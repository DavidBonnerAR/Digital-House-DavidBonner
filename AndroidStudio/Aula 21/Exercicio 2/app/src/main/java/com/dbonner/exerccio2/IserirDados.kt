package com.dbonner.exerccio2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_iserir_dados.*


class IserirDados : Fragment() {

    private lateinit var activity: IResultados

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IResultados)
            activity = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_iserir_dados, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCalcular.setOnClickListener {
            if (editTxtNome.text?.isEmpty()!!) {
                editTxtNome.error = "Preencha o nome"
            } else if (editTxtAnoNasc.text?.isEmpty()!!) {
                editTxtAnoNasc.error = "Preencha o ano"
            } else {
                val nome = editTxtNome.text?.toString()
                val idade = editTxtAnoNasc.text?.toString()?.toInt()
                activity.mudarResultado(nome!!, idade!!)
            }

        }
    }

}
// || editTxtAnoNasc.text?.toString()?.toInt() ?: 0 <= 1900