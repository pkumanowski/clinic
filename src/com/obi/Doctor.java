package com.obi;

import java.util.ArrayList;

public class Doctor extends Person {

    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, int id, int phoneNumber, String specialization)
    {
        super(name, id, phoneNumber);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}
