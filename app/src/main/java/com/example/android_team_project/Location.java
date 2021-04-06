package com.example.android_team_project;

public class Location {

    // DATA MEMBERS
    private String name;
    private String desc;
    private String price;
    private String review;

    // CONSTRUCTOR
    public Location () {
        name = "name";
        desc = "desc";
        price = "$";
        review = "review";
    }

    public Location (String name, String desc, String price, String review){
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.review = review;
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
}
