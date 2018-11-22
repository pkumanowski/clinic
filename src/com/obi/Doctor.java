package com.obi;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends Specialization {

    private LocalDate workHours;

    public Doctor(String name, int id, int phoneNumber, String specialization, LocalDate workHours) {
        super(name, id, phoneNumber, specialization);
        this.workHours = workHours;
    }

    public void setWorkHours(LocalDate workHours) {
        this.workHours = workHours;
    }

    public LocalDate getWorkHours() {
        return workHours;
    }
}


