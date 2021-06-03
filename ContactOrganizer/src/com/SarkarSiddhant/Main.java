package com.SarkarSiddhant;

import java.util.Scanner;

public class Main {
private static Scanner scanner=new Scanner(System.in);
private static MobilePhone PhoneList=new MobilePhone("CONTACTS");

    public static void main(String[] args) {
	boolean flag=false;
	int number;
        System.out.println("Starting the Program....");
        print_Menu();
        while(!flag){
            System.out.println("Please enter a Number: Press 6 to display the Menu");
            number=scanner.nextInt();
            scanner.nextLine();
            switch(number){
                case 0:
                    flag=true;
                    System.out.println("Shutting Down Have a Good Day");
                    break;
                case 1:
                    print_Contacts();
                    break;
                case 2:
                    AddContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    Remove_Contact();
                    break;
                case 5:
                    To_Check();
                    break;
                case 6:
                    print_Menu();
                    break;

            }

        }

    }

    /***
     * Menu printing Function
     ***/
    public static void print_Menu(){
        System.out.println("Press 0 : to Shut Down");
        System.out.println("Pres  1 : to Print the list of Contacts ");
        System.out.println("Press 2 : to Add the Contact");
        System.out.println("Press 3 : to update an existing Contact");
        System.out.println("Press 4 : Remove the Existing Contact ");
        System.out.println("Press 5 : To Query if an Contact Exists ");
        System.out.println("Press 6 : To print the List of Available Actions ");
        System.out.println();

    }
    /***
     * Print Contact
     ***/
    public static void print_Contacts(){
        PhoneList.Contacts_Printer();
    }
    /***
     * To Add new Contact
     ***/
    public static void AddContact(){
        String number;
        String name;
        System.out.println("Please enter the name you want to add to the contact");
        name= scanner.nextLine();
        if (PhoneList.Check(name)>=0){
            System.out.println("Hmm the Contact really Does not  exists");
        }
        else{
            System.out.println("Please enter the number you want to add to the contact");
            number= scanner.nextLine();
            PhoneList.Contact_Add(name,number);
        }
    }
    /***
     * To update existing Contact
     ***/
    public static void updateContact(){
        String number;
        String name;
        System.out.println("Please enter the name of the contact you want to edit");
        name= scanner.nextLine();
        if (PhoneList.Check(name)<0){
            System.out.println("Contact you entered is invalid");
        }
        else{
            System.out.println("Please enter the number by which you edit the shit out of it");
            number= scanner.nextLine();
            PhoneList.EditContact(number,name);
        }
    }
    /***
     * Remove Contact
     ***/
    public static void Remove_Contact(){
        String name;
        System.out.println("Please enter the name of the contact you want to remove");
        name= scanner.nextLine();
        if (PhoneList.Check(name)<0){
            System.out.println("Contact you entered is invalid");
        }
        else{
            PhoneList.Remove(name);
        }
    }
    /***
     *Query If an Contact Exists
     ***/
    public static void To_Check(){
        String name;
        System.out.println("Please enter the name of the contact you want to Check");
        name= scanner.nextLine();
        if (PhoneList.Check(name)<0){
            System.out.println("Contact you entered is invalid");
        }
        else{
            System.out.println("The Contact number That you Typed is Present in the list");
        }
    }



}
