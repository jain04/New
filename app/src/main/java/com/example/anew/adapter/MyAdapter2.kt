package com.example.anew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.anew.R
import com.example.anew.homeFragment
import com.example.anew.model.Imageless

class MyAdapter2(private val context: homeFragment, private val dataSize2:ArrayList<Imageless>):RecyclerView.Adapter<MyAdapter2.MyViewHolder2>() {

    class MyViewHolder2(view:View):RecyclerView.ViewHolder(view){
        val image:ImageView=view.findViewById(R.id.carimg)
        val text2:TextView=view.findViewById(R.id.txt2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
       val layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.loader,parent,false)
        return MyViewHolder2(layoutInflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        val item=dataSize2[position]
        holder.image.setImageResource(item.imgRes)
        holder.text2.text=item.stringRes
    }

    override fun getItemCount()=dataSize2.size
}