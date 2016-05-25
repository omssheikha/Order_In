package com.example.omar.orderin.Menus;

import java.util.ArrayList;


public class FoodMenu
{

    private String menuName;
    private ArrayList<FoodItem> food = new ArrayList<>();
    private ArrayList<FoodMenu> subMenus = new ArrayList<>();

    public FoodMenu(String menuName)
    {
        this.menuName = menuName;
    }

    public void addSubMenu(FoodMenu menu)
    {
        subMenus.add(menu);
    }

    public void addSubMenu(ArrayList<FoodMenu> menu)
    {
        subMenus.addAll(menu);
    }

    public void addFoodItem(FoodItem item)
    {
        food.add(item);
    }

    public void addFoodItem(ArrayList<FoodItem> item)
    {
        food.addAll(item);
    }

}
