package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class JazzAdapter extends ArrayAdapter<Jazz> {

    private static final String LOG_TAG = JazzAdapter.class.getSimpleName();

    public JazzAdapter(Activity context, ArrayList<Jazz> musicLibraryOfJazz) {
        super(context, 0, musicLibraryOfJazz);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        Jazz currentJazzAdapter = getItem(position);

        TextView artistNameOfJazz = (TextView) listItemView.findViewById(R.id.artist_name);
        artistNameOfJazz.setText(currentJazzAdapter.getmArtistNameOfJazz());

        TextView songNameOfJazz = (TextView) listItemView.findViewById(R.id.song_name);
        songNameOfJazz.setText(currentJazzAdapter.getmSongNameOfJazz());

        ImageView imageAlbumOfJazz = (ImageView) listItemView.findViewById(R.id.image_album);
        imageAlbumOfJazz.setImageResource(currentJazzAdapter.getmImageAlbumOfJazz());

        return listItemView;
    }
}
