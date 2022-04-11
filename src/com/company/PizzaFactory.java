package com.company;
import enums.*;
import pizza.*;

import java.util.Observer;

public class PizzaFactory {

    private static PizzaFactory uniqueInstance;
    PizzaType pizzaTypes;
    Topping toppingTypes;
    public Client client;
    private boolean state;

    public PizzaFactory() {

    }

    public static PizzaFactory instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactory();
        }
        return uniqueInstance;
    }

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CAPRICIOSA:
                return new Capriciosa();
            case PROSCIUTTO_FUNGHI:
                return new ProsciuttoFunghi();
            case QUATRO_STAGIONI:
                return new QuatroStagioni();
            case MARGUERITA:
                return new Marguerita();
        }
        return null;
    }

    public void attachClient(Client client) {
        this.client = client;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state){
        this.state =state;
        notifyClient();
    }

    public void notifyClient(){
        client.receiveUpdate();
    }
}

class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class ToppingDecorator extends PizzaDecorator {
    public ToppingDecorator(Pizza pizza) {
        super(pizza);
    }
}