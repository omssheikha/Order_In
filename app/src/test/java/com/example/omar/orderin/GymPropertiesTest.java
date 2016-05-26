package com.example.omar.orderin;

import com.example.omar.orderin.Menus.GymProperties;
import org.junit.Test;
import static org.junit.Assert.*;

public class GymPropertiesTest {

    private static final double SAMPLE_CALORIES = 12.5;
    private static final double SAMPLE_PROTEINS = 12.5;
    private static final double SAMPLE_FIBRE = 12.5;
    private static final double SAMPLE_BCAA = 12.5;
    private static final double SAMPLE_CARBS = 12.5;
    private static final double SAMPLE_FATS = 12.4;

    protected static GymProperties makeGymProperties()
    {
        return new GymProperties(SAMPLE_CALORIES, SAMPLE_PROTEINS,SAMPLE_FIBRE, SAMPLE_BCAA,
                SAMPLE_CARBS,SAMPLE_FATS,VitaminsTest.makeVitmains());
    }

    @Test
    public void createGymProperties()
    {
        GymProperties g = makeGymProperties();
    }

}
