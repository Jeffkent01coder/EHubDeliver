package com.jeff.eldorhubdeliveries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.jeff.eldorhubdeliveries.databinding.ActivityPaymentMethodBinding
import com.jeff.eldorhubdeliveries.databinding.EditProfileBinding
import com.jeff.eldorhubdeliveries.databinding.LipaBinding

class PaymentMethod : AppCompatActivity() {
     private lateinit var binding: ActivityPaymentMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPaymentMethodBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)

        binding.ivMpesa.setOnClickListener {
            val dialogView = LipaBinding.inflate(layoutInflater)
            val mBuilder = AlertDialog.Builder(this)
                .setView(dialogView.root)
                .setTitle("Lipa Na MPESA")

            mBuilder.create().show()

            dialogView.btnCancel3.setOnClickListener {
                mBuilder.create().cancel()
            }
        }
    }
}