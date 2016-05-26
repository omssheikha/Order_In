package com.example.omar.orderin;

import com.example.omar.orderin.General.Review;
import com.example.omar.orderin.Users.User;

import org.junit.Test;
import static org.junit.Assert.*;


public class ReviewTest {

    private static final String SAMPLE_REVIEW = "The food was ga7ed";


    protected static Review makeSampleReview()
    {
        return new Review(UserTest.makeUser(),SAMPLE_REVIEW);
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
        //TODO: finish user class so that this can be tested name vs name.
    }
}
