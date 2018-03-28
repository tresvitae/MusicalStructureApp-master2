package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SleepAdapter extends ArrayAdapter<Sleep> {

    private static final String LOG_TAG = SleepAdapter.class.getSimpleName();

    public SleepAdapter(Activity context, ArrayList<Sleep> musicLibraryOfSleep) {
        super(context, 0, musicLibraryOfSleep);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        Sleep currentSongAdapter = getItem(position);

        TextView artistNameOfSleep = (TextView) listItemView.findViewById(R.id.artist_name);
        artistNameOfSleep.setText(currentSongAdapter.getArtistNameOfSleep());

        TextView songNameOfSleep = (TextView) listItemView.findViewById(R.id.song_name);
        songNameOfSleep.setText(currentSongAdapter.getSongNameOfSleep());

        ImageView imageAlbumOfSleep = (ImageView) listItemView.findViewById(R.id.image_album);
        imageAlbumOfSleep.setImageResource(currentSongAdapter.getImageAlbumOfSleep());

        return listItemView;
    }
}
