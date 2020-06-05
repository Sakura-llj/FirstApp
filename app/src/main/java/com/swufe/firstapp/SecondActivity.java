package com.swufe.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        score = findViewById(R.id.score);
    }
    public void btnAdd1(View btn){
        showScore(1);
    }

    public void btnAdd2(View btn){
        showScore(2);
    }

    public void btnAdd3(View btn){
        showScore(3);
    }

    public void btnReset(View btn){
        score.setText("0");//重置即显示新成绩(改变用户输出为0)
    }

    private void showScore(int inc){//加一个公共方法，每一次的增量传过来
        Log.i("show","inc=" + inc);
        String oldScore = (String) score.getText();//获取旧成绩（控件已获取），因为score是TextView类型，getText(char),(String)将其转化为字符串
        int newScore = Integer.parseInt(oldScore) + inc;//新成绩int=旧成绩string+int inc，将旧成绩string转化成整数类型int
        score.setText("" + newScore);//显示新成绩（改变用户输出），setText(char)，将新成绩newScore转换成字符串类型
    }
}
