package com.example.usingstrings;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ActivityOne extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView txTvMsg2 = findViewById(R.id.TvMsg2);
        txTvMsg2.setText(R.string.Msg2);
    }
}