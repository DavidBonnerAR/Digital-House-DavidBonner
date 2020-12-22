package com.example.webservices.listagem.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.webservices.R
import com.example.webservices.listagem.model.PersonagemModel

class ListaAdapter(private val personagemModels: List<PersonagemModel>): RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = personagemModels[position]

        holder.bind(item)

    }

    override fun getItemCount() = personagemModels.size
}