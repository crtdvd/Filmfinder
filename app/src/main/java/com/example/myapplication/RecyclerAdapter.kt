package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var pelis: MutableList<Peliculas> = ArrayList()
    lateinit var context: Context

    fun RecyclerAdapter(pelis: MutableList<Peliculas>, context: Context) {
        this.pelis = pelis
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pelis.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_result, parent, false))
    }

    override fun getItemCount(): Int {
        return pelis.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val titulo = view.findViewById(R.id.tv_titulo) as TextView
        val año = view.findViewById(R.id.tv_año) as TextView
        val director = view.findViewById(R.id.tv_director) as TextView
        val poster = view.findViewById(R.id.iv_poster) as ImageView

        fun bind(pelicula: Peliculas, context: Context) {
            titulo.text = pelicula.titulo
            año.text = pelicula.año
            director.text = pelicula.director
            itemView.setOnClickListener(View.OnClickListener {
                Toast.makeText(
                    context,
                    pelicula.titulo,
                    Toast.LENGTH_SHORT
                ).show()
            })
            poster.loadUrl(pelicula.photo)
        }

        fun ImageView.loadUrl(url: String) {
            Picasso.with(context).load(url).into(this)
        }
    }
}