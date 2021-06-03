package com.SarkarSiddhant;

public class Main {

    public static void main(String[] args) {
        Hamburger My_Burger=new Hamburger("Basic","White","Chicken",100);
        My_Burger.Add_Extras_1("Pickels",2);
        My_Burger.Add_Extras_2("Cheese",3);
        My_Burger.Add_Extras_3("Cabbage",4);
        My_Burger.Add_Extras_4("Cold Drinks",5);

        System.out.println(My_Burger.BurgerModifier());

        DeluxBurger My_DeluxBurger=new DeluxBurger();
        System.out.println(My_DeluxBurger.BurgerModifier());



    }
}
