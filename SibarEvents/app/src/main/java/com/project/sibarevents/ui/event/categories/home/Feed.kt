package com.project.sibarevents.ui.event.categories.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.project.sibarevents.R


class Feed : Fragment() {

    private lateinit var buttonNav: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false)
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
}