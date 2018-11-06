package Ch3.Starbuzz.Decorator;

import Ch3.Starbuzz.Component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
