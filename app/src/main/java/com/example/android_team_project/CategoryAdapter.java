package com.example.android_team_project;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Location> {
    public CategoryAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Location currentBusiness = getItem(position);

        View business = convertView;
        if( business == null){
            business = LayoutInflater.from(getContext()).inflate(R.layout.search_item,parent, false);
        }

        TextView business_name = business.findViewById(R.id.search_Buisness_name);
        TextView business_description = business.findViewById(R.id.search_description);

        business_name.setText(currentBusiness.getName());
        business_description.setText(currentBusiness.getDesc());

        return business;
    }
}