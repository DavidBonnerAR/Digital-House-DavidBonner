package com.example.consumodeapipartei.models

import com.google.gson.annotations.SerializedName

data class OriginModel (
    @SerializedName("name")
    val nome: String,
    val url: String
)