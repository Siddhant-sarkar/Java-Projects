package com.sarkarSiddhant.developer;

import java.util.Random;

class Writer implements Runnable{
    private Message message;

    public Writer(Message message){
        this.message=message;
    }

    public void run(){
        String []messgae={
                "HUmpty Dumpty sat on a wall",
                "HUmpty Dumpty Had a great fall",
                "All the kings Horses  and the men",
                "Couldent put him together again"
        };
        Random random=new Random();
        for (int i=0;i<messgae.length;i++){
            this.message.write(messgae[i]);
            try{
                Thread.sleep(random.nextInt(2000));
            }catch(InterruptedException e){

            }
        }
        message.write("Finished");
    }
}
