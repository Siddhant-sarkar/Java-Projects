package com.sarkarSiddhant.developer.datasoruce;

public class Constants {
    public static final String PATH = "jdbc:sqlite:B:\\JAVA\\MusicDB\\";
    public static final String FILENAME = "music.db";

    public static final String TABLE_ALBUMS = "albums";
    public static final String TABLE_ARTISTS = "artists";
    public static final String TABLE_SONGS = "songs";

    public static final String ALBUM_id = "_id";
    public static final int INDEX_ALBUM_id = 1;
    public static final String ALBUM_NAME = "name";
    public static final int INDEX_ALBUM_NAME = 2;
    public static final String ALBUM_ARTIST = "artist";
    public static final int INDEX_ALBUM_SONGS = 3;

    public static final String ARTISTS_id = "_id";
    public static final int INDEX_ARTISTS_id = 1;
    public static final String ARTISTS_NAME = "name";
    public static final int INDEX_ARTISTS_NAME = 2;

    public static final String SONGS_id = "_id";
    public static final int INDEX_SONGS_id = 1;
    public static final String SONGS_TRACK = "track";
    public static final int INDEX_SONGS_TRACK = 2;
    public static final String SONGS_TITLE = "title";
    public static final int INDEX_SONGS_TITLE = 3;
    public static final String SONGS_ALBUM = "album";
    public static final int INDEX_SONGS_ALBUM = 4;

    public static final int ORDER_NONE = 0;
    public static final int ORDER_ASC = 2;
    public static final int ORDER_DEC = 1;


    public static final String INSERT_ARTIST = "INSERT INTO " + TABLE_ARTISTS + '(' + ARTISTS_NAME + ") VALUES (?)";
    public static final String INSERT_ALBUMS = "INSERT INTO " + TABLE_ALBUMS + '(' + ALBUM_NAME + "," + ALBUM_ARTIST + ") VALUES (?,?)";
    public static final String INSERT_SONGS = "INSERT INTO " + TABLE_SONGS + '(' + SONGS_TRACK + "," + SONGS_TITLE + "," + SONGS_ALBUM + ") VALUES (?,?,?)";
}
