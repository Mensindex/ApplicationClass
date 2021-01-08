package com.example.applicationclass;

import android.app.Application;

public class ApplicationMine extends Application {
    private static ApplicationMine ttt;
    private ApplicationMine() {}
    public static ApplicationMine getInstance() {
        return ttt;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ttt = this;
    }
}
