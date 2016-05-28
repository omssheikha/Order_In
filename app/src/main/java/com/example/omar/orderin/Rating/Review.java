package com.example.omar.orderin.Rating;

import com.example.omar.orderin.Users.User;

/**
 * Created by th on 26/05/2016.
 */
public class Review {
    private User user;
    private String review;

    public Review(User user, String review) {
        this.user = user;
        this.review = review;
    }

    public String getReview() {
        return review;
    }

    public User getUser() {
        return user;
    }

}
