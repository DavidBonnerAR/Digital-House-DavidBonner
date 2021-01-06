package com.example.chucknorrisapp.listagem.repository

class CategoriaRepository {
    private val client =  CategoriasEndpoint.endpoint

    suspend fun obterListaCategorias() = client.obterListaCategorias()
}