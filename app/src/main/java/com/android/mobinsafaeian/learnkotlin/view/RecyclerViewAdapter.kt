package com.android.mobinsafaeian.learnkotlin.view

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.mobinsafaeian.learnkotlin.R
import com.android.mobinsafaeian.learnkotlin.model.ListItem
import com.android.mobinsafaeian.learnkotlin.presenter.presenterRecyclerView
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerViewAdapter(private val presenter:presenterRecyclerView , private val context:Context): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item , parent , false))
    }

    override fun getItemCount(): Int {
        return presenter.getRecyclerViewItemSize()
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        presenter.onBindRecyclerView(position , holder)
    }

    class ViewHolder(view:View): RecyclerView.ViewHolder(view) , itemView{
        var itemTxt = view.recycler_view_text

        override fun setItemText(txt: String?) {
            itemTxt.text = txt
        }
    }

}