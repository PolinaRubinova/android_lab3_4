package com.example.lab3_4

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toFirst.setOnClickListener { finish() }
        binding.toThird.setOnClickListener { toThird() }
        binding.toAbout.setOnNavigationItemSelectedListener  { toAbout(it) }
    }

    private fun toThird() {
        startActivity(Intent(this, ThirdActivity::class.java))
    }

    private fun toAbout(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
        return false
    }
}