package com.android.mobinsafaeian.learnkotlin.view


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.android.mobinsafaeian.learnkotlin.R
import com.android.mobinsafaeian.learnkotlin.model.ListItem
import com.android.mobinsafaeian.learnkotlin.presenter.presenterRecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var listItems:ArrayList<ListItem>
    private lateinit var adapter:RecyclerViewAdapter
    private lateinit var presenter:presenterRecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializations
        init()

        //initialize recyclerView
        initRecyclerView()
    }

    private fun initRecyclerView() {
        for (i in 1..25)
             listItems.add(ListItem("item $i"))
        adapter.notifyDataSetChanged()
    }

    private fun init() {
        listItems = ArrayList()
        presenter = presenterRecyclerView(listItems)
        adapter = RecyclerViewAdapter(presenter, this)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter
    }

}
