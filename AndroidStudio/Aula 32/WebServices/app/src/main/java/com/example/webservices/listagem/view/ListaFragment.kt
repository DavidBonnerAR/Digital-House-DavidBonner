package com.example.webservices.listagem.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.webservices.R
import com.example.webservices.listagem.model.PersonagemModel
import com.example.webservices.listagem.repository.PersonagemRepository
import com.example.webservices.listagem.viewmodel.PersonagemViewModel

class ListaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lista = view.findViewById<RecyclerView>(R.id.lista)
        val manager = LinearLayoutManager(view.context)

        val listaDePersonagens = mutableListOf<PersonagemModel>()
        val listaAdapter = ListaAdapter(listaDePersonagens)

        lista.apply {
            setHasFixedSize(true)
            layoutManager = manager
            adapter = listaAdapter
        }

        val viewModel = ViewModelProvider(
            this,
            PersonagemViewModel.PersonagemViewModelFactory(PersonagemRepository())
        ).get(PersonagemViewModel::class.java)

        viewModel.personagens.observe(this, Observer{
            listaDePersonagens.addAll(it)
            //listaAdapter.notifyDataSetChanged()
        })

        viewModel.obterLista()
    }
}