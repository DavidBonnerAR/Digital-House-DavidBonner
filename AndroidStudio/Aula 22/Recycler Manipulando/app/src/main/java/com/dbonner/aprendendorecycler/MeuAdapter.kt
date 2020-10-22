package com.dbonner.aprendendorecycler

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//aqui se passa a lista de objetos que se vá ter na recycler, nesse caso é uma lista de String
class MeuAdapter(private val dataSet: List<Chat>): RecyclerView.Adapter<MeuAdapter.meuViewHolder>() {
    //Para tratar cada elemento da linha, colocar todos os elementos aqui
    class meuViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val nome: TextView = view.findViewById(R.id.txtnome)
        private val ultimaMensagem: TextView = view.findViewById(R.id.txtultimamensagem)
        private val hora: TextView = view.findViewById(R.id.txthora)


        fun bind(nomeChat: String, mensagemChat: String, horaChat: String){
            nome.text = nomeChat
            ultimaMensagem.text = mensagemChat
            hora.text = horaChat
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
        holder.bind(dataSet[position].nome, dataSet[position].ultimaMensagem, dataSet[position].hora)
    }
}