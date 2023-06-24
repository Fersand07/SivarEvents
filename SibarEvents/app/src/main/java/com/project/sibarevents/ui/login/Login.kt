package com.project.sibarevents.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.findNavController
import com.project.sibarevents.R


class Login : Fragment() {

    private lateinit var backButton: ImageButton
    private lateinit var nextButton: ImageButton
    private lateinit var forgotPass: TextView
    private lateinit var singUp: TextView

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
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }
    private fun bind() {
        nextButton = view?.findViewById(R.id.btnNext) as ImageButton
        backButton = view?.findViewById(R.id.btnBack) as ImageButton
        forgotPass = view?.findViewById(R.id.TV_ForgotPass) as TextView
        singUp = view?.findViewById(R.id.Tv_singUp) as TextView

    }

    private fun listeners() {

       nextButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_to_selectCategories)
        }
        backButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_to_login_signin)
        }
        /*
        * forgotPass.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
        * */
        singUp.setOnClickListener {
            it.findNavController().navigate(R.id.action_login_to_register)
        }

    }
}