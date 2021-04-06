package com.example.android_team_project;

public class Food extends Location{

    //  EXTENDS LOCATION SO IT HAS ALL THE SAME MEMBERS
    public Food () {
        super(); // default constructor from Location class
    }

    public Food (String name, String desc, String address, String price, String review, String imageID){
        super(name, desc, address, price, review, imageID);
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
    public void setAddress (String address){
        super.setReview(address);
    }
    public void setImageID (String imageID){
        super.setImageID(imageID);
    }

}
