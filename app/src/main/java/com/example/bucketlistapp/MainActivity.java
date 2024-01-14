package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button thingsTodoBtn = findViewById(R.id.btn_things_todo);
        Button placesTogoBtn = findViewById(R.id.btn_places_togo);

        thingsTodoBtn.setOnClickListener((v -> {
                    Intent thingsTodoIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                    startActivity(thingsTodoIntent);
                })
        );

        placesTogoBtn.setOnClickListener((v) -> {
            Intent placesTogoIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);
            startActivity(placesTogoIntent);
        });
    }
}