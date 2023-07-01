package com.project.sibarevents.ui.login.forgotPassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
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


    private fun listeners(){

        nextButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_to_selectCategories)
        }
        backButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_to_login_signin)
        }

    }


}