package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);


        String[] things = {
                "Rock Climbing",
                "Para gliding",
                "Parachute jump",
                "helicopter riding"
        };

        RecyclerView thingsList = findViewById(R.id.rv_things_todo);

        ThingsToDoActivityAdapter todoAdapter = new ThingsToDoActivityAdapter(things);
        thingsList.setAdapter(todoAdapter);
    }
}