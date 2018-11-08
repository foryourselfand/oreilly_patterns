package Ch3_Decorator.Starbuzz.ConcreteDecorators;

import Ch3_Decorator.Starbuzz.Component.Beverage;
import Ch3_Decorator.Starbuzz.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}