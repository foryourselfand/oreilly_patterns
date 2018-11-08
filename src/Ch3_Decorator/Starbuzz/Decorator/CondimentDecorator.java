package Ch3_Decorator.Starbuzz.Decorator;

import Ch3_Decorator.Starbuzz.Component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
