package com.sarkarSiddhant.developer;

import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class MyProducer implements Runnable{
    private ArrayBlockingQueue<String>buffer;
    private String color;



    public MyProducer(ArrayBlockingQueue<String> buffer, String color){
        this.buffer=buffer;
        this.color=color;

    }
    @Override
    public void run(){
        Random random=new Random();
        String []nums={"1","2","3","4","5","6"};

        for (String string : nums){
            try{
                System.out.println(color+"Adding ...."+string);
                buffer.add(string);
                Thread.sleep(random.nextInt(1000));
            }catch(InterruptedException e){
                System.out.println("Produver was interupted");
            }
        }
        System.out.println(color+"Adding EOF and exiting...");
            buffer.add("EOF");
        }
    }

