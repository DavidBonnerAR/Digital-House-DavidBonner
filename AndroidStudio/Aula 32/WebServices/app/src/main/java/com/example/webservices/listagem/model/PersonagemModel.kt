package com.example.webservices.listagem.model

import com.google.gson.annotations.SerializedName

data class PersonagemModel(
    val id: Int,
    @SerializedName("name")
    val nome: String,
    val url: String
)