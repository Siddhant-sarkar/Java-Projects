package com.sarkarSiddhant.developer;

import static com.sarkarSiddhant.developer.ThreadColour.ANSI_BLUE;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"HEllo From Runnable instance ");
    }
}
