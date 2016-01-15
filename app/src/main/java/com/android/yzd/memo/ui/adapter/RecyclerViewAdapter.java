package com.android.yzd.memo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.yzd.memo.R;
import com.android.yzd.memo.ui.adapter.viewholder.RecyclerItemViewHolder;

/**
 * Created by Administrator on 2016/1/15.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private final Context mContext;

    public RecyclerViewAdapter(Context context) {
        mContext = context;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_item_layout, parent, false);
        return new RecyclerItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}