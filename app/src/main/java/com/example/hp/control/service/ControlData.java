package com.example.hp.control.service;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ControlData {

    @JsonProperty
    private Long idClient;
    private String surname;
    private String first_name;
    private String position;
    private Date conlrolDateIn;
    private Date conlrolDateOut;

    public ControlData() {
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getConlrolDateIn() {
        return conlrolDateIn;
    }

    public void setConlrolDateIn(Date conlrolDateIn) {
        this.conlrolDateIn = conlrolDateIn;
    }

    public Date getConlrolDateOut() {
        return conlrolDateOut;
    }

    public void setConlrolDateOut(Date conlrolDateOut) {
        this.conlrolDateOut = conlrolDateOut;
    }
}
