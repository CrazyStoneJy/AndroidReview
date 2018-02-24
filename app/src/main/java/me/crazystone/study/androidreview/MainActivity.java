package me.crazystone.study.androidreview;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import me.crazystone.study.androidreview.activity_lifecycle.AActivity;
import me.crazystone.study.androidreview.base.BaseActivity;
import me.crazystone.study.androidreview.base.ContentView;
import me.crazystone.study.androidreview.utils.Routers;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @BindView(R.id.main_recyler_view)
    RecyclerView recyclerView;

    List<String> list = new ArrayList<>();

    @Override
    protected void init() {
        setDatas();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new MainAdapter(list));
        MainAdapter adapter = (MainAdapter) recyclerView.getAdapter();
        adapter.setOnItemClickListener((v, p) -> {
            switch (p) {
                case 0:
//                    Views.toast(list.get(p));
                    Routers.startActivity(MainActivity.this, AActivity.class);
                    break;
                default:

                    break;
            }
        });
    }

    private void setDatas() {
        list.add("activity生命周期");
    }


}
