package com.example.letsema.ui.mytenders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.letsema.R

class MyTendersFragment : Fragment() {

    companion object {
        fun newInstance() = MyTendersFragment()
    }

    private lateinit var viewModel: MyTendersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.my_tenders_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyTendersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}