package me.crazystone.study.androidreview.activity_lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import butterknife.BindView;
import me.crazystone.study.androidreview.R;
import me.crazystone.study.androidreview.base.BaseActivity;
import me.crazystone.study.androidreview.base.ContentView;
import me.crazystone.study.androidreview.utils.Logs;

/**
 * Created by crazy_stone on 18-2-24.
 */
@ContentView(R.layout.activity_test)
public class AActivity extends BaseActivity {

    @BindView(R.id.test_txt)
    TextView txt;

    @Override
    protected void init() {
        txt.setText("A activity");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logs.d("onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logs.d("onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logs.d("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logs.d("onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logs.d("onDestory");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Logs.d("onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Logs.d("onSaveInstanceState");
    }
}
