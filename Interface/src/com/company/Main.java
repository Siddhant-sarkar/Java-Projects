package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone SarkarsPhone = new DeskPhone(999999);
        SarkarsPhone.powerOn();
        SarkarsPhone.answer();
        SarkarsPhone.CallPhone(999999);
        SarkarsPhone.isRinging();
        SarkarsPhone.dial(999999);
   }
}
