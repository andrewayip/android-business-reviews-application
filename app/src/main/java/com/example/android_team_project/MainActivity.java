package com.example.android_team_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    // REFERENCES
    String selectedCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        // REFERENCES
        selectedCategory = "";

    }
    public void barsOption(View view){
      selectedCategory = "allBars";
      Intent launchReport = new Intent(this, SearchPageActivity.class);
      launchReport.putExtra("category", selectedCategory);
      startActivity(launchReport);
    }
    public void fitnessOption(View view){
        selectedCategory = "allBeauty";
        Intent launchReport = new Intent(this, SearchPageActivity.class);
        launchReport.putExtra("category", selectedCategory);
        startActivity(launchReport);
    }
    public void entertainmentOption(View view){
        selectedCategory = "allEntertainment";
        Intent launchReport = new Intent(this, SearchPageActivity.class);
        launchReport.putExtra("category", selectedCategory);
        startActivity(launchReport);
    }
    public void foodOption(View view){
        selectedCategory = "allFood";
        Intent launchReport = new Intent(this, SearchPageActivity.class);
        launchReport.putExtra("category", selectedCategory);
        startActivity(launchReport);
    }
    public void hotelOption(View view){
        selectedCategory = "allGym";
        Intent launchReport = new Intent(this, SearchPageActivity.class);
        launchReport.putExtra("category", selectedCategory);
        startActivity(launchReport);
    }
    public void beautyOption(View view){
        selectedCategory = "allHotels";
        Intent launchReport = new Intent(this, SearchPageActivity.class);
        launchReport.putExtra("category", selectedCategory);
        startActivity(launchReport);
    }
}