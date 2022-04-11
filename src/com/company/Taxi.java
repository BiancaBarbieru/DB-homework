package com.company;

public class Taxi extends Vehicle{
    private int noPassangers;
    private int tiketPrice;

    public Taxi() {
    }

    public Taxi(String colour, boolean functional, int noPassangers, int tiketPrice) {
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
            if (noPassangers == 4) System.out.println("This taxi is full!");
                else System.out.println(noPassangers + " passangers out of 4. Tiket price " + tiketPrice);
        }
        else System.out.println("This taxi is not functional.");
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "noPassangers=" + noPassangers +
                ", tiketPrice=" + tiketPrice +
                '}';
    }
}
