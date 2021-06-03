package com.sarkarSiddhant.developer;

import java.util.*;
import java.util.List;

public class Theater {
    private final String theaterName;
    public static  List<Seat>seats=new ArrayList<>();
    static final Comparator<Seat>PRICE_ORDER=new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getSeatCost()>seat2.getSeatCost()){
                return 1;
            }else if (seat1.getSeatCost()<seat2.getSeatCost()){
                return -1;
            }else{
                return 0;
            }
        }
    }
    ;

    public Theater(String theaterName,int numberOfRows,int seatsPerRow) {
        this.theaterName = theaterName;
        int lastRow='A'+numberOfRows-1;
        for (char row='A';row<lastRow;row++){
            for (int seatNumber=1;seatNumber<= seatsPerRow;seatNumber++){
                double costOfSeat=12.00;
                if (row <'D'&&(seatNumber>=4&&seatNumber<=9)){
                     costOfSeat=12.00;
                }else if (row>'F'||(seatNumber<4||seatNumber>9)){
                     costOfSeat =7.00;
                }
                Seat seat= new Seat(row+String.format("%02d",seatNumber),costOfSeat);
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            if (this.seats.get(foundSeat).isReserve()) {
                System.out.println("The seat is already reserved ");
                return false;
            }else{
                seats.get(foundSeat).reserve();
            }
        }else{
            System.out.println("Seat with that name not found please check ");
            return false;
        }
           return false;
    }


    public static Collection<Seat> getSeats(){
        return seats;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double cost;
        private boolean reserve=false;

        public Seat(String seatNumber,double cost) {
            this.seatNumber = seatNumber;
            this.cost=cost;
        }

        public boolean reserve(){
            if (!this.reserve){
                this.reserve=true;
                System.out.println("Seat "+seatNumber+" reserved");
                return true;
            }
            else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserve){
                this.reserve=false;
                System.out.println(" Reservation for seatNumber "+seatNumber+" Has been sucessfully cancelled ");
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber() {
            return seatNumber;
        }
        public double getSeatCost(){
            return this.cost;
        }

        public boolean isReserve() {
            return reserve;
        }
    }
}
