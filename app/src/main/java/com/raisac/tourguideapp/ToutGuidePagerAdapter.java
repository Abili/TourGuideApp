package com.raisac.tourguideapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ToutGuidePagerAdapter extends FragmentPagerAdapter {

    /*
    create the tab titles
     */
    private String[] tabTitles = new String[]{"Restuarants", "Public Places", "Attractions", "Monuments"};

    public ToutGuidePagerAdapter(FragmentManager fm) {
        super(fm);

    }

    /*
    overidding a getItem method to return the pages as per the positions
     */
    @Override
    public Fragment getItem(int position) {
        //first position position 0 retunr thr first page
        if (position == 0) {
            return new RestuarantsFragment();

            // else if the position is 1 then return the secons page
        } else if (position == 1) {
            return new PublicPlaces();

            // for the position ==2 return 3rd page
        } else if (position == 2) {
            return new Attractions();

            //if its not any of the postions above then any other page remaining should b displayed
        } else {
            return new Monuments_Fragment();
        }

    }
//this is ti retun the number of pages to be shown
    @Override
    public int getCount() {
        return 4;
    }

//for displaying the page title at specific positions respectively
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}