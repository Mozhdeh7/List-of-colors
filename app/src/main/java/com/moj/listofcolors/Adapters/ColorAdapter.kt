package com.moj.listofcolors.Adapters

import android.content.Context
import android.util.Log
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
        val colorListView: View
        var holder = ViewHolder()

        if (p1 == null) {

            colorListView = LayoutInflater.from(context).inflate(R.layout.list_item, null)
            holder.ColorImageView = colorListView.findViewById(R.id.imageViewitem)
            holder.ColorTextView = colorListView.findViewById(R.id.textViewitem)
            Log.i("perform", "create a new row!")
            colorListView.tag = holder // tag colorListView to using holder
        } else {
            Log.i("perform", "Recycle!")
            holder = p1.tag as ViewHolder
            colorListView = p1 // to recycle

        }



        holder.ColorTextView?.text = myList[p0].name

        val resourceID =
            context.resources.getIdentifier(myList[p0].image, "drawable", context.packageName)

        holder.ColorImageView?.setImageResource(resourceID)


        return colorListView
    }
}

class ViewHolder {
    var ColorImageView: ImageView? = null
    var ColorTextView: TextView? = null
}