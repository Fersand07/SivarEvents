package com.project.sibarevents.ui.event

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.project.sibarevents.R
import com.project.sibarevents.databinding.FragmentEventSelectedBinding
import com.project.sibarevents.ui.viewmodel.EventViewModel


class EventSelected : Fragment() {


    private val eventViewModel: EventViewModel by activityViewModels {
        EventViewModel.Factory
    }

    private lateinit var binding: FragmentEventSelectedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEventSelectedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        binding.btnBack.setOnClickListener(){
            findNavController().navigate(R.id.action_eventSelected_to_feed)
        }
    }

    private fun setViewModel() {
        binding.viewmodel= eventViewModel
    }
}