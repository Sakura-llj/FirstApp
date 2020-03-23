package com.swufe.firstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText input;
    private Button btn;
    private TextView txtout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过findViewById方法获取控件
        input = findViewById(R.id.input);
        String str = input.getText().toString();

        btn = findViewById(R.id.btn);
        btn.setText("转换为华氏温度");
        btn.setOnClickListener(this);

        txtout = findViewById(R.id.txtout);
        Log.i("main", "input=" + str);
    }

    @Override
    public void onClick(View v) {
        Log.i("click", "onClick.....");

        String str = input.getText().toString();
        Double num = Double.valueOf(input.getText().toString());
        Double result = num * 1.8 + 32;
        txtout.setText("结果为：" + result);
    }
}
