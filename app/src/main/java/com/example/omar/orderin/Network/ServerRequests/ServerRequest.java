package com.example.omar.orderin.Network.ServerRequests;

import android.content.Context;

import com.example.omar.orderin.Network.Parameters.Parameters;
import com.example.omar.orderin.Network.Responses.Response;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;

import java.io.UnsupportedEncodingException;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

public abstract class ServerRequest {

    public interface Responder{
         void returnResponce (Response response);
    }

    private String url;
    Parameters parameters;
    protected AsyncHttpClient client;
    Responder responder;
    private Context context;

    AsyncHttpResponseHandler handler = new AsyncHttpResponseHandler() {
        @Override
        public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
            responder.returnResponce(getCorrectResponseFormat());
        }

        @Override
        public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
            //ToDO: find out what to do when failure happens
        }
    };

    public ServerRequest(String url, Parameters parameters, Context context,Responder responder) {
        this.url = url;
        this.parameters = parameters;
        this.context = context;
        this.responder = responder;
    }

    public void Send() throws JSONException, UnsupportedEncodingException {
        client = new AsyncHttpClient();
        client.post(context,url, getFormattedParameters(),"application/json", handler);
    }

    protected abstract StringEntity getFormattedParameters() throws JSONException, UnsupportedEncodingException;

    protected abstract Response getCorrectResponseFormat();

}
