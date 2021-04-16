package com.example.android_team_project;

public class Location {

    // DATA MEMBERS
    private String name;
    private String desc;
    private String price;
    private String address;
    private String review;
    private String imageID;
    private String imageURL;

    // CONSTRUCTOR
    public Location () {
        name = "name";
        desc = "desc";
        price = "$";
        review = "review";
        address = "address";
        imageID = "123";
        imageURL = "";
    }

    public Location (String name, String desc, String address, String price, String review, String imageID, String imageURL){
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.review = review;
        this.address = address;
        this.imageID = imageID;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
