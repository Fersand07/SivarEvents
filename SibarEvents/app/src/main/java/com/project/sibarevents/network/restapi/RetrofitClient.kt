package com.project.sibarevents.network.restapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://54.157.106.122/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val consumirApi = retrofit.create(ConsumirApi::class.java)
}