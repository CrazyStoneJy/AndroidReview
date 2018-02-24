package me.crazystone.study.androidreview;

import android.app.Application;

/**
 * Created by crazy_stone on 18-2-24.
 */

public class MainApplication extends Application {

    public static MainApplication thiz;

    public static Application getApplication() {
        return thiz;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        thiz = this;
    }
}
