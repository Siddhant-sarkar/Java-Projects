package com.SkarTech;

public class VipCustomer {
    private String name;
    private int Account_Number;
    private String Email;

    public String getName() {
        return name;
    }

    public int getAccount_Number() {
        return Account_Number;
    }

    public String getEmail() {
        return Email;
    }

    private VipCustomer(String name, int Account_Number, String Email){
        this.Account_Number=Account_Number;
        this.Email=Email;
        this.name=name;
    }
}