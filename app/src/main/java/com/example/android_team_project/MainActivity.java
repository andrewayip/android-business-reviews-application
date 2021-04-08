package com.example.android_team_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // UI REFERENCES
    ImageButton barsBtn;
    ImageButton beautyBtn;
    ImageButton entertainmentBtn;
    ImageButton foodBtn;
    ImageButton fitnessBtn;
    ImageButton hotelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);

        barsBtn = (ImageButton) findViewById(R.id.barsBtn);
        beautyBtn = (ImageButton) findViewById(R.id.beautyBtn);
        entertainmentBtn = (ImageButton) findViewById(R.id.entertainmentBtn);
        foodBtn = (ImageButton) findViewById(R.id.foodBtn);
        fitnessBtn = (ImageButton) findViewById(R.id.fitnessBtn);
        hotelBtn = (ImageButton) findViewById(R.id.hotelBtn);

    }
}