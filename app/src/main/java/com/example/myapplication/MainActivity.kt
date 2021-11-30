package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.loginBut.setOnClickListener{loginVerify()}
        binding.butRegistro.setOnClickListener{registry()}
    }

    private fun loginVerify(){

        if (!binding.inputUser.text.isNullOrEmpty() && !binding.inputPass.text.isNullOrEmpty()){

            val intent =  Intent(this,HomeActivity::class.java)
            startActivity(intent)

        }
    }

    private fun registry(){

        val intent =  Intent(this,createAcc::class.java)
        startActivity(intent)
    }
}