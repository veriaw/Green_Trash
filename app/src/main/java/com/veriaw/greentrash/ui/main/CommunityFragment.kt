package com.veriaw.greentrash.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.veriaw.greentrash.R
import com.veriaw.greentrash.data.entity.PostEntity
import com.veriaw.greentrash.databinding.FragmentCommunityBinding
import com.veriaw.greentrash.databinding.FragmentHomeBinding
import com.veriaw.greentrash.ui.subscription.MitraAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [CommunityFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CommunityFragment : Fragment() {
    private var _binding: FragmentCommunityBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCommunityBinding.inflate(layoutInflater, container, false)
        val dummyPosts = listOf(
            PostEntity(
                nama = "Eco Warrior",
                deskripsi = "Hari ini kami berhasil mengumpulkan 50 kg sampah plastik di pantai. Ayo, bersama-sama kita bersihkan lingkungan!",
                jam = "08:00"
            ),
            PostEntity(
                nama = "Green Community",
                deskripsi = "Mengadakan workshop tentang pengelolaan sampah organik menjadi kompos. Jangan lupa datang minggu depan!",
                jam = "10:30"
            ),
            PostEntity(
                nama = "Save the Earth",
                deskripsi = "Tahukah kamu? Sampah elektronik membutuhkan penanganan khusus agar tidak mencemari lingkungan.",
                jam = "13:00"
            ),
            PostEntity(
                nama = "Clean Up Squad",
                deskripsi = "Aksi bersih-bersih sungai berjalan sukses! Terima kasih kepada semua relawan yang telah membantu.",
                jam = "15:45"
            ),
            PostEntity(
                nama = "Recycle Center",
                deskripsi = "Kami menerima donasi sampah kertas, kardus, dan botol plastik. Yuk, mulai daur ulang dari rumah!",
                jam = "17:20"
            )
        )
        val rvPlaces = binding.rvCommunity
        val adapterMitra = CommunityAdapter(dummyPosts)
        rvPlaces.apply {
            adapter = adapterMitra
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
        return binding.root
    }
}