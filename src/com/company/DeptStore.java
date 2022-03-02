package com.company;

import javax.crypto.spec.PSource;
import java.util.Collections;
import java.util.List;

public class DeptStore {
    private List<String> souvenirs;
    private List<String> groceries;
    private boolean sale;


    public DeptStore(String souvenirs, String groceries, boolean sale) {
        this.souvenirs = Collections.singletonList(souvenirs);
        this.groceries = Collections.singletonList(groceries);
        this.sale = sale;
    }


}
