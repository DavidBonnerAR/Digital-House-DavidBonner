package com.example.consumodeapipartei.models

import com.google.gson.annotations.SerializedName

data class PageInfoLocationModel(
    @SerializedName("Count")
    val total: Int,
    @SerializedName("pages")
    val paginas: Int,
    @SerializedName("next")
    val proximo: String?,
    @SerializedName("prev")
    val anterior: String?
)