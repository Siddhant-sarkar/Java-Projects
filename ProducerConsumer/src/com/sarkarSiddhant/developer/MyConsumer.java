package com.sarkarSiddhant.developer;


import java.util.concurrent.ArrayBlockingQueue;



public class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String>buffer;
    private String color;



    public MyConsumer(ArrayBlockingQueue<String> buffer, String color){
        this.buffer=buffer;
        this.color=color;

    }

    @Override
    public void run() {
        while(true) {
            synchronized(buffer){
                try{
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(Main.EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed" + buffer.take());
                    }
                }catch (InterruptedException e){
                    System.out.println("Something Just interrupted my MyConsumer Thread");
                }
            }
        }
    }
}

