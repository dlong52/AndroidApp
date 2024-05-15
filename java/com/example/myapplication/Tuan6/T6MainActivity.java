package com.example.myapplication.Tuan6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class T6MainActivity extends AppCompatActivity {
    private ListView listView;
    private T6Adapter adapter;
    private List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t6_main);
        listView = findViewById(R.id.lvT6);
        productList = new ArrayList<>();
        adapter = new T6Adapter(this, productList);
        listView.setAdapter(adapter);
        new FetchProductTask().execute();
    }
    private class  FetchProductTask extends AsyncTask<Void, Void, String>{
        @Override
        protected String doInBackground(Void... voids) {
            StringBuilder response = new StringBuilder();
            try {
                URL url = new URL("https://hungnttg.github.io/shopgiay.json");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line = "";
                while ((line=reader.readLine()) != null){
                    response.append(line);
                }
                reader.close();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return response.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            if (s != null && !s.isEmpty()){
                try {
                    JSONObject json = new JSONObject(s);
                    JSONArray productArr = json.getJSONArray("products");
                    for(int i=0; i<productArr.length(); i++){
                        JSONObject productObj = productArr.getJSONObject(i);
                        String styleId = productObj.getString("styleid");
                        String brand = productObj.getString("brands_filter_facet");
                        String price = productObj.getString("price");
                        String addInfo = productObj.getString("product_additional_info");
                        String image = productObj.getString("search_image");
                        Product product = new Product(styleId, brand,price, addInfo, image);
                        productList.add(product);
                    }
                    adapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }else{
                Toast.makeText(T6MainActivity.this, "Faill to fetch", Toast.LENGTH_LONG);
            }
        }
    }
}