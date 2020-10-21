package com.dbonner.aprendendorecycler

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter: RecyclerView.Adapter<MeuAdapter.meuViewHolder>() {
    //Para tratar cada elemento da linha
    class meuViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val texto: TextView = view.findViewById(R.id.txtRecycle)
    }

    //Usar xml como item de linha
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): meuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return meuViewHolder(view)
    }

    //Quantidade de itens
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    //Quando chegar elemento novo, chamar para cada elemento
    override fun onBindViewHolder(holder: meuViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}