package com.project.sibarevents.network.restapi

import retrofit2.Call
import retrofit2.http.GET

interface ConsumirApi {
    @GET("events")
    fun getTraer(): Call<Evento>
}