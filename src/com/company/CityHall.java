package com.company;

public class CityHall extends Buildings {
    private boolean forum;

    public CityHall(boolean forum, int noOfStories, String bldgName, String description) {
        super(noOfStories, bldgName, description);
        this.forum = forum;}

    public boolean isForum() {
        return forum;

    }

    public void getDetails() {
        System.out.println("Name: " + getBldgName() + ". Description: " + getDescription() + ". Number of Stories:" + getNoOfStories()
        + "\n Forum in Session? " + isForum());
    }

}
