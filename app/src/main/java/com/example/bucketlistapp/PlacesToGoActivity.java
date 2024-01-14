package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        String[] places = {
                "Switzerland",
                "Paris",
                "Japan",
                "Singapore"
        };

        RecyclerView placesList = findViewById(R.id.rv_places_togo);

        PlacesToGoActivityAdapter placeAdapter = new PlacesToGoActivityAdapter(places);
        placesList.setAdapter(placeAdapter);
    }
}