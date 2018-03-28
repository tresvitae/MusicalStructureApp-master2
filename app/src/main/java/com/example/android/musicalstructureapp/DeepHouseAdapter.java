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
 * Created by Lenovo on 2018-03-25.
 */

public class DeepHouseAdapter extends ArrayAdapter<DeepHouse> {

    private static final String LOG_TAG = DeepHouseAdapter.class.getSimpleName();

    public DeepHouseAdapter(Activity context, ArrayList<DeepHouse> musicLibraryOfDeepHouse) {
        super(context, 0, musicLibraryOfDeepHouse);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        DeepHouse currentDeepHouseAdapter = getItem(position);
        TextView artistNameOfDeepHouse = (TextView) listItemView.findViewById(R.id.artist_name);
        artistNameOfDeepHouse.setText(currentDeepHouseAdapter.getmArtistNameOfDeepHouse());

        TextView songNameOfDeepHouse = (TextView) listItemView.findViewById(R.id.song_name);
        songNameOfDeepHouse.setText(currentDeepHouseAdapter.getmSongsNameOfDeepHouse());

        ImageView imageAlbumOfDeepHouse = (ImageView) listItemView.findViewById(R.id.image_album);
        imageAlbumOfDeepHouse.setImageResource(currentDeepHouseAdapter.getmImageAlbumOfDeepHouse());

        return listItemView;
    }
}
