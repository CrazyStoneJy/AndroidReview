package me.crazystone.study.androidreview.utils;

import android.util.Log;

import me.crazystone.study.androidreview.BuildConfig;

/**
 * Created by crazy_stone on 18-2-24.
 */

public class Logs {

    private static boolean isDebug = BuildConfig.DEBUG;
    private static String TAG = "TAG";

    public static void d(String tag, String message) {
        if (isDebug) {
            Log.i(tag, message);
        }
    }

    public static void d(String message) {
        d(TAG, message);
    }

    public static void i(String message) {
        i(TAG, message);
    }

    public static void i(String tag, String message) {
        if (isDebug) {
            Log.i(tag, message);
        }
    }

}
