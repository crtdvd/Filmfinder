package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Spinner
import com.example.myapplication.databinding.FilterActivityBinding
import com.example.myapplication.databinding.HomeActivityBinding


class FilterActivity : AppCompatActivity() {

    private lateinit var binding: FilterActivityBinding

    var años: MutableList<String> = mutableListOf()
    var generos: MutableList<String> = mutableListOf("acción", "belica", "comedia","comedia negra","histórica","musical","noir","romántica","thriller","terror")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FilterActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.butBuscar.setOnClickListener { searchCLick() }
        añosInsert()
        val spinner = findViewById<Spinner>(R.id.spn_año1)
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, años)
        spinner.adapter = adaptador
        val spinner2 = findViewById<Spinner>(R.id.spn_año2)
        spinner2.adapter = adaptador
        val spinner3 = findViewById<Spinner>(R.id.spn_genero)
        val adaptador2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, generos)
        spinner3.adapter = adaptador2

    }

    fun añosInsert() {
        for (i in 1980..2021) {
            años.add(i.toString())
        }
    }

    private fun searchCLick(){
        val intent = Intent(this,results::class.java)
        startActivity(intent)
    }
}