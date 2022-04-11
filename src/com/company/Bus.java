package com.company;

public class Bus extends Vehicle{
   private int noPassangers;
   private int tiketPrice;

    public Bus() {
    }

    public Bus(String colour, boolean functional, int noPassangers, int tiketPrice) {
        super(colour, functional);
        this.noPassangers = noPassangers;
        this.tiketPrice = tiketPrice;
    }

    @Override
    int charge() {
        return noPassangers * tiketPrice;
    }

    @Override
    int profit() {
        return (int) ((25 * charge() / 100));
    }

    @Override
    void display() {
        if(isFunctional()) {
            if (noPassangers == 20) System.out.println("This bus is full!");
            else System.out.println(noPassangers + " passangers out of 20. Tiket price " + tiketPrice);
        }
        else System.out.println("This bus is not functional.");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "noPassangers=" + noPassangers +
                ", tiketPrice=" + tiketPrice +
                '}';
    }
}
