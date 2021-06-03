package com.sarkarSiddhant.developer.datasoruce;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.sarkarSiddhant.developer.datasoruce.Constants;

public class DataFile {
    Connection conn;
    private PreparedStatement artists;
    private PreparedStatement albums;
    private PreparedStatement songs;

    public boolean openConnection(){
        try{
            conn= DriverManager.getConnection(Constants.PATH+Constants.FILENAME);
            artists=conn.prepareStatement(Constants.INSERT_ARTIST,Statement.RETURN_GENERATED_KEYS);
            albums=conn.prepareStatement(Constants.INSERT_ALBUMS,Statement.RETURN_GENERATED_KEYS);
            songs=conn.prepareStatement(Constants.INSERT_SONGS);
            return  true;
        }catch(SQLException e){
            System.out.println("That failed because : "+e.getMessage());
            return false;
        }
    }

    public void closeConnection(){
        try{
            if(conn!=null){
                conn.close();
                artists.close();
                albums.close();
                songs.close();
            }
        }catch (SQLException e){
            System.out.println("That failed because : "+e.getMessage());
        }
    }

    public List<Artists> queryArtists(int sortOrder){
        StringBuilder sb =new StringBuilder("SELECT * FROM ");
        sb.append(Constants.TABLE_ARTISTS);
        if (sortOrder != Constants.ORDER_NONE){
            sb.append(" ORDER BY ");
            sb.append(Constants.ARTISTS_NAME);
            sb.append(" COLLATE NOCASE ");
            if (sortOrder==Constants.ORDER_DEC){
                sb.append("DESC");
            }else{
                sb.append("ASC");
            }
        }
        List<Artists> artistsList=new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sb.toString())){
            while(resultSet.next()){
                Artists artists =new Artists();
                artists.set_id(resultSet.getInt(Constants.ARTISTS_id));
                artists.setName(resultSet.getString(Constants.ARTISTS_NAME));
                artistsList.add(artists);
            }
            return artistsList;
        }catch (SQLException e){
            System.out.println("Couldnt complete the query as : "+e.getMessage());
            return null;
        }
    }

    public List<Albums> queryAlbums(){
        List<Albums> albumsList=new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM "+Constants.TABLE_ALBUMS)){
            while(resultSet.next()){
                Albums albums =new Albums();
                albums.set_id(resultSet.getInt(Constants.ALBUM_id));
                albums.setName(resultSet.getString(Constants.ALBUM_NAME));
                albums.setName(resultSet.getString(Constants.ALBUM_NAME));
                albumsList.add(albums);
            }
            return albumsList;
        }catch (SQLException e){
            System.out.println("Couldnt complete the query as : "+e.getMessage());
            return null;
        }
    }

    public List<Songs> querySongs(){
        List<Songs> songsList=new ArrayList<>();
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM "+Constants.TABLE_SONGS)){
            while(resultSet.next()){
                Songs songs =new Songs();
                songs.set_id(resultSet.getInt(Constants.ARTISTS_id));
                songs.setTitle(resultSet.getString(Constants.SONGS_TITLE));
                songs.setAblum(resultSet.getString(Constants.SONGS_ALBUM));
                songs.setTrack(resultSet.getString(Constants.SONGS_TRACK));
                songsList.add(songs);
            }
            return songsList;
        }catch (SQLException e){
            System.out.println("Couldnt complete the query as : "+e.getMessage());
            return null;
        }
    }

    public List<String> queryAlbumsForArtits(String artistsName,int sortOrder){
        //SELECT albums.name FROM albums INNER JOIN artists ON albums.artist=artists._id
        // WHERE artists.name= "Pink Floyd" ORDER BY albums.name COLLATE NOCASE DESC;
        StringBuilder sb =new StringBuilder("SELECT ");
        sb.append(Constants.TABLE_ALBUMS);
        sb.append(".");
        sb.append(Constants.ALBUM_NAME);
        sb.append(" FROM ");
        sb.append(Constants.TABLE_ALBUMS);
        sb.append(" INNER JOIN ");
        sb.append(Constants.TABLE_ARTISTS);
        sb.append(" ON ");
        sb.append(Constants.TABLE_ALBUMS); sb.append(".");sb.append(Constants.ALBUM_ARTIST);
        sb.append("=");
        sb.append(Constants.TABLE_ARTISTS);sb.append(".");sb.append(Constants.ARTISTS_id);
        sb.append(" WHERE ") ;
        sb.append(Constants.TABLE_ARTISTS);sb.append(".");sb.append(Constants.ARTISTS_NAME);
        sb.append("=");
        sb.append("\"" +artistsName+ "\" ");
        sb.append("ORDER BY ");
        sb.append(Constants.TABLE_ALBUMS);
        sb.append(".");
        sb.append(Constants.ALBUM_NAME);
        if (sortOrder!=Constants.ORDER_NONE){
            sb.append(" COLLATE NOCASE ");
            if (sortOrder==Constants.ORDER_DEC){
                sb.append("DESC;");
            }else{
                sb.append("ASC;");
            }
        }

        System.out.println(sb.toString());
        ArrayList<String>TheFinalList=new ArrayList<>();
        try(Statement statement= conn.createStatement();
            ResultSet set= statement.executeQuery(sb.toString())){
            while(set.next()){
                TheFinalList.add(set.getString(1));
            }
            return TheFinalList;
        }catch (SQLException e){
            System.out.println("Somethings problem in my code : "+e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public void getCount(String tableName){
        String st = "SELECT COUNT (*) AS count , MIN(_id) FROM "+tableName;
        try(Statement statement =conn.createStatement();
            ResultSet set =statement.executeQuery(st)){
            int count=set.getInt("count");
            int min=set.getInt(2);
            System.out.format("The total count %d and the minimum %d",count,min);
        }catch (SQLException e){
            System.out.println("Query is failed due to : "+e.getMessage());
            e.printStackTrace();
        }
    }

    private int insertArtist(String name) throws  SQLException{
        artists.setString(1,name);
        int affectedRows=artists.executeUpdate();
        if (affectedRows!=1){
            new SQLException("This this can not be added to the table");
        }
        ResultSet generatedKeys=artists.getGeneratedKeys();
        if (generatedKeys.next()){
            return generatedKeys.getInt(1);
        }else{
            throw new SQLException("Could not  get _id  For artists");
        }
    }

    private int insertAlbum(String name,int ArtistId) throws  SQLException{
        albums.setString(1,name);
        albums.setInt(2,ArtistId);
        int affectedRows=albums.executeUpdate();
        if (affectedRows!=1){
            new SQLException("This this can not be added to the table");
        }
        ResultSet generatedKeys=albums.getGeneratedKeys();
        if (generatedKeys.next()){
            return generatedKeys.getInt(1);
        }else{
            throw new SQLException("Could not  get _id  For album");
        }
    }

    private void insertSong(String title,String artist ,String Album,int track) throws  SQLException{
        try{
            conn.setAutoCommit(false);
            int artistId=insertArtist(artist);
            int albumId=insertAlbum(Album,artistId);
            songs.setInt(1,track);
            songs.setString(2,title);
            songs.setInt(3,albumId);
            int affectedRows=albums.executeUpdate();
            if (affectedRows==1) {
                conn.commit();
            }else{
                new SQLException("This this can not be added to the table");
            }
        }catch (Exception e){
            System.out.println("The problem is : "+e.getMessage());
            try{
                System.out.println("Trying to perform a Roll back");
                conn.rollback();
            }catch (SQLException e2){
                System.out.println("This are going really bad bro");
            }
        }
        finally {
            try{
                System.out.println("Resetting the default commit behaviour ");
                conn.setAutoCommit(true);
            }
            catch (SQLException e ){
                System.out.println("Auto commit cant be turned on Fuck Bro ");
            }
        }
    }
}
