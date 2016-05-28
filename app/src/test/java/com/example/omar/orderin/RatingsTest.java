package com.example.omar.orderin;

import com.example.omar.orderin.Rating.Ratings;

import org.junit.Test;

public class RatingsTest
{
    private static final double SAMPLE_RATING= 3.2;
    private static final int SAMPLE_NUMBER_OF_RATINGS = 12;

    private Ratings makeRatings()
    {
        return new Ratings(SAMPLE_RATING,SAMPLE_NUMBER_OF_RATINGS);
    }

    @Test
    public void createRatings()
    {
        Ratings r = makeRatings();
    }

}
