package com.example.whatsapptabs.repository

class CharacterRepository {
    private val client = CharacterEndpoint.Endpoint

    suspend fun obterLista() = client.obterLista()
}