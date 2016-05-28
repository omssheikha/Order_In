package com.example.omar.orderin.Rating;

import android.media.Rating;

import java.util.ArrayList;

/**
 * Created by Omar on 27/05/2016.
 */
public class RatingAndReviews
{
    ArrayList<Review> reviews;
    Rating rating;

    public RatingAndReviews(ArrayList<Review> reviews, Rating rating)
    {
        this.reviews = reviews;
        this.rating = rating;
    }

    public Rating getRating()
    {
        return rating;
    }


    public ArrayList<Review> getReviews()
    {
        return reviews;
    }

    public Review getReviews(int i)
    {
        return reviews.get(i);
    }
}
