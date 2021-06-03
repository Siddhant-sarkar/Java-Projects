package com.SarkarSiddhant;

public class Contacts {
    private String Name;
    private String number;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Contacts(String name, String number) {
        Name = name;
        this.number = number;
    }
}