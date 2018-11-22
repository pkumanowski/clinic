package com.obi;


import java.time.LocalDate;
import java.util.ArrayList;


public class Timetable {

    ArrayList<LocalDate> timetable;
    Doctor allDoctors;
    Patient allPatiens;
    private int vititId;

    public Timetable(ArrayList<LocalDate> timetable)
    {
        this.timetable = timetable;
    }

    public void addVisitDate (LocalDate dateOfVisit)
    {
        timetable.add(dateOfVisit);
    }
}
