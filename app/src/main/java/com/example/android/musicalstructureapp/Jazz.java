package com.example.android.musicalstructureapp;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class Jazz {

    private String useArtistNameOfJazz;
    private String useSongNameOfJazz;
    private int useImageAlbumOfJazz;


    public Jazz(String artistNameOfJazz, String songNameOfJazz, int imageAlbumOfJazz) {
        useArtistNameOfJazz = artistNameOfJazz;
        useSongNameOfJazz = songNameOfJazz;
        useImageAlbumOfJazz = imageAlbumOfJazz;
    }

    public String getmArtistNameOfJazz() {
        return useArtistNameOfJazz;
    }

    public String getmSongNameOfJazz() {
        return useSongNameOfJazz;
    }

    public int getmImageAlbumOfJazz() {
        return useImageAlbumOfJazz;
    }
}

