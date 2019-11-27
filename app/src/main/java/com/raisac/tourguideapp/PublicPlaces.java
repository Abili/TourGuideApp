package com.raisac.tourguideapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PublicPlaces extends Fragment {

    ArrayList<TourGuide> public_places;

    RecyclerView restrecycler;

    public PublicPlaces() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_public_places, container, false);

        public_places = new ArrayList<>();
        restrecycler = view.findViewById(R.id.publicplace_recyclerview);

        Bitmap ambiance = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.ambiance);
        public_places.add(new TourGuide(getString(R.string.ambiance_name), getString(R.string.ambiance_locaton), ambiance));


        Bitmap gurvnor = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.gurvnor);
        public_places.add(new TourGuide(getString(R.string.guvnor), getString(R.string.guvnor_location),
                gurvnor));


        Bitmap hive = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.hive);
        public_places.add(new TourGuide(getString(R.string.hive), getString(R.string.hibe_location), hive));


        Bitmap sky = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.sky);
        public_places.add(new TourGuide(getString(R.string.sky_lounge), getString(R.string.sky_location),
                sky));


        Bitmap panamera = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.panamera);
        public_places.add(new TourGuide(getString(R.string.panemera), getString(R.string.panamera_location),
                panamera));


        Bitmap legends = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.legends);
        public_places.add(new TourGuide(getString(R.string.legends), getString(R.string.legends_location),
                legends));


        Bitmap amnesia = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.amnesia);
        public_places.add(new TourGuide(getString(R.string.amnesia), getString(R.string.amnesia_location),
                amnesia));


        Bitmap nyondo = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.nyondo);
        public_places.add(new TourGuide(getString(R.string.nyondo), getString(R.string.nyondo_location),
                nyondo));


        Bitmap wave = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.wave);
        public_places.add(new TourGuide(getString(R.string.wave), getString(R.string.wave_location),
                wave));


        Bitmap obligato = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.obligato);
        public_places.add(new TourGuide(getString(R.string.obligatto), getString(R.string.obligato_location),
                obligato));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        restrecycler.setLayoutManager(layoutManager);

        PublicPlacesAdapter publicPlacesAdapter = new PublicPlacesAdapter(public_places, getActivity());
        restrecycler.setAdapter(publicPlacesAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(restrecycler.getContext(),
                layoutManager.getOrientation());
        restrecycler.addItemDecoration(dividerItemDecoration);

        return view;
    }


}