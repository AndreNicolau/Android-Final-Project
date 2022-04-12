package com.example.andre_nicolau_projeto_final;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFootballClub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_footballclub);

        Button buttonOlimpico = findViewById(R.id.buttonOlimpico);
        Button buttonBenfica = findViewById(R.id.buttonBenfica);
        Button buttonSporting = findViewById(R.id.buttonSporting);
        Button buttonPorto = findViewById(R.id.buttonPorto);

        buttonOlimpico.setOnClickListener(view -> {
            String url = "https://www.zerozero.pt/equipa.php?id=11139";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        });

        buttonBenfica.setOnClickListener(view -> {
            String url = "https://www.slbenfica.pt/pt-pt/";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        });

        buttonSporting.setOnClickListener(view -> {
            String url = "https://www.sporting.pt/pt";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        });

        buttonPorto.setOnClickListener(view -> {
            String url = "https://www.fcporto.pt/pt";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        });

    }
}
