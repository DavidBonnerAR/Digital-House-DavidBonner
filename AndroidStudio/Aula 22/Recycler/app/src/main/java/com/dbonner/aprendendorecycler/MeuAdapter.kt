package com.dbonner.aprendendorecycler

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//aqui se passa a lista de objetos que se vá ter na recycler, nesse caso é uma lista de String
class MeuAdapter(private val dataSet: List<String>): RecyclerView.Adapter<MeuAdapter.meuViewHolder>() {
    //Para tratar cada elemento da linha, colocar todos os elementos aqui
    class meuViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val texto: TextView = view.findViewById(R.id.txtRecycle)

        fun bind(string: String){
            texto.text = string
        }
    }

    //Usar xml como item de linha
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): meuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return meuViewHolder(view)
    }

    //Quantidade de itens
    override fun getItemCount() = dataSet.size

    //Quando chegar elemento novo, chamar para cada elemento
    override fun onBindViewHolder(holder: meuViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }
}