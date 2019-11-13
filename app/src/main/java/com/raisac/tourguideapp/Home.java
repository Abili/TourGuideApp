package com.raisac.tourguideapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Home extends AppCompatActivity {
    @BindView(R.id.imageSlider)
    SliderView sliderView;

    @BindView(R.id.otherInformation)
    RecyclerView recyclerView;

    @BindView(R.id.tourkampala)
    Button tour;

    ArrayList<OtherInfo> infoArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        SliderAdapter adapter = new SliderAdapter(this);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        final ArrayList<OtherInfo> infoArrayList = new ArrayList<>();
        infoArrayList.add(new OtherInfo("Elevation:", "1,190 m"));
        infoArrayList.add(new OtherInfo("Area:", "189 km²"));
        infoArrayList.add(new OtherInfo("Weather: ", "22°C, Wind NW at 10 km/h, 85% Humidity"));
        infoArrayList.add(new OtherInfo("Population:", "1.507 million (2014) United Nations"));

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        infoArrayAdapter = new ArrayList<>();
        OthersAdapter othersAdapter = new OthersAdapter(infoArrayList, this);
        recyclerView.setAdapter(othersAdapter);



        }
    @OnClick(R.id.tourkampala)
    public void onclick(View view){
        Intent intent = new Intent(Home.this, TouristAttraction.class);
        startActivity(intent);
    }
}
