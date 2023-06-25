package com.project.sibarevents

import android.app.Application
import com.project.sibarevents.data.events
import com.project.sibarevents.repositories.EventRepository

class EventReviewerApplication : Application() {
    val eventRepository: EventRepository by lazy {
        EventRepository(events)
    }
}