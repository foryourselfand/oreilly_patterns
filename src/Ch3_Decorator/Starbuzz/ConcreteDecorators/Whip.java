package Ch3_Decorator.Starbuzz.ConcreteDecorators;

import Ch3_Decorator.Starbuzz.Component.Beverage;
import Ch3_Decorator.Starbuzz.Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}