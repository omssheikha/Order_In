package com.example.omar.orderin;

import com.example.omar.orderin.Menus.FoodItemProfile;

import org.junit.Test;

public class FoodItemProfileTest
{
    private static final String SAMPLE_PICTURE = "";
    private static final String SAMPLE_DESCRIPTION = "el akl dah ga7ed";
    private static final String SAMPLE_NAME = "alfred el bo7s";
    private static final boolean SAMPLE_IS_AVAILABLE = true;
    private static final double SAMPLE_PRICE = 12.50;

    private FoodItemProfile makeFoodItem()
    {
        return new FoodItemProfile(SAMPLE_PICTURE,SAMPLE_DESCRIPTION,SAMPLE_NAME,
                SAMPLE_IS_AVAILABLE,SAMPLE_PRICE);
    }

    @Test
    public void createFoodItemProfile()
    {
        FoodItemProfile f = makeFoodItem();
    }
}
