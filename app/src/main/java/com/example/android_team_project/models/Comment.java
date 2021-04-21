package com.example.android_team_project.models;

public class Comment {

    // DATA MEMBERS
    private String review;
    private String price;

    public Comment (String review, String price){
        this.review = review;
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "review='" + review + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
