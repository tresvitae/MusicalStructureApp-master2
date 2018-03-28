package com.example.android.musicalstructureapp;

public class DeepHouse {

    private String useArtistNameOfDeepHouse;
    private String useSongsNameOfDeepHouse;
    private int useImageAlbumOfDeepHouse;

    /**
     * For display data on particular song
     *
     * @param artistNameOfDeepHouse, songNameOfDeepHouse and imageAlbumOfDeepHouse
     */
    public DeepHouse(String artistNameOfDeepHouse, String songNameOfDeepHouse, int imageAlbumOfDeepHouse) {
        useArtistNameOfDeepHouse = artistNameOfDeepHouse;
        useSongsNameOfDeepHouse = songNameOfDeepHouse;
        useImageAlbumOfDeepHouse = imageAlbumOfDeepHouse;
    }

    /**
     * Get the artist, song name and image albunm.
     */
    public String getmArtistNameOfDeepHouse() {
        return useArtistNameOfDeepHouse;
    }

    public String getmSongsNameOfDeepHouse() {
        return useSongsNameOfDeepHouse;
    }

    public int getmImageAlbumOfDeepHouse() {
        return useImageAlbumOfDeepHouse;
    }
}
