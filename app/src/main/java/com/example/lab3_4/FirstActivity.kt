package com.example.lab3_4

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_4.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener { toSecond() }
        binding.toThird.setOnClickListener { toThird() }
        binding.toAbout.setOnNavigationItemSelectedListener  { toAbout(it) }

    }

    private fun toSecond() {
        startActivity(Intent(this, SecondActivity::class.java))
    }

    private fun toThird() {
        val intent = Intent(this, ThirdActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        startActivity(intent)
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