package com.example.android_team_project.models;

public class Gym extends Location{

    public Gym () {
        super();
    }

    public Gym (String name, String desc, String address, String price, String review, String imageURL){
        super(name, desc, address, price, review, imageURL);
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
    public void setImageURL(String imageURL) {super.setImageURL(imageURL);}
}
