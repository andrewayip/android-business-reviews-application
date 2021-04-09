package com.example.android_team_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.view.View;

public class SearchPageActivity extends Activity {

    // DATA MEMBERS
    SearchView searchView;
    ListView listView;

    // NOW BASED ON WHAT CATEGORY WE SELECT WE DETERMINE WHICH HASHMAP TO DISPLAY (BASED ON CATEGORY)

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);

        // UI REFERENCES
        searchView = (SearchView) findViewById(R.id.simpleSearchView);
        listView = (ListView) findViewById(R.id.listview);

        // PASS DATA FROM ONE CLASS TO ANOTHER
        Intent intent = getIntent();

        // RETRIEVE CATEGORY DATA FROM MAIN ACTIVITY
        String category;
        category = intent.getStringExtra("category"); // PASSED FROM MAIN ACTIVITY FILE

        System.out.println("this is the selected category: " + category);

    }

}
