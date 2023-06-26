package com.project.sibarevents.ui.viewmodel

import android.text.Spannable.Factory
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.project.sibarevents.EventReviewerApplication
import com.project.sibarevents.data.model.EventModel
import com.project.sibarevents.repositories.EventRepository

class EventViewModel (private val repository: EventRepository) : ViewModel() {
    var name = MutableLiveData("")
    var day_hour = MutableLiveData("")
    var location = MutableLiveData("")
    var description = MutableLiveData("")
    var category = MutableLiveData("")
    var banner = MutableLiveData("")
    var status = MutableLiveData("")



    fun getEvents()= repository.getEvents()

    private fun addEvents(event: EventModel) = repository.addEvents(event)

    private fun validateData(): Boolean {
        when{
            name.value.isNullOrEmpty() -> return false
            day_hour.value.isNullOrEmpty() -> return false
            location.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
            category.value.isNullOrEmpty() -> return false
            banner.value.isNullOrEmpty() -> return false

        }
        return true
    }

    fun clearData(){
        name.value = ""
        day_hour.value = ""
        location.value = ""
        description.value = ""
        category.value = ""
        banner.value = ""
    }

    fun clearStatus() {
        status.value = INACTIVE
    }

    fun createEvent(){
        if (!validateData()){
            status.value = WRONG_INFORMATION
            return
        }

        val event = EventModel(
            name.value!!,
            day_hour.value!!,
            location.value!!,
            description.value!!,
            category.value!!,
            banner.value!!
        )

        addEvents(event)
        clearData()

        status.value = EVENT_CREATED
    }
    fun setSelectedEvent(event: EventModel){
        name.value = event.name
        day_hour.value = event.day_hour
        description.value = event.description
        location.value = event.location
        category.value = event.category
    }

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as EventReviewerApplication
                EventViewModel(app.eventRepository)
            }
        }

        const val EVENT_CREATED = "Event created"
        const val WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""
    }
}