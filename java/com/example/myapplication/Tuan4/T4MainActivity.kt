package com.example.myapplication.Tuan4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class T4MainActivity : AppCompatActivity() {
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t4_main)
        var btnGet = findViewById<Button>(R.id.T4GetDataBtn)
        var tvKq = findViewById<TextView>(R.id.T4TvKq)
        val fn1 = T4VolleyFn()
        btnGet!!.setOnClickListener{
            fn1.getAllData(context, tvKq!!)
        }
    }
}