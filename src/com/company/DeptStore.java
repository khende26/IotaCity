package com.company;

import javax.crypto.spec.PSource;
import java.util.Collections;
import java.util.List;

public class DeptStore extends Buildings {
    private List<String> souvenirs;
    private List<String> groceries;
    private boolean sale;


    public DeptStore(String souvenirs, String groceries, boolean sale) {
        super(2, "GitHub Groceries and More", "Est 1937. One stop shop! Check for sales.");
        this.souvenirs = Collections.singletonList(souvenirs);
        this.groceries = Collections.singletonList(groceries);
        this.sale = sale;
    }

    public void getDetails() {
        System.out.println("Name: " + getBldgName() + ". Description: " + getDescription() + "\n" + " Items sold here:" +
                souvenirs + " " + groceries + ". Current sale? " + sale);
    }
}
