package com.example.omar.orderin.Users;

import com.example.omar.orderin.General.Soura;

import java.util.Date;

/**
 * Created by Omar on 23/05/2016.
 */
public class User
{
    private String username;
    private String name;
    private Date dateOfBirth;
    private String status;
    private Soura profilePicture;

    public User(String username, String name, Date dateOfBirth, String status, Soura profilePicture)
    {
        this.username = username;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public Soura getProfilePicture() {
        return profilePicture;
    }


}
