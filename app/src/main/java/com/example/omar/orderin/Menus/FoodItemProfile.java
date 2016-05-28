package com.example.omar.orderin.Menus;


public class FoodItemProfile {
    String picture;
    String description;
    String name;
    boolean isAvailable;
    double price;

    public FoodItemProfile(String picture, String description, String name,
                           boolean isAvailable, double price)
    {
        this.picture = picture;
        this.description = description;
        this.name = name;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAvailable(boolean available)
    {
        isAvailable = available;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
