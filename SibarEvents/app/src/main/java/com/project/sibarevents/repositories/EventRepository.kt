package com.project.sibarevents.repositories

import com.project.sibarevents.data.model.EventModel
import com.project.sibarevents.network.restapi.Evento
import com.project.sibarevents.network.restapi.RetrofitClient
import retrofit2.Call
import retrofit2.Response

class EventRepository (private  val events: MutableList<EventModel>){
    fun getEvents() = events
    fun addEvents(event: EventModel) = events.add(event)


}