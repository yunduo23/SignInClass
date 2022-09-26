package com.example.signinclass.publicModule.network;

import androidx.annotation.NonNull;

import com.example.signinclass.publicModule.constants.NetworkConstants;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RequestInterceptor implements Interceptor {
    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request();
        Request newRequest = request.newBuilder()
                .header("appId", NetworkConstants.APP_ID)
                .header("appSecret", NetworkConstants.APP_SECRET)
                .build();
        return chain.proceed(newRequest);
    }
}
