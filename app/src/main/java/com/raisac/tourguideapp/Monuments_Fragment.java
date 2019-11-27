package com.raisac.tourguideapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Monuments_Fragment extends Fragment {

    ArrayList<TourGuide> monnuments;

    RecyclerView restrecycler;

    public Monuments_Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_monuments, container, false);

        monnuments = new ArrayList<>();

        //get the resource id for the recyclerview
        restrecycler = view.findViewById(R.id.monuments_recyclerview);

        //convert the drawable images to Bitmap
        Bitmap independence = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.independence);

        //add the images, location and the name
        monnuments.add(new TourGuide(getString(R.string.Independence),
                getString(R.string.independence_monumnet), independence));


        Bitmap nantawetwa = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.nantawetwa);
        monnuments.add(new TourGuide(getString(R.string.Nantawetwa),
                getString(R.string.nantaweta_monumnet_Location),
                nantawetwa));


        Bitmap centinary = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.centinary);
        monnuments.add(new TourGuide(getString(R.string.Centenery), getString(R.string.cantenery_monumnet_location), centinary));


        Bitmap statueof_leadership = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.statueof_leadership);
        monnuments.add(new TourGuide(getString(R.string.Leadership), getString(R.string.leadership_monument_location),
                statueof_leadership));


        Bitmap worldwar = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.worldwar);
        monnuments.add(new TourGuide(getString(R.string.Wold_war), getString(R.string.world_war_monument_location),
                worldwar));


        Bitmap the_stride = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.the_stride);
        monnuments.add(new TourGuide(getString(R.string.Stride), getString(R.string.stride_monument_location),
                the_stride));


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        restrecycler.setLayoutManager(layoutManager);

        AttractionsAdapter attractionsAdapter = new AttractionsAdapter(monnuments, getActivity());
        restrecycler.setAdapter(attractionsAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(restrecycler.getContext(),
                layoutManager.getOrientation());
        restrecycler.addItemDecoration(dividerItemDecoration);

        return view;
    }


}