package com.example.android_team_project;

import androidx.appcompat.app.AppCompatActivity;
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
      selectedCategory = "bars";
      Intent launchReport = new Intent(this, SearchPageActivity.class);
      launchReport.putExtra("category", selectedCategory);
      startActivity(launchReport);
    }
    public void fitnessOption(View view){
        //Insert Intent stuff here
    }
    public void entertainmentOption(View view){
        //Insert Intent stuff here
    }
    public void foodOption(View view){
        //Insert Intent stuff here
    }
    public void hotelOption(View view){
        //Insert Intent stuff here
    }
    public void beautyOption(View view){
        //Insert Intent stuff here
    }
}