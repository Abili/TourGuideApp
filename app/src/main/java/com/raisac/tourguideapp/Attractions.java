package com.raisac.tourguideapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Attractions extends Fragment {

    ArrayList<TourGuide> attractions;

    RecyclerView restrecycler;

    public Attractions() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);



        attractions = new ArrayList<>();
        restrecycler = view.findViewById(R.id.attractions_recyclerview);


        /*since the drawables in the dapater had ot be converted to bitmaps inorder to transfer them to
        * be able to move them to the next activity using intent, it has to be cchange inside the object class as well
        * from interger that recieves the resource id to bitmap so this affects this class as well as images cannot be cast nto the imageview
        * unless they are converted to bitmaps and below is the way i a have decided to do it which functions well
        * */

        /* below as well here iam adding the images, ocation and the name of the place to the array list*/
        Bitmap gadafiMosque = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.gadafi);
        attractions.add(new TourGuide(getString(R.string.gadaffi_Mosque_Old_Kampala), "Old Kampala road", gadafiMosque));


        Bitmap kabakas_Palace = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.kabakas_palace);
        attractions.add(new TourGuide(getString(R.string.kabakas_Palace_and_Idi_Amins_Torture_chambers), getString(R.string.kabaka_palce_location),
                kabakas_Palace));


        Bitmap bahai_temple = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.bahai_temple);
        attractions.add(new TourGuide(getString(R.string.ba_hai_Temple), getString(R.string.bahai_location), bahai_temple));


        Bitmap namirembe = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.namirembe);
        attractions.add(new TourGuide(getString(R.string.namirembe_Catherdral), getString(R.string.namirembe_location),
                namirembe));


        Bitmap owino = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.owino);
        attractions.add(new TourGuide(getString(R.string.owino_Market), getString(R.string.owino_location),
                owino));


        Bitmap lakevictoria = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.lakevictoria);
        attractions.add(new TourGuide(getString(R.string.lake_Victoria), getString(R.string.lakevictoria_location),
                lakevictoria));


        Bitmap craftsmarket = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.craftsmarket);
        attractions.add(new TourGuide(getString(R.string.craft_Markets), getString(R.string.craftsmarket_location),
                craftsmarket));


        Bitmap entebbebotanical = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.entebbebotanical);
        attractions.add(new TourGuide(getString(R.string.entebbe_Botanical_Gardens),
                getString(R.string.entebbe_botanical_location),
                entebbebotanical));


        Bitmap museum = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.museum);
        attractions.add(new TourGuide(getString(R.string.the_Uganda_National_Museum), getString(R.string.meuseum_location),
                museum));


        Bitmap rubaga = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.rubaga);
        attractions.add(new TourGuide(getString(R.string.rubaga), getString(R.string.rubaga_location),
                rubaga));


        /*here i create a linearlayout manager for the recyclerview as it cannot function with out
        a layout manager
         */


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        restrecycler.setLayoutManager(layoutManager);

        /*
        i also call the Attraction adapter so that i can add the arraylits that has the images, names and location of the
        attraction places in my city
         */
        AttractionsAdapter attractionsAdapter = new AttractionsAdapter(attractions, getActivity());
        restrecycler.setAdapter(attractionsAdapter);

        /*
        the Item decoration is mainly to add a line separator between each it separating from each other
         */
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(restrecycler.getContext(),
                layoutManager.getOrientation());
        /*
        after adding the arraylist items to the adapter now i can cast the sadpter on to the recycleriew
        to display the information required
         */
        restrecycler.addItemDecoration(dividerItemDecoration);

        return view;
    }


}