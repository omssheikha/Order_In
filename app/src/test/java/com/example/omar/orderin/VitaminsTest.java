package com.example.omar.orderin;

import com.example.omar.orderin.Menus.Vitamins;


import org.junit.Test;
import static org.junit.Assert.*;

public class VitaminsTest {


    protected static Vitamins makeVitmains()
    {
        return new Vitamins();
    }

    @Test
    public void createVitamins()
    {
        Vitamins v = makeVitmains();
    }

}
