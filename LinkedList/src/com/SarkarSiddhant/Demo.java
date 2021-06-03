package com.SarkarSiddhant;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String>PlacesToVisit=new LinkedList<>();
        AddAlphabetically(PlacesToVisit,"U.S.A");
        AddAlphabetically(PlacesToVisit,"Uk");
        AddAlphabetically(PlacesToVisit,"Canada");
        AddAlphabetically(PlacesToVisit,"Russia");
        AddAlphabetically(PlacesToVisit,"Moscow");
        AddAlphabetically(PlacesToVisit,"Switzerland");
        AddAlphabetically(PlacesToVisit,"Finland");
        AddAlphabetically(PlacesToVisit,"Germany");
        AddAlphabetically(PlacesToVisit,"Singapore");
        AddAlphabetically(PlacesToVisit,"Mauritius");
        PrintLinkedList(PlacesToVisit);
        Visit(PlacesToVisit);

    }

    private static void PrintLinkedList( LinkedList NameOfList){
        Iterator<String> i=NameOfList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting "+i.next());
        }
        System.out.println("*************************************" +
                "**********************************************" +
                "****************************************************");
    }

    /*********
     *
     * @param Samplelinkedlist
     * @param NewCity
     * @return it does not return anything but add new String Lexxadeagocaly
     *
     */
    private static boolean AddAlphabetically(LinkedList Samplelinkedlist,String NewCity){
        ListIterator<String>listIterator= Samplelinkedlist.listIterator();

        while(listIterator.hasNext()){
            int Compaarison=listIterator.next().compareTo(NewCity);
            if (Compaarison==0){
                System.out.println("Sorry Same City cannot be added");
                return false;
            }
            else if (Compaarison>0){
                listIterator.previous();
                listIterator.add(NewCity);
                return true;
            }
            else if (Compaarison<0){
            }
        }
        listIterator.add(NewCity);
        return true;
    }

    public static void Visit(LinkedList cities){
        Scanner scanner =new Scanner(System.in);
        boolean quit=false;
        boolean goingforward =true;
        ListIterator<String> Temp_List_Iterator= cities.listIterator();
        if (cities.isEmpty()){
            System.out.println("The LinkedList is empty");
        }
        else{
            System.out.println("You are Now At : 1" +Temp_List_Iterator.next());
            print_menu();
        }

        while(!quit){
            int i = scanner.nextInt();
            scanner.nextLine();
            switch (i){
                case 0:
                    System.out.println("Holiday vacation over");
                    quit=true;
                    break;
                case 1:
                    if (!goingforward){
                        if (Temp_List_Iterator.hasNext()){
                            Temp_List_Iterator.next();
                            goingforward=true;
                        }
                    }
                    if (Temp_List_Iterator.hasNext()){
                        System.out.println("Moving to "+Temp_List_Iterator.next());
                    }
                    else{
                        System.out.println("The End of the list reached");
                        goingforward=false;
                    }
                    break;
                case 2:
                    if (goingforward){
                        if (Temp_List_Iterator.hasPrevious()){
                            Temp_List_Iterator.previous();
                            goingforward=false;
                        }
                    }
                    if (Temp_List_Iterator.hasPrevious()){
                        System.out.println("Now visiting the "+Temp_List_Iterator.previous());
                    }else{
                        System.out.println("You are the staring element");
                        goingforward=true;
                    }
                    break;
                case 3:
                    print_menu();
                    break;
            }
        }

    }
    public static void print_menu(){
        System.out.println("Avail able options : \n press");
        System.out.println("0== Exit from your holiday");
        System.out.println("1==to move to your next destination");
        System.out.println("2== to move to your previous destination");
        System.out.println("3 == to print this menue again");
    }
}
