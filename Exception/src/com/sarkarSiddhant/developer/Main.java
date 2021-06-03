package com.sarkarSiddhant.developer;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n ,m;

    divide();
    }

    public static int getInt(){
        Scanner scanner=new Scanner(System.in);
        try{
            int i;
            i= scanner.nextInt();
        return i;
        }catch (InputMismatchException l ){
            System.out.println("Please enetr someting asshole");
            scanner.nextLine();
        }
        return 0;
    }

    public static int divide(){
        int n,m;
       try{
           n=getInt();
           m=getInt();
//       }catch(NoSuchElementException |ArithmeticException x) {    //this can be used when catching multiple exceptions but this can only print only one error message bro
//           throw new NoSuchElementException("You did not enter something");
       }catch(NoSuchElementException x){
               throw new NoSuchElementException("You did not enter something");
       }catch (ArithmeticException lm){
           throw new ArithmeticException("Divide By Zero");
       }
       return 0;
    }

}
