package com.company;

public class MobilePhone {
    int MyNumber;
    boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("DeskPhone always onn");
    }

    @Override
    public void dial(int PhoneNumber) {
        System.out.println("Now ringing the " + PhoneNumber + " on DeskPhone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the deskPhone");
            isRinging = false;
        }
        System.out.println("NOt Ringing the deskphone");
    }

    @Override
    public boolean CallPhone(int number) {
        if (this.MyNumber == number) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    public DeskPhone(int myNumber) {
        MyNumber = myNumber;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }
}
