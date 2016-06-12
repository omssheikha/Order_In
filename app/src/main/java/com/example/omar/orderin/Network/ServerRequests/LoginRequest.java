package com.example.omar.orderin.Network.ServerRequests;

import android.content.Context;

import com.example.omar.orderin.Network.Parameters.LoginParameters;
import com.example.omar.orderin.Network.Parameters.Parameters;
import com.example.omar.orderin.Network.Responses.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

import cz.msebera.android.httpclient.entity.StringEntity;


public class LoginRequest extends ServerRequest{

    private static final String LOGIN_URL = "";
    private static final String USERNAME_LABEL = "username";
    private static final String PASSWORD_LABEL = "password";

    public LoginRequest(Parameters parameters, Context context, Responder responder) {
        super(LOGIN_URL, parameters, context, responder);
    }


    @Override
    protected StringEntity getFormattedParameters() throws JSONException, UnsupportedEncodingException {
        return new StringEntity(encrypt(makeJSONString()));
    }


    private String encrypt(JSONObject s) {
        return "";
    }

    private JSONObject makeJSONString() throws JSONException {
        JSONObject j = new JSONObject();
        LoginParameters l  = (LoginParameters) parameters;
        j.put(USERNAME_LABEL,l.getUsername());
        j.put(PASSWORD_LABEL,l.getPassword());
        return j;
    }

    @Override
    protected Response getCorrectResponseFormat() {
        return null;
    }
}
