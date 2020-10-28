package com.digitalhouse.rickapp

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso

class MeuAdapter(private val personagem: List<Personagem>): RecyclerView.Adapter<MeuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return MeuViewHolder(view)
    }

    override fun getItemCount() = personagem.size

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(personagem[position])
    }
}