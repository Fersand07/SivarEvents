package com.project.sibarevents.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.findNavController
import com.project.sibarevents.R



class Register : Fragment() {
    private lateinit var backButton: ImageButton
    private lateinit var nextButton: ImageButton

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
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()

    }
    private fun bind() {
        nextButton = view?.findViewById(R.id.btnNext) as ImageButton
        backButton = view?.findViewById(R.id.btnBack) as ImageButton

    }

    private fun listeners() {
        nextButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_register_to_login)
        }
        backButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_register_to_login_signin)
        }
    }
}