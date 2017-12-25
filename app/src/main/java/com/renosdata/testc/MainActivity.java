package com.renosdata.testc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.renosdata.hellojni.JniUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvshow = (TextView) findViewById(R.id.tv);
        tvshow.setText("" + JniUtil.hello());
    }
}
