package com.example.android.musicalstructureapp;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class Party {

    private String useArtistNameOfParty;
    private String useSongNameOfParty;
    private int useImageAlbumOfParty;

    public Party(String artistNameOfParty, String songNameOfParty, int imageAlbumOfParty) {
        useArtistNameOfParty = artistNameOfParty;
        useSongNameOfParty = songNameOfParty;
        useImageAlbumOfParty = imageAlbumOfParty;
    }

    public String getArtistNameOfParty() {
        return useArtistNameOfParty;
    }

    public String getSongNameOfParty() {
        return useSongNameOfParty;
    }

    public int getImageAlbumOfParty() {
        return useImageAlbumOfParty;
    }
}
