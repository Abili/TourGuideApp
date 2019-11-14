package com.raisac.tourguideapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Restuarants extends Fragment {

ArrayList<TourGuide> tourGuides;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_restuarants, container, false);

        tourGuides = new ArrayList<>();
        tourGuides.add(new TourGuide());
        return view;
    }




}
