package com.example.omar.orderin.Network.Parameters;

/**
 * Created by th on 12/06/2016.
 */
public class LoginParameters extends Parameters{

    private String Username;
    private String Password;


    public LoginParameters(String username, String password) {
        Username = username;
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
}
