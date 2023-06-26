package com.project.sibarevents.ui.event.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.project.sibarevents.data.model.EventModel
import com.project.sibarevents.databinding.EventItemBinding

class EventRecyclerViewHolder(private val binding: EventItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(event: EventModel, clickListener: (EventModel) -> Unit){
        binding.titleTextView.text = event.name
        binding.dayHourTextView.text = event.day_hour
        binding.locationTextView.text = event.location

        binding.eventItemCardView.setOnClickListener{
            clickListener(event)
        }
    }
}