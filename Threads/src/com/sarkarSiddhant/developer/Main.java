package com.sarkarSiddhant.developer;

import static com.sarkarSiddhant.developer.ThreadColour.*;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(ANSI_RED + "HEllo worlds From main thread");

        AnotherThread thread = new AnotherThread();
        thread.setName("==Another Thread==");
        thread.start();
        System.out.println(ANSI_RED + "Again printing from MAin thread");


//The anonymous class
        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "HEllo from  Anonymous thread ");
            }
        }.start();

        MyRunnable runBro = new MyRunnable();
        runBro.run();
        Thread runSis=new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_PURPLE+"HEllow from Anomynous Runnable instance of Thread  ");
                try{
                    thread.join(1000);
                    System.out.println("Another Thread finsished so Iam up again");
                }catch (InterruptedException e){
                    System.out.println("Cant wait to be intu..pted");
                }
            }
        });
        runSis.start();

            }
}

