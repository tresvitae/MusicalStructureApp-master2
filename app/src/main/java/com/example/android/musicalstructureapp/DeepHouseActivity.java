package com.example.android.musicalstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class DeepHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<DeepHouse> musicLibraryOfDeepHouse = new ArrayList<DeepHouse>();
        musicLibraryOfDeepHouse.add(new DeepHouse("Matt Simons", "Catch & Release (Deepend Remix)", R.drawable.matt));
        musicLibraryOfDeepHouse.add(new DeepHouse("AHMET KILIC", "DEEP HOUSE SUMMER MIX 2", R.drawable.kilic));

        DeepHouseAdapter adapter = new DeepHouseAdapter(this, musicLibraryOfDeepHouse);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(),"Playing the song", Toast.LENGTH_SHORT).show();
    };
}