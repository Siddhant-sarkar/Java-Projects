package com.sarkarSiddhant.developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Player Sid=new Player("Siddhant",100,100);
//        System.out.println(Sid.toString());
//        Sid.setWeapon("Arctic Warfare Magnum");
//        System.out.println(Sid.toString());
//        saveObject(Sid);
//        LoadObject(Sid);
//
        ISaveable WareWolf=new Monster("WareWolf",200,300);
        saveObject(WareWolf);
        System.out.println(WareWolf.toString());
        ((Monster)WareWolf).getStrength();


    }
    public static ArrayList<String> ReadValue(){
        ArrayList<String> value=new ArrayList<String>();

        Scanner scanner =new Scanner(System.in);
        boolean quit = false;
        int index =0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        while(!quit){
            System.out.println("Choose an option ");
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit =true;
                    break;
                case 1 :
                    System.out.println("Enter a string");
                    String  StringInput=scanner.nextLine();
                    value.add(index,StringInput);
                    index++;
                    break;
            }
        }
        return value;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" To storage Device");

        }
    }

    public static void LoadObject(ISaveable ObjectToLoad){
        List<String>toLoad=ReadValue();
        ObjectToLoad.read(toLoad);


    }

























}
