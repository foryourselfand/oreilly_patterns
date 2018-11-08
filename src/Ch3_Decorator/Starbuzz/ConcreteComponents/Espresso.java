package Ch3_Decorator.Starbuzz.ConcreteComponents;

import Ch3_Decorator.Starbuzz.Component.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
