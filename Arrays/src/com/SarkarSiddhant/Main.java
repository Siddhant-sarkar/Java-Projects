package com.SarkarSiddhant;


public class Main{
    public static void main(String[] args){
        int [ ] mylistofnumbers;
        mylistofnumbers=new int[4];
        mylistofnumbers[3]=500;
//        System.out.println(mylistofnumbers[3]);

        int[] latest={1,2,3,4,5,6,7,8,9,10};
//        System.out.println(latest[5]);
//        System.out.println(latest[0]);
//        System.out.println(latest[1]);

        int[] latest1=new int[26];
        for(int i=0;i<latest1.length;i++){
            latest1[i]=i*5;
        }
//        for(int j=0;j<latest1.length;j++){
//            System.out.println(latest1[j]);
//        }

        Print_myArray(mylistofnumbers);
        Print_myArray(latest);
        Print_myArray(latest1);
    }

    public static void Print_myArray(int[]array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }

    


}