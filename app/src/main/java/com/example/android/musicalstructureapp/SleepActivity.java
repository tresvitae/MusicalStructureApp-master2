package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Sleep> musicLibraryOfSleep = new ArrayList<Sleep>();
        musicLibraryOfSleep.add(new Sleep("Galimatias", "Alina Baraz & Galimatias - Make You Feel", R.drawable.galimatias));
        musicLibraryOfSleep.add(new Sleep("Alina Baraz", "Alina Baraz & Galimatias - Show Me", R.drawable.alina_baraz));
        musicLibraryOfSleep.add(new Sleep("HW&W Recordings", "Stwo - Syrup", R.drawable.hww));
        musicLibraryOfSleep.add(new Sleep("Moods", "Ashtraynutz - City Life (Moods Remix)", R.drawable.moods));

        SleepAdapter adapter = new SleepAdapter(this, musicLibraryOfSleep);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(),"Playing the song", Toast.LENGTH_SHORT).show();
    };

}
