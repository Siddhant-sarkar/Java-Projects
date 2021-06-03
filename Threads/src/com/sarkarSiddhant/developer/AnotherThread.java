package com.sarkarSiddhant.developer;

import static com.sarkarSiddhant.developer.ThreadColour.ANSI_GREEN;

public class AnotherThread extends  Thread{
    @Override
    public void run() {
        System.out.println(ANSI_GREEN+"Printing from "+currentThread().getName());
        try{
            sleep(10000);
        }catch (InterruptedException e){
            System.out.println(ANSI_GREEN+"Another exception woke me up");
            return;
        }
        System.out.println(ANSI_GREEN+"This is me wakeing up after 10 seconds");
    }
}
