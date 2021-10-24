package com.example.lab3_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_4.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}