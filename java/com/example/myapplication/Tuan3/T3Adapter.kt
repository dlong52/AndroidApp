package com.example.myapplication.Tuan3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class T3Adapter(val list: ArrayList<T3Contact>,val context: Context): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, cvv: View?, p2: ViewGroup?): View {
        var convertView = cvv
        val vax : ViewAX
        if (convertView == null){
            vax = ViewAX()
            convertView = LayoutInflater.from(context).inflate(R.layout.t3_item_view, null)
            vax.ivImg=convertView!!.findViewById(R.id.t3ImageItem)
            vax.tvName = convertView!!.findViewById(R.id.t3NameItem)
            vax.tvAge = convertView!!.findViewById(R.id.t3AgeItem)
            convertView.tag = vax
        }else{
            vax = convertView.tag as ViewAX
        }
        vax.ivImg!!.setImageResource(list[p0].image)
        vax.tvName!!.text = list[p0].name
        vax.tvAge!!.text = list[p0].age
        return convertView

    }
    internal inner class ViewAX{
        var ivImg : ImageView? = null
        var tvName : TextView? = null
        var tvAge : TextView? = null

    }

}