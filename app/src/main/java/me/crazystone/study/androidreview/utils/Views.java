package me.crazystone.study.androidreview.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by crazy_stone on 18-2-24.
 */

public class Views {

    public static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        context = null;
    }

    public static void toast(String message) {
        toast(Contexts.getContext(), message);
    }

}
