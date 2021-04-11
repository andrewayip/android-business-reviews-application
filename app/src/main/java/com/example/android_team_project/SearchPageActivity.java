package com.example.android_team_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchPageActivity extends Activity {

    // DATA MEMBERS
    SearchView searchView;
    ListView listView;

    // STORING DATA
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

    // NOW BASED ON WHAT CATEGORY WE SELECT WE DETERMINE WHICH HASHMAP TO DISPLAY (BASED ON CATEGORY)

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);

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
        allLocations.add(new Bar("Flamingo", "A fun loving dive bar in downtown", "34.058502161755655, -117.1821900156451" ,"$", "Great place to get out of the heat grab a cold beer or two and shoot some pool." , "flamingo.jpg"));
        allBars.put("Flamingo", new Bar("Flamingo", "A fun loving dive bar in downtown", "34.058502161755655, -117.1821900156451", "$", "Great place to get out of the heat grab a cold beer or two and shoot some pool." , "flamingo.jpg"));

        //Hangar 24
        allLocations.add(new Bar("Hangar 24", "Tasting room offering rotating beers plus food catered by local eateries & live music on the patio", "34.16126846054634, -117.14499919717565" ,"$$", "Great people, great food and great brew. Well set up. Enjoy every time" , "hangar24.jpeg"));
        allBars.put("Hangar 24", new Bar("Hangar 24", "Tasting room offering rotating beers plus food catered by local eateries & live music on the patio", "34.16126846054634, -117.14499919717565", "$$", "Great people, great food and great brew. Well set up. Enjoy every time" , "hangar24.jpeg"));

        //The Boiler Room
        allLocations.add(new Bar("The Boiler Room", "Bar in Redlands with great drink specials and nightlife.", "34.05909331431702, -117.18167743098192" ,"$", "Walked and immediately was aggressively confronted by a young security guard.... was very rude" , "the_boiler_room.jpg"));
        allBars.put("The Boiler Room", new Bar("The Boiler Room", "Bar in Redlands with great drink specials and nightlife.", "34.05909331431702, -117.18167743098192", "$", "Walked and immediately was aggressively confronted by a young security guard.... was very rude" , "the_boiler_room.jpg"));

        //Darby's American Cantina
        allLocations.add(new Bar("Darby's American Cantina", "Spacious sports pub offering American comfort food, 30+ TVs & a wraparound bar with 40 beer taps.", "34.056916540249134, -117.18240154448083" ,"$$", "Great food, fabulous service, amazing staff that makes us feel like family." , "darby_cantina.jpg"));
        allBars.put("Darby's American Cantina", new Bar("Darby's American Cantina", "Spacious sports pub offering American comfort food, 30+ TVs & a wraparound bar with 40 beer taps.", "34.056916540249134, -117.18240154448083", "$$", "Great food, fabulous service, amazing staff that makes us feel like family." , "darby_cantina.jpg"));

        //The District
        allLocations.add(new Bar("The District", "Retro lounge providing craft cocktails, flatbread pizzas & live music in a cool atmosphere", "34.055831585021075, -117.1819263067446" ,"$$", "Love the vibe, atmosphere, drinks, and food!" , "the_district.jpg"));
        allBars.put("The District", new Bar("The District", "Retro lounge providing craft cocktails, flatbread pizzas & live music in a cool atmosphere", "34.055831585021075, -117.1819263067446", "$$", "Love the vibe, atmosphere, drinks, and food!" , "the_district.jpg"));


        //************************ BEAUTY CATEGORY***********************

        //Sports Clips
        allLocations.add(new Beauty("Sports Clips Haircuts of Redlands", "Hair Salon that includes sports on TV, steamed towel treatment, and a fantastic haircut", "34.07493746667798, -117.20601048019489" ,"$", "Chill Place to watch the game while getting the fresh cut. Feeling snazzier than ever" , "sports_clips.jpg"));
        allBeauty.put("Sports Clips Haircuts of Redlands", new Beauty("Sports Clips Haircuts of Redlands", "Hair Salon that includes sports on TV, steamed towel treatment, and a fantastic haircut", "34.07493746667798, -117.20601048019489", "$", "Chill Place to watch the game while getting the fresh cut. Feeling snazzier than ever", "sports_clips.jpg"));

        //Revive Salon & Barber
        allLocations.add(new Beauty("Revive Salon & Barber", "Salon that offers a variety of services such as salon services, barbershop, and skin care", "34.064658625049844, -117.22587126447404" ,"$$", "Good quality cuts with upfront pricing on all their work" , "revive_salon_barber.jpg"));
        allBeauty.put("Revive Salon & Barber", new Beauty("Revive Salon & Barber", "Salon that offers a variety of services such as salon services, barbershop, and skin care", "34.064658625049844, -117.22587126447404", "$$", "Good quality cuts with upfront pricing on all their work", "revive_salon_barber.jpg"));

        //Hairajuku
        allLocations.add(new Beauty("Hairajuku", "Hair salon in Redlands, CA.", "34.06075165419431, -117.18622063124148" ,"$$", "Kat is amazing! If you have dark hair with Stubborn gray or you want a fun color and think you never can with your hair color being dark.  This girl can perform miracles." , "hairajuku.jpg"));
        allBeauty.put("Hairajuku", new Beauty("Hairajuku", "Hair salon in Redlands, CA.", "34.06075165419431, -117.18622063124148", "$$", "Kat is amazing! If you have dark hair with Stubborn gray or you want a fun color and think you never can with your hair color being dark.  This girl can perform miracles.", "hairajuku.jpg"));

        //Ancient Thai Massage
        allLocations.add(new Beauty("Ancient Thai Massage", "Massage spa in Redlands, CA", "34.065867471822195, -117.18276867134257" ,"$$", "Best massage I’ve ever had. Very professional and relaxing. I’ve been here about 4 times and was never disappointed. Highly recommend" , "ancient_thai_massage.jpg"));
        allBeauty.put("Ancient Thai Massage", new Beauty("Ancient Thai Massage", "Massage spa in Redlands, CA", "34.065867471822195, -117.18276867134257", "$$", "Best massage I’ve ever had. Very professional and relaxing. I’ve been here about 4 times and was never disappointed. Highly recommend", "ancient_thai_massage.jpg"));

        //European Wax Center
        allLocations.add(new Beauty("European Wax Center", "Waxing center in Redlands, CA.", "34.07335228209944, -117.21156026827077" ,"$$", "Friendly staff, great service, easy parking." , "european_wax_center.png"));
        allBeauty.put("European Wax Center", new Beauty("European Wax Center", "Waxing center in Redlands, CA.", "34.07335228209944, -117.21156026827077", "$$", "Friendly staff, great service, easy parking.", "european_wax_center.png"));



        //************************ ENTERTAINMENT CATEGORY***********************
        //Harkins Theatres
        allLocations.add(new Entertainment("Harkins Theatres", "Modern multiplex chain showing blockbusters & a few independent films; some venues offer childcare.", "34.074507097782416, -117.20591811837417" ,"$$", "Powered recliners included with regular tickets, comfy seats, great atmosphere" , "harkins.jpg"));
        allEntertainment.put("Harkins Theatres", new Entertainment("Harkins Theatres", "Modern multiplex chain showing blockbusters & a few independent films; some venues offer childcare.", "34.074507097782416, -117.20591811837417", "$$", "Powered recliners included with regular tickets, comfy seats, great atmosphere" , "harkins.jpg"));

        //Studio Movie Grill
        allLocations.add(new Entertainment("Studio Movie Grill", "First-run, classic & kids' films, plus a varied American menu & cocktails brought to guests' seats", "34.060287026371284, -117.18480377072386" ,"$$", "Love the service they provide they bring your food, drinks to your seat." , "studio_movie_grill.jpg"));
        allEntertainment.put("Studio Movie Grill", new Entertainment("Studio Movie Grill", "First-run, classic & kids' films, plus a varied American menu & cocktails brought to guests' seats", "34.060287026371284, -117.18480377072386", "$$", "Love the service they provide they bring your food, drinks to your seat." , "studio_movie_grill.jpg"));

        //Redlands Footlighters Theatre
        allLocations.add(new Entertainment("Redlands Footlighters Theatre", "Intimate, long-running venue showcasing comedies, classics & other community theater performances.", "34.05189606491037, -117.21690444560686" ,"$", "Small town feel with great actors. Tickets are absolutely affordable and you will be entertained as the seats are so close to the stage. An intimate experience" , "footlighters.jpg"));
        allEntertainment.put("Redlands Footlighters Theatre", new Entertainment("Redlands Footlighters Theatre", "Intimate, long-running venue showcasing comedies, classics & other community theater performances.", "34.05189606491037, -117.21690444560686", "$", "Small town feel with great actors. Tickets are absolutely affordable and you will be entertained as the seats are so close to the stage. An intimate experience" , "footlighters.jpg"));

        //Empire Bowl
        allLocations.add(new Entertainment("Empire Bowl", "Popular long-standing venue featuring 24 bowling lanes, arcade games, a snack bar & cocktail lounge.", "34.065186434031254, -117.1944633709442" ,"$", "A great place for family and friends to relax and bowl. The couches are a nice added touch. The bowling alley is well-maintained and reasonably priced." , "empire_bowl.png"));
        allEntertainment.put("Empire Bowl", new Entertainment("Empire Bowl", "Popular long-standing venue featuring 24 bowling lanes, arcade games, a snack bar & cocktail lounge.", "34.065186434031254, -117.1944633709442", "$", "A great place for family and friends to relax and bowl. The couches are a nice added touch. The bowling alley is well-maintained and reasonably priced." , "empire_bowl.png"));

        //Vector Escape Games
        allLocations.add(new Entertainment("Vector Escape Games", "Vector Escape Games is here to bring the fun. With energetic staff and actors we strive to bring the next generation of escape rooms.", "34.067477293754244, -117.2150455616178" ,"$$", "There are 3 rooms to choose from and they have amazing deals and rooms!" , "vector_escape_games.jpg"));
        allEntertainment.put("Vector Escape Games", new Entertainment("Vector Escape Games", "Vector Escape Games is here to bring the fun. With energetic staff and actors we strive to bring the next generation of escape rooms.", "34.067477293754244, -117.2150455616178", "$$", "There are 3 rooms to choose from and they have amazing deals and rooms!" , "vector_escape_games.jpg"));


        //************************ FOOD CATEGORY***********************
        allLocations.add(new Food("Gourmet Pizza Shoppe", "Unique & classic pizzas plus other Italian eats are served in a casual joint with a brick exterior.", "34.05678057699603, -117.18087798503647" ,"$$", "Tables are clean and atmosphere of the place was friendly, family, and relaxed" ,"gourment_pizza_shoppe.jpg"));
        allFood.put("Gourmet Pizza Shoppe", new Food("Gourmet Pizza Shoppe", "Unique & classic pizzas plus other Italian eats are served in a casual joint with a brick exterior.", "34.05678057699603, -117.18087798503647", "$$", "Tables are clean and atmosphere of the place was friendly, family, and relaxed", "gourmet_pizza_shoppe.jpg"));

        allLocations.add(new Food("Rok N Fondue", "Rustic-chic establishment serving steaks & fondue, plus craft beers & cocktails in an airy interior.", "34.056720909942705, -117.18170055435208", "$$$", "Very unique experience. The fondue is excellent. Highly recommend getting a Rok plate. It is a cook yourself meal for the main course so be prepared to slice ", "rok_n_fondue.png"));
        allFood.put("El Burrito", new Food("Rok N Fondue", "Rustic-chic establishment serving steaks & fondue, plus craft beers & cocktails in an airy interior.", "34.056720909942705, -117.18170055435208", "$$$", "Very unique experience. The fondue is excellent. Highly recommend getting a Rok plate. It is a cook yourself meal for the main course so be prepared to slice ", "rok_n_fondue.png"));

        allLocations.add(new Food("Citrone", "Upscale restaurant & lounge offering Californian/Mediterranean fare, a long wine list & cocktails.", "34.05849778512296, -117.18237295435135", "$$$", "Small plates, slightly pretentious atmosphere, overpriced given the quality.", "citrone.jpg"));
        allFood.put("Citrone", new Food("Citrone", "Upscale restaurant & lounge offering Californian/Mediterranean fare, a long wine list & cocktails.", "34.05849778512296, -117.18237295435135", "$$$", "Small plates, slightly pretentious atmosphere, overpriced given the quality.", "citrone.jpg"));

        allLocations.add(new Food("Dhat Island Caribbean Creole", "Festive, unpretentious eatery offers quick-serve, traditional Caribbean cuisine in a basic space.", "34.05745052656236, -117.18618778503624", "$$", "Great food, great service, energetic location, fair price.", "dhat_island.jpg"));
        allFood.put("Dhat Island Caribbean Creole", new Food("Dhat Island Caribbean Creole", "Festive, unpretentious eatery offers quick-serve, traditional Caribbean cuisine in a basic space.", "34.05745052656236, -117.18618778503624", "$$", "Great food, great service, energetic location, fair price.", "dhat_island.jpg"));

        allLocations.add(new Food("Carolyn’s Cafe", "Snug, bustling joint offering ample breakfasts from morning to noon, plus lunch options.", "34.04995372457991, -117.19873938503952", "$$", "I have been there twice and I will continue to go when I am in the area!!! Best coffee cake in town.", "carolyns_cafe.jpg"));
        allFood.put("Carolyn’s Cafe", new Food("Carolyn’s Cafe", "Snug, bustling joint offering ample breakfasts from morning to noon, plus lunch options.", "34.04995372457991, -117.19873938503952", "$$", "I have been there twice and I will continue to go when I am in the area!!! Best coffee cake in town.", "carolyns_cafe.jpg"));

        //************************ GYM CATEGORY ***********************
        //Anytime Fitness
        allLocations.add(new Gym("Anytime Fitness", "workout anytime", "", "$", "good gym", "anytime_fitness.jpg"));
        allGym.put("Anytime Fitness", new Gym("Anytime Fitness", "workout anytime", "",  "$", "good gym" ,"anytime_fitness.jpg"));

        //Fitness 19
        allLocations.add(new Gym("Fitness 19", "Classic gym with monthly memberships.", "34.069138486366654, -117.13994368503073", "$$", "Good place to workout, awesome staff keeps the place clean even when it’s busy.", "fitness19.jpg"));
        allGym.put("Fitness 19", new Gym("Fitness 19", "Classic gym with monthly memberships.", "34.069138486366654, -117.13994368503073", "$$", "Good place to workout, awesome staff keeps the place clean even when it’s busy.", "fitness19.jpg"));

        //Flowstone
        allLocations.add(new Gym("Flowstone", "Inland Empire’s first modern indoor bouldering facility, located in historic Redlands, California. Climbing inspired, community driven.", "34.05588150502014, -117.20484672366848", "$$", "Quality climbing, fun environment, great staff, and just good vibes all around.", "flowstone.jpg"));
        allGym.put("Flowstone", new Gym("Flowstone", "Inland Empire’s first modern indoor bouldering facility, located in historic Redlands, California. Climbing inspired, community driven.", "34.05588150502014, -117.20484672366848", "$$", "Quality climbing, fun environment, great staff, and just good vibes all around.", "flowstone.jpg"));

        //Vasa The Yoga Studio
        allLocations.add(new Gym("Vasa The Yoga Studio", "Yoga studio in Redlands, CA.", "34.0479348094893, -117.17104233106684", "$$$", "I found Vasa the Yoga Studio through ClassPass and it is by far my favorite workout in the city. Extremely relaxing environment, and the classes are fast paced so you don't get bored.", "vasa_yoga.jpg"));
        allGym.put("Vasa The Yoga Studio", new Gym("Vasa The Yoga Studio", "Yoga studio in Redlands, CA.", "34.0479348094893, -117.17104233106684", "$$$", "I found Vasa the Yoga Studio through ClassPass and it is by far my favorite workout in the city. Extremely relaxing environment, and the classes are fast paced so you don't get bored.", "vasa_yoga.jpg"));

        //Ultimate Kickboxing & Fitness
        allLocations.add(new Gym("Ultimate Kickboxing & Fitness", "At Ultimate Kickboxing & Fitness, you will experience the ultimate workout in both cardiovascular and strength training", "34.058774483844964, -117.19922215435123", "$$$", "The staff helped me set up, modify my workout, and was very encouraging.", "ultime_kickboxing_fitness.png"));
        allGym.put("Ultimate Kickboxing & Fitness", new Gym("Ultimate Kickboxing & Fitness", "At Ultimate Kickboxing & Fitness, you will experience the ultimate workout in both cardiovascular and strength training", "34.058774483844964, -117.19922215435123", "$$$", "The staff helped me set up, modify my workout, and was very encouraging.", "ultime_kickboxing_fitness.png"));

        //************************ HOTEL CATEGORY***********************
        //Ayres Hotel
        allLocations.add(new Hotel("Ayres Hotel", "Family-run, Mediterranean-inspired property with free breakfast, Wi-Fi & happy hour, plus a pool.","34.06251795169684, -117.19706452898386","$$","Guests appreciated the friendly, professional staff · Guests spoke highly of management & reception · Guests enjoyed the pool","ayres_hotel_redlands.jpg"));
        allHotels.put("Ayres Hotel", new Hotel("Ayres Hotel", "Family-run, Mediterranean-inspired property with free breakfast, Wi-Fi & happy hour, plus a pool.","34.06251795169684, -117.19706452898386","$$","Guests appreciated the friendly, professional staff · Guests spoke highly of management & reception · Guests enjoyed the pool","ayres_hotel_redlands.jpg"));

        //Dynasty Suites
        allLocations.add(new Hotel("Dynasty Suites","Low-key hotel offering traditional rooms & suites, some with whirlpool tubs, plus free breakfast.","34.062716275081286, -117.20147396044503","$$","Guests liked the clean rooms, though some commented they were dated · Guests appreciated the bathrooms","dynasty_suites.jpg"));
        allHotels.put("Dynasty Suites", new Hotel("Dynasty Suites","Low-key hotel offering traditional rooms & suites, some with whirlpool tubs, plus free breakfast.","34.062716275081286, -117.20147396044503","$$","Guests liked the clean rooms, though some commented they were dated · Guests appreciated the bathrooms","dynasty_suites.jpg"));

        //Country Inn & Suites by Radisson
        allLocations.add(new Hotel("Country Inn & Suites by Radisson","Warm rooms & suites in a casual hotel with free hot breakfast & Wi-Fi, plus an outdoor pool.","34.06600500138148, -117.20937285434796","$$","Guests appreciated the friendly staff · Guests spoke highly of the reception staff, though some said management could be improved","country_inn_suites.jpg"));
        allHotels.put("Country Inn & Suites by Radisson", new Hotel("Country Inn & Suites by Radisson","Warm rooms & suites in a casual hotel with free hot breakfast & Wi-Fi, plus an outdoor pool.","34.06600500138148, -117.20937285434796","$$","Guests appreciated the friendly staff · Guests spoke highly of the reception staff, though some said management could be improved","country_inn_suites.jpg"));

        //Comfort Suites
        allLocations.add(new Hotel("Comfort Suites","Casual suites in an unpretentious hotel offering free breakfast, plus an indoor pool & a gym.","34.064186655496705, -117.20061520832236","$$","Guests appreciated the friendly staff · Guests enjoyed the pool · Guests spoke highly of the reception staff","comfort_suites.jpg"));
        allHotels.put("Comfort Suites", new Hotel("Comfort Suites","Casual suites in an unpretentious hotel offering free breakfast, plus an indoor pool & a gym.","34.064186655496705, -117.20061520832236","$$","Guests appreciated the friendly staff · Guests enjoyed the pool · Guests spoke highly of the reception staff","comfort_suites.jpg"));

        //WoodSpring Suites
        allLocations.add(new Hotel("WoodSpring Suites","Informal all-suite hotel offering parking, plus streamlined quarters featuring kitchens.","34.06873468724912, -117.21256351571523","$$","I thought the facility was very clean and had a great set up.","woodspring_suites.jpg"));
        allHotels.put("WoodSpring Suites", new Hotel("WoodSpring Suites","Informal all-suite hotel offering parking, plus streamlined quarters featuring kitchens.","34.06873468724912, -117.21256351571523","$$","I thought the facility was very clean and had a great set up.","woodspring_suites.jpg"));

        // UI REFERENCES
        searchView = (SearchView) findViewById(R.id.simpleSearchView);
        listView = (ListView) findViewById(R.id.listview);

        // PASS DATA FROM ONE CLASS TO ANOTHER
        Intent intent = getIntent();

        // RETRIEVE CATEGORY DATA FROM MAIN ACTIVITY
        String category;
        category = intent.getStringExtra("category"); // PASSED FROM MAIN ACTIVITY FILE

        //Checking to see what category the user selects
        System.out.println("this is the selected category: " + category);
        
    }

}
