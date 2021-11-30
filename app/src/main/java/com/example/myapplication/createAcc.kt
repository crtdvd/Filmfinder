package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCreateAccBinding

class createAcc : AppCompatActivity() {

    lateinit var binding: ActivityCreateAccBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        binding.button.setOnClickListener{registerClick()}
    }

    private fun registerClick(){

        if (!binding.inputName.text.isNullOrEmpty() && !binding.inputPass.text.isNullOrEmpty() && !binding.inputName.text.isNullOrEmpty() && !binding.inputMail.text.isNullOrEmpty()) {

            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}