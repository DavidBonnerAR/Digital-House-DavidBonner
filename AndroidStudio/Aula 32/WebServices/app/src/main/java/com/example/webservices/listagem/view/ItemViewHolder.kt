package com.example.webservices.listagem.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.webservices.R
import com.example.webservices.listagem.model.PersonagemModel

class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    private val imagem = view.findViewById<ImageView>(R.id.imgIcon)
    private val nome = view.findViewById<TextView>(R.id.txtName)

    fun bind(personagemModel: PersonagemModel) {
        nome.text = personagemModel.nome
        // TODO Usar Picasso
    }

}
