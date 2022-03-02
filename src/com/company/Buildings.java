package com.company;

public class Buildings {
    private int noOfStories;
    private String bldgName;
    private String description;

    public Buildings (int noOfStories, String bldgName, String description) {
        this.noOfStories = noOfStories;
        this.bldgName = bldgName;
        this.description = description; }

    public int getNoOfStories() {
        return noOfStories;}
    public String getBldgName()  {
        return bldgName; }
    public String getDescription() {
        return description; }



}
