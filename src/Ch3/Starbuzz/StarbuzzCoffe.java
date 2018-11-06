package Ch3.Starbuzz;

import Ch3.Starbuzz.Component.Beverage;
import Ch3.Starbuzz.ConcreteComponents.DarkRoast;
import Ch3.Starbuzz.ConcreteComponents.Espresso;
import Ch3.Starbuzz.ConcreteComponents.HouseBlend;
import Ch3.Starbuzz.ConcreteDecorators.Mocha;
import Ch3.Starbuzz.ConcreteDecorators.Soy;
import Ch3.Starbuzz.ConcreteDecorators.Whip;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() +
                " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() +
                " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() +
                " $" + beverage3.cost());
    }
}