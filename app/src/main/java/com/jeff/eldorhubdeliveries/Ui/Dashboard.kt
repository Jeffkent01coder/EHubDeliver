package com.jeff.eldorhubdeliveries.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeff.eldorhubdeliveries.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            startActivity(Intent(this, Delivery::class.java))

            binding.imageView4.setOnClickListener {
                startActivity(Intent(this, Profile::class.java))
            }
        }
    }
}