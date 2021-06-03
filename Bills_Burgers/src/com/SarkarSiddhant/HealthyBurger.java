package com.SarkarSiddhant;

public class HealthyBurger extends Hamburger {
    public HealthyBurger( String meat, int price) {
        super("Helathy Burger","Brown Rye Bread", meat, price);
    }
    private String Healthy_Add_Extras_1_Name;
    private int Healthy_Add_Extras_1_Price;

    public void Healthy_Add_Extras_1(String Healthy_Add_Extras_1_Name,int Healthy_Add_Extras_1_Price){
        this.Healthy_Add_Extras_1_Name=Healthy_Add_Extras_1_Name;
        this.Healthy_Add_Extras_1_Price=Healthy_Add_Extras_1_Price;
    }

    private String Healthy_Add_Extras_2_Name;
    private int Healthy_Add_Extras_2_Price;

    public void Healthy_Add_Add_Extras_2(String Healthy_Add_Extras_2_Name,int Healthy_Add_Extras_2_Price){
        this.Healthy_Add_Extras_2_Name=Healthy_Add_Extras_2_Name;
        this.Healthy_Add_Extras_2_Price=Healthy_Add_Extras_2_Price;
    }

    @Override
    public double BurgerModifier() {
        double Total_Cost=super.BurgerModifier();
        if(this.Healthy_Add_Extras_1_Name!=null){
            Total_Cost+=this.Healthy_Add_Extras_1_Price;
            System.out.println("Added " + this.Healthy_Add_Extras_1_Name + " for an extra " + this.Healthy_Add_Extras_1_Price);

        }
        if(this.Healthy_Add_Extras_2_Name!=null){
            Total_Cost+=this.Healthy_Add_Extras_2_Price;
            System.out.println("Added " + this.Healthy_Add_Extras_2_Name + " for an extra " + this.Healthy_Add_Extras_2_Price);

        }
        return Total_Cost;
    }
}
