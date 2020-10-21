package com.vittoria.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val dataSet: List<Usuario>) : RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {
    class MeuViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val meuTexto : TextView  = view.findViewById(R.id.meuTexto)
        private val meuTexto : TextView  = view.findViewById(R.id.meuTexto)
        private val meuTexto : TextView  = view.findViewById(R.id.meuTexto)

        fun bind(usuario: Usuario){
            meuTexto.text = usuario.nome
        }
    }

    //Inflar o xml (a linha)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return MeuViewHolder(view)
    }

    //Quantidade de itens do dataset
    override fun getItemCount() = dataSet.size

    //Chamado a cada item do dataset
    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }
}