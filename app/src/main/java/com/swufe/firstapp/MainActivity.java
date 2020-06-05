package com.swufe.firstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView out;
    EditText inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = findViewById(R.id.showText);//TextVtew在上面import class
        inp = findViewById(R.id.inpText);

        Button btn = findViewById(R.id.btn1);//Button在上面import class,button要进行事件处理必须设置监听
        //btn.setOnClickListener(this);//btn.setOnClickListener()可以设置当前类监听，也可以设置匿名类监听,按下button时调用this对象的onClick方法
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("main","onClick called....");
//
//                String str = inp.getText().toString();//获取用户输入，.toString是将获取的类型变成字符串
//                out.setText("Hello " + str);
//            }
//        });

        //System.out.print("input" + str);Java中的输出处理
        //Log.i("main","input" + str);//Log在上面import class,日志处理
    }

//    @Override
//    public void onClick(View v) {
//        Log.i("click","onclick .....");
//
//        //TextView tv = findViewById(R.id.showText);
//        //EditText inp = findViewById(R.id.inpText);
//        String str = inp.getText().toString();//获取用户输入，.toString是将获取的类型变成字符串
//
//        out.setText("Hello " + str);//改变用户输出
//    }

    public void btnClick(View btn){
        Log.i("click","btnClick called....");
    }
}
