package com.example.android_team_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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
    Map<String, Hotel> allHotels;

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
        allHotels = new HashMap<>();

        //************************ ADD LOCATIONS TO PROPER DATA STRUCTURES ***********************


                                            //************************ BARS CATEGORY***********************

        //Flamingo Bar
        allLocations.add(new Bar("Flamingo", "A fun loving dive bar in downtown", "34.058502161755655, -117.1821900156451" ,"$", "Great place to get out of the heat grab a cold beer or two and shoot some pool." , ""));
        allBars.put("Flamingo", new Bar("Flamingo", "A fun loving dive bar in downtown", "34.058502161755655, -117.1821900156451", "$", "Great place to get out of the heat grab a cold beer or two and shoot some pool." , ""));

        //Hangar 24
        allLocations.add(new Bar("Hangar 24", "Tasting room offering rotating beers plus food catered by local eateries & live music on the patio", "34.16126846054634, -117.14499919717565" ,"$$", "Great people, great food and great brew. Well set up. Enjoy every time" , ""));
        allBars.put("Hangar 24", new Bar("Hangar 24", "Tasting room offering rotating beers plus food catered by local eateries & live music on the patio", "34.16126846054634, -117.14499919717565", "$$", "Great people, great food and great brew. Well set up. Enjoy every time" , ""));

        //The Boiler Room
        allLocations.add(new Bar("The Boiler Room", "Bar in Redlands with great drink specials and nightlife.", "34.05909331431702, -117.18167743098192" ,"$", "Walked and immediately was aggressively confronted by a young security guard.... was very rude" , ""));
        allBars.put("The Boiler Room", new Bar("The Boiler Room", "Bar in Redlands with great drink specials and nightlife.", "34.05909331431702, -117.18167743098192", "$", "Walked and immediately was aggressively confronted by a young security guard.... was very rude" , ""));

        //Darby's American Cantina
        allLocations.add(new Bar("Darby's American Cantina", "Spacious sports pub offering American comfort food, 30+ TVs & a wraparound bar with 40 beer taps.", "34.056916540249134, -117.18240154448083" ,"$$", "Great food, fabulous service, amazing staff that makes us feel like family." , ""));
        allBars.put("Darby's American Cantina", new Bar("Darby's American Cantina", "Spacious sports pub offering American comfort food, 30+ TVs & a wraparound bar with 40 beer taps.", "34.056916540249134, -117.18240154448083", "$$", "Great food, fabulous service, amazing staff that makes us feel like family." , ""));

        //The District
        allLocations.add(new Bar("The District", "Retro lounge providing craft cocktails, flatbread pizzas & live music in a cool atmosphere", "34.055831585021075, -117.1819263067446" ,"$$", "Love the vibe, atmosphere, drinks, and food!" , ""));
        allBars.put("The District", new Bar("The District", "Retro lounge providing craft cocktails, flatbread pizzas & live music in a cool atmosphere", "34.055831585021075, -117.1819263067446", "$$", "Love the vibe, atmosphere, drinks, and food!" , ""));


                                        //************************ BEAUTY CATEGORY***********************
        allLocations.add(new Beauty("Sports Clips", "Hair salon in Redlands", "1" ,"$", "nice place" , ""));
        allBeauty.put("Sports Clips", new Beauty("Sports Clips", "Hair salon in Redlands", "1", "$", "nice place", ""));


                                        //************************ ENTERTAINMENT CATEGORY***********************
        allLocations.add(new Entertainment("Mountain Grove Shopping Center", "mall in Redlands", "" ,"$$$", "convinient place" , ""));
        allEntertainment.put("Mountain Grove Shopping Center", new Entertainment("Mountain Grove Shopping Center", "mall in Redlands", "", "$$$", "convinient place" , ""));


                                        //************************ FOOD CATEGORY***********************
        allLocations.add(new Food("El Burrito", "burrito place", "" ,"$", "super good food" ,""));
        allFood.put("El Burrito", new Food("El Burrito", "burrito place", "", "$", "super good food", ""));


                                        //************************ GYM CATEGORY ***********************
        allLocations.add(new Gym("Anytime Fitness", "workout anytime", "", "$", "good gym", ""));
        allGym.put("Anytime Fitness", new Gym("Anytime Fitness", "workout anytime", "",  "$", "good gym" ,""));


                                         //************************ HOTEL CATEGORY***********************
        allLocations.add(new Hotel("Country Inn & Suites by Radisson, San Bernardino", "hotel place", "", "$", "comfy eh", ""));
        allHotels.put("Country Inn & Suites by Radisson, San Bernardino", new Hotel("Country Inn & Suites by Radisson, San Bernardino", "hotel place", "", "$", "comfy eh", ""));


    }
}