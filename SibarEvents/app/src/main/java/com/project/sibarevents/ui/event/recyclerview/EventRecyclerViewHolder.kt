package com.project.sibarevents.ui.event.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.project.sibarevents.data.model.EventModel
import com.project.sibarevents.databinding.EventItemBinding
import com.project.sibarevents.network.restapi.Evento
import com.project.sibarevents.network.restapi.RetrofitClient
import retrofit2.Call
import retrofit2.Response

class EventRecyclerViewHolder(private val binding: EventItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(event: EventModel, clickListener: (EventModel) -> Unit){
        binding.titleTextView.text = event.name
        binding.dayHourTextView.text = event.day_hour
        binding.locationTextView.text = event.location

        binding.eventItemCardView.setOnClickListener{
            clickListener(event)
        }


        val retrofitTraer = RetrofitClient.consumirApi.getTraer()

        retrofitTraer.enqueue(object : retrofit2.Callback<Evento>{

        override fun onResponse(call: Call<Evento>, response: Response<Evento>) {
            binding.locationTextView.text = response.body()?.data?.size.toString()
        }

        override fun onFailure(call: Call<Evento>, t: Throwable) {
        TODO("TOAST ")
        }
        })

    }
}