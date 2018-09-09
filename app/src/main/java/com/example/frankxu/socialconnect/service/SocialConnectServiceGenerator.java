package com.example.frankxu.socialconnect.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by frankxu on 2018-09-09.
 */

public class SocialConnectServiceGenerator {

    public static <S> S createService(Class<S> serviceClass, String baseURL) {

        Retrofit.Builder builder =
                new Retrofit.Builder()
                        .baseUrl(baseURL)
                        .addConverterFactory( GsonConverterFactory.create() );
        Retrofit retrofit = builder.build();

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging);
            builder = builder.client(httpClient.build());
            retrofit = builder.build();
        }

        return retrofit.create(serviceClass);
    }

}
