package Ch3_Decorator.Starbuzz.ConcreteComponents;

import Ch3_Decorator.Starbuzz.Component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
