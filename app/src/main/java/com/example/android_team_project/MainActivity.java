package com.example.android_team_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    // HOLDS ALL LOCATIONS (WE CAN SWITCH TO A HASH MAP
    // WE'LL USE THIS WHEN THE USER WANTS TO SEARCH FOR ITEMS
    // MAYBE CAN CHANGE IT TO KEY: NAME OF LOCATION, VALUE: LOCATION
    // Map<String, Location> allLocations = new HashMap();

    ArrayList<Location> allLocations;

    // MAP OF EACH CATEGORY (key: nameOfLocation (unique), value: actualLocation)
    Map<String, Bar> allBars;
    Map<String, Beauty> allBeauty;
    Map<String, Entertainment> allEntertainment;
    Map<String, Food> allFood;
    Map<String, Gym> allGym;
    Map<String, Housing> allHousing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        // INITIALIZING DATA STRUCTURES
        allLocations = new ArrayList<Location>();
        allBars = new HashMap<>();
        allBeauty = new HashMap<>();
        allEntertainment = new HashMap<>();
        allFood = new HashMap<>();
        allGym = new HashMap<>();
        allHousing = new HashMap<>();

        //************************ ADD LOCATIONS TO PROPER DATA STRUCTURES ***********************


                        //************************ BARS CATEGORY***********************
        allLocations.add(new Bar("Flamingo", "Description of Flamingo", "$", "it was nice"));
        allBars.put("Flamingo", new Bar("Flamingo", "Description of Flamingo", "$", "it was nice"));


                        //************************ BEAUTY CATEGORY***********************
        allLocations.add(new Beauty("Sports Clips", "Hair salon in Redlands", "$", "nice place"));
        allBeauty.put("Sports Clips", new Beauty("Sports Clips", "Hair salon in Redlands", "$", "nice place"));


                        //************************ ENTERTAINMENT CATEGORY***********************
        allLocations.add(new Entertainment("Mountain Grove Shopping Center", "mall in Redlands", "$$$", "convinient place"));
        allEntertainment.put("Mountain Grove Shopping Center", new Entertainment("Mountain Grove Shopping Center", "mall in Redlands", "$$$", "convinient place"));


                        //************************ FOOD CATEGORY***********************
        allLocations.add(new Food("El Burrito", "burrito place", "$", "super good food"));
        allFood.put("El Burrito", new Food("El Burrito", "burrito place", "$", "super good food"));


                        //************************ GYM CATEGORY ***********************
        allLocations.add(new Gym("Anytime Fitness", "workout anytime", "$", "good gym"));
        allGym.put("Anytime Fitness", new Gym("Anytime Fitness", "workout anytime", "$", "good gym"));


                        //************************ HOUSING CATEGORY***********************
        allLocations.add(new Housing("Country Inn & Suites by Radisson, San Bernadino", "hotel place", "$", "comfy eh"));
        allHousing.put("Country Inn & Suites by Radisson, San Bernadino", new Housing("Country Inn & Suites by Radisson, San Bernadino", "hotel place", "$", "comfy eh"));


    }
}