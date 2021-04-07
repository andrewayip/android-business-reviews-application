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

        //Sports Clips
        allLocations.add(new Beauty("Sports Clips Haircuts of Redlands", "Hair Salon that includes sports on TV, steamed towel treatment, and a fantastic haircut", "34.07493746667798, -117.20601048019489" ,"$", "Chill Place to watch the game while getting the fresh cut. Feeling snazzier than ever" , ""));
        allBeauty.put("Sports Clips Haircuts of Redlands", new Beauty("Sports Clips Haircuts of Redlands", "Hair Salon that includes sports on TV, steamed towel treatment, and a fantastic haircut", "34.07493746667798, -117.20601048019489", "$", "Chill Place to watch the game while getting the fresh cut. Feeling snazzier than ever", ""));

        //Revive Salon & Barber
        allLocations.add(new Beauty("Revive Salon & Barber", "Salon that offers a variety of services such as salon services, barbershop, and skin care", "34.064658625049844, -117.22587126447404" ,"$$", "Good quality cuts with upfront pricing on all their work" , ""));
        allBeauty.put("Revive Salon & Barber", new Beauty("Revive Salon & Barber", "Salon that offers a variety of services such as salon services, barbershop, and skin care", "34.064658625049844, -117.22587126447404", "$$", "Good quality cuts with upfront pricing on all their work", ""));

        //Hairajuku
        allLocations.add(new Beauty("Hairajuku", "Hair salon in Redlands, CA.", "34.06075165419431, -117.18622063124148" ,"$$", "Kat is amazing! If you have dark hair with Stubborn gray or you want a fun color and think you never can with your hair color being dark.  This girl can perform miracles." , ""));
        allBeauty.put("Hairajuku", new Beauty("Hairajuku", "Hair salon in Redlands, CA.", "34.06075165419431, -117.18622063124148", "$$", "Kat is amazing! If you have dark hair with Stubborn gray or you want a fun color and think you never can with your hair color being dark.  This girl can perform miracles.", ""));

        //Ancient Thai Massage
        allLocations.add(new Beauty("Ancient Thai Massage", "Massage spa in Redlands, CA", "34.065867471822195, -117.18276867134257" ,"$$", "Best massage I’ve ever had. Very professional and relaxing. I’ve been here about 4 times and was never disappointed. Highly recommend" , ""));
        allBeauty.put("Ancient Thai Massage", new Beauty("Ancient Thai Massage", "Massage spa in Redlands, CA", "34.065867471822195, -117.18276867134257", "$$", "Best massage I’ve ever had. Very professional and relaxing. I’ve been here about 4 times and was never disappointed. Highly recommend", ""));

        //European Wax Center
        allLocations.add(new Beauty("European Wax Center", "Waxing center in Redlands, CA.", "34.07335228209944, -117.21156026827077" ,"$$", "Friendly staff, great service, easy parking." , ""));
        allBeauty.put("European Wax Center", new Beauty("European Wax Center", "Waxing center in Redlands, CA.", "34.07335228209944, -117.21156026827077", "$$", "Friendly staff, great service, easy parking.", ""));



                                        //************************ ENTERTAINMENT CATEGORY***********************
       //Harkins Theatres
        allLocations.add(new Entertainment("Harkins Theatres", "Modern multiplex chain showing blockbusters & a few independent films; some venues offer childcare.", "34.074507097782416, -117.20591811837417" ,"$$", "Powered recliners included with regular tickets, comfy seats, great atmosphere" , ""));
        allEntertainment.put("Harkins Theatres", new Entertainment("Harkins Theatres", "Modern multiplex chain showing blockbusters & a few independent films; some venues offer childcare.", "34.074507097782416, -117.20591811837417", "$$", "Powered recliners included with regular tickets, comfy seats, great atmosphere" , ""));

        //Studio Movie Grill
        allLocations.add(new Entertainment("Studio Movie Grill", "First-run, classic & kids' films, plus a varied American menu & cocktails brought to guests' seats", "34.060287026371284, -117.18480377072386" ,"$$", "Love the service they provide they bring your food, drinks to your seat." , ""));
        allEntertainment.put("Studio Movie Grill", new Entertainment("Studio Movie Grill", "First-run, classic & kids' films, plus a varied American menu & cocktails brought to guests' seats", "34.060287026371284, -117.18480377072386", "$$", "Love the service they provide they bring your food, drinks to your seat." , ""));

        //Redlands Footlighters Theatre
        allLocations.add(new Entertainment("Redlands Footlighters Theatre", "Intimate, long-running venue showcasing comedies, classics & other community theater performances.", "34.05189606491037, -117.21690444560686" ,"$", "Small town feel with great actors. Tickets are absolutely affordable and you will be entertained as the seats are so close to the stage. An intimate experience" , ""));
        allEntertainment.put("Redlands Footlighters Theatre", new Entertainment("Redlands Footlighters Theatre", "Intimate, long-running venue showcasing comedies, classics & other community theater performances.", "34.05189606491037, -117.21690444560686", "$", "Small town feel with great actors. Tickets are absolutely affordable and you will be entertained as the seats are so close to the stage. An intimate experience" , ""));

        //Empire Bowl
        allLocations.add(new Entertainment("Empire Bowl", "Popular long-standing venue featuring 24 bowling lanes, arcade games, a snack bar & cocktail lounge.", "34.065186434031254, -117.1944633709442" ,"$", "A great place for family and friends to relax and bowl. The couches are a nice added touch. The bowling alley is well-maintained and reasonably priced." , ""));
        allEntertainment.put("Empire Bowl", new Entertainment("Empire Bowl", "Popular long-standing venue featuring 24 bowling lanes, arcade games, a snack bar & cocktail lounge.", "34.065186434031254, -117.1944633709442", "$", "A great place for family and friends to relax and bowl. The couches are a nice added touch. The bowling alley is well-maintained and reasonably priced." , ""));

        //Vector Escape Games
        allLocations.add(new Entertainment("Vector Escape Games", "Vector Escape Games is here to bring the fun. With energetic staff and actors we strive to bring the next generation of escape rooms.", "34.067477293754244, -117.2150455616178" ,"$$", "There are 3 rooms to choose from and they have amazing deals and rooms!" , ""));
        allEntertainment.put("Vector Escape Games", new Entertainment("Vector Escape Games", "Vector Escape Games is here to bring the fun. With energetic staff and actors we strive to bring the next generation of escape rooms.", "34.067477293754244, -117.2150455616178", "$$", "There are 3 rooms to choose from and they have amazing deals and rooms!" , ""));


        //************************ FOOD CATEGORY***********************
        allLocations.add(new Food("El Burrito", "burrito place", "" ,"$", "super good food" ,""));
        allFood.put("El Burrito", new Food("El Burrito", "burrito place", "", "$", "super good food", ""));


                                        //************************ GYM CATEGORY ***********************
        //Anytime Fitness
        allLocations.add(new Gym("Anytime Fitness", "workout anytime", "", "$", "good gym", ""));
        allGym.put("Anytime Fitness", new Gym("Anytime Fitness", "workout anytime", "",  "$", "good gym" ,""));

        //Fitness 19
        allLocations.add(new Gym("Fitness 19", "Classic gym with monthly memberships.", "34.069138486366654, -117.13994368503073", "$$", "Good place to workout, awesome staff keeps the place clean even when it’s busy.", ""));
        allGym.put("Fitness 19", new Gym("Fitness 19", "Classic gym with monthly memberships.", "34.069138486366654, -117.13994368503073", "$$", "Good place to workout, awesome staff keeps the place clean even when it’s busy.", ""));

        //Flowstone
        allLocations.add(new Gym("Flowstone", "Inland Empire’s first modern indoor bouldering facility, located in historic Redlands, California. Climbing inspired, community driven.", "34.05588150502014, -117.20484672366848", "$$", "Quality climbing, fun environment, great staff, and just good vibes all around.", ""));
        allGym.put("Flowstone", new Gym("Flowstone", "Inland Empire’s first modern indoor bouldering facility, located in historic Redlands, California. Climbing inspired, community driven.", "34.05588150502014, -117.20484672366848", "$$", "Quality climbing, fun environment, great staff, and just good vibes all around.", ""));

        //Vasa The Yoga Studio
        allLocations.add(new Gym("Vasa The Yoga Studio", "Yoga studio in Redlands, CA.", "34.0479348094893, -117.17104233106684", "$$$", "I found Vasa the Yoga Studio through ClassPass and it is by far my favorite workout in the city. Extremely relaxing environment, and the classes are fast paced so you don't get bored.", ""));
        allGym.put("Vasa The Yoga Studio", new Gym("Vasa The Yoga Studio", "Yoga studio in Redlands, CA.", "34.0479348094893, -117.17104233106684", "$$$", "I found Vasa the Yoga Studio through ClassPass and it is by far my favorite workout in the city. Extremely relaxing environment, and the classes are fast paced so you don't get bored.", ""));

        //Ultimate Kickboxing & Fitness
        allLocations.add(new Gym("Ultimate Kickboxing & Fitness", "At Ultimate Kickboxing & Fitness, you will experience the ultimate workout in both cardiovascular and strength training", "34.058774483844964, -117.19922215435123", "$$$", "The staff helped me set up, modify my workout, and was very encouraging.", ""));
        allGym.put("Ultimate Kickboxing & Fitness", new Gym("Ultimate Kickboxing & Fitness", "At Ultimate Kickboxing & Fitness, you will experience the ultimate workout in both cardiovascular and strength training", "34.058774483844964, -117.19922215435123", "$$$", "The staff helped me set up, modify my workout, and was very encouraging.", ""));

                                         //************************ HOTEL CATEGORY***********************
        allLocations.add(new Hotel("Country Inn & Suites by Radisson, San Bernardino", "hotel place", "", "$", "comfy eh", ""));
        allHotels.put("Country Inn & Suites by Radisson, San Bernardino", new Hotel("Country Inn & Suites by Radisson, San Bernardino", "hotel place", "", "$", "comfy eh", ""));


    }
}