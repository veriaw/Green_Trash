package com.veriaw.greentrash.ui.subscription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.veriaw.greentrash.R
import com.veriaw.greentrash.data.entity.Mitra
import com.veriaw.greentrash.databinding.FragmentFormBinding
import com.veriaw.greentrash.databinding.FragmentMitraBinding

class MitraFragment : Fragment() {
    private var _binding: FragmentMitraBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMitraBinding.inflate(layoutInflater, container, false)

        val mitraList = listOf(
            Mitra("TPS Piyungan", "Senin, Jumat", "Kledokan, Caturtunggal"),
            Mitra("TPS Piyungan", "Senin, Jumat", "Kledokan, Caturtunggal"),
            Mitra("TPS Piyungan", "Senin, Jumat", "Kledokan, Caturtunggal"),
            Mitra("TPS Piyungan", "Senin, Jumat", "Kledokan, Caturtunggal")
        )

        val rvPlaces = binding.rvMitra
        val adapterMitra = MitraAdapter(mitraList)
        rvPlaces.apply {
            adapter = adapterMitra
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }

        binding.btnSubscription.setOnClickListener {
            navigateToFragment(ConfirmationFragment())
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