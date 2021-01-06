package com.example.chucknorrisapp.listagem.repository

class JokesRepository {
    private val client = JokesEndpoint.endpoint

    suspend fun getJokes(category: String?) = client.getJokes(category)
}