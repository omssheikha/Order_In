package com.example.omar.orderin.Menus;

/**
 * Created by th on 26/05/2016.
 */
public class GymProperties {



    private double calories;
    private double protein;
    private double fibre;
    private double BCAA;
    private double carbs;
    private double fats;

    public GymProperties(double calories, double protein, double fibre, double BCAA,
                         double carbs, double fats) {
        this.calories = calories;
        this.protein = protein;
        this.fibre = fibre;
        this.BCAA = BCAA;
        this.carbs = carbs;
        this.fats = fats;
    }

    public double getCalories()
    {
        return calories;
    }

    public double getProtein()
    {
        return protein;
    }

    public double getFibre()
    {
        return fibre;
    }

    public double getBCAA()
    {
        return BCAA;
    }

    public double getCarbs()
    {
        return carbs;
    }

    public double getFats()
    {
        return fats;
    }

}
