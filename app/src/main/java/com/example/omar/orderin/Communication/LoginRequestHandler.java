package com.example.omar.orderin.Communication;

import java.util.HashMap;


public class LoginRequestHandler extends RequestHandler
{
    private static final String LOGIN_URL = "";
    HashMap<String,String> parameters;
    private String url = "";

    public LoginRequestHandler(HashMap<String,String> parameters)
    {
        super(LOGIN_URL);
        this.parameters = parameters;
    }



    @Override
    protected ResponceHandler sendRequest()
    {
        return null;
    }

    @Override
    public String encryptValues(String s)
    {
        return null;
    }


}
