package com.example.myapplication.Tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class T22MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t22_main)
        var listView = findViewById<ListView>(R.id.listView);
        var arr = arrayOf("Item 1","Item 2","Item 3","Item 4","Item 5","Item 6");
        var adapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listView!!.adapter = adapter1;
    }
}