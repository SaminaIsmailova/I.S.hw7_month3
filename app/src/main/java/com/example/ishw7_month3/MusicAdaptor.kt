package com.example.ishw7_month3

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.ishw7_month3.databinding.ItemSongBinding

class MusicAdaptor(
    private var list: ArrayList<Music>,
    private val onClick: (position: Int) -> Unit
) :
    RecyclerView.Adapter<MusicAdaptor.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemSongBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            onClick(position)
        }
    }

    inner class MusicViewHolder(private var binding: ItemSongBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(music: Music) {
            binding.run {
                number.text = music.number
                name.text = music.name
                singer.text = music.singer
                time.text = music.time

            }
        }
    }

}