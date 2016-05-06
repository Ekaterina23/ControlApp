package com.example.hp.control.service;

import com.example.hp.control.BuildConfig;
import com.example.hp.control.imterface.ControlService;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ControlRest {

    public static final String HTTPS_ENDPOINT = "http://10.0.2.2:8080/reminders";
    public static final String HTTP_ENDPOINT = "http://10.0.2.2:8080/reminders";
    public static final String PROD_ENDPOINT = "http://10.0.2.2:8080/reminders";
    public static final String PROD_ENDPOINT_V2 = "http://10.0.2.2:8080/reminders";

    private static final int READ_TIMEOUT_SECONDS = 20;
    private static final int CONNECT_TIMEOUT_SECONDS = 20;

    public static ControlService getProdV2Service() {
        return getAdapter(PROD_ENDPOINT_V2).create(ControlService.class);
    }

    public static ControlService getProdService() {
        return getAdapter(PROD_ENDPOINT).create(ControlService.class);
    }

    public static ControlService getHttpsService() {
        return getAdapter(HTTPS_ENDPOINT).create(ControlService.class);
    }

    public static ControlService getHttpService() {
        return getAdapter(HTTP_ENDPOINT).create(ControlService.class);
    }

    public static ControlService getService() {
        return getProdService();
    }

    private static Retrofit getAdapter(String endpoint) {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        }

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .connectTimeout(CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(endpoint)
                .client(okHttpClient)
                .build();
    }

}


