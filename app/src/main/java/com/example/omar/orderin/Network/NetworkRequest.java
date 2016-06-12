package com.example.omar.orderin.Network;

import android.content.Context;

import com.example.omar.orderin.Network.Parameters.Parameters;
import com.example.omar.orderin.Network.Responses.Response;
import com.example.omar.orderin.Network.ServerRequests.ServerRequest;

/**
 * Created by th on 12/06/2016.
 */
public class NetworkRequest implements ServerRequest.Responder {

    ServerRequest request;
    Parameters paramters;
    Context context;

    public NetworkRequest(ServerRequest request, Parameters paramters, Context context)
    {
        this.request = request;
        this.paramters = paramters;
    }

    public Response send()
    {
        return null;
    }

    @Override
    public void returnResponce(Response response) {

    }
}
