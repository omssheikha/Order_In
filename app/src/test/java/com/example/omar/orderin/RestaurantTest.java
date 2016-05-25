package com.example.omar.orderin;

import com.example.omar.orderin.Restraunt.Restaurant;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import com.example.omar.orderin.General.GpsLocation;
import com.example.omar.orderin.Menus.FoodMenu;
import com.example.omar.orderin.Users.User;


public class RestaurantTest
{

private static final int SAMPLE_RATING = 4;
private static final String SAMPLE_NAME = "OMAR";
private static final String SAMPLE_ADDRESS = "Mr. Walter C. Brown 49 Featherstone " +
        "Street LONDON EC1Y 8SY UNITED KINGDOM";

    private static FoodMenu getSampleMenu()
    {
        return MenusTest.makeSampleMenu();
    }

    private static GpsLocation getSampleLocation()
    {
        return GpsLocationTest.makeGpsLocation();
    }

    private static User getSampleUser()
    {
        return UserTest.makeUser();
    }

    protected static Restaurant makeRestaurant()
    {
        Restaurant r = new Restaurant(SAMPLE_RATING, getSampleLocation(), SAMPLE_NAME, SAMPLE_ADDRESS,
                getSampleMenu(), getSampleUser());
        return r;
    }


    @Test
    public void createRestaurant()
    {
        Restaurant r = makeRestaurant();
    }


    @Test
    public void getValuesFromRestaurant()
    {
        Restaurant r = makeRestaurant();
        assertEquals(r.getRating(),SAMPLE_RATING);
        assertEquals(r.getName(),SAMPLE_NAME);
        assertEquals(r.getAddress(), SAMPLE_ADDRESS);
        //TODO: make user class so that i can test this
        //Assert.AreEqual(r.getOwner(),getSampleUser());
        //TODO: make menu and sub menu class so one could test this heh :D
        //assertEquals(r.getMenu(),getSampleMenu());
        assertTrue(r.getLocation().isEqualTo(getSampleLocation()));
    }
}
