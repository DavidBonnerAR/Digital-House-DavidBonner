package com.example.whatsapptabs.repository

import com.example.whatsapptabs.model.CharacterModel
import com.example.whatsapptabs.network.NetworkUtils
import retrofit2.http.GET

interface CharacterEndpoint {
    @GET("characters")
    suspend fun obterLista(): List<CharacterModel>

    companion object{
        val Endpoint: CharacterEndpoint by lazy{
            NetworkUtils.getRetrofitInstance().create(CharacterEndpoint::class.java)
        }
    }
}