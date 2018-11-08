package Ch3_Decorator.Starbuzz.ConcreteComponents;

import Ch3_Decorator.Starbuzz.Component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
