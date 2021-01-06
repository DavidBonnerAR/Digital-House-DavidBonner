package com.example.chucknorrisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerList)
        val manager = LinearLayoutManager()
        val listaDeCategorias = mutableListOf<String>()
        val listaAdapter = ListagemAdapter(listaDeCategorias){
            val bundle = bundleOf("categoria" to it)
            navControl.navigate(R.id.action_catListFragment_to_jokeFragment, bundle)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            adapter = listaAdapter
            layoutManager = manager
        }

    }
}