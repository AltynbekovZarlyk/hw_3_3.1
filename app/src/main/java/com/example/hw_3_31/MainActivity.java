package com.example.hw_3_31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> gameList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        loadData();
        GameAdapter adapter = new GameAdapter(gameList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        gameList.add("GTA 5");
        gameList.add("Half-Life 2");
        gameList.add("Fallout 2");
        gameList.add("Portal 2");
        gameList.add("Batman: Arkham Asylum");
        gameList.add("StarCraft");
        gameList.add("The Witcher 3: Wild Hunt");
        gameList.add("Red Dead Redemption 2");
        gameList.add("God of War");
        gameList.add("Resident Evil 2");
        gameList.add("Dark Souls III");
        gameList.add("Metro Exodus");
        gameList.add("Forza Horizon 3");
        gameList.add("DOOM");
        gameList.add("Battlefield 1");
    }
}