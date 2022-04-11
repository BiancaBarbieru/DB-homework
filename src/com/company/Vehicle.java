package com.company;

public abstract class Vehicle implements Comparable<Vehicle> {
    private String colour;
    private boolean functional;

    public Vehicle() {
    }

    public Vehicle(String colour, boolean functional) {
        this.colour = colour;
        this.functional =functional;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFunctional() {
        return functional;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    abstract int charge();
    abstract int profit();
    abstract void display();

    @Override
    public int compareTo(Vehicle o) {
        return (int) (this.profit() - o.profit());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "colour='" + colour + '\'' +
                ", functional=" + functional +
                '}';
    }
}
