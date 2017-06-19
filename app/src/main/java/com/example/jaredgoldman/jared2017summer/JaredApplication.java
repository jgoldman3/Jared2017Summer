package com.example.jaredgoldman.jared2017summer;

import android.app.Application;

import com.example.jaredgoldman.jared2017summer.util.UtilLog;

/**
 * Created by jaredgoldman on 6/19/17.
 */

public class JaredApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true); //set to false before submitting to google
    }
}
