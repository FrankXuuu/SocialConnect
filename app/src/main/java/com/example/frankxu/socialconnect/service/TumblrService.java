package com.example.frankxu.socialconnect.service;

import com.example.frankxu.socialconnect.model.User;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by frankxu on 2018-09-09.
 */

public interface TumblrService {

    @GET("/api/tumblr/login/")
    Call<User> login();
}
