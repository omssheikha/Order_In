package com.example.omar.orderin;

import com.example.omar.orderin.Rating.Review;
import com.example.omar.orderin.Users.User;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class ReviewTest {

    private static final String SAMPLE_REVIEW = "The food was ga7ed";
    private User sampleUser = mock(User.class);

    protected Review makeSampleReview()
    {
        return new Review(sampleUser,SAMPLE_REVIEW);
    }

    @Test
    public void CreateReview()
    {
        Review r = makeSampleReview();
    }

    @Test
    public void getReview()
    {
        Review r = makeSampleReview();
        assertEquals(r.getReview(), SAMPLE_REVIEW);
    }

    @Test
    public void getUser()
    {
        Review r = makeSampleReview();
    }
}
