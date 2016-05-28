package com.example.omar.orderin;


import com.example.omar.orderin.Menus.FoodItem;
import com.example.omar.orderin.Menus.FoodItemProfile;
import com.example.omar.orderin.Menus.FoodTags;
import com.example.omar.orderin.Menus.GymProperties;
import com.example.omar.orderin.Rating.RatingAndReviews;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class FoodItemTest
{
    private static final int SAMPLE_ID = 3;
    private RatingAndReviews sampleRatingsAndReviews = mock(RatingAndReviews.class);
    private FoodTags sampleFoodTags = mock(FoodTags.class);
    private static final String[] SAMPLE_ALLERGIES = new String[2];
    private FoodItemProfile sampleFoodItemProfile = mock(FoodItemProfile.class);
    private GymProperties sampleGymProperties = mock(GymProperties.class);

    private FoodItem makeFoodItem()
    {
        return new FoodItem(SAMPLE_ID,sampleRatingsAndReviews,sampleFoodTags,
                SAMPLE_ALLERGIES,sampleFoodItemProfile,sampleGymProperties);
    }

    @Test
    public void createFoodItem()
    {
        FoodItem f = makeFoodItem();
    }

}
