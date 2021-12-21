package com.example.anew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anew.adapter.MyAdapter3
import com.example.anew.model.neural


class settingFragment : Fragment() {

    private lateinit var nrecycleview4:RecyclerView
    private lateinit var arraylist4:ArrayList<neural>
    lateinit var img1:Array<Int>
    lateinit var txt1:Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_setting, container, false)

        img1= arrayOf(
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3,
            R.drawable.d4,
            R.drawable.d5,
            R.drawable.d6,
            R.drawable.d7,
            R.drawable.d9,
            R.drawable.x4,
            R.drawable.x5,
        )

        txt1= arrayOf(
            "Be yourself; everyone else is already taken. ",
            "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
            "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.",
            "You know you're in love when you can't fall asleep because reality is finally better than your dreams.",
            "You only live once, but if you do it right, once is enough.",
            "If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.",
            "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.",
            "Live as if you were to die tomorrow. Learn as if you were to live forever.",
            "I am so clever that sometimes I don't understand a single word of what I am saying.",
            "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment."
        )

        nrecycleview4=view.findViewById(R.id.recycle3)
        nrecycleview4.setHasFixedSize(true)
        arraylist4= arrayListOf()
        addInputData()


        return view
    }

    private fun addInputData() {
        for (i in img1.indices){
            val y=neural(img1[i],txt1[i])
            arraylist4.add(y)
        }
        nrecycleview4.adapter=MyAdapter3(this,arraylist4)
    }


}