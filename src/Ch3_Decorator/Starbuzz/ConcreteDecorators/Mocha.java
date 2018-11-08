package Ch3_Decorator.Starbuzz.ConcreteDecorators;

import Ch3_Decorator.Starbuzz.Component.Beverage;
import Ch3_Decorator.Starbuzz.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
