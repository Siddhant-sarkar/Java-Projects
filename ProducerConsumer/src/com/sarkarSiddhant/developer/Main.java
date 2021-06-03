package com.sarkarSiddhant.developer;


import java.util.concurrent.*;

public class Main {
    public static String EOF="EOF";

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        ArrayBlockingQueue <String> buffer=new ArrayBlockingQueue<String>(6);
        MyProducer producer=new MyProducer(buffer,ThreadColor.ANSI_CYAN);
        MyConsumer consumer =new MyConsumer(buffer,ThreadColor.ANSI_RED);
        MyConsumer hotComsumer=new MyConsumer(buffer,ThreadColor.ANSI_GREEN);

        executorService.execute(producer);
        executorService.execute(consumer);
        executorService.execute(hotComsumer);
        Future<String> future=executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_BLUE+"I am being printed from Callable Class");
                return "Thats What I want to return ";
            }
        });

        try{
            System.out.println(future.get());
        }catch(InterruptedException e){
            System.out.println("Thread runnning in the main is Interrupted");
        }catch (ExecutionException e){
            System.out.println("Something went wrong");
        }
         executorService.shutdown();


    }
}
