package com.example.android_team_project;

public class Bar extends Location{

    // BAR EXTENDS LOCATION SO IT HAS ALL THE SAME MEMBERS
    public Bar () {
        super(); // default constructor from Location class
    }

    public Bar (String name, String desc, String price, String review){
        super(name, desc, price, review);
    }

    public void setName (String name){
        super.setName(name);
    }

    public void setDesc (String desc){
        super.setDesc(desc);
    }

    public void setPrice (String price){
        super.setPrice(price);
    }

    public void setReview (String review){
        super.setReview(review);
    }

}
