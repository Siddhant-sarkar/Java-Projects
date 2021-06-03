package com.timbuchalka;

import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();
    private static Map<Integer,indexRecords>index=new LinkedHashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {
       try(RandomAccessFile rao=new RandomAccessFile("location_rand.dat","rwd")){
            rao.writeInt(locations.size());
            int indexSize= locations.size()*3*Integer.BYTES;
            int locationStart=(int)(indexSize+ rao.getFilePointer()+Integer.BYTES);
            rao.writeInt(locationStart);

            long indexStart= rao.getFilePointer();
            int startPointer=locationStart;
            rao.seek(startPointer);
            for (Location location : locations.values()){
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder =new StringBuilder();
                for (String Direction : location.getExits().keySet()){
                    if(!Direction.equalsIgnoreCase("Q")){
                        builder.append(Direction);
                        builder.append(",");
                        builder.append(location.getExits().get(Direction));
                        builder.append(",");
                    }
                }
                rao.writeUTF(builder.toString());
                indexRecords record =new indexRecords(startPointer,(int)(rao.getFilePointer()-startPointer));
                index.put(location.getLocationID(),record);
                startPointer=(int )rao.getFilePointer();
                for (Integer locationID: index.keySet()){
                    rao.writeInt(locationID);
                    rao.writeInt(index.get(locationID).getStartByte());
                    rao.writeInt(index.get(locationID).getLength());
                }
            }

       }
    }

    static {

        try{
            ra = new RandomAccessFile("location_rand.dat","rwd" );
            int numLocation =ra.readInt();
            long locationStartPoint=ra.readInt();
            while(ra.getFilePointer()<locationStartPoint){
                int locationID=ra.readInt();
                int locationStart=ra.readInt();
                int locationLength =ra.readInt();

                indexRecords record=new indexRecords(locationStart,locationLength);
                index.put(locationID,record);

            }
        }catch(IOException e){
            System.out.println("Catch IOexception in static Initializer Block : "+e.getMessage());
        }
        
//        try(ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
//            boolean eof = false;
//            while(!eof){
//                try{
//                    Location location =(Location) locFile.readObject();
//                    System.out.println("REad Location "+location.getLocationID()+" : "+location.getDescription());
//                    System.out.println("Found "+location.getExits().size()+" Exits");
//
//
//                    locations.put(location.getLocationID(),location);
//                }catch (EOFException e){
//                    eof=true;
//                }
//            }
////
//        }catch (InvalidClassException ex){
//            System.out.println("Invalid Class exception"+ex.getMessage());
//        } catch(IOException io) {
//            System.out.println("IO Exception");
//        }catch (ClassNotFoundException c){
//            System.out.println("Class not found Excepition "+c.getMessage());
//        }

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        // Now read the exits
        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;
            while((input = dirFile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    public void close()throws IOException{
        ra.close();
    }
}
