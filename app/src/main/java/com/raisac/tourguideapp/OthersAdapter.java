package com.raisac.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OthersAdapter extends RecyclerView.Adapter<OthersAdapter.MyViewHolder> {

    private ArrayList<OtherInfo> infoArrayAdapter;
    Context context;

    public OthersAdapter(ArrayList<OtherInfo> infoArrayAdapter, Context context) {
        this.infoArrayAdapter = infoArrayAdapter;
        this.context = context;
    }

    @NonNull
    @Override
    public OthersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.other_info_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OthersAdapter.MyViewHolder holder, int position) {

        holder.condition1.setText(infoArrayAdapter.get(position).getConsition1());
        holder.condition2.setText(infoArrayAdapter.get(position).getCondition2());
    }

    @Override
    public int getItemCount() {
        return infoArrayAdapter.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.condition1)
        TextView condition1;

        @BindView(R.id.condition2)
        TextView condition2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
