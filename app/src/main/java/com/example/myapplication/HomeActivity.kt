package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.HomeActivityBinding


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: HomeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.imgButFilter.setOnClickListener{filterClick()}
        binding.userIcon.setOnClickListener{userClick()}

    }

    private fun filterClick(){
        val intent =  Intent(this,FilterActivity::class.java)
        startActivity(intent)
    }

    private fun userClick(){

        val intent =  Intent(this,UserAccount::class.java)
        startActivity(intent)
    }

}