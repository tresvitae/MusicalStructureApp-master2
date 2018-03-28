package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2018-03-26.
 */

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Jazz> musicLibraryOfJazz = new ArrayList<Jazz>();

        musicLibraryOfJazz.add(new Jazz("Bredzisław", "Pink Panther Flute Impro", R.drawable.pink));
        musicLibraryOfJazz.add(new Jazz("YoungOnes", "Ichisan - Terminal E (Piano Version)", R.drawable.young_ones));
        musicLibraryOfJazz.add(new Jazz("Jerzy Maczynski", "Bemsha Swing", R.drawable.bemsha));
        musicLibraryOfJazz.add(new Jazz("katze murr", "das kind und die zeit - mix", R.drawable.katze));
        musicLibraryOfJazz.add(new Jazz("Asger Thomsen", "Guitar", R.drawable.asger));
        musicLibraryOfJazz.add(new Jazz("Gospel Harmonica", "Joshua fit the battle of Jericho", R.drawable.gospel));

        JazzAdapter adapter = new JazzAdapter(this, musicLibraryOfJazz);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(),"Playing the song", Toast.LENGTH_SHORT).show();
    };
}

