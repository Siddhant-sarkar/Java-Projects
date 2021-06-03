package com.sarkarSiddhant.developer;

import com.sarkarSiddhant.developer.datasoruce.Artists;
import com.sarkarSiddhant.developer.datasoruce.DataFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        DataFile file =new DataFile();
        if(file.openConnection()==false){
            System.out.println("Couldnt open data Sourec");
            return;
        }
//        List<Artists> temp=file.queryArtists(2);
//        for (Artists artists:temp){
//            System.out.println("ID = "+artists.get_id()+"  || Name = : "+artists.getName());
//            return;
//        }
        Scanner scanner =new Scanner(System.in);
        String str= scanner.nextLine();
        List<String>albumsForArtits=file.queryAlbumsForArtits(str,2);
        for ( String s:albumsForArtits){
            System.out.println(s);
        }
//        file.getCount(DataFile.TABLE_SONGS);
//        file.closeConnection();
    }
}
