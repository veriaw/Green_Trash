package com.veriaw.greentrash.ui.subscription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veriaw.greentrash.R
import com.veriaw.greentrash.databinding.FragmentFormBinding

class FormFragment : Fragment() {
    private var _binding: FragmentFormBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFormBinding.inflate(layoutInflater, container, false)
        binding.btnSubscription.setOnClickListener {
            navigateToFragment(MitraFragment())
        }
        return binding.root
    }

    fun navigateToFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null) // Menambahkan ke backstack untuk navigasi kembali
            .commit()
    }

}