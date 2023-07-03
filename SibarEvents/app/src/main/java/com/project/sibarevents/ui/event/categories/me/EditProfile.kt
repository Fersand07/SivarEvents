package com.project.sibarevents.ui.event.categories.me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.project.sibarevents.R
import com.project.sibarevents.databinding.FragmentEditProfileBinding
import com.project.sibarevents.databinding.FragmentMyProfileBinding


class EditProfile : Fragment() {

    private lateinit var binding: FragmentEditProfileBinding
    private lateinit var confirmEdit: Button

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
        binding = FragmentEditProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }

    private fun bind() {
        confirmEdit = view?.findViewById(R.id.Okbtn) as Button
    }

    private fun listeners(){
        confirmEdit.setOnClickListener {
            it.findNavController().navigate(R.id.action_editProfile_to_myProfile)
        }
    }
}