package com.example.myapplication.Tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class T21MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t21_main_result)
        var result = findViewById<TextView>(R.id.result2);
        var i1 = intent;
        var chuoi1 = i1.extras!!.getString("so1");
        var so1 = chuoi1!!.toFloat();
        var chuoi2 = i1.extras!!.getString("so2");
        var so2 = chuoi2!!.toFloat();
        var tong = so1+so2;
        result!!.text = tong.toString();
    }
}