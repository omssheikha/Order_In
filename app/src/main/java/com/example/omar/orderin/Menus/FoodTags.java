package com.example.omar.orderin.Menus;


public class FoodTags {

    int spiciness;
    boolean isVegetarian = false;
    boolean isGlutenFree = false;
    boolean isVegan = false;
    boolean isHallal = false;
    boolean isTimeConsuming = false;

    public FoodTags(int spiciness, boolean isVegetarian, boolean isGlutenFree, boolean isVegan, boolean isHallal, boolean isTimeConsuming)
    {
        this.spiciness = spiciness;
        this.isVegetarian = isVegetarian;
        this.isGlutenFree = isGlutenFree;
        this.isVegan = isVegan;
        this.isHallal = isHallal;
        this.isTimeConsuming = isTimeConsuming;
    }

    public int getSpiciness()
    {
        return spiciness;
    }

    public boolean isVegetarian()
    {
        return isVegetarian;
    }

    public boolean isGlutenFree()
    {
        return isGlutenFree;
    }

    public boolean isVegan()
    {
        return isVegan;
    }

    public boolean isHallal()
    {
        return isHallal;
    }

    public boolean isTimeConsuming()
    {
        return isTimeConsuming;
    }
}
