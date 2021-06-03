package com.sarkarSiddhant.developer;

import java.util.Scanner;

public class Main {
    public  static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        equation();
    }
    public static void equation(){
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        System.out.println("PLease write Point 1");
        a=scanner.nextDouble();
        scanner.nextLine();
        b=scanner.nextDouble();
        scanner.nextLine();
        c=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("PLease write Point 2");
        d=scanner.nextDouble();
        scanner.nextLine();
        e=scanner.nextDouble();
        scanner.nextLine();
        f=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("The unit vector is : ");

        double temp1=d-a;
        double temp2=e-b;
        double temp3=f-c;
        double temp4=Math.sqrt((temp1*temp1)+(temp2*temp2)+(temp3*temp3));
        System.out.println("===========================");
        System.out.println(temp1/temp4+" i + "+temp2/temp4+" j + "+temp3/temp4+" k");
        System.out.println("===========================");
    }
}