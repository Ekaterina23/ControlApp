package com.example.hp.control.imterface;

import retrofit2.Response;
import retrofit2.http.GET;


public interface ControlService {

    @GET("http://10.0.2.2:8080/reminders")
    Response getUsers();

}

