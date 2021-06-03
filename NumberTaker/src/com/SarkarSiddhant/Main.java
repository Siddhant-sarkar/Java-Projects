package com.SarkarSiddhant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*********
     * Declaring Scanner Class Globally
     *********/
    private static Scanner input=new Scanner(System.in);

    /*********
     *Main Java Class
     *********/
    public static void main(String[] args) {

        int [] myIntegers=getArray(5);
        displayArray(myIntegers);
        displayArray(Sort_Asscending(myIntegers));
    }
    /*********
     * Function TO get Array By continously Typing NUmber
     *********/
    public static int[] getArray(int number){
        int[] array=new int[number];
        for (int i=0;i< array.length;i++){
            array[i]= input.nextInt();
        }
        return array;
    }
    /*********
     *Function to Display Arrays Serially
     *********/
    public static void displayArray(int [] array){
        System.out.println("******Displaying Arrays******");
        for (int i:array) {
            System.out.println(i);
        }
        System.out.println("******Stopping Displaying Arrays******");
    }
    /*********
     *Method to Sort Arrays
     * In Asscending Order
     *********/
    public static int[] Sort_Asscending(int [] test_Array){
        int [] array= Arrays.copyOf(test_Array,test_Array.length);
        boolean flag=true;
        int temp=0;
        while(flag){
            flag=false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }
            }

        }

        return array;
    }


}
