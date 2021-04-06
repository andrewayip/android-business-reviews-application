package com.example.android_team_project;

public class Food extends Location{

    //  EXTENDS LOCATION SO IT HAS ALL THE SAME MEMBERS
    public Food () {
        super(); // default constructor from Location class
    }

    public Food (String name, String desc, String price, String review){
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
