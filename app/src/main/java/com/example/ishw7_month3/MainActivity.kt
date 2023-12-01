package com.example.ishw7_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container1, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container2, SecondFragment()).commit()
    }
}