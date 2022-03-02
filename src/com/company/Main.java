package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Map.*;

public class Main {

    public static void main(String[] args) {
        CityHall cityHall = new CityHall(true, 8, "Iota City Hall",
                "Built in 1907, this is where our city government meets");
        DeptStore deptStore = new DeptStore("magnets, shirts, shot glasses",
                "milk, eggs, fruit, meat, veggies", true);
        Restaurant restaurant1 = new Restaurant("Fast Food", 2, 1,
                "Burgers Are Us", "est 2010 - Local spot for a quick bite.");
        Restaurant restaurant2 = new Restaurant("Italian", 4, 3,
                "Giacomo's", "est 1950 - a taste of Italy");
        Attraction attraction = new Attraction("Kids Korner", "Playground");
        Attraction attraction1 = new Attraction("Slip 'n Slide", "Waterpark");
        Attraction attraction2 = new Attraction("Method Museum", "Museum");
        Attraction attraction3 = new Attraction("Java Movie House", "Theater");
        Attraction attraction4 = new Attraction("Iota Area", "Sports");
        Person person1 = new Person("Mayor", "Adam Christan");
        Person person2 = new Person("City Clerk", "Bill Albertson");
        Person person3 = new Person("Sheriff", "Dennis Murray");
        Person person4 = new Person("Head Coach", "Vince Mariucci");
        Person person5 = new Person("Assistant Coach", "Braden Lyford");
        Person person6 = new Person("Assistant Coach", "Erik Kiledal");
        Map newMap = new Map();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Iota City");

        map = new String[9];

        for (int i = 0; i < map.length; i++) {
            map[i] = String.valueOf(i + 1);
        }

        map[0] = restaurant1.getBldgName();
        map[1] = attraction1.getName();
        map[2] = deptStore.getBldgName();
        map[3] = attraction.getName();
        map[4] = cityHall.getBldgName();
        map[5] = restaurant2.getBldgName();
        map[6] = attraction2.getName();
        map[7] = attraction3.getName();
        map[8] = attraction4.getName();
        ;
        newMap.buildMap();
        boolean keepAsking = true;
        while (keepAsking) {
            System.out.println("\n Press 1) for Restaurants \n 2) for Attractions \n 3) for City Hall \n" +
                    " 4) for People Directory \n 5) for Shopping \n 6) To Exit");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                newMap.buildMap();
                System.out.println("Location on map: 1");
                restaurant1.getDetails();
                System.out.println("Location on map: 6");
                restaurant2.getDetails();
                keepAsking = true;
                //need to create a return statement
            } else if (userInput == 2) {
                newMap.buildMap();
                System.out.println("Location on map: 2");
                attraction1.getDetails();
                System.out.println("Location on map: 4");
                attraction.getDetails();
                System.out.println("Location on map: 7");
                attraction2.getDetails();
                System.out.println("Location on map: 8");
                attraction3.getDetails();
                System.out.println("Location on map: 9");
                attraction4.getDetails();
                keepAsking = true;
            } else if (userInput == 3) {
                newMap.buildMap();
                System.out.println("Location on map: 5");
                cityHall.getDetails();
                //options for mayors office / clerks office
                person1.getDetails();
                person2.getDetails();
                person3.getDetails();
                keepAsking = true;
            } else if (userInput == 4) {
                //crete people and a get details here:
                person1.getDetails();
                person2.getDetails();
                person3.getDetails();
                person4.getDetails();
                person5.getDetails();
                person6.getDetails();
                keepAsking = true;
            } else if (userInput == 5) {
                newMap.buildMap();
                System.out.println("Location on map: 5");
                deptStore.getDetails();
                keepAsking = true;
            } else if (userInput == 6) {
                keepAsking = false;
                System.out.println("Enjoy your visit");
            } else {
                System.out.println("Invalid input. Please try again:");
                userInput = scanner.nextInt();
            }


            //scanner press 1 for restaurants - choice of two restaurants and location?
            //scanner press 2 for attractions - list of attractions, add museum and location
            //scanner press 3 for City Hall  - Mayor's office ; Clerk's office
            //scanner 4 People Directory - use person class
            //scanner with exceptions
//        Arrays.asList(map).indexOf("restaurant1");
//        System.out.println(Arrays.toString(map.));
        }
    }
}

