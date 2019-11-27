package com.raisac.tourguideapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Home extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.imageSlider)
    SliderView sliderView;

    @BindView(R.id.otherInformation)
    RecyclerView recyclerView;

    @BindView(R.id.tourkampala)
    FloatingActionButton tourKla;

    ArrayList<OtherInfo> infoArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        //set ONclick listener on the floatingAction button so that it you can navigate the next page
        tourKla.setOnClickListener(this);

        //call the slider adapter for animation the images on the home page
        SliderAdapter adapter = new SliderAdapter(this);

        //set the slider adaper on to the slideview
        sliderView.setSliderAdapter(adapter);

        /*set indicator animation by using SliderLayout.IndicatorAnimations.
         :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
         */
        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);

        //set scroll delay in seconds :
        sliderView.setScrollTimeInSec(4);
        sliderView.startAutoCycle();

        //get the Arraylist
        final ArrayList<OtherInfo> infoArrayList = new ArrayList<>();

        //add the other information about the city onto the arraylist
        infoArrayList.add(new OtherInfo(getString(R.string.elevation_name), getString(R.string.elevation_value)));
        infoArrayList.add(new OtherInfo(getString(R.string.area_word), getString(R.string.area_value)));
        infoArrayList.add(new OtherInfo(getString(R.string.weather_word), getString(R.string.weather_values)));
        infoArrayList.add(new OtherInfo(getString(R.string.population_word), getString(R.string.population_values)));

        //set a fixed sixe for the recyclerview to avoid variation in size of the list items
        recyclerView.setHasFixedSize(true);

        //create the linearlayout manager to manage the layout of the recyclerview
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //set he manager to the recyclerview
        recyclerView.setLayoutManager(layoutManager);

        /*call the othersAdapter set the inforArraylist on to it, then set the adapter to
        the recyclerview
        */
        OthersAdapter othersAdapter = new OthersAdapter(infoArrayList, this);
        recyclerView.setAdapter(othersAdapter);



        }

    @Override
    public void onClick(View v) {
        /*
        onclicking the floating action button creat an intent to open a new activity
         */
        Intent intent = new Intent(Home.this, InsideKampala.class);
        startActivity(intent);
    }
}
