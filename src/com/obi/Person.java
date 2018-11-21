package com.obi;

public abstract class Person {

    private String name;
    private int id;
    private int phoneNumber;

    public Person(String name, int id, int phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
