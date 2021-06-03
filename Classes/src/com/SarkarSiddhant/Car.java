package com.SarkarSiddhant;

public class Car {
    public int year;
    public int wheel_size;
    public String model;

    public void setModel(String model){
        String Valid_model=model.toLowerCase();
        if (Valid_model.equals("porsche")){
            this.model=model;
        }
        else{
            this.model="Unknown";
        }
    }
    public String getModel(){
        System.out.println(this.model);
        return this.model;
    }
}
