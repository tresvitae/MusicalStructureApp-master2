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

public class PartyAdapter extends ArrayAdapter<Party> {

    private static final String LOG_TAG = PartyAdapter.class.getSimpleName();

    public PartyAdapter(Activity context, ArrayList<Party> musicLibraryOfParty) {
        super(context, 0, musicLibraryOfParty);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        Party currenctPartyActivity = getItem(position);

        TextView artistNameOfParty = (TextView) listItemView.findViewById(R.id.artist_name);
        artistNameOfParty.setText(currenctPartyActivity.getArtistNameOfParty());

        TextView songNameOfParty = (TextView) listItemView.findViewById(R.id.song_name);
        songNameOfParty.setText(currenctPartyActivity.getSongNameOfParty());

        ImageView imageAlbumOfParty = (ImageView) listItemView.findViewById(R.id.image_album);
        imageAlbumOfParty.setImageResource(currenctPartyActivity.getImageAlbumOfParty());

        return listItemView;
    }
}
