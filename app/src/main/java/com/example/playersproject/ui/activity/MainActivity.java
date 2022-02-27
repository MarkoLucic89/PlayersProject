package com.example.playersproject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.playersproject.R;
import com.example.playersproject.data.DataContainer;
import com.example.playersproject.ui.adapter.PlayersAdapter;

public class MainActivity extends AppCompatActivity {

    //ui
    private RecyclerView recyclerViewPlayers;

    //vars
    private PlayersAdapter playersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerViewPlayers.setLayoutManager(new LinearLayoutManager(this));
        playersAdapter = new PlayersAdapter(this, DataContainer.players);
        recyclerViewPlayers.setAdapter(playersAdapter);
    }

    private void initUi() {
        recyclerViewPlayers = findViewById(R.id.recyclerViewPlayers);
    }
}