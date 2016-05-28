package com.example.omar.orderin.Rating;

/**
 * Created by th on 26/05/2016.
 */
public class Ratings {

    double rating;

    public Ratings(double rating, int numberOfRatings)
    {
        this.rating = rating;
        this.numberOfRatings = numberOfRatings;
    }

    int numberOfRatings;

    public double getRating()
    {
        return rating;
    }

    public int getNumberOfRatings()
    {
        return numberOfRatings;
    }


}
