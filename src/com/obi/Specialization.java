package com.obi;


public class Specialization extends Person {


    private String specialization = "";

    public Specialization(String name, int id, int phoneNumber, String specialization) {
        super(name, id, phoneNumber);
        this.specialization = specialization;
    }
}
