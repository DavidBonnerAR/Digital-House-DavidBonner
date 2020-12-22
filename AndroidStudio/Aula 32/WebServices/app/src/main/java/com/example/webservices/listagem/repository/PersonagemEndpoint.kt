package com.example.webservices.listagem.repository

import com.example.webservices.data.model.ResponseModel
import com.example.webservices.listagem.model.PersonagemModel
import retrofit2.Call
import retrofit2.http.GET

interface PersonagemEndpoint {
    @GET("character")
    fun obterLista(): Call<ResponseModel<PersonagemModel>>
}