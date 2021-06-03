package com.sarkarSiddhant.developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread{
    private  Socket socket;

    public Echoer(Socket socket) {
        this.socket=socket;
    }
    @Override
    public void run(){
        try{
            BufferedReader input =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output=new PrintWriter(socket.getOutputStream(),true);
            System.out.println("Connection Online");

            while(true){
                String echoString =input.readLine();
                if (echoString.equals("exit")){
                    break;
                }
                output.println("The echoed String is ||  "+echoString+"  ||");
            }
        }catch (IOException e){
            System.out.println("OOOps the message : "+e.getMessage());
        }finally {
            try{
                socket.close();
            }catch (IOException c){
                System.out.println("Fuxk socket was not closed as : "+c.getMessage());
            }
        }
    }
}
