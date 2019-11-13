package com.raisac.tourguideapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ToutGuidePagerAdapter extends FragmentPagerAdapter {

    public ToutGuidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayFragment();
        } else if (position == 1){
            return new TuesdayFragment();
        } else {
            return new WednesdayFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}