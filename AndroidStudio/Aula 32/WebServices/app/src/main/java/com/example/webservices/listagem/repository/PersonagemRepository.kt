package com.example.webservices.listagem.repository

import com.example.webservices.data.api.NetworkUtils
import com.example.webservices.data.api.OnResult
import com.example.webservices.data.model.ResponseModel
import com.example.webservices.listagem.model.PersonagemModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PersonagemRepository {
    public fun obterLista(onResult: OnResult<ResponseModel<PersonagemModel>>){
        var client = NetworkUtils.getRetrofitInstance()
        val api = client.create(PersonagemEndpoint::class.java)

        val call = api.obterLista()
        call.enqueue(object : Callback<ResponseModel<PersonagemModel>>{
            override fun onFailure(call: Call<ResponseModel<PersonagemModel>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<ResponseModel<PersonagemModel>>,
                response: Response<ResponseModel<PersonagemModel>>
            ) {
                onResult.onSucces(response.body()!!)
            }


        })
    }
}
