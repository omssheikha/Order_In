package com.example.omar.orderin.Menus;

/**
 * Created by th on 26/05/2016.
 */
public class GymProperties {



    double calories;
    double protien;
    double fibre;
    double BCAA;
    double carbs;
    double fats;
    Vitamins vitamins;

    public GymProperties(double calories, double protein, double fibre, double BCAA,
                         double carbs, double fats, Vitamins vitamins) {
        this.calories = calories;
        this.protien = protein;
        this.fibre = fibre;
        this.BCAA = BCAA;
        this.carbs = carbs;
        this.fats = fats;
        this.vitamins = vitamins;
    }

}
