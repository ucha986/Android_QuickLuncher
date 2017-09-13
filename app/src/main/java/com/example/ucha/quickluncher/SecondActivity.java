package com.example.ucha.quickluncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.ucha.quickluncher.PARAM"))
        {
            TextView tv = (TextView) findViewById(R.id.textView);
            String s = getIntent().getExtras().getString("com.example.ucha.quickluncher.PARAM");
            tv.setText(s);
        }
    }
}
