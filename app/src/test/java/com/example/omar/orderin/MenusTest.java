package com.example.omar.orderin;

import android.view.MenuItem;

import org.junit.Test;
import com.example.omar.orderin.Menus.FoodMenu;
import com.example.omar.orderin.Menus.FoodItem;
import static org.mockito.Mockito.*;
import java.util.ArrayList;

public class MenusTest
{
    private static final String SAMPLE_MENU_NAME = "el ga7ed";
    private ArrayList<FoodItem> sampleMenuItems= new ArrayList<>();
    private ArrayList<FoodMenu> sampleSubMenu = new ArrayList<>();
    private FoodItem sampleMenuItem = mock(FoodItem.class);


    private FoodMenu makeSampleMenu()
    {
        return new FoodMenu(SAMPLE_MENU_NAME);
    }

    @Test
    public void createMenu()
    {
       FoodMenu m = makeSampleMenu();
    }


    @Test
    public void addingASubMenu()
    {
        FoodMenu m = makeSampleMenu();
        m.addSubMenu(makeSampleMenu());
    }

    @Test
    public void addingSubMenus()
    {
        FoodMenu m = makeSampleMenu();
        m.addSubMenu(sampleSubMenu);
    }

    @Test
    public void addingAFoodItem()
    {
        FoodMenu m = makeSampleMenu();
        m.addFoodItem(sampleMenuItem);
    }


    @Test
    public void addingFoodItems()
    {
        FoodMenu m = makeSampleMenu();
        m.addFoodItem(sampleMenuItems);
    }



}
