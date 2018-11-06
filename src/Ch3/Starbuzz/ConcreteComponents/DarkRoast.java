package Ch3.Starbuzz.ConcreteComponents;

import Ch3.Starbuzz.Component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
