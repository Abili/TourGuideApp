package com.raisac.tourguideapp;

public class TourGuide {
    private String name;
    private String location;
    private String raters;
    private  String rates;
    private int image;

    public TourGuide() {
    }

    public TourGuide(String name, String location, String raters, String rates, int image) {
        this.name = name;
        this.location = location;
        this.raters = raters;
        this.rates = rates;
        this.image = image;

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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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
