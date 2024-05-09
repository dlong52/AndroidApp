package com.example.myapplication.Tuan5

import android.R
import android.content.Context
import android.widget.ArrayAdapter
import android.widget.ListView
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class T5VolleyListView {
    fun getAllData(context: Context, listView: ListView) {
        val url = "https://hungnttg.github.io/array_json_new.json"
        val dataList = ArrayList<String>()

        // Tạo request
        val request = JsonArrayRequest(
            url,
            { response ->
                // Xử lý phản hồi thành công từ server
                for (i in 0 until response.length()) {
                    val product: JSONObject = response.getJSONObject(i)
                    val name = product.getString("name")
                    val gia = product.getString("email")


                    // Tạo chuỗi hiển thị thông tin
                    val personInfo = "Name: $name\nEmail: $gia\n"
                    dataList.add(personInfo)
                }

                // Tạo Adapter
                val adapter = ArrayAdapter(context, R.layout.simple_list_item_1, dataList)

                // Thiết lập Adapter cho ListView
                listView.adapter = adapter
            },
            { error ->
                // Xử lý khi có lỗi xảy ra trong quá trình request

            }
        )

        // Thêm request vào hàng đợi của Volley để thực hiện
        Volley.newRequestQueue(context).add(request)
    }
}