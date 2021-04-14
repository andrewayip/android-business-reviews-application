package com.example.android_team_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ResultPageActivity extends Activity {

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_page);

        Intent intent = getIntent();


    }
}
