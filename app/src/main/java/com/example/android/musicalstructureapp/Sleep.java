package com.example.android.musicalstructureapp;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class Sleep {

    private String useArtistNameOfSleep;
    private String useSongNameOfSleep;
    private int useImageAlbumOfSleep;

    public Sleep(String artistNameOfSleep, String songNameOfSleep, int imageAlbumOfSleep) {
        useArtistNameOfSleep = artistNameOfSleep;
        useSongNameOfSleep = songNameOfSleep;
        useImageAlbumOfSleep = imageAlbumOfSleep;
    }

    public String getArtistNameOfSleep() {
        return useArtistNameOfSleep;
    }

    public String getSongNameOfSleep() {
        return useSongNameOfSleep;
    }

    public int getImageAlbumOfSleep() {
        return useImageAlbumOfSleep;
    }
}
