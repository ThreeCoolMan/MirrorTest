package com.lanou.mirrortest.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by Yi on 16/3/29.
 */
public class BaseApplication extends Application {

    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
