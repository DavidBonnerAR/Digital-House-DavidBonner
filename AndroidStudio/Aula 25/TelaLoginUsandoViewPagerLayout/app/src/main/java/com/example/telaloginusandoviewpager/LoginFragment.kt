package com.example.telaloginusandoviewpager

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment() {


    private lateinit var mudarTabListener: IMudarTab

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        view.findViewById<MaterialButton>(R.id.btnLogin).setOnClickListener {
            if (validaEntradas(view)){
                Toast.makeText(view.context, "Login Realizado", Toast.LENGTH_LONG).show()
            }
        }

        view.findViewById<TextInputEditText>(R.id.editTextUserNameLogin).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                view.findViewById<TextInputLayout>(R.id.txtUserNameLogin).error = ""
            }
        })

        view.findViewById<TextInputEditText>(R.id.editTextPasswordLogin).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                view.findViewById<TextInputLayout>(R.id.txtPasswordLogin).error = ""
            }
        })

        view.findViewById<MaterialButton>(R.id.btnSignUpLogin).setOnClickListener {
            mudarTabListener.mudarTab()
        }
        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

        mudarTabListener = context as IMudarTab
    }

    fun validaEntradas(view: View): Boolean{
        var resultado = true

        val editUserName = view.findViewById<TextInputEditText>(R.id.editTextUserNameLogin)
        val editPassword = view.findViewById<TextInputEditText>(R.id.editTextPasswordLogin)

        if (editUserName.text?.isBlank()!!){
            view.findViewById<TextInputLayout>(R.id.txtUserNameLogin).error = "Username Vazio"
            resultado = false
        }
        if (editPassword.text?.isBlank()!!){
            view.findViewById<TextInputLayout>(R.id.txtPasswordLogin).error = "Senha vazia"
            resultado = false
        }

        return resultado
    }
}