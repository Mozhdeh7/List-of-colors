package com.moj.listofcolors.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.moj.listofcolors.Model.Color
import com.moj.listofcolors.R

class ColorAdapter(var context: Context, var myList: List<Color>) : BaseAdapter() {
    override fun getCount(): Int {
        return myList.count()
    }

    override fun getItem(p0: Int): Any {
        return myList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0;
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var colorListView: View
        colorListView = LayoutInflater.from(context).inflate(R.layout.list_item, null)

        val myimage = colorListView.findViewById<ImageView>(R.id.imageViewitem)
        val mytext = colorListView.findViewById<TextView>(R.id.textViewitem)

        mytext.text = myList[p0].name

        var resourceID =
            context.resources.getIdentifier(myList[p0].image, "drawable", context.packageName)

        myimage.setImageResource(resourceID)

        return colorListView
    }
}