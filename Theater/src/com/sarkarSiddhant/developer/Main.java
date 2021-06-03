package com.sarkarSiddhant.developer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Roman Tale", 10, 10);
//        printList(theater.getSeats());
        theater.reserveSeat("B02");
        theater.reserveSeat("B02");
        List<Theater.Seat>reversedList=new ArrayList<Theater.Seat>(Theater.getSeats());
        Collections.reverse(reversedList);
        printList(reversedList);
        List<Theater.Seat>priceSeats = new ArrayList<>(theater.getSeats());

        priceSeats.add(theater.new Seat("B00",13));
        priceSeats.add(theater.new Seat("A00",13));

        Collections.sort(priceSeats,Theater.PRICE_ORDER);
        Collections.sort(priceSeats);
        printList(priceSeats);





    }


    public static void printList(List <Theater.Seat> seatList) {
        for (Theater.Seat s : seatList) {
            System.out.print("  " + s.getSeatNumber());
        }
        System.out.println();

        for (Theater.Seat s : seatList) {
            System.out.print("  " + s.getSeatCost());
        }
        System.out.println();
        System.out.println("*********************************************************************");
    }

}