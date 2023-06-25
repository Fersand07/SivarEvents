package com.project.sibarevents.ui.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.project.sibarevents.R

class SelectCategories : Fragment() {
    private lateinit var buttonDone: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listener()
    }

    private fun listener() {
        buttonDone.setOnClickListener {
            it.findNavController().navigate(R.id.action_selectCategories_to_feed)
        }
    }

    private fun bind() {
        buttonDone = view?.findViewById(R.id.btnDone_categories) as Button
    }

}