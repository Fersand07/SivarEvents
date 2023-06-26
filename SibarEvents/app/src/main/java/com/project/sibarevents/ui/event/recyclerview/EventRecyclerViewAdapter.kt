package com.project.sibarevents.ui.event.recyclerview

import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.sibarevents.data.model.EventModel
import com.project.sibarevents.databinding.EventItemBinding

class EventRecyclerViewAdapter(
    private val clickListener: (EventModel) -> Unit
) : RecyclerView.Adapter<EventRecyclerViewHolder>() {
    private val events = ArrayList<EventModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventRecyclerViewHolder {
        val binding = EventItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    override fun onBindViewHolder(holder: EventRecyclerViewHolder, position: Int) {
        val event = events[position]
        holder.bind(event, clickListener)
    }

    fun setData(eventsList: List<EventModel>){
        events.clear()
        events.addAll(eventsList)
    }

}