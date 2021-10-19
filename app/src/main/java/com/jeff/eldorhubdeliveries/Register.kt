package com.jeff.eldorhubdeliveries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeff.eldorhubdeliveries.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding?.btnRegister?.setOnClickListener {
            val inputs = arrayOf(binding?.usernameLogin, binding?.etUserEmail, binding?.etUserPass, binding?.etUserPhone)
            var filled = true
            inputs.forEach { input ->
                filled = filled && input!!.text!!.isNotEmpty()
                if (!filled){
                    input?.error = "required"
                }
            }.also {
                if (filled){
                    // Authenticate with firebase later
                    startActivity(Intent(this, Login::class.java))
                    finish()
                }
            }
        }

        binding?.tvAlreadyHaveAcc?.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }
    }

}