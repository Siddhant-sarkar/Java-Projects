package com.SarkarSiddhant;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("Delux Burger ", "Maharaja", "Spicy N Crispy", 200);
        super.Add_Extras_1("Chips", 25);
        super.Add_Extras_2("Cold-Drinks", 5);
    }

    @Override
    public void Add_Extras_1(String Extras_1_Name, int Extras_1_Price) {
        System.out.println("Sorry Cant add");
    }

    @Override
    public void Add_Extras_2(String Extras_2_Name, int Extras_2_Price) {
        System.out.println("Sorry Cant add");

    }

    @Override
    public void Add_Extras_3(String Extras_3_Name, int Extras_3_Price) {
        System.out.println("Sorry Cant add");
    }

    @Override
    public void Add_Extras_4(String Extras_4_Name, int Extras_4_Price) {
        System.out.println("Sorry Cant add");
    }

    @Override
    public double BurgerModifier() {
        System.out.println("Thank you For Buying A Delux Burger");
        return super.BurgerModifier();
    }
}
