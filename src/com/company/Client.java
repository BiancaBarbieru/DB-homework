package com.company;

public class Client {
    private static PizzaFactory pizza;

    public Client(PizzaFactory pizza) {
        this.pizza = pizza;
        this.pizza.attachClient(this);
    }

    public void receiveUpdate(){
        if( pizza.getState() == true)
            System.out.println("Pizza e gata!");
        else
            System.out.println("Pizza inca nu e gata!");
    }
}

