package com.example.android_team_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultPageActivity extends Activity {

    private TextView title;
    private TextView description;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_page);

        // REFERENCES TO UI
        title = (TextView) findViewById(R.id.resultsTitleTxtV);
        description = (TextView) findViewById(R.id.resultsDescriptionTextV);

        Intent intent = getIntent();
        String nameData;
        nameData = intent.getStringExtra("name");
        String descriptionData;
        descriptionData = intent.getStringExtra("description");

        System.out.println(nameData);

        title.setText(nameData);
        description.setText(descriptionData);

    }
}
