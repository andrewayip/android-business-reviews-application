package com.example.android_team_project;

public class Beauty extends Location{

    // EXTENDS LOCATION SO IT HAS ALL THE SAME MEMBERS
    public Beauty () {
        super(); // default constructor from Location class
    }

    public Beauty (String name, String desc, String address, String price, String review, String imageID, String imageURL){
        super(name, desc, address, price, review, imageID, imageURL);
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
        super.setAddress(address);
    }
    public void setImageID (String imageID){
        super.setImageID(imageID);
    }
    public void setImageURL(String imageURL) {super.setImageURL(imageURL);}
}
