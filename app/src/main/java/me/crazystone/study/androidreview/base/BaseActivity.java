package me.crazystone.study.androidreview.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by crazy_stone on 18-2-24.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView2();
        ButterKnife.bind(this);
        init();
    }

    protected void init() {

    }

    private void setContentView2() {
        Class<? extends Activity> cls = getClass();
        boolean hasContentView = cls.isAnnotationPresent(ContentView.class);
        if (hasContentView) {
            ContentView contentView = cls.getAnnotation(ContentView.class);
            int layoutId = contentView.value();
            setContentView(layoutId);
        } else {
            throw new RuntimeException("you has not set content view");
        }
    }

//    protected abstract void setLayout();

}
