package com.example.hw_3_31;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GamesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvGame;

    public GamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvGame = itemView.findViewById(R.id.tv_game);
    }

    public void bind(String game) {
        tvGame.setText(game);
    }
}
