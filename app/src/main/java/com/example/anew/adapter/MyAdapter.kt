package com.example.anew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.anew.R
import com.example.anew.firstFragment
import com.example.anew.model.SomeLess

class MyAdapter(private val context: firstFragment, private val dataSize:ArrayList<SomeLess>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imageView:ImageView=view.findViewById(R.id.img)
        val textView:TextView=view.findViewById(R.id.txt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.coolpad,parent,false)
        return MyViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item=dataSize[position]
        holder.imageView.setImageResource(item.titleImage)
        holder.textView.text=item.stringResource
    }

    override fun getItemCount()=dataSize.size
}