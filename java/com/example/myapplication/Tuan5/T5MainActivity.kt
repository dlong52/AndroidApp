package com.example.myapplication.Tuan5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class T5MainActivity : AppCompatActivity() {
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t5_main)
        var listView = findViewById<ListView>(R.id.t5Lv)
        val fn1 = T5VolleyListView()

        fn1.getAllData(context, listView!!)
    }
}