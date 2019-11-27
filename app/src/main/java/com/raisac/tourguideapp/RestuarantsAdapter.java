package com.raisac.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RestuarantsAdapter extends RecyclerView.Adapter<RestuarantsAdapter.MyViewHolder> {

    private ArrayList<TourGuide> tourGuides;
    Context context;

    public RestuarantsAdapter(ArrayList<TourGuide> tourGuides, Context context) {
        this.tourGuides = tourGuides;
        this.context = context;
    }

    @NonNull
    @Override
    public RestuarantsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restuarant_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestuarantsAdapter.MyViewHolder holder, final int position) {
        holder.restName.setText(tourGuides.get(position).getName());
        holder.restLocation.setText(tourGuides.get(position).getLocation());
        holder.raters.setText(tourGuides.get(position).getRaters());
        holder.ratings.setText(tourGuides.get(position).getRates());
        holder.restImage.setImageBitmap(tourGuides.get(position).getImage());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent intent = new Intent(context, RestuarantDetailsActivity.class);
                   intent.putExtra(context.getString(R.string.name_intent),tourGuides.get(position).getName());
                   intent.putExtra(context.getString(R.string.position_intent), position);

                Bitmap bitmap = tourGuides.get(position).getImage(); // your bitmap
                ByteArrayOutputStream _bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 50, _bs);
                intent.putExtra(context.getString(R.string.bitmap_intent), _bs.toByteArray());
                   context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return tourGuides.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
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
