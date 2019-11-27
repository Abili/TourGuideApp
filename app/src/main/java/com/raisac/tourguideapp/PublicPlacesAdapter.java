package com.raisac.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PublicPlacesAdapter extends RecyclerView.Adapter<PublicPlacesAdapter.MyViewHolder> {

    private ArrayList<TourGuide> tourGuides;
    Context context;

    public PublicPlacesAdapter(ArrayList<TourGuide> tourGuides, Context context) {
        this.tourGuides = tourGuides;
        this.context = context;
    }

    @NonNull
    @Override
    public PublicPlacesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.attractions_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PublicPlacesAdapter.MyViewHolder holder, final int position) {
        holder.attName.setText(tourGuides.get(position).getName());
        holder.attLocation.setText(tourGuides.get(position).getLocation());
        holder.attImage.setImageBitmap(tourGuides.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent intent = new Intent(context, PublicPlacesDetailsActivity.class);
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
        @BindView(R.id.attractName)
        TextView attName;
        @BindView(R.id.attractLocation)
        TextView attLocation;
        @BindView(R.id.attract_image)
        ImageView attImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
