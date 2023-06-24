package com.project.sibarevents.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

import com.project.sibarevents.R


class FirstPage : Fragment() {
    private lateinit var buttonDiscover: Button

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
        return inflater.inflate(R.layout.fragment_first_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listener()
    }

    private fun listener() {
        buttonDiscover.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstPage_to_login_signin)
        }
    }

    private fun bind() {
        buttonDiscover = view?.findViewById(R.id.btnDiscover) as Button
    }
}