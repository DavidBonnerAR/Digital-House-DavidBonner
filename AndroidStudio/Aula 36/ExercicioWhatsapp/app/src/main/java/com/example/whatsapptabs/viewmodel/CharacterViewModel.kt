package com.example.whatsapptabs.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.whatsapptabs.model.CharacterModel
import com.example.whatsapptabs.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers


class CharacterViewModel(private val repository: CharacterRepository): ViewModel(){
    private var characters : List<CharacterModel> = listOf()

    fun obterLista() = liveData(Dispatchers.IO){
        val response = repository.obterLista()
        characters = response
        emit(response)
    }

    class CharacterViewModelFactory(
        private val repository: CharacterRepository
    ): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CharacterViewModel(repository) as T
        }
    }
}