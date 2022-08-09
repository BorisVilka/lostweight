package com.example.easylossweight;

import android.app.Application;

import com.appsflyer.AppsFlyerLib;

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        AppsFlyerLib.getInstance().init("zbK2wAKKdxkckUX4wA6xDA",null,this);
        AppsFlyerLib.getInstance().start(this);
        AppsFlyerLib.getInstance().setDebugLog(true);
    }
}
