package com.example.omar.orderin;

import com.example.omar.orderin.General.Soura;
import com.example.omar.orderin.Users.User;

import org.junit.Test;

import java.util.Date;

import static org.mockito.Mockito.mock;


public class UserTest
{
    private static final String SAMPLE_USERNAME= "oms";
    private static final String SAMPLE_NAME = "omar el sheikha";
    private static final Date SAMPLE_DATE_OF_BIRTH = new Date();
    private static final String SAMPLE_STATUS  = "hello im doing fine :D";
    private Soura sampleProfilePicure = mock(Soura.class);

    private User makeUser()
    {
        return new User(SAMPLE_USERNAME,SAMPLE_NAME,SAMPLE_DATE_OF_BIRTH,SAMPLE_STATUS
                ,sampleProfilePicure);
    }

    @Test
    public void createUser()
    {
           User u = makeUser();
    }
}
