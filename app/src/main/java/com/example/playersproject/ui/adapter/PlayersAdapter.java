package com.example.playersproject.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.playersproject.R;
import com.example.playersproject.model.Player;
import com.example.playersproject.ui.activity.PlayerProfileActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.PlayerViewHolder> {

    private Context context;
    private ArrayList<Player> players;

    public PlayersAdapter(Context context, ArrayList<Player> players) {
        this.context = context;
        this.players = players;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(context)
                .inflate(R.layout.rv_item_player, parent, false);
        return new PlayerViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player tempPlayer = players.get(position);
        holder.textViewName.setText(tempPlayer.name);
        holder.textViewTeam.setText(tempPlayer.team);

        Picasso.get().load(tempPlayer.imageUrl)
                .into(holder.imageView);

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, PlayerProfileActivity.class);

//            intent.putExtra("name", tempPlayer.name);
//            intent.putExtra("surname", tempPlayer.surname);
//            intent.putExtra("team", tempPlayer.team);
//            intent.putExtra("url", tempPlayer.imageUrl);

            intent.putExtra("player", tempPlayer);

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        if (players == null) {
            return 0;
        }
        return players.size();

    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewName;
        private TextView textViewTeam;
        private ImageView imageView;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewItemName);
            textViewTeam = itemView.findViewById(R.id.textViewItemTeam);
            imageView = itemView.findViewById(R.id.imageViewItemPlayer);
        }
    }
}
