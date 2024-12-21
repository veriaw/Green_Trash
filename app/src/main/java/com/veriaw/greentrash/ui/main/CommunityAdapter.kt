package com.veriaw.greentrash.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.veriaw.greentrash.data.entity.Mitra
import com.veriaw.greentrash.data.entity.PostEntity
import com.veriaw.greentrash.databinding.ItemPostBinding
import com.veriaw.greentrash.databinding.ItemTpaBinding
import com.veriaw.greentrash.ui.subscription.MitraAdapter

class CommunityAdapter(private val postList: List<PostEntity>): RecyclerView.Adapter<CommunityAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: ItemPostBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(post: PostEntity) {
            binding.userName.text=post.nama
            binding.tvDescription.text=post.deskripsi
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = postList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val post = postList[position]
        holder.bind(post)
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<PostEntity>() {
            override fun areItemsTheSame(oldItem: PostEntity, newItem: PostEntity): Boolean {
                return oldItem == newItem
            }
            override fun areContentsTheSame(oldItem: PostEntity, newItem: PostEntity): Boolean {
                return oldItem == newItem
            }
        }
    }
}