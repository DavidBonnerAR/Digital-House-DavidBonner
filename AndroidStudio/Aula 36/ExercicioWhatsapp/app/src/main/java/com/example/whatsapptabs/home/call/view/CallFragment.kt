package com.example.whatsapptabs.home.call.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapptabs.R
import com.example.whatsapptabs.home.call.adapter.CharacterAdapter
import com.example.whatsapptabs.model.CharacterModel
import com.example.whatsapptabs.repository.CharacterRepository
import com.example.whatsapptabs.viewmodel.CharacterViewModel

class CallFragment : Fragment() {

    private lateinit var _viewModel : CharacterViewModel
    private lateinit var _view: View
    private lateinit var _listaAdapter: CharacterAdapter
    private lateinit var recyclerView: RecyclerView

    private var _listaCharacters = mutableListOf<CharacterModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _view = view
        recyclerView = _view.findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(view.context)
        _listaAdapter = CharacterAdapter(_listaCharacters)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = manager
            adapter = _listaAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        _viewModel = ViewModelProvider(
            this, CharacterViewModel.CharacterViewModelFactory(
            CharacterRepository()
            )
        ).get(CharacterViewModel::class.java)

        _viewModel.obterLista().observe(viewLifecycleOwner) {
            exibirLista(it)
        }
    }

    private fun exibirLista(lista: List<CharacterModel>) {
        lista.let{_listaCharacters.addAll(lista)
        _listaAdapter.notifyDataSetChanged()
        }
    }
}