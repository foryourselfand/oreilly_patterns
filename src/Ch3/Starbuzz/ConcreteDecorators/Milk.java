package Ch3.Starbuzz.ConcreteDecorators;

import Ch3.Starbuzz.Component.Beverage;
import Ch3.Starbuzz.Decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .5;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .15;
        }
        return cost;
    }
}