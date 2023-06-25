package com.project.sibarevents.ui.event.categories.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.sibarevents.R
import com.project.sibarevents.databinding.FragmentFeedBinding
import com.project.sibarevents.ui.viewmodel.EventViewModel


class Feed : Fragment() {

    private val eventViewModel: EventViewModel by activityViewModels {
        EventViewModel.Factory
    }

    private lateinit var buttonNav: Button
    private lateinit var binding: FragmentFeedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listener()

    }

    private fun bind() {
        buttonNav= view?.findViewById(R.id.nav_fav) as Button
    }

    private fun listener() {
        buttonNav.setOnClickListener {
            it.findNavController().navigate(R.id.action_feed_to_favoriesCategories)
        }
    }
    /*
    * private fun setRecyclerView(view: View){
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

        adapter = EventRecycleViewAdapter { selectedEvent ->
            showSelectedItem(selectedEvent)
        }
    }
    * ///////////////////////////////////////////////////////////////
    * private fun displayMovies() {
        adapter.setData(eventViewModel.getEvents())
        adapter.notifyDataSetChanged()
    }

    private fun showSelectedItem(event: EventModel) {
        eventViewModel.setSelectedEvent(event)
        findNavController().navigate(R.id.action_Feed_to_//TODO AGREGAR VISTA DE DESCRIPCION DE EVENTOS)
    }
    * */



}