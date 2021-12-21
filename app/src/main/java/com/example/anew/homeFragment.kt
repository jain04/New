package com.example.anew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anew.adapter.MyAdapter2
import com.example.anew.model.Imageless


class homeFragment : Fragment() {

    private lateinit var nrecyclerView:RecyclerView
    private lateinit var arrayList3:ArrayList<Imageless>
    lateinit var img:Array<Int>
    lateinit var txt:Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)


        img= arrayOf(
            R.drawable.a4,
            R.drawable.a8,
            R.drawable.b1,
            R.drawable.b6,
            R.drawable.c8,
            R.drawable.c4,
            R.drawable.a7,
            R.drawable.b1,
            R.drawable.b4,
            R.drawable.b3
        )

        txt= arrayOf(
            "first image",
            "Second image",
            "Third image",
            "Fourth image",
            "Fivth image",
            "Sixth image",
            "Seveth image",
            "Eigth image",
            "Ninth image",
            "Tenth image"
        )

        nrecyclerView=view.findViewById(R.id.recycler2)
        nrecyclerView.setHasFixedSize(true)
        arrayList3= arrayListOf()
        getUserData()


        return view
    }

    private fun getUserData() {
        for (i in img.indices){
            val q=Imageless(img[i],txt[i])
            arrayList3.add(q)
        }
        nrecyclerView.adapter=MyAdapter2(this,arrayList3)
    }


}