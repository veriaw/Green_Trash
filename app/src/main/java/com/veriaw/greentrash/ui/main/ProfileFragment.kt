package com.veriaw.greentrash.ui.main

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.veriaw.greentrash.R
import com.veriaw.greentrash.databinding.FragmentCommunityBinding
import com.veriaw.greentrash.databinding.FragmentProfileBinding
import com.veriaw.greentrash.ui.auth.LoginActivity

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        val sharedPreferences: SharedPreferences = requireActivity().getSharedPreferences("UserPrefs", MODE_PRIVATE)
        binding.btnLogout.setOnClickListener {
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.clear()
            editor.putBoolean("isLoggedIn",false)
            editor.apply()
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}