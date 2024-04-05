package com.example.myapplication.Tuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R

class T21MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t21_main)
        var ip1 = findViewById<EditText>(R.id.ip21);
        var ip2 = findViewById<EditText>(R.id.ip22);

        var button = findViewById<Button>(R.id.button2);

        button!!.setOnClickListener {
            var i = Intent(this@T21MainActivity, T21MainActivityResult::class.java);
            i.putExtra("so1", ip1!!.text.toString());
            i.putExtra("so2", ip2!!.text.toString());
            startActivity(i);
        }
    }
}