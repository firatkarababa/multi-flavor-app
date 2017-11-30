package com.sample.multiflavorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);

        if(BuildConfig.FLAVOR.equals("whitneyhoustonFull")) {
            textView.setText("Whitney Houston");
        }
        else if(BuildConfig.FLAVOR.equals("elvispresleyDemo")) {
            textView.setText("Elvis Presley");
        }
    }
}
