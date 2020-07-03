package com.example.songy.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.songy.R
import com.example.songy.databinding.FragmentSearchBinding
import com.example.songy.util.inflaters.contentView
import com.example.songy.util.viewmodel.viewModel

class SearchFragment : Fragment() {

    private val binding by contentView<FragmentSearchBinding>(R.layout.fragment_search)
    private val model by viewModel<SearchViewModel>()

    companion object {
        fun createInstance() =
            SearchFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.model = model
        return binding.root
    }
}