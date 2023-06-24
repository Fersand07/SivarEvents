package com.project.sibarevents.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

import com.project.sibarevents.R

class Login_signin : Fragment() {

    private lateinit var buttonBack: ImageButton
    private lateinit var buttonLogin: Button
    private lateinit var buttonRegister: Button

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
        return inflater.inflate(R.layout.fragment_login_signin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }

    private fun bind() {
        buttonBack = view?.findViewById(R.id.btnBack) as ImageButton
        buttonRegister = view?.findViewById(R.id.btnSignIn) as Button
        buttonLogin= view?.findViewById(R.id.btnLogIn) as Button
    }

    private fun listeners() {
        buttonBack.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_signin_to_firstPage)
        }
        buttonLogin.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_signin_to_login)
        }
        buttonRegister.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_signin_to_register)
        }
    }

}