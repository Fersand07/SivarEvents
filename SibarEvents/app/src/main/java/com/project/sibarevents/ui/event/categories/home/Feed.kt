package com.project.sibarevents.ui.event.categories.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.project.sibarevents.R
import com.project.sibarevents.data.model.EventModel
import com.project.sibarevents.databinding.FragmentFeedBinding
import com.project.sibarevents.ui.event.recyclerview.EventRecyclerViewAdapter
import com.project.sibarevents.ui.viewmodel.EventViewModel


class Feed : Fragment() {

    private val eventViewModel: EventViewModel by activityViewModels {
        EventViewModel.Factory
    }

    private lateinit var binding: FragmentFeedBinding
    private lateinit var adapter: EventRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.bottomNavigation.setOnItemReselectedListener { item ->
            when(item.itemId) {
                R.id.nav_fav -> {
                    // Respond to navigation item 1 reselection
                    findNavController().navigate(R.id.action_feed_to_favoriesCategories)
                    true
                }
                R.id.nav_me -> {
                    // Respond to navigation item 2 reselection
                    findNavController().navigate(R.id.action_feed_to_myProfile)
                    true
                }
                R.id.nav_cat -> {
                    // Respond to navigation item 2 reselection
                    findNavController().navigate(R.id.action_feed_to_categories)
                    true
                }
                else -> false
            }
        }

    }

    private fun setRecyclerView(view: View){
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

        adapter = EventRecyclerViewAdapter { selectedEvent ->
            showSelectedItem(selectedEvent)
        }
    }

    private fun displayEvents(){
        adapter.setData(eventViewModel.getEvents())
        adapter.notifyDataSetChanged()
    }

    private fun showSelectedItem(event: EventModel){
        eventViewModel.setSelectedEvent(event)
        //TODO: AGREGAR INFORMACION DE EVENTOS
    }

}