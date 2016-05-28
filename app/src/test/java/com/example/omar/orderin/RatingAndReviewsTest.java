package com.example.omar.orderin;

import android.media.Rating;

import com.example.omar.orderin.Rating.RatingAndReviews;
import com.example.omar.orderin.Rating.Review;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;


public class RatingAndReviewsTest
{
    private static final ArrayList<Review> SAMPLE_REVIEWS = new ArrayList<>();
    Rating sampleRating = mock(Rating.class);

    private RatingAndReviews makeRatingandReviews()
    {
        return new RatingAndReviews(SAMPLE_REVIEWS,sampleRating);
    }

    @Test
    public void createRatingsAndReviews()
    {
        RatingAndReviews r = makeRatingandReviews();
    }

}
