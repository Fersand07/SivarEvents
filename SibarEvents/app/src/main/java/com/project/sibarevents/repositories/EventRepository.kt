package com.project.sibarevents.repositories

import com.project.sibarevents.data.model.EventModel

class EventRepository (private  val events: MutableList<EventModel>){
    fun getEvents() = events
    fun addEvents(event: EventModel) = events.add(event)
}