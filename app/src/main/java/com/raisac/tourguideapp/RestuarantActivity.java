package com.raisac.tourguideapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class RestuarantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarant);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestuarantsFragment())
                .commit();

    }
}
