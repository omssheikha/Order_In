package com.example.omar.orderin;

import com.example.omar.orderin.General.GpsLocation;

import org.junit.Test;

import static org.junit.Assert.*;

public class GpsLocationTest
{
    private static final double SAMPLE_LATITUDE  = 33.5;
    private static final double SAMPLE_LONGITUDE = 33.1;


    protected static GpsLocation makeGpsLocation()
    {
        return new GpsLocation(SAMPLE_LATITUDE,SAMPLE_LONGITUDE);
    }

    @Test
    public void createGpsLocation()
    {
        GpsLocation g  = makeGpsLocation();
    }

    @Test
    public void getValuesFromLocation()
    {
        GpsLocation g = makeGpsLocation();
        assertEquals(g.getLatitude(),SAMPLE_LATITUDE,0);
        assertEquals(g.getLongitude(),SAMPLE_LONGITUDE,0);
    }

    @Test
    public void checkComparator()
    {
        GpsLocation g = makeGpsLocation();
        GpsLocation g2 = makeGpsLocation();
        assertTrue(g.isEqualTo(g2));
    }

}
