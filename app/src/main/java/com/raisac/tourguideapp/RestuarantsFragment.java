package com.raisac.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;


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
        tourGuides.add(new TourGuide("Cayenne Restaurant and Lounge", "Kira Rd, Kampala",
                "1,447 Google reviews", "4.1", R.drawable.cayen));

        tourGuides.add(new TourGuide("2K Restaurant", " Hoima Rd, Kampala",
                "731 Google reviews", "4.2", R.drawable.twokrestuarant));

        tourGuides.add(new TourGuide("Il Patio Italian Restaurant", "Kisozi Close, Kyagwe Rd, Kampala",
                "394 Google reviews", "4.3", R.drawable.patioitallian));

        tourGuides.add(new TourGuide("Piato", " Lumumba Ave, Kampala",
                "1,279 Google reviews", "4.3", R.drawable.piato));

        tourGuides.add(new TourGuide("Cafe Javas - Kampala Road", "Kampala Road, Opposite post office, Kampala",
                "1,333 Google reviews", "4.5", R.drawable.cafejavas));

        tourGuides.add(new TourGuide("Faze 2", "Plot 10 Nakasero Road",
                "630 Google reviews", "4.1", R.drawable.faze2));

        tourGuides.add(new TourGuide("Fang Fang Chinese Restaurant", " Plot 1, Conville Street",
                "284 Google reviews", "4.1", R.drawable.fangfang));

        tourGuides.add(new TourGuide("Seven Seas", "Ternan Ave, Kampala",
                "26 Google reviews", "4.2", R.drawable.sevenseas));

        tourGuides.add(new TourGuide("Haandi kampala restaurant ltd", "Haandi kampala restaurant ltd",
                "618 Google reviews", "4.2", R.drawable.haundai));

        tourGuides.add(new TourGuide("Amagara Cafe Bistro", "Colville St, Kampala",
                "313 Google reviews", "4.1", R.drawable.amagara));


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        restrecycler.setLayoutManager(layoutManager);

        tourGuideAdapter tourGuideAdapter = new tourGuideAdapter(tourGuides, getActivity());
        restrecycler.setAdapter(tourGuideAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(restrecycler.getContext(),
                layoutManager.getOrientation());
        restrecycler.addItemDecoration(dividerItemDecoration);

        return view;
    }


}
