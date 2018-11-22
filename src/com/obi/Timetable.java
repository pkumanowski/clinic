package com.obi;


import java.time.LocalDate;
import java.util.ArrayList;


public class Timetable {

    ArrayList<LocalDate> timetable;
    Doctor allDoctors;
    Patient allPatients;
    private int visitId;

    public Timetable(ArrayList<LocalDate> timetable)
    {
        this.timetable = timetable;
    }

    public void addVisitDate (LocalDate dateOfVisit)
    {
        timetable.add(dateOfVisit);
    }

    public ArrayList<LocalDate> getTimetable() {
        return timetable;
    }

    public void setTimetable(ArrayList<LocalDate> timetable) {
        this.timetable = timetable;
    }

    public Doctor getAllDoctors() {
        return allDoctors;
    }

    public void setAllDoctors(Doctor allDoctors) {
        this.allDoctors = allDoctors;
    }

    public Patient getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(Patient allPatients) {
        this.allPatients = allPatients;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }
}
