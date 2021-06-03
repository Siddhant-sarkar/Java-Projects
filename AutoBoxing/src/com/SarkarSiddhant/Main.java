package com.SarkarSiddhant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*****
         * This is one way of doing it the way of long method
         *****/
//        ArrayList<Integer> newinteger= new ArrayList<>();
//        for (int i =0;i<10;i++){
//            newinteger.add(Integer.valueOf(i));
//            //this is autoboxing
//            //taking prmitive int and converting it to INTEGER int
//        }
//        for (int i=0;i<10;i++){
//            System.out.println(newinteger.get(i).intValue());
//            //this is unboxing
//            //taking INTEGER int and cnverting to integer int
//        }
//
//        ArrayList<Double> My_Double=new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            My_Double.add(Double.valueOf(i));
//        }
//        for (int i = 0; i < 10; i++) {
//            My_Double.get(i).doubleValue();
//        }
        /*****
         *This is the short way the incorporates the use of
         * operator overloading behind the scences;
         * uses .Valueof()===>for autoboxing
         * uses .intvalue/.doublevalue for unboxing;
         *****/

        Integer myint=56;//using myint.valueof(56);
        int ninit=myint;//using myint.intvalue();

    }
}
