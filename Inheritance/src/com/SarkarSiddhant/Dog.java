package com.SarkarSiddhant;

public class Dog extends Animal {
    private int number;
    private int number2;
    private int number3;

    public Dog(int num1, int num4, int num5, int num6,int number,int number2,int number3) {
        super(num1, 2, 3, num4, num5, num6);
        this.number=number;
        this.number2=number2;
        this.number3=number3;

    }

    @Override
    public void Eat(){
        System.out.println("THis is Dogs eat methord Called");
    }

}
