package com.project.sibarevents.ui.event.categories.me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.project.sibarevents.R
import com.project.sibarevents.databinding.FragmentFavoriesCategoriesBinding
import com.project.sibarevents.databinding.FragmentMyProfileBinding

class MyProfile : Fragment() {

    private lateinit var binding: FragmentMyProfileBinding
    private lateinit var editProfile: Button
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
        binding = FragmentMyProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun bind() {
        editProfile = view?.findViewById(R.id.EditProfile) as Button
    }

    private fun listeners(){
        editProfile.setOnClickListener {
            it.findNavController().navigate(R.id.action_myProfile_to_editProfile)
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()

        binding.bottomNavigation.selectedItemId = R.id.nav_me
        binding.bottomNavigation.setOnItemReselectedListener { item ->
            when(item.itemId) {
                R.id.nav_home -> {
                    // Respond to navigation item 1 reselection
                    findNavController().navigate(R.id.action_myProfile_to_feed)
                }
                R.id.nav_fav -> {
                    // Respond to navigation item 2 reselection
                    findNavController().navigate(R.id.action_myProfile_to_favoriesCategories)
                }
                R.id.nav_cat -> {
                    // Respond to navigation item 2 reselection
                    findNavController().navigate(R.id.action_myProfile_to_categories)
                }
            }
        }
    }
}