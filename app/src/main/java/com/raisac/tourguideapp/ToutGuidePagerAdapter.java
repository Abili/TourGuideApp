package com.raisac.tourguideapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ToutGuidePagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[]{"Restuarants", "Public  Places", "Attractions"};
    public ToutGuidePagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestuarantsFragment();
        } else if (position == 1){
            return new PublicPlaces();
        } else {
            return new Attractions();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}