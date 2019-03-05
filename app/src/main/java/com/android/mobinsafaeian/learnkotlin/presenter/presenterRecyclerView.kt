package com.android.mobinsafaeian.learnkotlin.presenter

import com.android.mobinsafaeian.learnkotlin.model.ListItem
import com.android.mobinsafaeian.learnkotlin.view.itemView

class presenterRecyclerView {
    var listItems:List<ListItem>
    lateinit var item:ListItem

    constructor(listItems: List<ListItem>) {
        this.listItems = listItems
    }

    public fun onBindRecyclerView(position:Int , holder: itemView){
        item = listItems[position]
        holder.setItemText(item.itemName)
    }
    public fun getRecyclerViewItemSize():Int {
        return listItems.size
    }

}