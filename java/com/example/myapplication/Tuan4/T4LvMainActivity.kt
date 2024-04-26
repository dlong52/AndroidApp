package com.example.myapplication.Tuan4

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import com.example.myapplication.R

class T4LvMainActivity : AppCompatActivity() {
    var context:Context = this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t4_lv_main)
        var listView = findViewById<ListView>(R.id.t4Lv)
        val fn1 = T4VolleyListView()

        fn1.getAllData(context, listView!!)

    }
}