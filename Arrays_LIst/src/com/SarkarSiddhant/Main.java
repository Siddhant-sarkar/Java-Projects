package com.SarkarSiddhant;

import java.util.Scanner;

public class Main {
    private static Scanner input= new Scanner(System.in);
    private static ArrayList newList= new ArrayList();

    public static void main(String[] args) {
        boolean mood=false;
        int choice=0;
        printInstructions();
//        choice=input.nextInt();
//        input.nextLine();

        while(!mood){
            System.out.println("Enter Your Choice ");
            choice=input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    newList.PrintList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    mood=true;
                    break;
                case 6:
                    processthelist();
                    break;
            }

        }

    }
    public static void printInstructions(){
        System.out.println("Press 0 for Instructions");
        System.out.println("Press 1 for Printing List");
        System.out.println("Press 2 for Adding Items To the ArrayList");
        System.out.println("Press 3 for Modifying Items");
        System.out.println("Press 4 to remove An item From The List");
        System.out.println("Press 5 to Exit my Software");
    }

    public static void modifyItem(){
        System.out.println("Enter the item you wish to replace ");
        String toFind = input.nextLine();
        input.nextLine();
        System.out.println("Enter the name By which you want to replace");
        String toReplace = input.nextLine();
        input.nextLine();
        if(newList.Find_item_number(toFind)>=0){
            newList.Change_at(newList.Find_item_number(toFind),toReplace);
        }
        else{
            System.out.println("The Word you typed isnt in the list");
        }
    }

    public static void addItem(){
        System.out.println("Enter the Name of item you Want to Add");
        String item=input.nextLine();
        newList.AddItems(item);

    }

    public static void removeItem(){
        System.out.println("Enter the item you wish to remove ");
        String toFind = input.nextLine();
        input.nextLine();
        System.out.println("Enter the name By which you want to replace");
        String toRemove = input.nextLine();
        input.nextLine();
        if(newList.Find_item_number(toFind)>=0){
            newList.Remove(newList.Find_item_number(toFind));
        }
        else{
            System.out.println("The Word you typed isn't in the list");
        }
    }

    public static void processthelist(){
//        java.util.ArrayList<String>NewArray=new java.util.ArrayList<String>();
//        NewArray.addAll(newList.getMyList());



    }

}
