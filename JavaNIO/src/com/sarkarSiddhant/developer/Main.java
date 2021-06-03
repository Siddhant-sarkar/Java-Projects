package com.sarkarSiddhant.developer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

public class Main {

    public static void main(String[] args) throws IOException  {
        try(FileOutputStream stream=new FileOutputStream("aDATA.xxx");FileChannel channel =stream.getChannel()){

            byte[] outputBuffer ="Hello World!!!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(outputBuffer);
            int numBytes =channel.write(buffer);
            System.out.println("numBytes Written was : "+numBytes);


            ByteBuffer intBuffer=ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(785);
            intBuffer.flip();
            numBytes=channel.write(intBuffer);
            System.out.println("numBytes Written was : "+numBytes);

            intBuffer.flip();
            intBuffer.putInt(-6974256);
            intBuffer.flip();
            numBytes=channel.write(intBuffer);
            System.out.println("numBytes Written was : "+numBytes);

            RandomAccessFile ra=new RandomAccessFile("aDATA.xxx","rwd");
            FileChannel newchannel=ra.getChannel();

            outputBuffer[0]='a';
            outputBuffer[1]='b';
            long numBytesRead=newchannel.read(buffer);
            buffer.flip();
            System.out.println("output Byte : "+new String (outputBuffer));

            if (buffer.hasArray()){
                System.out.println("byte Buffer =" +new String (outputBuffer));

            }
            intBuffer.flip();
            numBytesRead=newchannel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt());
            intBuffer.flip();
            numBytesRead=newchannel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt());
            channel.close();
            ra.close();





//            RandomAccessFile ra= new RandomAccessFile("aDAta.xxx","rwd");
//            byte[]b=new byte[outputBuffer.length];
//            ra.read(b);
//            System.out.println(new String (b));
//
//            long int1 =ra.readInt();
//            long int2=ra.readInt();
//            System.out.println(int1+"   "+int2);


        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
