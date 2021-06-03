package com.sarkarSiddhant.developer;

public class Series {
    public static int nSum(int a){
        return ((a*(a+1))/2);
    }
    public static int factorial(int a){
       if(a==0){
           return 1;
       }
       return a*factorial(a-1);
    }
    public static int fibonnaci(int a ){
       if(a<=1){
           return a;
       }
       return fibonnaci(a-1)+fibonnaci(a-2);
    }
}
