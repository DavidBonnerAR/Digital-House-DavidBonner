package com.digitalhouse.rickapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso

class MeuViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val nomePersonagem: TextView = view.findViewById(R.id.txtNomePersonagem)
    private val foto: ImageView = view.findViewById(R.id.imgFotoPersonagem)


    fun bind(personagem: Personagem){
        nomePersonagem.text = personagem.nome

        Picasso.get().load(personagem.imagemUrl)
            .into(foto)

    }
}