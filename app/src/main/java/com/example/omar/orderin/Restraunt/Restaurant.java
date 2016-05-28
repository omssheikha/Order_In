package com.example.omar.orderin.Restraunt;


import com.example.omar.orderin.General.GpsLocation;
import com.example.omar.orderin.Menus.FoodMenu;
import com.example.omar.orderin.Users.User;

/**
 * Created by Omar on 23/05/2016.
 */

public class Restaurant
{
    int id;
    int rating;
    GpsLocation location;
    String name, address;
    FoodMenu menu;
    User owner;


    public Restaurant(int id, int rating, GpsLocation location, String name, String address
            ,FoodMenu menu,User owner)
    {
        this.id = id;
        this.rating = rating;
        this.location = location;
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.owner = owner;
    }

    public int getId()
    {
        return id;
    }

    public int getRating()
    {
        return rating;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public GpsLocation getLocation()
    {
        return location;
    }

    public FoodMenu getMenu()
    {
        return menu;
    }

    public User getOwner()
    {
        return owner;
    }
}
