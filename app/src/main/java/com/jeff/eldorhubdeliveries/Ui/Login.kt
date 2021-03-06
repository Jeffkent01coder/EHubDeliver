package com.jeff.eldorhubdeliveries.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeff.eldorhubdeliveries.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)

        binding?.btnLogin?.setOnClickListener {
            val inputs = arrayOf(binding?.usernameLogin, binding?.userPass)
            var filled = true
            inputs.forEach { input ->
                filled = filled && input!!.text!!.isNotEmpty()
                if (!filled){
                    input?.error = "required"
                }
            }.also {
                if (filled){
                    // Authenticate with firebase later
                    startActivity(Intent(this, Dashboard::class.java))
                    finish()
                }
            }
        }

        binding?.tvAlreadyHaveAcc?.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
            finish()
        }
    }
}