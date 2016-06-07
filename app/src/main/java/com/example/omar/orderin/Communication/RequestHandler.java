package com.example.omar.orderin.Communication;

import android.util.Log;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Omar on 23/05/2016.
 */
public abstract class RequestHandler{

    protected URL url;

    public RequestHandler(String url)
    {
        this.url = makeUrlFromString(url);
    }

    protected URL makeUrlFromString(String url)
    {
        try
        {
            return new URL(url);
        }
        catch (MalformedURLException e)
        {
            Log.e("Network Error", "String in RequestHandler not formed Correctly: ", e);
        }
        finally
        {
            return null;
        }
    }

    protected  ResponceHandler sendRequest()
    {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        
    }

    protected abstract String encryptValues(String s);



    protected String serailaizeParameters(HashMap<String,String> parameters)
    {
        String s = "?";
        s = convertHashMapToSerializedString(parameters, s);
        s = removeLastAnd(s);
        return s;
    }

    private String convertHashMapToSerializedString(HashMap<String, String> parameters, String s)
    {
        for(Map.Entry<String,String> pair: parameters.entrySet())
        {
            s+= pair.getKey() + "=" + pair.getValue() + "&";
        }
        return s;
    }


    private String removeLastAnd(String s)
    {
        return s.substring(0,s.length()-1);
    }

}
