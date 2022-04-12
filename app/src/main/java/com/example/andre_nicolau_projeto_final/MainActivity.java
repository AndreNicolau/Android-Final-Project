package com.example.andre_nicolau_projeto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myFavouritePlaceButton = findViewById(R.id.button_my_favourite_place);
        Button myFootballClubButton = findViewById(R.id.button_my_football_club);
        Button creatorButton = findViewById(R.id.button_creator);

        myFavouritePlaceButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), MapsActivity.class);
            startActivity(intent);
        });

        myFootballClubButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), ActivityFootballClub.class);
            startActivity(intent);
        });

        creatorButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), CreatorActivity.class);
            startActivity(intent);
        });
    }
}
