package com.veriaw.greentrash.ui.subscription

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veriaw.greentrash.R
import com.veriaw.greentrash.databinding.FragmentMitraBinding
import com.veriaw.greentrash.databinding.FragmentSuccessSubsBinding
import com.veriaw.greentrash.ui.MainActivity


class SuccessSubs : Fragment() {
    private var _binding: FragmentSuccessSubsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSuccessSubsBinding.inflate(layoutInflater, container, false)
        binding.btnSubscription.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

}