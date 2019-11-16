package com.raisac.tourguideapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class tourGuideAdapter extends RecyclerView.Adapter<tourGuideAdapter.MyViewHolder> {

    private ArrayList<TourGuide> tourGuides;
    Context context;

    public tourGuideAdapter(ArrayList<TourGuide> tourGuides, Context context) {
        this.tourGuides = tourGuides;
        this.context = context;
    }

    @NonNull
    @Override
    public tourGuideAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restuarant_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tourGuideAdapter.MyViewHolder holder, int position) {
        holder.restName.setText(tourGuides.get(position).getName());
        holder.restLocation.setText(tourGuides.get(position).getLocation());
        holder.raters.setText(tourGuides.get(position).getRaters());
        holder.ratings.setText(tourGuides.get(position).getRates());
        holder.restImage.setImageResource(tourGuides.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return tourGuides.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.restuarantName)
        TextView restName;
        @BindView(R.id.restuarantLocation)
        TextView restLocation;
        @BindView(R.id.restuarant_image)
        ImageView restImage;
        @BindView(R.id.restuarantRateing)
        TextView ratings;
        @BindView(R.id.restuarantNumberofRaters)
        TextView raters;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
