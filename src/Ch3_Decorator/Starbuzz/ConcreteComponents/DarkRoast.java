package Ch3_Decorator.Starbuzz.ConcreteComponents;

import Ch3_Decorator.Starbuzz.Component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
