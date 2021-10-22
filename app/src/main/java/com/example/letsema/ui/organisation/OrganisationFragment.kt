package com.example.letsema.ui.organisation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.letsema.R

class OrganisationFragment : Fragment() {

    companion object {
        fun newInstance() = OrganisationFragment()
    }

    private lateinit var viewModel: OrganisationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.organisation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OrganisationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}