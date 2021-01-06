package com.example.chucknorrisapp.listagem.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.chucknorrisapp.listagem.repository.CategoriaRepository
import kotlinx.coroutines.Dispatchers

class CategoriasViewModel(private val repository: CategoriaRepository): ViewModel() {

    private var _categorias: MutableList<String> = mutableListOf()

    fun obterLista() = liveData(Dispatchers.IO) {

        val response = repository.obterListaCategorias()

        emit(response)

    }

    class CategoriesViewModelFactory(
        private val repository: CategoriaRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CategoriasViewModel(repository) as T
        }
    }
}