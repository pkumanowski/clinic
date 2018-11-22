package com.obi;


public class Doctor extends Person {

    private String specialization = "";

    public Doctor(String name, int id, int phoneNumber, String specialization) {
        super(name, id, phoneNumber);
        this.specialization = specialization;
    }
}


