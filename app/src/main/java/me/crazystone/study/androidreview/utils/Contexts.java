package me.crazystone.study.androidreview.utils;

import android.content.Context;

import me.crazystone.study.androidreview.MainApplication;

/**
 * Created by crazy_stone on 18-2-24.
 */

public class Contexts {

    public static Context getContext(){
        return MainApplication.getApplication();
    }

}
