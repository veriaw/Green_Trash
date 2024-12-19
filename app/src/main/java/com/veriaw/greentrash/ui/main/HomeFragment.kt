package com.veriaw.greentrash.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.veriaw.greentrash.R
import com.veriaw.greentrash.databinding.FragmentConfirmationBinding
import com.veriaw.greentrash.databinding.FragmentFormBinding
import com.veriaw.greentrash.databinding.FragmentHomeBinding
import com.veriaw.greentrash.ui.subscription.MitraFragment
import com.veriaw.greentrash.ui.subscription.SubscriptionActivity


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        binding.btnSubscription.setOnClickListener {
            val intent = Intent(requireContext(), SubscriptionActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}