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

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.MyViewHolder> {

    private ArrayList<TourGuide> tourGuides;
    Context context;

    public AttractionsAdapter(ArrayList<TourGuide> tourGuides, Context context) {
        this.tourGuides = tourGuides;
        this.context = context;
    }

    @NonNull
    @Override
    public AttractionsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.attractions_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionsAdapter.MyViewHolder holder, final int position) {
        holder.attractName.setText(tourGuides.get(position).getName());
        holder.attractLocation.setText(tourGuides.get(position).getLocation());
        holder.attractImage.setImageBitmap(tourGuides.get(position).getImage());

        /*
        set an onclick listener on the each item on the recyclerview/ list
        so when it is clicker it opens another activity that gives the details of th items selcted

         */
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AttractionsDetailsActivity.class);
                //add the name of the item to the intent
                intent.putExtra(context.getString(R.string.name_intent), tourGuides.get(position).getName());

                //add the position of the items to the intent
                intent.putExtra(context.getString(R.string.position_intent), position);

                //add the image of the item to the intent
                Bitmap bitmap = tourGuides.get(position).getImage(); // your bitmap
                ByteArrayOutputStream _bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 50, _bs);
                intent.putExtra(context.getString(R.string.bitmap_intent), _bs.toByteArray());

                //start the intent
                context.startActivity(intent);

            }
        });
    }

    /*
    this method returns items in the recylerview, not that if it is not set to size and set to zero
    n item wil be shown in the recyclervew
     */
    @Override
    public int getItemCount() {
        return tourGuides.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        /*
        here used the butter knife library to decalare variables and get their resource ids at the same time

         */
        @BindView(R.id.attractName)
        TextView attractName;
        @BindView(R.id.attractLocation)
        TextView attractLocation;
        @BindView(R.id.attract_image)
        ImageView attractImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            /*the bind the views using the  bind method which takes in parameters
                for this class and itemview
             */

            ButterKnife.bind(this, itemView);

        }
    }
}
