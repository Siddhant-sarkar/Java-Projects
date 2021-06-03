package com.sarkarSiddhant.developer;


import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException{
        try(DataOutputStream locFile=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
            for (Location location:locations.values()){
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                System.out.println("Writing location "+ location.getLocationID()+" : "+location.getDescription());
                System.out.println("Writing "+(location.getExits().size()-1)+" Exits.");
                locFile.writeInt(location.getExits().size()-1);
                for(String direction : location.getExits().keySet()){
                    if (!direction.equalsIgnoreCase("Q")){
                        System.out.println("\t\t"+direction+","+location.getExits().get(direction));
                        locFile.writeUTF(direction);
                        locFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }
    }
    static {
        try(Scanner scanner =new Scanner(new BufferedReader(new FileReader("MyFile.txt")))){
            scanner.useDelimiter(" ");
            while(scanner.hasNextLine()){
                int loc=scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String descripton=scanner.nextLine();
                System.out.println("Imported Location "+loc+" : "+descripton);
                Map<String,Integer>tempExit=new HashMap<>();
                locations.put(loc, new Location (loc,descripton,tempExit));
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("Directions.txt"))){
            String Input;
            while((Input=bufferedReader.readLine())!=null){

                String []args=Input.split(",");
                int loc=Integer.parseInt(args[0]);
                String direction =args[1];
                int dest=Integer.parseInt(args[2]);
                System.out.println(loc+" : "+direction+" : "+dest);
                Location location=locations.get(loc);
                location.addExit(direction,dest);
            }
                    
        }catch(IOException e){
            e.printStackTrace();
        }
//        Map<String, Integer> tempExit = new HashMap<String, Integer>();
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 2);
//        tempExit.put("E", 3);
//        tempExit.put("S", 4);
//        tempExit.put("N", 5);
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 5);
//        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 1);
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 1);
//        tempExit.put("W", 2);
//        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("S", 1);
//        tempExit.put("W", 2);
//        locations.put(5, new Location(5, "You are in the forest",tempExit));

    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }

}
