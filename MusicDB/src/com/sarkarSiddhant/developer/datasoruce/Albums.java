package com.sarkarSiddhant.developer.datasoruce;

public class Albums {
    private  int _id;
    private String name;
    private String artist;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbumId() {
        return artist;
    }

    public void setAlbumId(String albumId) {
        artist = albumId;
    }
}