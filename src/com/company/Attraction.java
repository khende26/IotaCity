package com.company;

public class Attraction {
    private String name;
    private String typeOfPark;

    public Attraction (String name, String typeOfPark) {
        this.name = name;
        this.typeOfPark = typeOfPark;}


    public void getDetails() {
        System.out.println("Name: " + name + ". Type: " + typeOfPark);
    }

    public String getName() {
        return name;
    }

    }



