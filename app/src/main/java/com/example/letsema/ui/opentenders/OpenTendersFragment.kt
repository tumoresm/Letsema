package com.example.letsema.ui.opentenders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.letsema.R

class OpenTendersFragment : Fragment() {

    companion object {
        fun newInstance() = OpenTendersFragment()
    }

    private lateinit var viewModel: OpenTendersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.open_tenders_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OpenTendersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}