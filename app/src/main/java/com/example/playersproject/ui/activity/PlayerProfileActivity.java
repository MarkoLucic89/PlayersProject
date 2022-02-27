package com.example.playersproject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.playersproject.R;
import com.example.playersproject.model.Player;
import com.squareup.picasso.Picasso;

public class PlayerProfileActivity extends AppCompatActivity {

    private ImageView imageViewProfilePicture;
    private TextView textViewName;
    private TextView textViewTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_profile);

        initUi();
        setUi();

    }

    private void setUi() {
//        Picasso.get().load(getIntent().getStringExtra("url")).into(imageViewProfilePicture);
//        textViewName.setText(getIntent().getStringExtra("name") + " " + getIntent().getStringExtra("surname"));
//        textViewTeam.setText(getIntent().getStringExtra("team"));

        Player player = (Player) getIntent().getSerializableExtra("player");
        Picasso.get().load(player.imageUrl).into(imageViewProfilePicture);
        textViewName.setText(player.name + " " + player.surname);
        textViewTeam.setText(player.team);
    }

    private void initUi() {
        imageViewProfilePicture = findViewById(R.id.imageViewPlayerProfilePicture);
        textViewName = findViewById(R.id.textViewPlayerProfileName);
        textViewTeam = findViewById(R.id.textViewPlayerProfileTeam);
    }
}