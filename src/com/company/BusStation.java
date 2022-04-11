package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusStation {
    List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void showAllVehicles(){
        for(Vehicle v : vehicles) {
            v.display();
        }
    }

    public int showTotalProfit(){
        int sumProfit = 0;
        for(Vehicle v : vehicles)
            sumProfit += v.profit();
        return sumProfit;
    }

    public void sortVehicles(){
        Collections.sort(vehicles);
        System.out.println(vehicles);
    }

}
