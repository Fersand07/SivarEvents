package com.project.sibarevents.data.apiconsumption

import android.telecom.Call
import retrofit2.http.GET

interface ConsumoApi {
    @GET("events")
    fun getTraer(): Call<Events>
}