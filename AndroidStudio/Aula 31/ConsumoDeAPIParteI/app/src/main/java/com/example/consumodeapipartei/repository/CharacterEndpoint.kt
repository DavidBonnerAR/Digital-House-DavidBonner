package com.example.consumodeapipartei.repository


import com.example.consumodeapipartei.models.ApiResponseModel
import com.example.consumodeapipartei.models.CharacterModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterEndpoint {

    @GET("character")
    fun obterPersonagens(): Call<ApiResponseModel<CharacterModel>>

    @GET("character/{id}")
    fun obterDetalhes(@Path("id") id: Int): Call<CharacterModel>
}