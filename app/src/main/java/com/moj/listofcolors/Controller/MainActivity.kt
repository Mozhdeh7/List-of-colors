package com.moj.listofcolors.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.moj.listofcolors.Adapters.ColorAdapter
import com.moj.listofcolors.Model.Color
import com.moj.listofcolors.R
import com.moj.listofcolors.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var myColorList: ListView
    lateinit var myAdapter: ColorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myColorList = findViewById<ListView>(R.id.myListView)
        myAdapter = ColorAdapter(this, DataService.colors)
        myColorList.adapter = myAdapter
    }
}