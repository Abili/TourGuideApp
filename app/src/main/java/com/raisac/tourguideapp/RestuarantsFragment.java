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


public class RestuarantsFragment extends Fragment {

    ArrayList<TourGuide> tourGuides;

    RecyclerView restrecycler;

    public RestuarantsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restuarants, container, false);

        tourGuides = new ArrayList<>();
        restrecycler = view.findViewById(R.id.restuarants_recyclerview);

        Bitmap cayenne = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.cayen);
        tourGuides.add(new TourGuide(getString(R.string.cayen), getString(R.string.cayen_location),
                getString(R.string.cayen_raters), getString(R.string.cayen_rates), cayenne));


        Bitmap two_k = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.twokrestuarant);
        tourGuides.add(new TourGuide(getString(R.string.two_K_restuarant), getString(R.string.two_k_location),
                getString(R.string.two_k_raters), getString(R.string.two_k_rates), two_k));


        Bitmap patio = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.patioitallian);
        tourGuides.add(new TourGuide(getString(R.string.patio_restuarant), getString(R.string.patio_location),
                getString(R.string.patio_raters), getString(R.string.patio_rates), patio));


        Bitmap piato = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.piato);
        tourGuides.add(new TourGuide(getString(R.string.piato_restuarant), getString(R.string.piato_location),
                getString(R.string.piato_raters), getString(R.string.piato_rates), piato));


        Bitmap cafe = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.cafejavas);
        tourGuides.add(new TourGuide(getString(R.string.cafe_javas), getString(R.string.cafe_javas_location),
                getString(R.string.cafe_raters), getString(R.string.cafe_rates), cafe));


        Bitmap faze = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.faze2);
        tourGuides.add(new TourGuide(getString(R.string.faze_two), getString(R.string.faze_two_location),
                getString(R.string.faze_two_raters), getString(R.string.faze_two_rates), faze));


        Bitmap famffang = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.fangfang);
        tourGuides.add(new TourGuide(getString(R.string.fang_fang_restuarant), getString(R.string.fang_fang_location),
                getString(R.string.fang_fang_raters), getString(R.string.fang_fang_rates), famffang));


        Bitmap seven_seas = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.sevenseas);
        tourGuides.add(new TourGuide(getString(R.string.seven_seas_restuarant), getString(R.string.seven_seas_location),
                getString(R.string.seven_seas_raters), getString(R.string.seven_seas_rates), seven_seas));


        Bitmap Haandi = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.haundai);
        tourGuides.add(new TourGuide(getString(R.string.haudai_retsuarant), getString(R.string.haudai_location),
                getString(R.string.haudai_raters), getString(R.string.haudai_rates), Haandi));


        Bitmap amagara = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.amagara);
        tourGuides.add(new TourGuide(getString(R.string.amagar_restuarant), getString(R.string.amagara_location),
                getString(R.string.amagara_raters), getString(R.string.amagara_rates), amagara));


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        restrecycler.setLayoutManager(layoutManager);

        RestuarantsAdapter restuarantsAdapter = new RestuarantsAdapter(tourGuides, getActivity());
        restrecycler.setAdapter(restuarantsAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(restrecycler.getContext(),
                layoutManager.getOrientation());
        restrecycler.addItemDecoration(dividerItemDecoration);

        return view;
    }


}
