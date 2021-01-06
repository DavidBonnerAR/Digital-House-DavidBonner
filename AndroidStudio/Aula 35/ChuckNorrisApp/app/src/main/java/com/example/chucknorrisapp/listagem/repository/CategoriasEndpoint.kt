package com.example.chucknorrisapp.listagem.repository

import com.example.chucknorrisapp.data.api.NetworkUtils
import retrofit2.http.GET

interface CategoriasEndpoint {

    @GET("categories")
    suspend fun obterListaCategorias(): List<String>

    companion object {
        val endpoint: CategoriasEndpoint by lazy {
            NetworkUtils.getRetrofitInstance().create(CategoriasEndpoint::class.java)
        }
    }
}