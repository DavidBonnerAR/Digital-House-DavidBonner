package com.example.consumodeapipartei.models

import com.google.gson.annotations.SerializedName

data class LocationModel(
    val id: Int,
    @SerializedName("name")
    val nome: String,
    @SerializedName("dimension")
    val dimensao: String,
    @SerializedName("residents")
    val urlResidentes: List<String>
)
