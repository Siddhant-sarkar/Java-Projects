package com.SarkarSiddhant;

import java.util.ArrayList;

public class Customers {
    private String Name;
    private ArrayList<Double>Trasactions;

    public Customers(String Name){
        this.Name=Name;
        this.Trasactions=new ArrayList<>();
    }
    public Customers(String Name,double TAmmount){
        this.Name=Name;
        this.Trasactions=new ArrayList<>();
        Add_Transaction(TAmmount);

    }

    public ArrayList<Double> getTrasactions() {
        return Trasactions;
    }

    public String getName() {
        return Name;
    }

    public void Add_Transaction(double ammount){
        this.Trasactions.add(Double.valueOf(ammount));
    }
}
