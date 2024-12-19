package com.veriaw.greentrash.ui.subscription

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.veriaw.greentrash.data.entity.Mitra
import com.veriaw.greentrash.databinding.FragmentProfileBinding
import com.veriaw.greentrash.databinding.ItemTpaBinding

class MitraAdapter(private val mitraList: List<Mitra>): RecyclerView.Adapter<MitraAdapter.MitraViewHolder>() {
    class MitraViewHolder(val binding: ItemTpaBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(mitra: Mitra) {
            binding.placeName.text=mitra.nama
            binding.tvLocation.text=mitra.lokasi
            binding.tvSchedule.text=mitra.jadwal
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MitraViewHolder {
        val binding = ItemTpaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MitraViewHolder(binding)
    }

    override fun getItemCount(): Int = mitraList.size

    override fun onBindViewHolder(holder: MitraViewHolder, position: Int) {
        val mitra = mitraList[position]
        holder.bind(mitra)
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Mitra>() {
            override fun areItemsTheSame(oldItem: Mitra, newItem: Mitra): Boolean {
                return oldItem == newItem
            }
            override fun areContentsTheSame(oldItem: Mitra, newItem: Mitra): Boolean {
                return oldItem == newItem
            }
        }
    }
}