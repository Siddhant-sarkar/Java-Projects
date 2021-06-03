package com.sarkarSiddhant.developer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	    new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from Runnable");
//            }
//        }).start();
//        new Thread(()-> {
//            System.out.println("The printing from Runnable ");
//            System.out.println("THis is the second line");
//            System.out.println("THis is the 3rd line");
//        }).start();

        List<Integer>number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        number.forEach((n)->System.out.println(number.get(n-1)));
    }
}
class codeToRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing from Runnable");
    }
}

