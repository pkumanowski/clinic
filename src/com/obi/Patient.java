package com.obi;

import java.time.LocalDate;

public class Patient extends Person {

    private String illness;
    private LocalDate visitDate;

    public Patient(String name, int id, int phoneNumber, String illness, int year, int month, int day) {
        super(name, id, phoneNumber);
        this.illness = illness;
        this.visitDate = LocalDate.of(year, month, day);
    }
    public String getIllness() {
        return illness;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }
}

