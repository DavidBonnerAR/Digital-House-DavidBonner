package com.example.webservices.listagem.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.webservices.data.api.OnResult
import com.example.webservices.data.model.ResponseModel
import com.example.webservices.listagem.model.PersonagemModel
import com.example.webservices.listagem.repository.PersonagemRepository

class PersonagemViewModel(
    private val repository: PersonagemRepository
): ViewModel(){

    val personagens = MutableLiveData<List<PersonagemModel>>()
    fun obterLista() {
        repository.obterLista(object: OnResult<ResponseModel<PersonagemModel>>,
            OnResult<List<PersonagemModel>> {
            override fun onSucces(result: ResponseModel<PersonagemModel>) {
                personagens.value = result.results
            }

            override fun onFailure() {
                TODO("Not yet implemented")
            }

            override fun onSucces(result: List<PersonagemModel>) {
                TODO("Not yet implemented")
            }

        })
    }

    class PersonagemViewModelFactory(
        private val repository: PersonagemRepository
    ): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return PersonagemViewModel(repository) as T
        }
    }
}