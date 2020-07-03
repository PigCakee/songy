package com.example.songy.ui.player

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.songy.R
import com.example.songy.databinding.FragmentPlayerBinding
import com.example.songy.util.inflaters.contentView
import com.example.songy.util.viewmodel.viewModel

class PlayerFragment : Fragment() {
    private val binding by contentView<FragmentPlayerBinding>(R.layout.fragment_player)
    private val model by viewModel<PlayerViewModel>()

    companion object {
        fun createInstance() =
            PlayerFragment()
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