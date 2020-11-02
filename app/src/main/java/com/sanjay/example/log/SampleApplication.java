package com.sanjay.example.log;

import android.app.Application;

import com.sanjaydevtech.log.Cout;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Cout.init(true);
        }
    }
}
