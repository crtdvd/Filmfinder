package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserAccount : AppCompatActivity() {

    lateinit var mRecyclerView : RecyclerView
    val mAdapter : RecyclerAdapterFavoritos = RecyclerAdapterFavoritos()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_account)
        setUpRecyclerView()
    }
    fun setUpRecyclerView(){

        mRecyclerView = findViewById(R.id.rv_pelisFavoritas) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getPeliculas(), this)
        mRecyclerView.adapter = mAdapter
    }
    fun getPeliculas(): MutableList<PelisFavoritas>{

        var pelis:MutableList<PelisFavoritas> = ArrayList()
        return pelis
    }
}