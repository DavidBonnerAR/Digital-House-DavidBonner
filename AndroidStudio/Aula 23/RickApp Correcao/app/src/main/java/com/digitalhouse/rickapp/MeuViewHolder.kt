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
    private val planetaPersonagem: TextView = view.findViewById(R.id.txtPlaneta)
    private val especiePersonagem: TextView = view.findViewById(R.id.txtEspecie)
    private val statusPersonagem: TextView = view.findViewById(R.id.txtStaus)

    fun bind(personagem: Personagem){
        nomePersonagem.text = "Nome do personagem: "+ personagem.nome
        planetaPersonagem.text = "Localização: " + personagem.localizacao.nome
        especiePersonagem.text = " Espécie: " + personagem.especie
        statusPersonagem.text = "Estado atual: " + personagem.status
        Picasso.get().load(personagem.imagemUrl)
            .into(foto)

    }
}