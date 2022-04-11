package com.company;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizza = new PizzaFactory();
        Client client = new Client(pizza);
        pizza.setState(true);
        pizza.setState(true);

    }
}
