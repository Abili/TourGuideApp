package com.raisac.tourguideapp;

import android.graphics.Bitmap;

public class TourGuide {
    private String name;
    private String location;
    private String raters;
    private  String rates;
    private Bitmap image;
    private String description;



    public TourGuide(String name, String location, String raters, String rates, Bitmap image) {
        this.name = name;
        this.location = location;
        this.raters = raters;
        this.rates = rates;
        this.image = image;
        this.description=description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRaters() {
        return raters;
    }

    public void setRaters(String raters) {
        this.raters = raters;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TourGuide{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", raters='" + raters + '\'' +
                ", rates='" + rates + '\'' +
                '}';
    }
}
