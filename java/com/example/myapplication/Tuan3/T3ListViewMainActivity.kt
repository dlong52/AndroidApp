package com.example.myapplication.Tuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class T3ListViewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter? = null
    var ls = ArrayList<T3Contact>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t3_list_view_main)
        var lv = findViewById<ListView>(R.id.t3ListView)
        ls.add(T3Contact("Nguyen Van A", "20", R.drawable.img1))
        ls.add(T3Contact("Nguyen Van B", "20", R.drawable.img2))
        ls.add(T3Contact("Nguyen Van C", "20", R.drawable.img3))
        ls.add(T3Contact("Nguyen Van D", "20", R.drawable.img4))
        ls.add(T3Contact("Nguyen Van E", "20", R.drawable.img5))

        adapter = T3Adapter(ls, this)
        lv!!.adapter=adapter

    }
}