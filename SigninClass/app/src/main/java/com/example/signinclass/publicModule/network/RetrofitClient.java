package com.example.signinclass.publicModule.network;

import com.example.signinclass.publicModule.constants.NetworkConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit instance;
    public static Retrofit getRetrofitInstance(){
        if (instance == null) instance = new Retrofit.Builder().client(createOkHttpClient()).baseUrl(NetworkConstants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return instance;
    }

    private static OkHttpClient createOkHttpClient(){
        return new OkHttpClient.Builder().addInterceptor(new RequestInterceptor()).build();
    }
}
