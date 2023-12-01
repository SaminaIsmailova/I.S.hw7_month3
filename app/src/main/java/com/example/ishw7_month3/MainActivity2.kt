package com.example.ishw7_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ishw7_month3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var name = intent.getStringExtra("key")
        binding.name.text = name
    }
}