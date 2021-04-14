package com.example.android_team_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;


public class MainActivity extends AppCompatActivity {

    // REFERENCES
    String selectedCategory;
    SearchPageActivity searchPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        // REFERENCES
        selectedCategory = "";
        searchPage = new SearchPageActivity();

    }
    public void barsOption(View view){
      selectedCategory = "allBars";
      Intent launchReport = new Intent(this, SearchPageActivity.class);
      launchReport.putExtra("category", selectedCategory);
      startActivity(launchReport);
    }
    public void fitnessOption(View view){
        selectedCategory = "allGym";
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
        selectedCategory = "allHotels";
        Intent launchReport = new Intent(this, SearchPageActivity.class);
        launchReport.putExtra("category", selectedCategory);
        startActivity(launchReport);
    }
    public void beautyOption(View view){
        selectedCategory = "allBeauty";
        Intent launchReport = new Intent(this, SearchPageActivity.class);
        launchReport.putExtra("category", selectedCategory);
        startActivity(launchReport);
    }
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
                searchPage.categoryAdapter.getFilter().filter(newText);

                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);

    }
}