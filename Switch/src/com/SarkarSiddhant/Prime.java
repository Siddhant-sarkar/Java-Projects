package com.SarkarSiddhant;

public class Prime {
    public static boolean Is_Prime(int number ){
        if (number==1) {
            return false;
        }
        else{
            for(int i=2;i<(number/2);i++){
                if((number%i)==0){
                    return false;
                }
            }
            return true;
        }
    }


    public static void ten_prime_finder(int start,int end){
        int count=0;
        for(int i=start;i<end;i++){
            if(Prime.Is_Prime(i)){
                System.out.println(i);
                count++;
                if (count==100){
                    break;
                }
            }
        }
    }
}
