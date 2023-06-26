package com.project.sibarevents.ui.event.categories.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.sibarevents.R
import com.project.sibarevents.databinding.FragmentCategoriesBinding



class categories : Fragment() {

    private lateinit var binding: FragmentCategoriesBinding
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
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bottomNavigation.selectedItemId = R.id.nav_cat
        binding.bottomNavigation.setOnItemReselectedListener { item ->
            when(item.itemId) {
                R.id.nav_home -> {
                    // Respond to navigation item 1 reselection
                    findNavController().navigate(R.id.action_categories_to_feed)
                }
                R.id.nav_fav -> {
                    // Respond to navigation item 2 reselection
                    findNavController().navigate(R.id.action_categories_to_favoriesCategories)
                }
                R.id.nav_me -> {
                    // Respond to navigation item 2 reselection
                    findNavController().navigate(R.id.action_categories_to_myProfile)
                }
            }
        }
    }
}