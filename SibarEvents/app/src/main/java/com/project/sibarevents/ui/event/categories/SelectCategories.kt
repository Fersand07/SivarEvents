package com.project.sibarevents.ui.event.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.project.sibarevents.R
import org.w3c.dom.Text

class SelectCategories : Fragment() {
    private lateinit var buttonDone: Button
    private lateinit var skip: TextView
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
        skip.setOnClickListener {
            it.findNavController().navigate(R.id.action_selectCategories_to_feed)
        }
        buttonDone.setOnClickListener {
            it.findNavController().navigate(R.id.action_selectCategories_to_login_signin)
        }
    }

    private fun bind() {
        buttonDone = view?.findViewById(R.id.btnDone_categories) as Button
        skip = view?.findViewById(R.id.skip) as TextView
    }

}