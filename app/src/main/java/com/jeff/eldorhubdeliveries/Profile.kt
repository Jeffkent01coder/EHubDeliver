package com.jeff.eldorhubdeliveries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeff.eldorhubdeliveries.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}