package com.example.chucknorrisapp.listagem.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class JokesModel(
    @SerializedName("icon_url")
    val icone: String,
    @SerializedName("value")
    val joke: String
)
