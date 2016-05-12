package com.example.hp.control.imterface;

import com.example.hp.control.service.ControlData;

import java.util.Date;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ControlService {

    @GET()
    Call<ControlData> idClient (@Query("id") Long idClient);
    Call<ControlData> surname (@Query("Фамилия") String surname);
    Call<ControlData> first_name (@Query("Имя") String first_name);
    Call<ControlData> position (@Query("Должность") String position);
    Call<ControlData> conlrolDateIn (@Query("Время входа") Date conlrolDateIn);
    Call<ControlData> conlrolDateOut (@Query("Время выхода") Date conlrolDateOut);


}

