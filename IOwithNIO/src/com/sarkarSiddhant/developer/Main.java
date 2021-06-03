package com.sarkarSiddhant.developer;


import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
//        try{
//            Path path= FileSystems.getDefault().getPath("Temp.txt");
//            FileInputStream outStream=new FileInputStream("Temp.txt");
//            FileChannel newChannel=outStream.getChannel();
//            ByteBuffer buffer=ByteBuffer.allocate(69);
//            int BytesRead=newChannel.read(buffer);
//            System.out.println(buffer.);
//
//
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }


        Path pathnew=Files.





        try {
            Path path= FileSystems.getDefault().getPath("Temp.txt");
//            BufferedReader reader= Files.newBufferedReader(path);


            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
