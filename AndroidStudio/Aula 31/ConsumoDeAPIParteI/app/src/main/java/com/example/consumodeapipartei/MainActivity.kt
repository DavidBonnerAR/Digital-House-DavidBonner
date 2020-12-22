package com.example.consumodeapipartei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.consumodeapipartei.models.ApiResponseModel
import com.example.consumodeapipartei.models.CharacterModel
import com.example.consumodeapipartei.repository.CharacterEndpoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //testes
        var client = getRetrofitInstance(BASE_URL)

        var endpoint = client.create(CharacterEndpoint::class.java)

        endpoint.obterPersonagens().enqueue(object: Callback<ApiResponseModel<CharacterModel>> {
            override fun onResponse(
                call: Call<ApiResponseModel<CharacterModel>>,
                response: Response<ApiResponseModel<CharacterModel>>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<ApiResponseModel<CharacterModel>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
        fun getRetrofitInstance(baseUrl: String): Retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        companion object {
            const val BASE_URL = "https://rickandmortyapi.com/api/"
    }
}