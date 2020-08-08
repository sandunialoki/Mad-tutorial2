package com.example.usingstrings;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i( "Lifecycle", "onCreate() invoked");
    }
    public void onStart()
    {
        super.onStart();
        Log.i( "Lifecycle", "onStart() invoked");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.i( "Lifecycle", "onRestart() invoked");
    }

    public void onResume()
    {
        super.onResume();
        Log.i( "Lifecycle", "onResume() invoked");
    }

    public void onPause()
    {
        super.onPause();
        Log.i( "Lifecycle", "onPause() invoked");
    }

    public void onStop()
    {
        super.onStop();
        Log.i( "Lifecycle", "onStop() invoked");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i( "Lifecycle", "onDestroy() invoked");
    }
}