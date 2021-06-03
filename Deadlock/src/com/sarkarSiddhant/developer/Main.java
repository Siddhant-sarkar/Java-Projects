package com.sarkarSiddhant.developer;

public class Main {
    public static Object lock1=new Object();
    public static Object lock2=new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

   static class Thread1 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread1 has : Has Lock 1");
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                }
                System.out.println("Thread1 is waiting for Lock 2");
                synchronized (lock2){
                    System.out.println("Thread1 has: Lock1 and Lock2");
                }
                System.out.println("Thread 1: released lock2  ");
            }
            System.out.println("Thread 1 : Released Lock1 and Now Exiting...");
        }
    }
    static class Thread2 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread2 has : Has Lock 1");
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                }
                System.out.println("Thread2 is waiting for Lock 2");
                synchronized (lock2){
                    System.out.println("Thread2 has: Lock1 and Lock2");
                }
                System.out.println("Thread 2: released lock2  ");
            }
            System.out.println("Thread 2 : Released Lock1 and Now Exiting...");
        }
    }
}
