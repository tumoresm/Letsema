package com.example.letsema.ui.drafts

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.letsema.R

class DraftsTendersFragment : Fragment() {

    companion object {
        fun newInstance() = DraftsTendersFragment()
    }

    private lateinit var viewModel: DraftsTendersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.drafts_tenders_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DraftsTendersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}