package me.crazystone.study.androidreview.utils;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by crazy_stone on 18-2-24.
 */

public class Routers {

    public static void startActivity(Activity from, Class<? extends Activity> to) {
        if (from != null) {
            Intent intent = new Intent();
            intent.setClass(from, to);
            from.startActivity(intent);
        }
        from = null;
        to = null;
    }

}
