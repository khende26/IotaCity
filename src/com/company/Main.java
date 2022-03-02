package com.company;

public class Main {

    public static void main(String[] args) {
	CityHall cityHall = new CityHall(true, 8, "Iota City Hall",
            "Built in 1907, this is where our city govenrnment meets");
    DeptStore deptStore = new DeptStore("magnets, shirts, shot glasses",
            "milk, eggs, fruit, meat, veggie", true);
        Restaurant restaurant1 = new Restaurant("Fast Food", 2, 1,
                "Burgers Are Us", "est 2010 - Local spot for a quick bite.");
        Restaurant restaurant2 = new Restaurant("Italian", 4, 3,
                "Giacomo's", "est 1950 - a taste of Italy");
        Attraction attraction = new Attraction("Kids Korner", "Playground");
        Attraction attraction1 = new Attraction("Slip 'n Slide", "Waterpark");
    }
}
