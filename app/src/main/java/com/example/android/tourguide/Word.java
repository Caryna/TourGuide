package com.example.android.tourguide;

/**
 * Created by Carin on 4/7/2018.
 */
//{@link Word} represents a location word that the user wants to visit.
//It contains a landmark, some information regarding the landmark and an image.

public class Word {

    /**
     * Information regarding the location
     */
    private String mInfo;

    /**
     * The actual location, the landmark
     */
    private String mLocation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param info     tells about the address/business hours
     * @param location is the landmark in Bucharest
     */

    /**
     * Create a new Word object.
     *
     * @param mInfo           tells about the location/business hours/entrance fee
     * @param mLocation       is the place in Bucharest either a club, a monument, a restaurant or a park
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(String info, String location, int imageResourceId) {
        mInfo = info;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public String getInfo() {
        return mInfo;
    }
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the image of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*
    Return whether or not there is a image for the word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

