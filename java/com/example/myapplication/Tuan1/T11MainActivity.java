package com.example.myapplication.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class T11MainActivity extends AppCompatActivity {
    EditText ip1, ip2;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t11_main);
        ip1 = findViewById(R.id.ip1);
        ip2 = findViewById(R.id.ip2);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);
        button.setOnClickListener(v -> {
            tinhTong();
        });

    };
    private void tinhTong(){
        String str1 = ip1.getText().toString();
        float num1 = Float.parseFloat(str1);
        String str2 = ip2.getText().toString();
        float num2 = Float.parseFloat(str2);
        Float tong = num1 + num2;
        result.setText(String.valueOf(tong));
    }
}