package com.jeff.eldorhubdeliveries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import com.jeff.eldorhubdeliveries.databinding.ActivityDeliveryBinding

class Delivery : AppCompatActivity() {
    private lateinit var binding: ActivityDeliveryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDeliveryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)

        binding.Payment.setOnClickListener {
            startActivity(Intent(this, PaymentMethod::class.java))
        }


        binding.radioButton.setOnClickListener {
            selectOrUnselectRadioButton(binding.radioButton.isChecked, binding.radioButton)
        }
        binding.radio1.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio1.isChecked, binding.radio1)
        }
        binding.radio2.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio2.isChecked, binding.radio2)
        }
        binding.radio3.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio3.isChecked, binding.radio3)
        }
        binding.radio4.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio4.isChecked, binding.radio4)
        }
        binding.radio5.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio5.isChecked, binding.radio5)
        }
        binding.radio6.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio6.isChecked, binding.radio6)
        }
        binding.radio7.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio7.isChecked, binding.radio7)
        }
        binding.radio8.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio8.isChecked, binding.radio8)
        }
        binding.radio9.setOnClickListener {
            selectOrUnselectRadioButton(binding.radio9.isChecked, binding.radio9)
        }

    }

    private fun selectOrUnselectRadioButton(bool: Boolean, button: RadioButton) {
        button.isChecked = !bool
    }
}