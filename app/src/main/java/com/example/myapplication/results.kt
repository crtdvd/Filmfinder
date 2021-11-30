package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityResultsBinding
import com.example.myapplication.databinding.FilterActivityBinding

class results : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding
    lateinit var mRecyclerView : RecyclerView
    val mAdapter : RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        val view = binding.root
        binding.userIcon.setOnClickListener{userClick()}
        setContentView(view)
        setUpRecyclerView()
    }
    fun setUpRecyclerView(){

        mRecyclerView = findViewById(R.id.rv_pelis) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getPeliculas(), this)
        mRecyclerView.adapter = mAdapter
    }
    fun getPeliculas(): MutableList<Peliculas>{

        var pelis:MutableList<Peliculas> = ArrayList()
        return pelis
    }

    private fun userClick(){

        var intent = Intent(this, UserAccount::class.java)
        startActivity(intent)

    }
}