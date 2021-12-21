package com.example.anew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.anew.R
import com.example.anew.model.neural
import com.example.anew.settingFragment

class MyAdapter3(private val context: settingFragment, private val sizeable:ArrayList<neural>):RecyclerView.Adapter<MyAdapter3.MyViewHolder3>() {

    class MyViewHolder3(view: View):RecyclerView.ViewHolder(view){
        val image:ImageView=view.findViewById(R.id.tig_img)
        val text:TextView=view.findViewById(R.id.txt_tig)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder3 {
        val layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.cartoon,parent,false)
        return MyViewHolder3(layoutInflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder3, position: Int) {
        val item=sizeable[position]
        holder.image.setImageResource(item.img1)
        holder.text.text=item.res1
    }

    override fun getItemCount()=sizeable.size
}