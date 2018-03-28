package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Party> musicLibraryOfParty = new ArrayList<Party>();
        musicLibraryOfParty.add(new Party("Brydo", "FLOWERS IN THE POURIN' RAIN", R.drawable.brydo));
        musicLibraryOfParty.add(new Party("Don Diablo", "Cutting Shapes", R.drawable.don_diablo));
        musicLibraryOfParty.add(new Party("Birdy", "Keeping Your Head Up (Don Diablo Remix)", R.drawable.birdy));
        musicLibraryOfParty.add(new Party("Adult Swim", "Dj SpinKing Ft. Tyga, Asap Ferg, Jeremih, & Velous (Produced By Vinylz x SpinKing)", R.drawable.adult_swim));

        PartyAdapter adapter = new PartyAdapter(this, musicLibraryOfParty);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void viewMessage(View view) {
        Toast.makeText(view.getContext(),"Playing the song", Toast.LENGTH_SHORT).show();
    };
}
