package com.SarkarSiddhant;

public class Hamburger {
    private String Name;
    private String BreadRoll;
    private String Meat;
    private int Price;

    public Hamburger(String Name,String breadRoll, String meat, int price) {
        this.BreadRoll = breadRoll;
        this.Meat = meat;
        this.Price = price;
        this.Name=Name;
    }

    private String Extras_1_Name;
    private int Extras_1_Price;

    public void Add_Extras_1(String Extras_1_Name,int Extras_1_Price){
        this.Extras_1_Name=Extras_1_Name;
        this.Extras_1_Price=Extras_1_Price;
    }

    private String Extras_2_Name;
    private int Extras_2_Price;

    public void Add_Extras_2(String Extras_2_Name,int Extras_2_Price){
        this.Extras_2_Name=Extras_2_Name;
        this.Extras_2_Price=Extras_2_Price;
    }

    private String Extras_3_Name;
    private int Extras_3_Price;

    public void Add_Extras_3(String Extras_3_Name,int Extras_3_Price){
        this.Extras_3_Name=Extras_3_Name;
        this.Extras_3_Price=Extras_3_Price;
    }

    private String Extras_4_Name;
    private int Extras_4_Price;

    public void Add_Extras_4(String Extras_4_Name,int Extras_4_Price){
        this.Extras_4_Name=Extras_4_Name;
        this.Extras_4_Price=Extras_4_Price;
    }

    public double BurgerModifier(){
        double Total_Cost=this.Price;
        System.out.println(this.Name + " hamburger " + " on a " + this.BreadRoll + " roll "
                + "with " + this.Meat + ", price is "  + this.Price);
        if (this.Extras_1_Name !=null){
            Total_Cost+=this.Extras_1_Price;
            System.out.println("Added " + this.Extras_1_Name + " for an extra " + this.Extras_1_Price);
        }
        if (this.Extras_2_Name !=null){
            Total_Cost+=this.Extras_2_Price;
            System.out.println("Added " + this.Extras_2_Name + " for an extra " + this.Extras_2_Price);

        }
        if (this.Extras_3_Name !=null){
            Total_Cost+=this.Extras_3_Price;
            System.out.println("Added " + this.Extras_3_Name + " for an extra " + this.Extras_3_Price);

        }
        if (this.Extras_4_Name !=null){
            Total_Cost+=this.Extras_4_Price;
            System.out.println("Added " + this.Extras_4_Name + " for an extra " + this.Extras_4_Price);

        }

        return Total_Cost;

    }


}