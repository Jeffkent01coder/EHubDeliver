package com.jeff.eldorhubdeliveries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeff.eldorhubdeliveries.databinding.ActivityDeliveryBinding

class Delivery : AppCompatActivity() {
    private lateinit var binding: ActivityDeliveryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDeliveryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}