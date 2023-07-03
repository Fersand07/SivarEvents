package com.project.sibarevents.ui.login.forgotPassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.findNavController
import com.project.sibarevents.R


class ForgotPassword : Fragment() {
    private lateinit var backButton: ImageButton
    private lateinit var nextButton: ImageButton
    private lateinit var signUpButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }
    private fun bind() {
        nextButton = view?.findViewById(R.id.btnNext) as ImageButton
        backButton = view?.findViewById(R.id.btnBack) as ImageButton
        signUpButton = view?.findViewById(R.id.signUp) as Button

    }
    private fun listeners(){

        nextButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_forgotPassword_to_corfirmEmail)
        }
        backButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_forgotPassword_to_login)
        }
        signUpButton.setOnClickListener() {
            it.findNavController().navigate(R.id.action_forgotPassword_to_register)
        }

    }


}