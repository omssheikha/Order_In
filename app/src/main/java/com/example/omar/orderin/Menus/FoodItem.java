package com.example.omar.orderin.Menus;

import com.example.omar.orderin.Rating.RatingAndReviews;

public class FoodItem
{
    int id;
    RatingAndReviews ratingAndReviews;
    FoodTags tags;
    String[] allergies;
    FoodItemProfile profile;
    GymProperties properties;


    public FoodItem(int id, RatingAndReviews ratingAndReviews, FoodTags tags, String[] allergies,
                    FoodItemProfile profile, GymProperties properties)
    {
        this.id = id;
        this.ratingAndReviews = ratingAndReviews;
        this.tags = tags;
        this.allergies = allergies;
        this.profile = profile;
        this.properties = properties;
    }

    public int getId()
    {
        return id;
    }

    public RatingAndReviews getRatingAndReviews()
    {
        return ratingAndReviews;
    }

    public FoodTags getTags()
    {
        return tags;
    }

    public String[] getAllergies()
    {
        return allergies;
    }

    public FoodItemProfile getProfile()
    {
        return profile;
    }

    public GymProperties getProperties()
    {
        return properties;
    }
}
