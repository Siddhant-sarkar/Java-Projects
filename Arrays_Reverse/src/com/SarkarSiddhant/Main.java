package com.SarkarSiddhant;

import java.util.Arrays;

/**********
 * Program to reverse The Arrays
 **********/
public class Main {

    public static void main(String[] args) {
	int [] Arrays=new int[]{1,2,3,4,5};
	int[] Reversed_Arrays=Reverse_Array(Arrays);
        for (int a :Reversed_Arrays) {
            System.out.println(a);
        }
        
    }
    /**********
     *  reverse The Arrays Method
     **********/
    private static int[]Reverse_Array(int[] Arrays){
        int [] Reversed=new int[Arrays.length];
       for (int i=0;i< Arrays.length;i++){
           Reversed[i]=Arrays[Arrays.length-i-1];
       }
       return Reversed;
    }

}
