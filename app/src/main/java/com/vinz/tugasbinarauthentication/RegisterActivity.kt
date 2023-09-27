package com.vinz.tugasbinarauthentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vinz.tugasbinarauthentication.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setupBinding()
        setContentView(view)
    }
    private fun setupBinding(){
        binding.apply {
            btnRegister.setOnClickListener {
                // navigation goes here
            }
        }
    }
}