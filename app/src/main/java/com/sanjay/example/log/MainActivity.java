package com.sanjay.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sanjaydevtech.log.Cout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cout.v("Hi from onCreate");
    }
}