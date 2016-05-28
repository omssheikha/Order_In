package com.example.omar.orderin;

import com.example.omar.orderin.General.GpsLocation;
import com.example.omar.orderin.Menus.FoodMenu;
import com.example.omar.orderin.Restraunt.Restaurant;
import com.example.omar.orderin.Users.User;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class RestaurantTest
{

    private static final int SAMPLE_RATING = 4;
    private static final int SAMPLE_ID = 4;
    private static final String SAMPLE_NAME = "OMAR";
    private static final String SAMPLE_ADDRESS = "Mr. Walter C. Brown 49 Featherstone " +
            "Street LONDON EC1Y 8SY UNITED KINGDOM";
    private FoodMenu Samplemenu = mock(FoodMenu.class);
    private GpsLocation sampleLocation = mock(GpsLocation.class);
    private User sampleUser = mock(User.class);



    protected Restaurant makeRestaurant()
    {
        Restaurant r = new Restaurant(SAMPLE_ID,SAMPLE_RATING, sampleLocation, SAMPLE_NAME,
                SAMPLE_ADDRESS,Samplemenu, sampleUser);
        return r;
    }


    @Test
    public void createRestaurant()
    {
        Restaurant r = makeRestaurant();
    }



}
