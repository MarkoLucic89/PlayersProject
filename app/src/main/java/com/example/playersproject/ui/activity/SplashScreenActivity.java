package com.example.playersproject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.playersproject.R;
import com.example.playersproject.data.DataContainer;
import com.example.playersproject.model.Player;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        initPlayers();
        startMainActivity();

    }

    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void initPlayers() {
        Player player1 = new Player("Cristian", "Ronaldo", "Manchester United", 37,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Cristiano_Ronaldo_2018.jpg/250px-Cristiano_Ronaldo_2018.jpg");
        Player player2 = new Player("Lionel", "Messi", "PSG", 34,
                "https://img.a.transfermarkt.technology/portrait/big/28003-1631171950.jpg?lm=1");
        Player player3 = new Player("Dusan", "Vlahovic", "Juventus", 22,
                "https://img.a.transfermarkt.technology/portrait/big/357498-1632225570.jpg?lm=1");
        Player player4 = new Player("Manuel", "Neuer", "Bayern", 35,
                "https://img.a.transfermarkt.technology/portrait/big/17259-1540567890.jpg?lm=1");

        DataContainer.players.add(player1);
        DataContainer.players.add(player2);
        DataContainer.players.add(player3);
        DataContainer.players.add(player4);
    }
}