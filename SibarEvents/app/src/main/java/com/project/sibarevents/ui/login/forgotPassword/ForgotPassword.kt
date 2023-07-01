package com.project.sibarevents.ui.login.forgotPassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.findNavController
import com.project.sibarevents.R


class ForgotPassword : Fragment() {
    private lateinit var backButton: ImageButton
    private lateinit var nextButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_password, container, false)
    }

    private fun bind() {
        nextButton = view?.findViewById(R.id.btnNext) as ImageButton
        backButton = view?.findViewById(R.id.btnBack) as ImageButton

    }
    private fun listeners(){

        nextButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_forgotPassword_to_corfirmEmail)
        }
        backButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_forgotPassword_to_login)
        }

    }


}