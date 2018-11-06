package Ch3.Starbuzz.ConcreteComponents;

import Ch3.Starbuzz.Component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
