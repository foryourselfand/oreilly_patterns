package Ch3.Starbuzz.ConcreteComponents;

import Ch3.Starbuzz.Component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
