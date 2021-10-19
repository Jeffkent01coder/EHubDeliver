package com.jeff.eldorhubdeliveries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.jeff.eldorhubdeliveries.databinding.ActivityProfileBinding
import com.jeff.eldorhubdeliveries.databinding.EditProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)

       binding.editProfile.setOnClickListener {
           val dialogView = EditProfileBinding.inflate(layoutInflater)
           val mBuilder = AlertDialog.Builder(this)
               .setView(dialogView.root)
               .setTitle("Change Profile")

           mBuilder.create().show()

           dialogView.btnCancel.setOnClickListener {
               mBuilder.create().cancel()
           }
       }

        binding.changePass.setOnClickListener {
            val dialogView = EditProfileBinding.inflate(layoutInflater)
            val mBuilder = AlertDialog.Builder(this)
                .setView(dialogView.root)
                .setTitle("Change Password")

            mBuilder.create().show()

            dialogView.btnCancel.setOnClickListener {
                mBuilder.create().cancel()
            }
        }
    }
}