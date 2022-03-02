package com.company;

public class Restaurant extends Buildings {
    private String typeOfFood;
    private int rating;

    public Restaurant(String typeOfFood, int rating, int noOfStories, String bldgName, String description) {
        super(noOfStories, bldgName, description);
        this.typeOfFood = typeOfFood;
        this.rating = rating;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public int getRating() {
        return rating;
    }
}




