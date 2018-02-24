package me.crazystone.study.androidreview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by crazy_stone on 18-2-24.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    OnItemClickListener callback;
    private List<String> list;

    public MainAdapter(List<String> list) {
        this.list = list;
    }

    public void setOnItemClickListener(OnItemClickListener callback) {
        this.callback = callback;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), android.R.layout.simple_list_item_1, null);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.txt_label.setText(list.get(position));
        holder.itemView.setOnClickListener(v -> {
            if (callback != null) {
                callback.onItemClick(holder.itemView, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int pos);
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {

        TextView txt_label;
        View itemView;

        public MainViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            txt_label = itemView.findViewById(android.R.id.text1);
        }
    }

}
