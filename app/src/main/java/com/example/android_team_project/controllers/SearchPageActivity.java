package com.example.android_team_project.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View;

import com.example.android_team_project.utilities.CategoryAdapter;
import com.example.android_team_project.R;
import com.example.android_team_project.models.Bar;
import com.example.android_team_project.models.Beauty;
import com.example.android_team_project.models.Entertainment;
import com.example.android_team_project.models.Food;
import com.example.android_team_project.models.Gym;
import com.example.android_team_project.models.Hotel;
import com.example.android_team_project.models.Location;
import java.util.ArrayList;

public class SearchPageActivity extends Activity {

    // DATA MEMBERS
    private ListView listView;
    private CategoryAdapter categoryAdapter;
    private String category;
    private EditText searchTxt;
    private Button searchBtn;

    // ARRAY LIST OF EACH CATEGORY TYPE
    private ArrayList<Location> allLocations;
    private ArrayList<Location> allBars;
    private ArrayList<Location> allBeauty;
    private ArrayList<Location> allEntertainment;
    private ArrayList<Location> allFood;
    private ArrayList<Location> allGym;
    private ArrayList<Location> allHotels;

    // SEARCH ARRAY LIST
    private ArrayList<Location> searchArray;

    // SELECTED ARRAY LIST
    private ArrayList<Location> selectedCategoryList;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);

        // INITIALIZING DATA STRUCTURES
        allLocations = new ArrayList<Location>();
        allBars = new ArrayList<>();
        allBeauty = new ArrayList<>();
        allEntertainment = new ArrayList<>();
        allFood = new ArrayList<>();
        allGym = new ArrayList<>();
        allHotels = new ArrayList<>();

        searchArray = new ArrayList<>();

        // UI REFERENCES
        listView = (ListView) findViewById(R.id.listview);
        searchTxt = (EditText) findViewById(R.id.searchTxtView);
        searchBtn = (Button)findViewById(R.id.searchBtn);


        //************************ ADD LOCATIONS TO PROPER DATA STRUCTURES ***********************

        
        //************************ BARS CATEGORY***********************

        //Flamingo Bar
        allLocations.add(new Bar("Flamingo", "A fun loving dive bar in downtown", "34.058502161755655, -117.1821900156451" ,"$", "Great place to get out of the heat grab a cold beer or two and shoot some pool." , "https://fastly.4sqi.net/img/general/600x600/1057668_hgFZLCw4hudsseGle1Rk3PL0R0qHK4PN1wR7fa0G6eA.jpg"));
        allBars.add(new Bar("Flamingo", "A fun loving dive bar in downtown", "34.058502161755655, -117.1821900156451", "$", "Great place to get out of the heat grab a cold beer or two and shoot some pool." , "https://fastly.4sqi.net/img/general/600x600/1057668_hgFZLCw4hudsseGle1Rk3PL0R0qHK4PN1wR7fa0G6eA.jpg"));

        //Hangar 24
        allLocations.add(new Bar("Hangar 24", "Tasting room offering rotating beers plus food catered by local eateries & live music on the patio", "34.16126846054634, -117.14499919717565" ,"$$", "Great people, great food and great brew. Well set up. Enjoy every time" , "https://www.redlandsdailyfacts.com/wp-content/uploads/2018/04/0527_nws_rdf_l_hangar_01_me.jpg"));
        allBars.add(new Bar("Hangar 24", "Tasting room offering rotating beers plus food catered by local eateries & live music on the patio", "34.16126846054634, -117.14499919717565", "$$", "Great people, great food and great brew. Well set up. Enjoy every time" , "https://www.redlandsdailyfacts.com/wp-content/uploads/2018/04/0527_nws_rdf_l_hangar_01_me.jpg"));

        //The Boiler Room
        allLocations.add(new Bar("The Boiler Room", "Bar in Redlands with great drink specials and nightlife.", "34.05909331431702, -117.18167743098192" ,"$", "Walked and immediately was aggressively confronted by a young security guard.... was very rude" , "https://indulgery-a0f0.netdna-ssl.com/listing_images/1200x600/76438_0d7066e100ad8a157f4c82c3de264803.jpg"));
        allBars.add(new Bar("The Boiler Room", "Bar in Redlands with great drink specials and nightlife.", "34.05909331431702, -117.18167743098192", "$", "Walked and immediately was aggressively confronted by a young security guard.... was very rude" , "https://indulgery-a0f0.netdna-ssl.com/listing_images/1200x600/76438_0d7066e100ad8a157f4c82c3de264803.jpg"));

        //Darby's American Cantina
        allLocations.add(new Bar("Darby's American Cantina", "Spacious sports pub offering American comfort food, 30+ TVs & a wraparound bar with 40 beer taps.", "34.056916540249134, -117.18240154448083" ,"$$", "Great food, fabulous service, amazing staff that makes us feel like family." ,  "https://images.getbento.com/accounts/f3e9ee5b89de286290ed1b8729f4f594/media/rwsh2pNFQaqnRv9BJmQH_Darbys%20American%20Cantina-POI-7976_77_78_79_80.jpg"));
        allBars.add(new Bar("Darby's American Cantina", "Spacious sports pub offering American comfort food, 30+ TVs & a wraparound bar with 40 beer taps.", "34.056916540249134, -117.18240154448083", "$$", "Great food, fabulous service, amazing staff that makes us feel like family." , "https://images.getbento.com/accounts/f3e9ee5b89de286290ed1b8729f4f594/media/rwsh2pNFQaqnRv9BJmQH_Darbys%20American%20Cantina-POI-7976_77_78_79_80.jpg"));

        //The District
        allLocations.add(new Bar("The District", "Retro lounge providing craft cocktails, flatbread pizzas & live music in a cool atmosphere", "34.055831585021075, -117.1819263067446" ,"$$", "Love the vibe, atmosphere, drinks, and food!" , "https://s3-media0.fl.yelpcdn.com/bphoto/OmDR8FoGhryYiPwboljHTg/348s.jpg"));
        allBars.add(new Bar("The District", "Retro lounge providing craft cocktails, flatbread pizzas & live music in a cool atmosphere", "34.055831585021075, -117.1819263067446", "$$", "Love the vibe, atmosphere, drinks, and food!" , "https://s3-media0.fl.yelpcdn.com/bphoto/OmDR8FoGhryYiPwboljHTg/348s.jpg"));


        //************************ BEAUTY CATEGORY***********************

        //Sports Clips
        allLocations.add(new Beauty("Sports Clips Haircuts of Redlands", "Hair Salon that includes sports on TV, steamed towel treatment, and a fantastic haircut", "34.07493746667798, -117.20601048019489" ,"$", "Chill Place to watch the game while getting the fresh cut. Feeling snazzier than ever" , "https://s3-media0.fl.yelpcdn.com/bphoto/9ktYLCFYNFKr1UJ7xrStLQ/l.jpg"));
        allBeauty.add(new Beauty("Sports Clips Haircuts of Redlands", "Hair Salon that includes sports on TV, steamed towel treatment, and a fantastic haircut", "34.07493746667798, -117.20601048019489", "$", "Chill Place to watch the game while getting the fresh cut. Feeling snazzier than ever", "https://s3-media0.fl.yelpcdn.com/bphoto/9ktYLCFYNFKr1UJ7xrStLQ/l.jpg"));

        //Revive Salon & Barber
        allLocations.add(new Beauty("Revive Salon & Barber", "Salon that offers a variety of services such as salon services, barbershop, and skin care", "34.064658625049844, -117.22587126447404" ,"$$", "Good quality cuts with upfront pricing on all their work" , "https://revivesalonandbarber.com/wp-content/uploads/2016/12/14581546_1602517836718604_4921080424232875130_n.jpg"));
        allBeauty.add(new Beauty("Revive Salon & Barber", "Salon that offers a variety of services such as salon services, barbershop, and skin care", "34.064658625049844, -117.22587126447404", "$$", "Good quality cuts with upfront pricing on all their work", "https://revivesalonandbarber.com/wp-content/uploads/2016/12/14581546_1602517836718604_4921080424232875130_n.jpg"));

        //Hairajuku
        allLocations.add(new Beauty("Hairajuku", "Hair salon in Redlands, CA.", "34.06075165419431, -117.18622063124148" ,"$$", "Kat is amazing! If you have dark hair with Stubborn gray or you want a fun color and think you never can with your hair color being dark.  This girl can perform miracles." , "https://admin.salonch.com/photo/2583_5ef269ddb030a1592945117.png"));
        allBeauty.add(new Beauty("Hairajuku", "Hair salon in Redlands, CA.", "34.06075165419431, -117.18622063124148", "$$", "Kat is amazing! If you have dark hair with Stubborn gray or you want a fun color and think you never can with your hair color being dark.  This girl can perform miracles.", "https://admin.salonch.com/photo/2583_5ef269ddb030a1592945117.png"));

        //Ancient Thai Massage
        allLocations.add(new Beauty("Ancient Thai Massage", "Massage spa in Redlands, CA", "34.065867471822195, -117.18276867134257" ,"$$", "Best massage I’ve ever had. Very professional and relaxing. I’ve been here about 4 times and was never disappointed. Highly recommend" , "https://asianmassagestores.com/wp-content/uploads/formidable/7/Ancient-Thai-Massage-1-new.jpg"));
        allBeauty.add(new Beauty("Ancient Thai Massage", "Massage spa in Redlands, CA", "34.065867471822195, -117.18276867134257", "$$", "Best massage I’ve ever had. Very professional and relaxing. I’ve been here about 4 times and was never disappointed. Highly recommend", "https://asianmassagestores.com/wp-content/uploads/formidable/7/Ancient-Thai-Massage-1-new.jpg"));

        //European Wax Center
        allLocations.add(new Beauty("European Wax Center", "Waxing center in Redlands, CA.", "34.07335228209944, -117.21156026827077" ,"$$", "Friendly staff, great service, easy parking." , "https://mma.prnewswire.com/media/1087680/2.jpg"));
        allBeauty.add(new Beauty("European Wax Center", "Waxing center in Redlands, CA.", "34.07335228209944, -117.21156026827077", "$$", "Friendly staff, great service, easy parking.", "https://mma.prnewswire.com/media/1087680/2.jpg"));



        //************************ ENTERTAINMENT CATEGORY***********************
        //Harkins Theatres
        allLocations.add(new Entertainment("Harkins Theatres", "Modern multiplex chain showing blockbusters & a few independent films; some venues offer childcare.", "34.074507097782416, -117.20591811837417" ,"$$", "Powered recliners included with regular tickets, comfy seats, great atmosphere" , "https://www.harkins.com/application/files/2814/9521/3280/CN_545x390_ChinoHills.jpg"));
        allEntertainment.add(new Entertainment("Harkins Theatres", "Modern multiplex chain showing blockbusters & a few independent films; some venues offer childcare.", "34.074507097782416, -117.20591811837417", "$$", "Powered recliners included with regular tickets, comfy seats, great atmosphere" , "https://www.harkins.com/application/files/2814/9521/3280/CN_545x390_ChinoHills.jpg"));

        //Studio Movie Grill
        allLocations.add(new Entertainment("Studio Movie Grill", "First-run, classic & kids' films, plus a varied American menu & cocktails brought to guests' seats", "34.060287026371284, -117.18480377072386" ,"$$", "Love the service they provide they bring your food, drinks to your seat." , "https://www.redlandsdailyfacts.com/wp-content/uploads/2018/05/1226_nws_rdf-l-studiogrill-1226-01-rl.jpg"));
        allEntertainment.add(new Entertainment("Studio Movie Grill", "First-run, classic & kids' films, plus a varied American menu & cocktails brought to guests' seats", "34.060287026371284, -117.18480377072386", "$$", "Love the service they provide they bring your food, drinks to your seat." , "https://www.redlandsdailyfacts.com/wp-content/uploads/2018/05/1226_nws_rdf-l-studiogrill-1226-01-rl.jpg"));

        //Redlands Footlighters Theatre
        allLocations.add(new Entertainment("Redlands Footlighters Theatre", "Intimate, long-running venue showcasing comedies, classics & other community theater performances.", "34.05189606491037, -117.21690444560686" ,"$", "Small town feel with great actors. Tickets are absolutely affordable and you will be entertained as the seats are so close to the stage. An intimate experience" , "https://www.redlandsdailyfacts.com/wp-content/uploads/2020/06/RDF-L-DISTANCE-0618-PHOTOE-1.jpeg"));
        allEntertainment.add(new Entertainment("Redlands Footlighters Theatre", "Intimate, long-running venue showcasing comedies, classics & other community theater performances.", "34.05189606491037, -117.21690444560686", "$", "Small town feel with great actors. Tickets are absolutely affordable and you will be entertained as the seats are so close to the stage. An intimate experience" , "https://www.redlandsdailyfacts.com/wp-content/uploads/2020/06/RDF-L-DISTANCE-0618-PHOTOE-1.jpeg"));

        //Empire Bowl
        allLocations.add(new Entertainment("Empire Bowl", "Popular long-standing venue featuring 24 bowling lanes, arcade games, a snack bar & cocktail lounge.", "34.065186434031254, -117.1944633709442" ,"$", "A great place for family and friends to relax and bowl. The couches are a nice added touch. The bowling alley is well-maintained and reasonably priced." , "https://indulgery-a0f0.netdna-ssl.com/listing_images/1200x600/76436_2608df55a4da272d7c70c9768bde154c.jpg"));
        allEntertainment.add(new Entertainment("Empire Bowl", "Popular long-standing venue featuring 24 bowling lanes, arcade games, a snack bar & cocktail lounge.", "34.065186434031254, -117.1944633709442", "$", "A great place for family and friends to relax and bowl. The couches are a nice added touch. The bowling alley is well-maintained and reasonably priced." , "https://indulgery-a0f0.netdna-ssl.com/listing_images/1200x600/76436_2608df55a4da272d7c70c9768bde154c.jpg"));

        //Vector Escape Games
        allLocations.add(new Entertainment("Vector Escape Games", "Vector Escape Games is here to bring the fun. With energetic staff and actors we strive to bring the next generation of escape rooms.", "34.067477293754244, -117.2150455616178" ,"$$", "There are 3 rooms to choose from and they have amazing deals and rooms!" , "https://worldofescapes-com.s3.amazonaws.com/uploads/quests/9470/medium/vector-escape-games-the-inheritance.jpg"));
        allEntertainment.add(new Entertainment("Vector Escape Games", "Vector Escape Games is here to bring the fun. With energetic staff and actors we strive to bring the next generation of escape rooms.", "34.067477293754244, -117.2150455616178", "$$", "There are 3 rooms to choose from and they have amazing deals and rooms!" , "https://worldofescapes-com.s3.amazonaws.com/uploads/quests/9470/medium/vector-escape-games-the-inheritance.jpg"));


        //************************ FOOD CATEGORY***********************
        allLocations.add(new Food("Gourmet Pizza Shoppe", "Unique & classic pizzas plus other Italian eats are served in a casual joint with a brick exterior.", "34.05678057699603, -117.18087798503647" ,"$$", "Tables are clean and atmosphere of the place was friendly, family, and relaxed" , "https://californiathroughmylens.com/wp-content/uploads/2011/12/Gourmet-Pizza-Shoppe-In-Redlands-Sign.jpg"));
        allFood.add(new Food("Gourmet Pizza Shoppe", "Unique & classic pizzas plus other Italian eats are served in a casual joint with a brick exterior.", "34.05678057699603, -117.18087798503647", "$$", "Tables are clean and atmosphere of the place was friendly, family, and relaxed", "https://californiathroughmylens.com/wp-content/uploads/2011/12/Gourmet-Pizza-Shoppe-In-Redlands-Sign.jpg"));

        allLocations.add(new Food("Rok N Fondue", "Rustic-chic establishment serving steaks & fondue, plus craft beers & cocktails in an airy interior.", "34.056720909942705, -117.18170055435208", "$$$", "Very unique experience. The fondue is excellent. Highly recommend getting a Rok plate. It is a cook yourself meal for the main course so be prepared to slice ", "https://www.ieshineon.com/ius/images/ieshineon_roknfondue_redlands_nightlife500.jpg"));
        allFood.add(new Food("Rok N Fondue", "Rustic-chic establishment serving steaks & fondue, plus craft beers & cocktails in an airy interior.", "34.056720909942705, -117.18170055435208", "$$$", "Very unique experience. The fondue is excellent. Highly recommend getting a Rok plate. It is a cook yourself meal for the main course so be prepared to slice ", "https://www.ieshineon.com/ius/images/ieshineon_roknfondue_redlands_nightlife500.jpg"));

        allLocations.add(new Food("Citrone", "Upscale restaurant & lounge offering Californian/Mediterranean fare, a long wine list & cocktails.", "34.05849778512296, -117.18237295435135", "$$$", "Small plates, slightly pretentious atmosphere, overpriced given the quality.", "https://www.pe.com/wp-content/uploads/migration/nhe/nheum7-b88294752z.120141230113724000gnc767d2.10.jpg"));
        allFood.add(new Food("Citrone", "Upscale restaurant & lounge offering Californian/Mediterranean fare, a long wine list & cocktails.", "34.05849778512296, -117.18237295435135", "$$$", "Small plates, slightly pretentious atmosphere, overpriced given the quality.", "https://www.pe.com/wp-content/uploads/migration/nhe/nheum7-b88294752z.120141230113724000gnc767d2.10.jpg"));

        allLocations.add(new Food("Dhat Island Caribbean Creole", "Festive, unpretentious eatery offers quick-serve, traditional Caribbean cuisine in a basic space.", "34.05745052656236, -117.18618778503624", "$$", "Great food, great service, energetic location, fair price.", "https://images.squarespace-cdn.com/content/v1/560424d0e4b0a07c45c82175/1502032201422-ACP04187MG9BMS27855L/ke17ZwdGBToddI8pDm48kO3dkNKIEstXsufk8SyrXMN7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1Uf08AFE8FE949E8CcuixE2Ik1wM-yeMx_dwgL7xMEbjVcMBMmKQwhWunGA1rvA7j2g/new+di+sign+%282%29.jpg"));
        allFood.add(new Food("Dhat Island Caribbean Creole", "Festive, unpretentious eatery offers quick-serve, traditional Caribbean cuisine in a basic space.", "34.05745052656236, -117.18618778503624", "$$", "Great food, great service, energetic location, fair price.", "https://images.squarespace-cdn.com/content/v1/560424d0e4b0a07c45c82175/1502032201422-ACP04187MG9BMS27855L/ke17ZwdGBToddI8pDm48kO3dkNKIEstXsufk8SyrXMN7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1Uf08AFE8FE949E8CcuixE2Ik1wM-yeMx_dwgL7xMEbjVcMBMmKQwhWunGA1rvA7j2g/new+di+sign+%282%29.jpg"));

        allLocations.add(new Food("Carolyn’s Cafe", "Snug, bustling joint offering ample breakfasts from morning to noon, plus lunch options.", "34.04995372457991, -117.19873938503952", "$$", "I have been there twice and I will continue to go when I am in the area!!! Best coffee cake in town.", "https://popmenucloud.com/cdn-cgi/image/width=640,height=640,format=png,fit=scale-down/podanflw/3914f072-8adc-4090-bf18-96d63d5ca434.png"));
        allFood.add(new Food("Carolyn’s Cafe", "Snug, bustling joint offering ample breakfasts from morning to noon, plus lunch options.", "34.04995372457991, -117.19873938503952", "$$", "I have been there twice and I will continue to go when I am in the area!!! Best coffee cake in town.", "https://popmenucloud.com/cdn-cgi/image/width=640,height=640,format=png,fit=scale-down/podanflw/3914f072-8adc-4090-bf18-96d63d5ca434.png"));

        //************************ GYM CATEGORY ***********************
        //Anytime Fitness
        allLocations.add(new Gym("Anytime Fitness", "workout anytime", "", "$", "good gym", "https://s3-media0.fl.yelpcdn.com/bphoto/MIbZXcuo9O109Qp7gjSlJg/l.jpg"));
        allGym.add(new Gym("Anytime Fitness", "workout anytime", "",  "$", "good gym" , "https://s3-media0.fl.yelpcdn.com/bphoto/MIbZXcuo9O109Qp7gjSlJg/l.jpg"));

        //Fitness 19
        allLocations.add(new Gym("Fitness 19", "Classic gym with monthly memberships.", "34.069138486366654, -117.13994368503073", "$$", "Good place to workout, awesome staff keeps the place clean even when it’s busy.", "https://s3-media0.fl.yelpcdn.com/bphoto/YaqBe-Rzt-hnCOu35fCRaA/l.jpg"));
        allGym.add(new Gym("Fitness 19", "Classic gym with monthly memberships.", "34.069138486366654, -117.13994368503073", "$$", "Good place to workout, awesome staff keeps the place clean even when it’s busy.", "https://s3-media0.fl.yelpcdn.com/bphoto/YaqBe-Rzt-hnCOu35fCRaA/l.jpg"));

        //Flowstone
        allLocations.add(new Gym("Flowstone", "Inland Empire’s first modern indoor bouldering facility, located in historic Redlands, California. Climbing inspired, community driven.", "34.05588150502014, -117.20484672366848", "$$", "Quality climbing, fun environment, great staff, and just good vibes all around.", "https://www.flowstoneclimbing.com/uploads/1/1/6/5/116517763/img-6241_orig.jpg"));
        allGym.add(new Gym("Flowstone", "Inland Empire’s first modern indoor bouldering facility, located in historic Redlands, California. Climbing inspired, community driven.", "34.05588150502014, -117.20484672366848", "$$", "Quality climbing, fun environment, great staff, and just good vibes all around.", "https://www.flowstoneclimbing.com/uploads/1/1/6/5/116517763/img-6241_orig.jpg"));

        //Vasa The Yoga Studio
        allLocations.add(new Gym("Vasa The Yoga Studio", "Yoga studio in Redlands, CA.", "34.0479348094893, -117.17104233106684", "$$$", "I found Vasa the Yoga Studio through ClassPass and it is by far my favorite workout in the city. Extremely relaxing environment, and the classes are fast paced so you don't get bored.", "https://aboutredlands.com/system/uploads/attachment/attachment/20023/v1.jpg"));
        allGym.add(new Gym("Vasa The Yoga Studio", "Yoga studio in Redlands, CA.", "34.0479348094893, -117.17104233106684", "$$$", "I found Vasa the Yoga Studio through ClassPass and it is by far my favorite workout in the city. Extremely relaxing environment, and the classes are fast paced so you don't get bored.", "https://aboutredlands.com/system/uploads/attachment/attachment/20023/v1.jpg"));

        //Ultimate Kickboxing & Fitness
        allLocations.add(new Gym("Ultimate Kickboxing & Fitness", "At Ultimate Kickboxing & Fitness, you will experience the ultimate workout in both cardiovascular and strength training", "34.058774483844964, -117.19922215435123", "$$$", "The staff helped me set up, modify my workout, and was very encouraging.", "https://static.wixstatic.com/media/cf737e_c4637f70f8b84a698d08dec79615d67f~mv2.png/v1/fit/w_2500,h_1330,al_c/cf737e_c4637f70f8b84a698d08dec79615d67f~mv2.png"));
        allGym.add(new Gym("Ultimate Kickboxing & Fitness", "At Ultimate Kickboxing & Fitness, you will experience the ultimate workout in both cardiovascular and strength training", "34.058774483844964, -117.19922215435123", "$$$", "The staff helped me set up, modify my workout, and was very encouraging.", "https://static.wixstatic.com/media/cf737e_c4637f70f8b84a698d08dec79615d67f~mv2.png/v1/fit/w_2500,h_1330,al_c/cf737e_c4637f70f8b84a698d08dec79615d67f~mv2.png"));

        //************************ HOTEL CATEGORY***********************
        //Ayres Hotel
        allLocations.add(new Hotel("Ayres Hotel", "Family-run, Mediterranean-inspired property with free breakfast, Wi-Fi & happy hour, plus a pool.","34.06251795169684, -117.19706452898386","$$","Guests appreciated the friendly, professional staff · Guests spoke highly of management & reception · Guests enjoyed the pool", "https://media-cdn.tripadvisor.com/media/photo-s/01/9e/da/8a/ayres-hotel-redlands.jpg"));
        allHotels.add(new Hotel("Ayres Hotel", "Family-run, Mediterranean-inspired property with free breakfast, Wi-Fi & happy hour, plus a pool.","34.06251795169684, -117.19706452898386","$$","Guests appreciated the friendly, professional staff · Guests spoke highly of management & reception · Guests enjoyed the pool", "https://media-cdn.tripadvisor.com/media/photo-s/01/9e/da/8a/ayres-hotel-redlands.jpg"));

        //Dynasty Suites
        allLocations.add(new Hotel("Dynasty Suites","Low-key hotel offering traditional rooms & suites, some with whirlpool tubs, plus free breakfast.","34.062716275081286, -117.20147396044503","$$","Guests liked the clean rooms, though some commented they were dated · Guests appreciated the bathrooms", "https://media-cdn.tripadvisor.com/media/photo-s/12/ef/cd/c9/beautiful-hotel.jpg"));
        allHotels.add(new Hotel("Dynasty Suites","Low-key hotel offering traditional rooms & suites, some with whirlpool tubs, plus free breakfast.","34.062716275081286, -117.20147396044503","$$","Guests liked the clean rooms, though some commented they were dated · Guests appreciated the bathrooms", "https://media-cdn.tripadvisor.com/media/photo-s/12/ef/cd/c9/beautiful-hotel.jpg"));

        //Country Inn & Suites by Radisson
        allLocations.add(new Hotel("Country Inn & Suites by Radisson","Warm rooms & suites in a casual hotel with free hot breakfast & Wi-Fi, plus an outdoor pool.","34.06600500138148, -117.20937285434796","$$","Guests appreciated the friendly staff · Guests spoke highly of the reception staff, though some said management could be improved", "https://media.radissonhotelsamericas.com/image/country-inn-suites-by-radisson-san-bernardino-redlands-ca/exteriorview/20828-139410-f79104406_3xl.jpg"));
        allHotels.add(new Hotel("Country Inn & Suites by Radisson","Warm rooms & suites in a casual hotel with free hot breakfast & Wi-Fi, plus an outdoor pool.","34.06600500138148, -117.20937285434796","$$","Guests appreciated the friendly staff · Guests spoke highly of the reception staff, though some said management could be improved", "https://media.radissonhotelsamericas.com/image/country-inn-suites-by-radisson-san-bernardino-redlands-ca/exteriorview/20828-139410-f79104406_3xl.jpg"));

        //Comfort Suites
        allLocations.add(new Hotel("Comfort Suites","Casual suites in an unpretentious hotel offering free breakfast, plus an indoor pool & a gym.","34.064186655496705, -117.20061520832236","$$","Guests appreciated the friendly staff · Guests enjoyed the pool · Guests spoke highly of the reception staff", "https://cf.bstatic.com/images/hotel/max1280x900/273/273318316.jpg"));
        allHotels.add(new Hotel("Comfort Suites","Casual suites in an unpretentious hotel offering free breakfast, plus an indoor pool & a gym.","34.064186655496705, -117.20061520832236","$$","Guests appreciated the friendly staff · Guests enjoyed the pool · Guests spoke highly of the reception staff", "https://cf.bstatic.com/images/hotel/max1280x900/273/273318316.jpg"));

        //WoodSpring Suites
        allLocations.add(new Hotel("WoodSpring Suites","Informal all-suite hotel offering parking, plus streamlined quarters featuring kitchens.","34.06873468724912, -117.21256351571523","$$","I thought the facility was very clean and had a great set up.", "https://www.cityofredlands.org/sites/main/files/imagecache/lightbox/main-images/woodsprings_suites_logo.jpg"));
        allHotels.add(new Hotel("WoodSpring Suites","Informal all-suite hotel offering parking, plus streamlined quarters featuring kitchens.","34.06873468724912, -117.21256351571523","$$","I thought the facility was very clean and had a great set up.", "https://www.cityofredlands.org/sites/main/files/imagecache/lightbox/main-images/woodsprings_suites_logo.jpg"));

        // PASS DATA FROM ONE CLASS TO ANOTHER
        Intent intent = getIntent();

        // RETRIEVE CATEGORY DATA FROM MAIN ACTIVITY
        category = intent.getStringExtra("category"); // PASSED FROM MAIN ACTIVITY FILE

        //PASSES BUSINESS CATEGORY INTO CATEGORY ADAPTER
        switch (category){
            case "allBars":
                categoryAdapter = new CategoryAdapter(this, allBars);
                selectedCategoryList = allBars;
                searchArray = allBars;
                break;
            case "allBeauty":
                categoryAdapter = new CategoryAdapter(this, allBeauty);
                selectedCategoryList = allBeauty;
                searchArray = allBeauty;
                break;
            case "allEntertainment":
                categoryAdapter = new CategoryAdapter(this, allEntertainment);
                selectedCategoryList = allEntertainment;
                searchArray = allEntertainment;
                break;
            case "allFood":
                categoryAdapter = new CategoryAdapter(this, allFood);
                selectedCategoryList = allFood;
                searchArray = allFood;
                break;
            case "allHotels":
                categoryAdapter = new CategoryAdapter(this, allHotels);
                selectedCategoryList = allHotels;
                searchArray = allHotels;
                break;
            case "allGym":
                categoryAdapter = new CategoryAdapter(this, allGym);
                selectedCategoryList = allGym;
                searchArray = allGym;
                break;
        }

        updateListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3)
            {
                // ADD AN ITEM LISTENER FOR EACH LIST VIEW ITEM
                Intent launchReport = new Intent(v.getContext(), ResultPageActivity.class);
                launchReport.putExtra("name", selectedCategoryList.get(position).getName());
                launchReport.putExtra("description", selectedCategoryList.get(position).getDesc());
                launchReport.putExtra("imageURL", selectedCategoryList.get(position).getImageURL());
                launchReport.putExtra("review", selectedCategoryList.get(position).getReview());
                launchReport.putExtra("price", selectedCategoryList.get(position).getPrice());
                launchReport.putExtra("location", selectedCategoryList.get(position).getAddress());
                //launchReport.putExtra("imageURL", selectedCategoryList.get(position).get);
                startActivity(launchReport);

            }
        });

      /* This is an example of how to get the query
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);

      */
    }

    public void updateListView(){
        //MAKES VIEW
        listView = findViewById(R.id.listview);
        listView.setAdapter(categoryAdapter);
    }

    public void searchButton(View view){
        String searchQuery = searchTxt.getText().toString();
        ArrayList<Location> searchResults = new ArrayList<>();
        for(Location search: searchArray){
            if(search.getName().toLowerCase().contains(searchQuery.toLowerCase())){
                searchResults.add(search);
            }
        }
        if(searchResults.size() == 0){
            ArrayList<Location> newArray = new ArrayList<>();
            newArray.add(new Location("No results","","","","", ""));
            categoryAdapter = new CategoryAdapter(this, newArray);
        }
        else{
            categoryAdapter = new CategoryAdapter(this, searchResults);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> adapter, View v, int position,
                                        long arg3)
                {
                    // ADD AN ITEM LISTENER FOR EACH LIST VIEW ITEM
                    Intent launchReport = new Intent(v.getContext(), ResultPageActivity.class);
                    launchReport.putExtra("name", searchResults.get(position).getName());
                    launchReport.putExtra("description", searchResults.get(position).getDesc());
                    launchReport.putExtra("imageURL", searchResults.get(position).getImageURL());
                    launchReport.putExtra("review", searchResults.get(position).getReview());
                    launchReport.putExtra("price", searchResults.get(position).getPrice());
                    launchReport.putExtra("location", searchResults.get(position).getAddress());
                    //launchReport.putExtra("imageURL", selectedCategoryList.get(position).get);
                    startActivity(launchReport);
                }
            });
        }
        updateListView();
}}

  /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Initialize menu inflater
        MenuInflater menuInflater = getMenuInflater();
        //Inflate menu
        menuInflater.inflate(R.menu.menu_search,menu);
        //Initialize menu item
        MenuItem menuItem = menu.findItem(R.id.search_view);
        // Initialize search view
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // filter array list
                categoryAdapter.getFilter().filter(newText);

                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);

    }*/