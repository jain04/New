package com.example.anew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anew.adapter.MyAdapter
import com.example.anew.model.SomeLess


class firstFragment : Fragment() {

    private lateinit var newRecyclerView:RecyclerView
    private lateinit var newArrayList:ArrayList<SomeLess>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_first, container, false)

        imageId= arrayOf(

            R.drawable.a1,
            R.drawable.a7,
            R.drawable.b1,
            R.drawable.b3,
            R.drawable.c8,
            R.drawable.d4,
            R.drawable.x5,
            R.drawable.x7,
            R.drawable.y4,
            R.drawable.y6
        )
        //here we are adding array of String in to the title
        heading= arrayOf(

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

        newRecyclerView=view.findViewById(R.id.recycle)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf()
        getUserData()

        return view
    }

    private fun getUserData() {

        for (i in imageId.indices){

            val z=SomeLess(imageId[i],heading[i])
            newArrayList.add(z)
        }
        newRecyclerView.adapter=MyAdapter(this,newArrayList)
    }


}