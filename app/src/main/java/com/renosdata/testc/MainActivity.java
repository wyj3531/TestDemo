package com.renosdata.testc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.renosdata.hellojni.JniUtil;
import com.renosdata.testc.mvp.view.Main2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvshow = (TextView) findViewById(R.id.tv);
         findViewById(R.id.btmvp).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this, Main2Activity.class));
             }
         });
        tvshow.setText("" + JniUtil.hello());
        System.out.print("我是小白，第一次提交代码啊");

    }
}
