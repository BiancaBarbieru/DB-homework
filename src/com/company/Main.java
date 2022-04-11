package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BusStation veh = new BusStation();

        Vehicle v1 = new Bus("albastru", false, 0, 13);
        Vehicle v2 = new Bus("galben", true, 15, 10);
        Vehicle v3 = new Taxi("verde", true, 2, 50);
        Vehicle v4 = new Bus("verde", true, 10, 15);
        Vehicle v5 = new Taxi("verde", false, 0, 100);

        veh.vehicles.add(v1);
        veh.vehicles.add(v2);
        veh.vehicles.add(v3);
        veh.vehicles.add(v4);
        veh.vehicles.add(v5);

        System.out.println("All vehicles: ");
        veh.showAllVehicles();
        System.out.println("Profit total: " + veh.showTotalProfit());
        System.out.println("Sortare: ");
        veh.sortVehicles();


    }
}
