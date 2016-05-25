package com.example.omar.orderin;

import com.example.omar.orderin.Users.User;

import org.junit.Test;
import static org.junit.Assert.*;


public class UserTest
{
    protected static User makeUser()
    {
        return new User();
    }

    @Test
    public void createUser()
    {
        try{
            makeUser();
        }
        catch (Exception e)
        {
            System.out.println("Could not create User");
        }
    }
}
