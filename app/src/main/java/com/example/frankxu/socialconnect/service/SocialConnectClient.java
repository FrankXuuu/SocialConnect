package com.example.frankxu.socialconnect.service;

import com.example.frankxu.socialconnect.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by frankxu on 2018-09-09.
 */

public interface SocialConnectClient {

    @GET("/login/")
    Call<User> login();

    /*@GET("/user/{userId}")
    Call<User> userInfo(
            @Path("userId") String userId
    );

    @GET("/comments/{userId}")
    Call<Comments> comments(
            @Path("userId") String userId
    );*/
}
