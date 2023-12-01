package com.example.ishw7_month3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ishw7_month3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val musicList = arrayListOf(
        Music("1", "Blank Space", "Taylor Swift", "3:22"),
        Music("2", "Watch Me", "Silento", "5:36"),
        Music("3", "Earned It", "The Weekend", "4:51"),
        Music("4", "The Hills", "The Weekend", "3:41"),
        Music("5", "Writing’s On The Wall", "The Hils", "5:33"),
        Music("6", "Dragula", "Rob Zombie", "5:53"),
        Music("7", "Faggot", "MSI", "4:13"),
        Music("8", "Kabluk", "Jah Khalib", "3:25"),
        Music("9", "Za kulisami", "Tbili", "2:43"),
        Music("10", "991", "Jah Khalib", "3:15"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adaptor = MusicAdaptor(musicList, this::onClick)
        binding.rv.adapter = adaptor
    }
    private fun onClick(position: Int) {
        val intent = Intent(activity, MainActivity2::class.java)
        intent.putExtra("key", musicList[position].name)
        startActivity(intent)
    }
}
