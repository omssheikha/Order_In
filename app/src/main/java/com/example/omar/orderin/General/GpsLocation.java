package com.example.omar.orderin.General;

/**
 * Created by Omar on 23/05/2016.
 */
public class GpsLocation
{
    private double latitude,longitude;


    public GpsLocation(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public boolean isEqualTo(GpsLocation g)
    {
        if(g.getLatitude() == latitude && g.getLongitude() == longitude)
            return true;

        return false;
    }
}
